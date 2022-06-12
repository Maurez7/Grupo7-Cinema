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
}
