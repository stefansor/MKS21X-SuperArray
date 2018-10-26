public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[10];
  }
  public SuperArray(int size){
    data = new String[size];
  }
  public void clear(){
    this.data = new String[this.data.length];
    this.size = 0;
  }
  public int size(){
    int count = 0;
    for(int i = 0; i < this.data.length; i++){
      if(!(this.data[i] == null)){
        count = count + 1;
      }
    }
    this.size = count;
    return this.size;
  }
  public boolean isEmpty(){
    if(this.size() == 0){
      return true;
    }
    return false;
  }
  public boolean add(String elem){
    if(this.size() >= 10){
      this.resize();
      this.data[this.size()] = elem;
      return true;
    }
    if(this.size() < 10){
      this.data[this.size()] = elem;
      return true;
    }
    return false;
  }

  private void resize(){
    int a = this.size();
    String[] newdata = new String[this.data.length * 2];
    for(int i = 0; i < a; i++){
      newdata[i] = this.data[i];
    }
    this.data = newdata;
  }

  public String get(int index){
    if(index < this.size() && index > 0){
      return this.data[index];
    }
    else{
      return "error";
    }
  }
  public String set(int index, String elem){
    if(index < this.size()){
      String old = this.data[index];
      this.data[index] = elem;
      return old;
    }
    else{
      return "error";
    }
  }
  public String toString(){
    String argh = "[";
    for(int i = 0; i < this.size(); i++){
      if(i == this.size() - 1){
        argh = argh + this.data[i] + "]";
      }
      else{
        argh = argh + this.data[i] + ", ";
      }
    }
    return argh;
  }
  public String toStringDebug(){
    String arr = "[";
    for(int i = 0; i < this.data.length; i++){
      if(i == this.data.length - 1){
        arr = arr + this.data[i] + "]";
      }
      else{
        arr = arr + this.data[i] + ", ";
      }
    }
    return arr;
  }

  public boolean contains(String target){
    for(int i = 0; i < this.size(); i++){
      if(this.data[i].equals(target)){
        return true;
      }
    }
    return false;
  }
  public int indexOf(String target){
    for(int i = 0; i < this.size() ; i++){
      if(this.data[i].equals(target)){
        return i;
      }
    }
    return -1;
  }
  public int lastIndexOf(String target){
    for(int i = this.size() - 1; i > 0; i--){
      if(this.data[i].equals(target)){
        return i;
      }
    }
    return -1;
  }
  public void add(int index, String elem){
    if(index < 0 || index > this.size()){
      System.out.print("error");
    }
    else{
      int a = 0;
      String[] spit = new String[this.size() + 1];
      for(int i = 0; i < spit.length; i++){
        if(i == index){
          spit[i] = elem;
        }
        if (i != index){
          spit[i] = this.data[a];
          a++;
        }
      }
      this.data = spit;
    }
  }
  public String remove(int index){
    if(index < 0 || index > this.size()){
      return null;
    }
    else{
      String old = this.data[index];
      String[] newr = new String[this.data.length - 1];
      int a = 0;
      for(int i = 0; i < newr.length; i++){
        if(i < index){
          newr[i] = this.data[i];
          a++;
        }
        if(i == index){
          a++;
          newr[i] = this.data[a];
        }
        if(i > index){
          a++;
          newr[i] = this.data[a];
        }
      }
      this.data = newr;
      return old;
    }
  }
  public boolean remove(String target){
    if(this.contains(target)){
      int a = this.indexOf(target);
      if(this.remove(a).equals(target)){
        return true;
      }
    }
    return false;
  }



}
