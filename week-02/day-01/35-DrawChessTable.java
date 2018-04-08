public class DrawChessTable {
    public static void main(String[] args) {

        // Create a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        /* zsu_karap: I take it it should be a pre-defined 8*8 chess table, since task hasn't mentioned prompting user
        to enter a number to get a parameter.
        */

        String lineVariation1 = "% % % % ";
        String lineVariation2 = " % % % %";

        for (int i = 0; i < 8; i++){
            if (i % 2 == 0){
                System.out.println(lineVariation1);
            }
            else {
                System.out.println(lineVariation2);
            }
        }



    }
}