/*Ioanna Zournatzi*/

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //orizoume metavlites kai pinakes
        int i;
        char[] arr = new char[10];
        char[] tmp = new char[10];
        char[] clonedarray = new char[10];
        char[] a = new char[5];
        char[] b = new char[5];
        char k = 0;
   
     
//Kaloume tis synartiseis tis klasis Character Table kai tis tupwnoume
        System.out.println(
                "Fill table with random chars:");
        CharacterTable.filltableRandomly(arr);

        System.out.println(
                "\n Print table horizontally");
        CharacterTable.printTableΗ(arr);

        System.out.println(
                "\nPrint table vertically");
        CharacterTable.printTableV(arr);

        System.out.println(
                "---------");
        System.out.print("Swap two last values:");
        CharacterTable.swapValues(arr);

        System.out.println(
                "---------");
        System.out.println("Find all the positions the second char is displayed");
        CharacterTable.LocationChar(arr, k);

        System.out.println("---------");
        System.out.println("First Table:");
        System.out.print("Cloned table");
        CharacterTable.cloneTable(clonedarray);

        System.out.println("---------");

        CharacterTable.mergeTables(a, b);

        System.out.println("---------");
        System.out.print("Convert array to string: ");
        CharacterTable.ConvertToString(arr);

        System.out.println("------");
        System.out.println("Convert array to string given parameters: ");
        
        CharacterTable.ConvertToString(arr, 2, 7);

    }

}
