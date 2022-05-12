import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int c, r;

        c = leer.nextInt();
        r = leer.nextInt();

        int[][] matriz = new int[c][r];


        // leer matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = leer.nextInt();

            }
        }

        // renglones

        int max = c + r;

        System.out.println("Validación de renglones:");

        for(int x = 0 ; x < c; x++)

        {

            String sum = "";
            boolean good = true;

            for(int y = 0; y < r; y++)

            {

                if (matriz[x][y] > max)
                {
                    good = false;
                    break;
                }

                int count = ( sum.split(Integer.toString(matriz[x][y]), -1).length) - 1;
                if(count > 0)
                {
                    good = false;
                    break;

                }

                sum = sum + " " + matriz[x][y];





            }

            if (good)
                System.out.printf("1 ");
            else
                System.out.printf("0 ");

        }


        System.out.println("\nValidación de columnas:");

        for(int y = 0; y < r; y++)
        {

            String sum = "";
            boolean good = true;

            for(int x = 0 ; x < c; x++)

            {

                if (matriz[x][y] > max)
                {
                    good = false;
                    break;
                }

                int count = ( sum.split(Integer.toString(matriz[x][y]), -1).length) - 1;
                if(count > 0)
                {
                    good = false;
                    break;

                }

                sum = sum + " " + matriz[x][y];


            }

            if (good)
                System.out.printf("1 ");
            else
                System.out.printf("0 ");


        }

    }

}

