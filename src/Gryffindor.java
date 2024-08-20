  public class Gryffindor extends Hogwarts{

    private final int nobility;
    private final int honor;
    private final int bravery;

      public Gryffindor(String name, int magic, int transgression,
                        int nobility, int honor, int bravery) {
          super(name, magic, transgression);
          this.nobility = nobility;
          this.honor = honor;
          this.bravery = bravery;
      }



      public int getNobility() {
          return nobility;
      }

      public int getHonor() {
          return honor;
      }

      public int getBravery() {
          return bravery;
      }


      public int theAmountOfPointsGryffindor(){
          int sum = 0;
          return sum = nobility + honor + bravery;
      }/////// the sum of the properties


      public static void studentComparisonsGryffindor(Gryffindor gryffindor1, Gryffindor gryffindor2){
          if(gryffindor1.theAmountOfPointsGryffindor() > gryffindor2.theAmountOfPointsGryffindor()){
              System.out.println(gryffindor1.getName() + " лучший Гриффиндорец, чем " + gryffindor2.getName());
          }else if (gryffindor1.theAmountOfPointsGryffindor() < gryffindor2.theAmountOfPointsGryffindor()) {
              System.out.println(gryffindor2.getName() + " лучший Гриффиндорец, чем  " + gryffindor1.getName());
          }else {
              System.out.println(gryffindor1.getName() + " " + gryffindor2.getName() + " Лучшие Гриффиндорцы.");
          }
      }/// compare two students of the same faculty with each other in terms of properties

  }
