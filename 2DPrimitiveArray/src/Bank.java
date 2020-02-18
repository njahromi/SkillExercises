class Bank {
  public static void main(String[] args) {
    String kitty[] = new String[3];   // primitive type array
    kitty[0] = "Hungweee";
    kitty[1] = "Gwumpee";       // inserting element in an array
    kitty[2] = "Pwayfull";
    int count = 1;
    for(int i = 0; i < kitty.length; ++i) {   // traversing an array
      System.out.println("Kitty " + count + " is " + kitty[i]);
      ++count;
    }
  }
}
