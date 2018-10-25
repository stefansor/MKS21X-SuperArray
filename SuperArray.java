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
      if(!this.data[i].equals("")){
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
      int a = this.size(); 
      String[] newdata = new String[this.data.length * 2];
      for(int i = 0; i < a; i++){
        newdata[i] = this.data[i];
      }  
      newdata[a] = elem;
      this.data = newdata;
      return true;
    }
    if(this.size() < 10){
      this.data[this.size()] = elem;
      return true;
    }
    return false;
  }
  public String get(int index){
    if(index < this.size()){
      return this.data[index];
    }
    else{
      return null;
    }
  }
  public String set(int index, String elem){
    if(index < this.size()){
      String old = this.data[index];
      this.data[index] = elem;
      return old;
    }
    else{
      return null;
    }
  }
  public String toString(){
    String[] newp = new String[this.size()];
    int a = 0;
    for(int i = 0; i < this.data.length; i++){
      if(!this.data[i].equals("null")){
        newp[a] = this.data[i];
        a = a + 1;
      }
    }
    String format = "" + newp;
    String newformat = format.replaceAll("\"", "");
    return newformat;
  }

}
