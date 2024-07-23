public class Arrays {
    public static void main(String[] args) {

        String[] AndroidVersion = new String[17];

        String[] Days = new String[7];

        String[][] Cities = new String[4][2];

        int [][][] numbers = new int[2][2][2];

        int [][][][] numbers4 = new int[2][2][2][2];

        /*
        AQUI PODEMOS VISUALIZAR LAS DIFERENTES FORMAS DE DECLARAR ARREGLOS DE DIFERENTES DIMENSIONES
         */


        AndroidVersion[0] = "Kernel";
        AndroidVersion[1] = "Apple";
        AndroidVersion[2] = "Dont";
        AndroidVersion[3] = "Okay";

        for (int i = 0; i <= 3; i++) {
            System.out.println(AndroidVersion[i]);
        }
        /*
        System.out.println(AndroidVersion[0]);
        System.out.println(AndroidVersion[1]);
        System.out.println(AndroidVersion[2]);
        System.out.println(AndroidVersion[3]);
        */
        System.out.println();
        System.out.println();

        Cities[0][0] = "COLOMBIA";
        Cities[0][1] = "MEDELLIN";
        Cities[1][0] = "COLOMBIA";
        Cities[1][1] = "BOGOTA";
        Cities[2][0] = "MEXICO";
        Cities[2][1] = "GUADALAJARA";
        Cities[3][0] = "MEXICO";
        Cities[3][1] = "CDMX";

        for (int i = 0; i < Cities.length; i++) {
            for (int j = 0; j < Cities[i].length; j++) {

                System.out.println(Cities[i][j]);
            }
        }
        /*
        System.out.println(Cities[0][0]);
        System.out.println(Cities[0][1]);
        System.out.println(Cities[1][0]);
        System.out.println(Cities[1][1]);
        System.out.println(Cities[2][0]);
        System.out.println(Cities[2][1]);
        System.out.println(Cities[3][0]);
        System.out.println(Cities[3][1]);
        */
        System.out.println();
        System.out.println();

        String[][][][] animals = new String[2][3][2][2];
        animals [1][0][0][1]= "Monkey";

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {

                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }

        //System.out.println(animals[1][0][0][1]);
    }
}
