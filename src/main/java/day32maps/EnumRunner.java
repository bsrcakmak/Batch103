package day32maps;

public class EnumRunner {
    public static void main(String[] args) {

        String capital = UsStates.CALIFORNIA.getCapital();
        System.out.println(capital); // Sacramento

        String abbr = UsStates.FLORIDA.getAbbreviation();
        System.out.println(abbr); // FL

        String state = UsStates.getStateNameFromAbbreviation("FL");
        System.out.println(state); // Florida

        String stateName = UsStates.getStateNameFromCapital("Denver");
        System.out.println(stateName); // Colorado

        String abbreviation = UsStates.getAbbreviationFromCapital("Atlanta");
        System.out.println(abbreviation); // GA





    }
}
