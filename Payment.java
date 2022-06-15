import java.util.Scanner;

public class Payment {
    public Payment(){

    }
    public void Eleccion_Tarjeta(){
        int Op;
        Scanner input = new Scanner(System.in);
        System.out.println("Elija el tipo de tarjeta con el que va a pagar");
        System.out.println("1. MASTERCARD");
        System.out.println("2. VISA");
        System.out.print("Elige: ");
        Op = input.nextInt();
        switch(Op){
            case 1:
                Ingrese_Nombre();
                Ingrese_Apellido();
                Ingrese_NroTrajeta();
                Ingrese_CVC();
                Ingrese_Caducidad();
            break;
            case 2:
                Ingrese_Nombre();
                Ingrese_Apellido();
                Ingrese_NroTrajeta();
                Ingrese_CVC();
                Ingrese_Caducidad();
            break;
        }
    }
    public void Ingrese_Nombre(){
        String Nombre;
        Scanner input = new Scanner(System.in);
        System.out.println("INGRESE SU NOMBRE TAL COMO EN LA TARJETA");
        Nombre = input.nextLine();
    }
    public void Ingrese_Apellido(){
        String Apellido;
        Scanner input = new Scanner(System.in);
        System.out.println("INGRESE SU APELLIDO TAL COMO EN LA TARJETA");
        Apellido = input.nextLine();
    }
    public void Ingrese_NroTrajeta(){
        int Tarjeta;
        Scanner input = new Scanner(System.in);
        System.out.println("INGRESE SU NUMERO DE TARJETA");
        Tarjeta = input.nextInt();
    }
    public void Ingrese_CVC(){
        int CVC;
        Scanner input = new Scanner(System.in);
        System.out.println("INGRESE LOS ULTIMOS 3 NUMEROS DETRAS DE SU TARJETA");
        CVC = input.nextInt();
    }
    public void Ingrese_Caducidad(){
        int Mes, Año;
        Scanner input = new Scanner(System.in);
        System.out.println("INGRESE EL MES DE CADUCIDAD EN DIGITOS");
        Mes = input.nextInt();
        System.out.println("INGRESE LOS DOS ULTIMOS DIGITOS DEL AÑO DE CADUCIDAD");
        System.out.print(Mes + "/");
        Año = input.nextInt();
    }
}