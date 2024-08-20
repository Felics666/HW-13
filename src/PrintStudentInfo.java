public class PrintStudentInfo {

    public void printStudentInformation(Gryffindor gryffindor) {
        System.out.println("-------------------------Gryffindor Faculty-------------------------\n" +
                "Name: " + gryffindor.getName() + "\n" +
                "magic = " + gryffindor.getMagic() + "\n" +
                "transgression = " + gryffindor.getTransgression() + "\n" +
                "nobility = " + gryffindor.getNobility() + "\n" +
                "honor = " + gryffindor.getHonor() + "\n" +
                "Bravery = " + gryffindor.getBravery());
        System.out.println("--------------------------------------------------------------");
    }

    public void printStudentInformation(Ravenclaw ravenclaw) {
        System.out.println("-------------------------Ravenclaw Faculty-------------------------\n" +
                "Name: " + ravenclaw.getName() + "\n" +
                "magic = " + ravenclaw.getMagic() + "\n" +
                "transgression = " + ravenclaw.getTransgression() + "\n" +
                "mind = " + ravenclaw.getMind() + "\n" +
                "wisdom = " + ravenclaw.getWisdom() + "\n" +
                "wit = " + ravenclaw.getWit() + "\n" +
                "creation = " + ravenclaw.getCreation());
        System.out.println("--------------------------------------------------------------");
    }

    public void printStudentInformation(Hufflepuff hufflepuff) {
        System.out.println("-------------------------Hufflepuff Faculty-------------------------\n" +
                "Name: " + hufflepuff.getName() + "\n" +
                "magic = " + hufflepuff.getMagic() + "\n" +
                "transgression = " + hufflepuff.getTransgression() + "\n" +
                "industriousness = " + hufflepuff.getIndustriousness() + "\n" +
                "loyalty = " + hufflepuff.getLoyalty() + "\n" +
                "honesty = " + hufflepuff.getHonesty());
        System.out.println("--------------------------------------------------------------");
    }

    public void printStudentInformation(Slytherin slytherin) {
        System.out.println("-------------------------Slytherin Faculty-------------------------\n" +
                "Name: " + slytherin.getName() + "\n" +
                "magic = " + slytherin.getMagic() + "\n" +
                "transgression = " + slytherin.getTransgression() + "\n" +
                "trick = " + slytherin.getTrick() + "\n" +
                "determination = " + slytherin.getDetermination() + "\n" +
                "ambition = " + slytherin.getAmbition() + "\n" +
                "Resourcefulness = " + slytherin.getResourcefulness() + "\n" +
                "Thirst for power = " + slytherin.getThirstForPower());
        System.out.println("--------------------------------------------------------------");
    }

}
