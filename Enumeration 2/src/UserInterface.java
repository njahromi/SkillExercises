enum Day{
    Gold(1),Silver(2),Bronze(3),Copper(4),Plastic(5),Paper(6),Dirt(7);
    private int value;
    private Day(int value){
      this.value=value;
    }
    public int getValue(){
      return this.value;
    }
  }
 class UserInterface{
    public static void main (String[] args) {
       //printing all constants of an enum
        for(Day place:Day.values())
            System.out.println("Medal:"+place.name()+" Place:"+place.getValue());
    }
  }