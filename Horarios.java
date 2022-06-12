import java.text.BreakIterator;
import java.util.Scanner;

public class Horarios extends Cartelera{
    public String[] Dias;
    public String[] Horarios;
    public Horarios(){
    }
    public void Añadir_Dias(){
        Dias = new String [8];
        Dias[1] = "Lunes";
        Dias[2] = "Martes";
        Dias[3] = "Miercoles";
        Dias[4] = "Jueves";
        Dias[5] = "Viernes";
        Dias[6] = "Sabado";
        Dias[7] = "Domingo";
        for(int i=1;i<=7;i++){
            System.out.println(i + ". " + Dias[i]);
        }
        System.out.println("Elige el dia a desear: ");
    }
    public void Elijo_Horario(){
        Horarios = new String [14];
        Horarios[1] = "12:30";
        Horarios[2] = "13:20";
        Horarios[3] = "14:00";
        Horarios[4] = "14:40";
        Horarios[5] = "15:40";
        Horarios[6] = "16:30";
        Horarios[7] = "17:00";
        Horarios[8] = "17:50";
        Horarios[9] = "18:50";
        Horarios[10] = "19:45";
        Horarios[11] = "21:00";
        Horarios[12] = "22:00";
        Horarios[13] = "23:00";
    }
    public void Cadaver_Exquisito(){
        Añadir_Dias();
        System.out.print("Elija el DIa: ");
        String Hs = "22:50";
        int Op;
        Scanner input = new Scanner(System.in);
        Op = input.nextInt();
        if((Op > 0) & (Op < 8)){
            System.out.println(Hs);
        }else System.err.println("!Error¡ no selecciono ninguna opcion");
        }
        public void DR_Strange_2(){
            Añadir_Dias();
        int Op;
        Scanner input = new Scanner(System.in);
        Op = input.nextInt();
        switch(Op){
            case 1:
                DR_Strange_2_ophs();
            break;
            case 2:
                DR_Strange_2_ophs();
            break;
            case 3:
                DR_Strange_2_ophs();
            break;
            case 4:
                DR_Strange_2_ophs();
            break;
            case 5:
                DR_Strange_2_ophs();
            break;
            case 6:
                DR_Strange_2_ophs();
            break;
            case 7:
                DR_Strange_2_ophs();
            break;
            default: System.err.println("!Error¡. No ingreso ninguna de las opciones");
            }
        }
        public void DR_Strange_2_ophs(){
            System.out.println("1. 14:50");
            System.out.println("2. 19:50");
            System.out.println("Elija el Horario: ");
        int Op;
        String Hs;
        Scanner input = new Scanner(System.in);
        Op = input.nextInt();
        switch(Op){
            case 1:
                Hs = "14:50";
                System.out.print(Hs);
            break;
            case 2:
                Hs = "19:50";
                System.out.print(Hs);
            break;
            default: System.err.println("!Error¡. No ingreso ninguna de las opciones");
            }
        }
        public void GemeloSiniestro_hs(){
            System.out.println("1. 22:40");
            System.out.println("2. 01:15");
            System.out.println("Elige el horario: ");
            String Hs;
            Scanner input = new Scanner(System.in);
            int Op = input.nextInt();
            switch(Op){
                case 1:
                    Hs = "22:40";
                    System.out.println(Hs);
                break;
                case 2:
                    Hs = "01:15";
                    System.out.println(Hs);
                break;
                default: System.err.println("!Error¡ No eligio ninguna de las opciones");
            }
        }
        public void Gemelo_Siniestro_day(){
            Añadir_Dias();
            Scanner input = new Scanner(System.in);
            int Op = input.nextInt();
            switch(Op){
                case 1:
                    GemeloSiniestro_hs();
                break;
                case 2:
                    GemeloSiniestro_hs();
                break;
                case 3:
                    GemeloSiniestro_hs();
                break;
                case 4:
                    GemeloSiniestro_hs();
                break;
                case 5:
                    GemeloSiniestro_hs();
                break;
                case 6:
                    GemeloSiniestro_hs();
                break;
                case 7:
                    GemeloSiniestro_hs();
                break;
                default: System.err.println("!Error¡ No eligiio la opcion correcta");
            }
        }
        public void JurassicWorld(){
            Añadir_Dias();
            Scanner input = new Scanner(System.in);
            int Op = input.nextInt();
            switch(Op){
                case 1:
                    JurassicWorld_hs();
                break;
                case 2:
                    JurassicWorld_hs();
                break;
                case 3:
                    JurassicWorld_hs();
                break;
                case 4:
                    JurassicWorld_hs();
                break;
                case 5:
                    JurassicWorld_hs();
                break;
                case 6:
                    JurassicWorld_hs();
                break;
                case 7:
                    JurassicWorld_hs();
                break;
                default: System.err.println("!Error¡ No eligio ninguna de las opciones");
            }
        }
        public void JurassicWorld_hs(){
            System.out.println("1. 18:50");
            System.out.println("2. 22:00");
            System.out.println("3. 01:10");
            System.out.println("Elija el horario que quiere");
            String Hs;
            Scanner input = new Scanner(System.in);
            int Op = input.nextInt();
            switch(Op){
                case 1:
                    Hs = "18:50";
                    System.out.println(Hs);
                break;
                case 2:
                    Hs = "22:00";
                    System.out.println(Hs);
                break;
                case 3:
                    Hs = "01:10";
                    System.out.println(Hs);
                break;
                default: System.err.println("!Error¡ No eligio ninguna de las opciones");
            }
        }
        public void Sonic2_dia(){
            Añadir_Dias();
            Scanner input = Scanner(System.in);
            int Op = input.nextInt();
            switch(Op){
                case 1:
                    Sonic2_hs();
                break;
                case 2:
                    Sonic2_hs();
                break;
                case 3:
                    Sonic2_hs();
                break;
                case 4:
                    Sonic2_hs();
                break;
                case 5:
                    Sonic2_hs();
                break;
                case 6:
                    Sonic2_hs();
                break;
                case 7:
                    Sonic2_hs();
                break;
                default: System.err.println("!Error¡ no eligio ninguna de las opciones");
            }
        }
        public void Sonic2_hs(){
            System.out.println("1. 13:30");
            System.out.println("2. 16:15");
            System.out.println("Elige el horario");
            String Hs;
            Scanner input = new Scanner(System.in);
            int Op = input.nextInt();
            switch(Op){
                case 1:
                    Hs = "13:30";
                    System.out.println(Hs);
                break;
                case 2:
                    Hs = "16:15";
                    System.out.println(Hs);
                break;
                default: System.err.println("!Error¡ No ingreso ninguna de las opciones");
                break;
            }
        }
        public void TopGunMaverick(){
            Añadir_Dias();
            Scanner input = new Scanner();
            int Op = input.nextInt();
            switch (Op) {
                case 1:
                    TopGunMaverick_hs();
                break;
                case 2:
                    TopGunMaverick_hs();
                break;
                case 3:
                    TopGunMaverick_hs();
                break;
                case 4:
                    TopGunMaverick_hs();
                break;
                case 5:
                    TopGunMaverick_hs();
                break;
                case 6:
                    TopGunMaverick_hs();
                break;
                case 7:
                    TopGunMaverick_hs();
                break;
                default: System.err.println("!Error¡ No eligio ninguna opcion");
            }
        }
        public void TopGunMaverick_hs(){
            System.out.println("1. 19:10");
            System.out.println("2. 22:10");
            System.out.println("Elige el Horario: ");
            String Hs;
            Scanner input = new Scanner(System.in);
            int Op = input.nextInt();
            switch(Op){
            case 1:
                Hs = "19:30";
                System.out.println(Hs);
            break;
            case 2:
                Hs = "22:10";
                System.out.println(Hs);   
            break;
            default: System.err.println("!Error¡ No eligio ninguna Opcion");
            }
        }
    }
