public class Driver {
  public static void main(String[] args) {

    System.out.print("\n\n\n\n\n");

    /**************************************************************************/

    SuperArray SA = new SuperArray();
    System.out.println("Created an empty SuperArray \"SA\" with capacity 10\n\n");

    /**************************************************************************/

    System.out.println("SA's status:                       " + SA.toStringDebug());
    System.out.println("SA is empty (should return true):  " + SA.isEmpty());
    System.out.println("SA's size:                         " + SA.size());

    /**************************************************************************/

    SA.add("Fish");
    SA.add("45");
    SA.add("Fortnite");
    System.out.println("\nAdded \"Fish\", \"45\", \"Fortnite\" to SA");
    System.out.println("SA's current value':               " + SA.toString());
    System.out.println("Value with nulls:                  " + SA.toStringDebug() + "\n\n");
    System.out.println("SA is empty (should return false): " + SA.isEmpty());

    /**************************************************************************/

    SA.set(1, "38");
    System.out.println("Setting SA[1] to \"38\"...");
    System.out.println("\n");
    System.out.println("Checking set value:                " + SA.get(1) + "\n\n");

    /**************************************************************************/

    for (int i = SA.size(); i < 10; i++) {
      SA.add("" + i);
    }
    System.out.println("Filling empty slots of SA with integers...");
    System.out.println("Full status of SA:                 " + SA.toStringDebug() + "\n");
    System.out.println("Adding \"churros\" to SA to test resize...");
    SA.add("churros");
    System.out.println("SA (capacity should have doubled): " + SA.toStringDebug() + "\n\n");


    /**************************************************************************/

        System.out.println("Checking SA for \"Fortnite\":      " + SA.contains("Fortnite"));
        System.out.println("This should return true!");
        System.out.println("Checking SA for \"jedi master\"    " + SA.contains("jedi master"));
        System.out.println("This should return false!\n\n");

    /**************************************************************************/
    /**phase 2 testing start*/
    System.out.println("Phase 2 testing, start!");
    //testing resize()
    SuperArray letters = new SuperArray();

    for (int x = 0; x < 20; x++){
      System.out.println();
      letters.add("a");
      System.out.println("Size: " + letters.size());
      System.out.println(letters);
    } //array should now be filled to index 19

    System.out.println();
    System.out.println("Phase 2 testing, end");
    /** phase 2 testing end*/

    System.out.println();
    System.out.println();

    /** phase 2 testing end*/
    System.out.println("Phase 3 testing, start!");
    System.out.println();

    //testing contains()
    SuperArray randomLetters = new SuperArray();
    randomLetters.add("b");
    randomLetters.add("f");
    randomLetters.add("g");
    randomLetters.add("c");
    randomLetters.add("z");

    System.out.println(randomLetters); //should print [b,f,g,c,z]

    if (randomLetters.contains("a")){
      System.out.println("a is in the array");
    } else {
      System.out.println("a is not in the array");
    } //should print "a is not in the array"

    if (randomLetters.contains("c")){
      System.out.println("c is in the array");
    } else {
      System.out.println("c is not in the array");
    } //should print "c is in the array"

    System.out.println();

    //testing indexOf() and lastIndexOf()
    randomLetters.add("b");
    randomLetters.add("z");
    System.out.println(randomLetters); //should print [b,f,g,c,z,b,z]

    System.out.println("The first occurance of b is at: " + randomLetters.indexOf("b")); //should print 0
    System.out.println("The first occurance of f is at: " + randomLetters.indexOf("f")); //should print 1
    System.out.println("The first occurance of g is at: " + randomLetters.indexOf("g")); //should print 2
    System.out.println("The first occurance of c is at: " + randomLetters.indexOf("c")); //should print 3
    System.out.println("The first occurance of z is at: " + randomLetters.indexOf("z")); //should print 4
    System.out.println("The first occurance of j is at: " + randomLetters.indexOf("j")); //should print -1

    System.out.println();

    System.out.println("The last occurance of b is at: " + randomLetters.lastIndexOf("b")); //should print 5
    System.out.println("The last occurance of f is at: " + randomLetters.lastIndexOf("f")); //should print 1
    System.out.println("The last occurance of g is at: " + randomLetters.lastIndexOf("g")); //should print 2
    System.out.println("The last occurance of c is at: " + randomLetters.lastIndexOf("c")); //should print 3
    System.out.println("The last occurance of z is at: " + randomLetters.lastIndexOf("z")); //should print 6
    System.out.println("The last occurance of j is at: " + randomLetters.lastIndexOf("j")); //should print -1

    System.out.println();

    System.out.println();

    //testing add(int,String)
    System.out.println(randomLetters);//should print [b,f,g,c,z,b,z]

    randomLetters.add(2, "a");
    System.out.println(randomLetters);//should print [b,f,a,g,c,z,b,z]
    randomLetters.add(10, "a");//should print error

    System.out.println();

    System.out.println();

    //testing remove()
    System.out.println(randomLetters);//should print [b,f,a,g,c,z,b,z]

    System.out.println(randomLetters.remove(9));//should print null
    System.out.println(randomLetters.remove(1));//should print f;
    System.out.println(randomLetters);//should print [b,a,g,c,z,b,z]
  }
}
