package day11_loops;

public class NestedForLoop01 {
    public static void main(String[] args) {

       /*
            1.Example:Type code to get the output like. Asagidaki ciktiyi verecek kodu yaziniz
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */

        for (int i=1; i<3; i++){
            System.out.println("Week: "+ i);

            for (int k=1; k<4; k++){
                System.out.println("  Day: "+ k);
            }
        }



    }
}
