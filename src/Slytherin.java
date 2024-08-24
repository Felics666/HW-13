public class Slytherin extends Hogwarts {

    private final int trick;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public Slytherin(String name, int magic, int transgression, int trick,
                     int determination, int ambition, int resourcefulness, int thirstForPower) {

        super(name, magic, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;

    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public int theAmountOfPointsSlytherin(){
        int sum = 0;
        return sum = trick + determination + ambition + resourcefulness + thirstForPower;
    }/////// the sum of the properties


    public static void studentComparisonsSlytherin(Slytherin slytherin1, Slytherin slytherin2){
        if(slytherin1.theAmountOfPointsSlytherin() > slytherin2.theAmountOfPointsSlytherin()){
            System.out.println(slytherin1.getName() + " лучший Слизеринец, чем " + slytherin2.getName());
        }else if (slytherin1.theAmountOfPointsSlytherin() < slytherin2.theAmountOfPointsSlytherin()) {
            System.out.println(slytherin2.getName() + " лучший Слизеринец, чем  " + slytherin1.getName());
        }else {
            System.out.println(slytherin1.getName() + " " + slytherin2.getName() + " Лучшие Слизеринцы.");
        }
    }/// compare two students of the same faculty with each other in terms of properties

}
