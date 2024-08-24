public class Main {
    public static void main(String[] args) {

        PrintStudentInfo printStudentInfo = new PrintStudentInfo();

        Gryffindor harryPotter  = new Gryffindor("Harry Potter", 90, 40,58,45,67);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 65, 45,34,22,56);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 30,40,30,20,15);

        ///// Вывод данных о студенте
        printStudentInfo.printStudentInformation(harryPotter);
        printStudentInfo.printStudentInformation(hermioneGranger);
        printStudentInfo.printStudentInformation(ronWeasley);

        Ravenclaw choChang = new Ravenclaw("Cho Chang", 20,25,12,54,12,12);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 24,21,12,21,12,53);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 43,15,45,14,34,43);

        ///// Вывод данных о студенте
        printStudentInfo.printStudentInformation(choChang);
        printStudentInfo.printStudentInformation(padmaPatil);
        printStudentInfo.printStudentInformation(marcusBelby);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith",21,34,65,21,67);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory",32,42,55,64,34);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley",7,23,12,65,21);

        ///// Вывод данных о студенте
        printStudentInfo.printStudentInformation(zachariasSmith);
        printStudentInfo.printStudentInformation(cedricDiggory);
        printStudentInfo.printStudentInformation(justinFinchFletchley);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy",54,32,56,76,56,60,80);
        Slytherin grahamMontague = new Slytherin("Graham Montague",34,21,34,42,15,12,43);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle",32,25,32,29,43,43,55);

        ///// Вывод данных о студенте
        printStudentInfo.printStudentInformation(dracoMalfoy);
        printStudentInfo.printStudentInformation(grahamMontague);
        printStudentInfo.printStudentInformation(gregoryGoyle);


        //// Сравнение двух учеников одного факультета

        /// Gryffindor
        Gryffindor.studentComparisonsGryffindor(harryPotter, hermioneGranger);
        System.out.println("-------------------------------------------------------------");

        /// Ravenclaw
        Ravenclaw.studentComparisonsRavenclaw(choChang,marcusBelby);
        System.out.println("-------------------------------------------------------------");

        /// Hufflepuff
        Hufflepuff.studentComparisonsHufflepuff(justinFinchFletchley, cedricDiggory);
        System.out.println("-------------------------------------------------------------");

        /// Slytherin
        Slytherin.studentComparisonsSlytherin(dracoMalfoy, gregoryGoyle);
        System.out.println("-------------------------------------------------------------");

        //// Сравнение двух учеников разных факультетов
        Hogwarts.studentComparisonsHogwarts(dracoMalfoy, harryPotter);



    }
}