class Bank {
  public static void main(String[] args) {
    int phone[] = new int[3];   // primitive type array
    phone[0] = 033123456;
    phone[1] = 033123457;       // inserting element in an array
    phone[2] = 033123454;
    int count = 1;
    for(int i = 0; i < phone.length; ++i) {   // traversing an array
      System.out.println("phone number " + count + ": " + phone[i]);
      ++count;
    }
  }
}
