public class Hogwarts {

    private final String name;
    private final int magic;
    private final int transgression;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public int theAmountOfPointsHogwarts(){
        int sum = 0;
        return sum = magic + transgression;
    }/// the sum of the properties


    public static void studentComparisonsHogwarts(Hogwarts student1, Hogwarts student2){
        if(student1.theAmountOfPointsHogwarts() > student2.theAmountOfPointsHogwarts()){
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        }else if (student1.theAmountOfPointsHogwarts() < student2.theAmountOfPointsHogwarts()) {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        }else {
            System.out.println(student1.getName() + " " + student2.getName() + " Обладают равной силой магии");
        }
    }//// compares any two Hogwarts students in terms of magic power and transgression distance

}
