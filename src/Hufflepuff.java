public class Hufflepuff extends Hogwarts {

    private final int industriousness;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int magic, int transgression,
                      int industriousness, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public int theAmountOfPointsHufflepuff(){
        int sum = 0;
        return sum = industriousness + loyalty + honesty;
    }/////// the sum of the properties


    public static void studentComparisonsHufflepuff(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2){
        if(hufflepuff1.theAmountOfPointsHufflepuff() > hufflepuff2.theAmountOfPointsHufflepuff()){
            System.out.println(hufflepuff1.getName() + " лучший Пуффендуец, чем " + hufflepuff2.getName());
        }else if (hufflepuff1.theAmountOfPointsHufflepuff() < hufflepuff2.theAmountOfPointsHufflepuff()) {
            System.out.println(hufflepuff2.getName() + " лучший Пуффендуец, чем  " + hufflepuff1.getName());
        }else {
            System.out.println(hufflepuff1.getName() + " " + hufflepuff2.getName() + " Лучшие Пуффендуйцы.");
        }
    }/// compare two students of the same faculty with each other in terms of properties

}
