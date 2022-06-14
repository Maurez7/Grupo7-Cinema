import java.util.Scanner;
import java.util.Random;
public class Asientos {
    
    public Asientos(){

    }
    public void Sala(){
        String matriz[][] = new String[11][17];
        matriz[0][0] = "A";
        matriz[0][1] = "1";
        matriz[0][2] = "2";
        matriz[0][3] = "3";
        matriz[0][4] = "4";
        matriz[0][5] = "5";
        matriz[0][6] = "6";
        matriz[0][7] = "7";
        matriz[0][8] = "8";
        matriz[0][9] = "9";
        matriz[0][10] = "10";
        matriz[0][11] = "11";
        matriz[0][12] = "12";
        matriz[0][13] = "13";
        matriz[0][14] = "14";
        matriz[0][15] = "15";
        matriz[0][16] = "16";
        matriz[1][0] = "B";
        matriz[1][1] = "1";
        matriz[1][2] = "2";
        matriz[1][3] = "3";
        matriz[1][4] = "4";
        matriz[1][5] = "5";
        matriz[1][6] = "6";
        matriz[1][7] = "7";
        matriz[1][8] = "8";
        matriz[1][9] = "9";
        matriz[1][10] = "10";
        matriz[1][11] = "11";
        matriz[1][12] = "12";
        matriz[1][13] = "13";
        matriz[1][14] = "14";
        matriz[1][15] = "15";
        matriz[1][16] = "16";
        matriz[2][0] = "C";
        matriz[2][1] = "1";
        matriz[2][2] = "2";
        matriz[2][3] = "3";
        matriz[2][4] = "4";
        matriz[2][5] = "5";
        matriz[2][6] = "6";
        matriz[2][7] = "7";
        matriz[2][8] = "8";
        matriz[2][9] = "9";
        matriz[2][10] = "10";
        matriz[2][11] = "11";
        matriz[2][12] = "12";
        matriz[2][13] = "13";
        matriz[2][14] = "14";
        matriz[2][15] = "15";
        matriz[2][16] = "16";
        matriz[3][0] = "D";
        matriz[3][1] = "1";
        matriz[3][2] = "2";
        matriz[3][3] = "3";
        matriz[3][4] = "4";
        matriz[3][5] = "5";
        matriz[3][6] = "6";
        matriz[3][7] = "7";
        matriz[3][8] = "8";
        matriz[3][9] = "9";
        matriz[3][10] = "10";
        matriz[3][11] = "11";
        matriz[3][12] = "12";
        matriz[3][13] = "13";
        matriz[3][14] = "14";
        matriz[3][15] = "15";
        matriz[3][16] = "16";
        matriz[4][0] = "E";
        matriz[4][1] = "1";
        matriz[4][2] = "2";
        matriz[4][3] = "3";
        matriz[4][4] = "4";
        matriz[4][5] = "5";
        matriz[4][6] = "6";
        matriz[4][7] = "7";
        matriz[4][8] = "8";
        matriz[4][9] = "9";
        matriz[4][10] = "10";
        matriz[4][11] = "11";
        matriz[4][12] = "12";
        matriz[4][13] = "13";
        matriz[4][14] = "14";
        matriz[4][15] = "15";
        matriz[4][16] = "16";
        matriz[5][0] = "F";
        matriz[5][1] = "1";
        matriz[5][2] = "2";
        matriz[5][3] = "3";
        matriz[5][4] = "4";
        matriz[5][5] = "5";
        matriz[5][6] = "6";
        matriz[5][7] = "7";
        matriz[5][8] = "8";
        matriz[5][9] = "9";
        matriz[5][10] = "10";
        matriz[5][11] = "11";
        matriz[5][12] = "12";
        matriz[5][13] = "13";
        matriz[5][14] = "14";
        matriz[5][15] = "15";
        matriz[5][16] = "16";
        matriz[6][0] = "G";
        matriz[6][1] = "1";
        matriz[6][2] = "2";
        matriz[6][3] = "3";
        matriz[6][4] = "4";
        matriz[6][5] = "5";
        matriz[6][6] = "6";
        matriz[6][7] = "7";
        matriz[6][8] = "8";
        matriz[6][9] = "9";
        matriz[6][10] = "10";
        matriz[6][11] = "11";
        matriz[6][12] = "12";
        matriz[6][13] = "13";
        matriz[6][14] = "14";
        matriz[6][15] = "15";
        matriz[6][16] = "16";
        matriz[7][0] = "H";
        matriz[7][1] = "1";
        matriz[7][2] = "2";
        matriz[7][3] = "3";
        matriz[7][4] = "4";
        matriz[7][5] = "5";
        matriz[7][6] = "6";
        matriz[7][7] = "7";
        matriz[7][8] = "8";
        matriz[7][9] = "9";
        matriz[7][10] = "10";
        matriz[7][11] = "11";
        matriz[7][12] = "12";
        matriz[7][13] = "13";
        matriz[7][14] = "14";
        matriz[7][15] = "15";
        matriz[7][16] = "16";
        matriz[8][0] = "I";
        matriz[8][1] = "1";
        matriz[8][2] = "2";
        matriz[8][3] = "3";
        matriz[8][4] = "4";
        matriz[8][5] = "5";
        matriz[8][6] = "6";
        matriz[8][7] = "7";
        matriz[8][8] = "8";
        matriz[8][9] = "9";
        matriz[8][10] = "10";
        matriz[8][11] = "11";
        matriz[8][12] = "12";
        matriz[8][13] = "13";
        matriz[8][14] = "14";
        matriz[8][15] = "15";
        matriz[8][16] = "16";
        matriz[9][0] = "J";
        matriz[9][1] = "1";
        matriz[9][2] = "2";
        matriz[9][3] = "3";
        matriz[9][4] = "4";
        matriz[9][5] = "5";
        matriz[9][6] = "6";
        matriz[9][7] = "7";
        matriz[9][8] = "8";
        matriz[9][9] = "9";
        matriz[9][10] = "10";
        matriz[9][11] = "11";
        matriz[9][12] = "12";
        matriz[9][13] = "13";
        matriz[9][14] = "14";
        matriz[9][15] = "15";
        matriz[9][16] = "16";
        matriz[10][0] = "K";
        matriz[10][1] = "1";
        matriz[10][2] = "2";
        matriz[10][3] = "3";
        matriz[10][4] = "4";
        matriz[10][5] = "5";
        matriz[10][6] = "6";
        matriz[10][7] = "7";
        matriz[10][8] = "8";
        matriz[10][9] = "9";
        matriz[10][10] = "10";
        matriz[10][11] = "11";
        matriz[10][12] = "12";
        matriz[10][13] = "13";
        matriz[10][14] = "14";
        matriz[10][15] = "15";
        matriz[10][16] = "16";
            for (int x=0; x < matriz.length; x++) {
                System.out.print("|");
                for (int y=0; y < matriz[x].length; y++) {
                    System.out.print (matriz[x][y]);
                    if (y!=matriz[x].length-1) System.out.print("\t");
                    
                }
                System.out.println("|");
            }
                Scanner input = new Scanner(System.in);
                System.out.println("Ingrese la columna a elegir: ");
                String Op = input.nextLine();
                System.out.println("Ingrese la fila a elegir");
                String Fila = input.nextLine();
                int Camb;
                switch(Op){
                    case "A":
                        Camb = 0;
                        Elegir_Asiento(matriz, Camb, Fila, Op);
                    break;
                    case "B":
                        Camb = 1;
                        Elegir_Asiento(matriz, Camb, Fila,Op);
                    break;
                    case "C":
                        Camb = 2;
                        Elegir_Asiento(matriz, Camb, Fila, Op);
                    break;
                    case "D":
                        Camb = 3;
                        Elegir_Asiento(matriz, Camb, Fila, Op);
                    break;
                    case "E":
                        Camb = 4;
                        Elegir_Asiento(matriz, Camb, Fila, Op);
                    break;
                    case "F":
                        Camb = 5;
                        Elegir_Asiento(matriz, Camb, Fila, Op);
                    break;
                    case "G":
                        Camb = 6;
                        Elegir_Asiento(matriz, Camb, Fila, Op);
                    break;
                    case "H":
                        Camb = 7;
                        Elegir_Asiento(matriz, Camb, Fila, Op);
                    break;
                    case "I":
                        Camb = 8;
                        Elegir_Asiento(matriz, Camb, Fila, Op);
                    break;
                    case "J":
                        Camb = 9;
                        Elegir_Asiento(matriz, Camb, Fila, Op);
                    break;
                    case "K":
                        Camb = 10;
                        Elegir_Asiento(matriz, Camb, Fila, Op);
                    break;
                    }
    }
    public void Elegir_Asiento(String[][] M, int Camb, String Fila, String Op){
        boolean c = false, f = false;
        for (int i = 0; i <= M.length - 1; i++) {
            if(i == Camb){
                c = true;
            }
            for (int j = 0; j <= M[i].length - 1; j++) {
                if (M[i][j] == Fila) {
                    f = true;
                }
            }
        }
        if(c == true){
            int Sala = random.nextInt(8 + 1) + 1;
            System.out.println("Sala: " + Sala);
            System.out.println("Asiento : " + Op + Fila);
        }
    }
}