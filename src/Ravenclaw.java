public class Ravenclaw extends Hogwarts{

    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creation;

    public Ravenclaw(String name, int magic, int transgression, int mind,
                     int wisdom, int wit, int creation) {
        super(name, magic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    public int theAmountOfPointsRavenclaw(){
        int sum = 0;
        return sum = mind + wisdom + wit + creation;
    }/////// the sum of the properties


    public static void studentComparisonsRavenclaw(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2){
        if(ravenclaw1.theAmountOfPointsRavenclaw() > ravenclaw2.theAmountOfPointsRavenclaw()){
            System.out.println(ravenclaw1.getName() + " лучший Когтеврановец, чем " + ravenclaw2.getName());
        }else if (ravenclaw1.theAmountOfPointsRavenclaw() < ravenclaw2.theAmountOfPointsRavenclaw()) {
            System.out.println(ravenclaw2.getName() + " лучший Когтеврановец, чем  " + ravenclaw1.getName());
        }else {
            System.out.println(ravenclaw1.getName() + " " + ravenclaw2.getName() + " Лучшие Когтеврановцы.");
        }
    }/// compare two students of the same faculty with each other in terms of properties

}
