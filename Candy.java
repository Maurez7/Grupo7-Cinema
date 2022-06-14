import java.util.Scanner;

public class Candy {
    public Candy(){

    }
    public void Seleccion_Candy(){
        System.out.println("1. RECOMENDADO");
        System.out.println("2. COMBO SUSCRIPCION CINE FAN");
        System.out.println("3. COMBOS");
        System.out.println("4. POCHOCLOS");
        System.out.println("5. BEBIDAS");
        System.out.println("6. SNACKS");
        System.out.println("7. GOLOSINAS");
        System.out.println("8. SIN CANDY");

    } 
    public void RECOMENDADO(){
        System.out.println("RECOMENDADO");
        System.out.println("1. CUBETA LIGHTYEAR");
        System.out.println("2. VASO LIGHTYEAR");
        System.out.println("ELige una opcion");
        Scanner input = new Scanner(System.in);
        int Op = input.nextInt();
        String Candy;
        switch(Op){
            case 1:
                Candy = "CUBETA LIGHT YEAR $2900";
                System.out.println(Candy);
                break;
            case 2:
                Candy = "VASO LIGHTYEAR $2700";
                System.out.println("");
            break;
            default: System.err.println("!Error¡ No eligio ninguna de las Opciones");
        }
    }
    public void COMBO_SUSCRIPCION_FAN(){
        String Candy = "COMBO MEGA SUSCRIPCION $1090";
        System.out.println(Candy);
    }
    public void COLECCIONABLES_Y_MERCHANDISING(){
        String Candy;
        System.out.println("COLECCIONABLES & MERCHANDISING");
        System.out.println("1. COMBO TOP GUN");
        System.out.println("2. COMBO VASO MULTIVERSO DE LA LOCURA");
        System.out.println("ELIGE UNA OPCION");
        Scanner input = new Scanner(System.in);
        int Op = input.nextInt();
        switch(Op){
            case 1: 
                Candy = "COMBO TOP GUN $3200";
                System.out.println(Candy);
            break;
            case 2:
                Candy = "COMBO VASO MULTIVERSO DE LA LOCURA $2600";
                System.out.println(Candy);
            break;
            default: System.err.println("!Error! No eligio ninguna de las opciones");
        }
    }
    public void COMBOS(){
        System.out.println("COMBOS");
        System.out.println("1. COMBO MEGA RECARGADO $1570");
        System.out.println("2. COMBO MEGA $1320");
        System.out.println("3. COMBO NACHOS $810");
        System.out.println("4. COMBO MEGA INDIVIDUAL $930");
        System.out.println("Elige una opcion");
        Scanner input = new Scanner(System.in);
        int Op = input.nextInt();
        String Candy;
        switch(Op){
            case 1:
                Candy = "COMBO MEGA RECARGADO $1570";    
                System.out.println("Candy");
                break;
            case 2:
                Candy = "COMBO MEGA $1320";
                System.out.println("Candy");
            case 3:
                Candy = "COMBO NACHOS $810";
                System.out.println("Candy");
            break;
            case 4:
                Candy = "COMBO MEGA INDIVIDUAL $930";
                System.out.println("Candy"); 
            break;
            default: System.err.println("!Error¡ NO eligio ninguna de las opciones");
        }
    }
    public void Pochoclos(){
        System.out.println("POCHOCLOS");
        System.out.println("1. BALDE POCHOLOS $500");
        System.out.println("2. POP MEDIANO $500");
        System.out.print("Elige una opcion: ");
        Scanner input = new Scanner(System.in);
        int Op = input.nextInt();
        String Candy;
        switch(Op){
            case 1:
            Candy="BALDE POCHOLOS $500";
            System.out.println(Candy);
            break;
            case 2:
            Candy = "POP MEDIANO $500";
            System.out.println(Candy);
            break;
            default: System.err.println("!Error¡ No ingreso niguna de la opciones");
        }
    }
    public void Bebidas(){
        String Candy;
        Candy = "BEBIDA GRANDE $500";
        System.out.println(Candy);
    }
    public void Snacks(){
        String Candy;
        System.out.println("SNACKS");
        System.out.println("1. NACHOS CON QUESO $640");
        System.out.println("2. PANCHO $400");
        System.out.print("Elige una opcion: ");
        Scanner input = new Scanner(System.in);
        int Op = input.nextInt();
        switch(Op){
            case 1:
            Candy = "NACHOS CON QUESO $640";
            System.out.println(Candy);
            break;
            case 2:
            Candy = "PANCHO $400";
            System.out.println(Candy);
            break;
            default: System.err.println("!Error¡ No ingreso niguna de la opciones");
        }
    }
    public void Golosinas(){
        String Candy;
        System.out.println("GOLOSINAS");
        System.out.println("1. GOLOSINAS SNICKERS $450");
        System.out.println("2. ROCKLETS CHICOS $300");
        System.out.println("Elige una opcion: ");
        Scanner input = new Scanner(System.in);
        int Op = input.nextInt();
        switch(Op){
            case 1:
                Candy = "GOLOSINAS SNICKERS $450";
                System.out.println(Candy);
                break;
            case 2:
                Candy = "ROCKLETS CHICOS $300";
                System.out.println(Candy);
                break;
            default: System.err.println("!Error¡ No ingreso niguna de la opciones");
        }
    }
}
