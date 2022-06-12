import java.util.Scanner;

public class Entrada {
    
    public Entrada(){

    }
    public void Metodo_Pago(){
        System.out.println("BIENVENIDOS A CINE FAN");
        System.out.println("1. Entradas a Cine Fan $900");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////");
        System.out.println("GENERAL");
        System.out.println("2. General");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Entradas a 50% de descuento");
        System.out.println("3. American Express");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Promociones 2X1");
        System.out.println("4. Promociones 2X1");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////");
        System.out.println("ENTRADAS ESPECIALES");
        System.out.println("5. Entradas Especiales");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////");
        System.out.print("Elija una Opcion: ");
        String Entrada;
        Scanner input = new Scanner(System.in);
        int Op = input.nextInt();
        switch(Op){
            case 1:
                Entrada = "Entrada CINEFAN $900";
                System.out.println(Entrada);
            break;
            case 2:
                Entrada = "Entrada GENERAL $900";
                System.out.println(Entrada);
            break;
            case 3:
                Entrada = "Entrada 50% descuento $450";
                System.out.println(Entrada);
            break;
            case 4:
                Entradas2X1();
            break;
            case 5:

            break;
            default: System.err.println("!Error¡ No ingreso niguna de las opciones");
        }
    }
    public void Entradas2X1(){
        System.out.println("1. BBVA");
        System.out.println(" 2X1 $800");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////");
        System.out.println("2. Cencosud");
        System.out.println("2X1 800");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////");
        System.out.println("3. CLUB");
        system.out.println("2X1 $800");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////");
        System.out.println("4. Naranja");
        System.out.println("2X1 $800");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////");
        System.out.print("Elige una Opcion: ");
        String Entrada;
        Scanner input = new Scanner(System.in);
        int Op = input.nextInt();
        switch(Op){
            case 1:
                Entrada = "BBVA 2x1 $800";
                System.out.println(Entrada);
            break;
            case 2:
                Entrada = "CENCOSUD 2x1 $800";
                System.out.println("Entrada");
            break;
            case 3:
                Entrada = "CLUB 2x1 $800";
                System.out.println(Entrada);
            break;
            case 4:
                Entrada = "NARANJA 2x1 $800";
                System.out.println(Entrada);
            break;
            default: System.err.println("!Error¡ No eligio ninguna opcion");
        }
    }
    public void EntradaEspeciales(){
        System.out.println("1. BENEFICIO ESPECIAL");
        System.out.println("2. MENOR");
        System.out.println("3. JUBILADOS");
        System.out.print("Elige una opcion: ");
        Scanner input = new Scanner(System.in);
        int Op = input.nextInt();
        switch(Op){
            case 1:

            break;
            case 2:

            break;
            case 3:

            break;
            default: System.out.println("!Error¡ No eligio ninguna de las opciones");
        }
    }
}
