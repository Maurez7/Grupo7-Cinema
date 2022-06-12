import java.lang.ref.Cleaner;
import java.lang.runtime.SwitchBootstraps;
import java.text.BreakIterator;
import java.util.Scanner;
import java.util.Set;

public class Cartelera{
    public String[] Peliculas_lis;
    public String[] Foramtos_peli;
    // op = opcion
    public Cartelera(){
    }
    public void Añadir_Formatos(){
        this.Foramtos_peli = new String [12];
        this.Foramtos_peli[1] = "ESTRENOS";
        this.Foramtos_peli[2] = "CARTELERA";
        this.Foramtos_peli[3] = "VENTAS ANTICIPADAS";
        this.Foramtos_peli[4] = "PELICULAS 2D";
        this.Foramtos_peli[5] = "PELICULAS 3D";
        this.Foramtos_peli[6] = "PELICULAS 4D";
        this.Foramtos_peli[7] = "PELICULAS XD";
        this.Foramtos_peli[8] = "PELICULAS DBOX";
        this.Foramtos_peli[9] = "PREMIUM CLASS";
        this.Foramtos_peli[10] = "COMFORT";
        this.Foramtos_peli[11] = "PROXIMAMENTE";
        for(int j=1;j<=11;j++){
            System.out.println(j + ". " + Foramtos_peli[j]);
        }
    }
    public void Añadir_Peli(){
        this.Peliculas_lis = new String [11];
        this.Peliculas_lis[1] = "CADAVER EXQUISITO";
        this.Peliculas_lis[2] = "DOCTOR STRANGE EN EL MULTIVERSO DE LA LOCURA";
        this.Peliculas_lis[3] = "EL HOMBRE DEL NORTE";
        this.Peliculas_lis[4] = "GEMELO SINIESTRO";
        this.Peliculas_lis[5] = "JURASSIC WORLD DOMINIO";
        this.Peliculas_lis[6] = "LIGHTYEAR";
        this.Peliculas_lis[7] = "SHIRLEY";
        this.Peliculas_lis[8] = "SONIC 2";
        this.Peliculas_lis[9] = "TODO EN TODAS PARTES AL MISMO TIEMPO";
        this.Peliculas_lis[10] = "TOP GUN MAVERICK";
        for(int i=1;i<=10;i++){
            System.out.println(i + ". " + Peliculas_lis[i]);
        }
    }
    public void Mostrar_Descripcion(String Genero, String Duracion, String Reparto, String Director ){
        System.out.println("Genero: " + Genero);
        System.out.println("Duracion: " + Duracion);
        System.out.println("Reparto: " + Reparto);
        System.out.println("Director: " + Director);
    }
    public void pelicula_1(){
        Mostrar_Descripcion("Suspenso", "88min", "Analía Couceyro, Blanca Nieves Villalba, Rafael Spregelburd, Sofia Gala Castiglione", "Lucía Vassallo");
    }
    public void pelicula_2(){
        Mostrar_Descripcion("Acción", "126min", " Benedict Cumberbatch, Benedict Wong, Elizabeth Olsen", "Sam Raimi");
    }
    public void pelicula_3(){
        Mostrar_Descripcion("Acción", "137min", "Alexander Skarsgard, Anya Taylor -Joy, Ethan Hawke, Nicole Kidman, Willem Dafoe", "Robert Eggers");
    }
    public void pelicula_4(){

        Mostrar_Descripcion("Terror", "109min", "Steven Cree, Teresa Palmer, Tristan Ruggeri", "Taneli Mustonen");
    }
    public void pelicula_5(){
        Mostrar_Descripcion("Aventuras", "147min", "Bryce Dallas Howard, Chris Pratt, Laura Dern, Sam Neill", "Colin Trevorrow");
    }
    public void pelicula_6(){
        Mostrar_Descripcion("Animación", "100min", "*", "Angus MacLane");
    }
    public void pelicula_7(){
        Mostrar_Descripcion("Suspenso", "107min", "*", "Josephine Decker");
    }
    public void pelicula_8(){  
        Mostrar_Descripcion("Animación", "122min", "Idris Elba, Jim Carrey", "Jeff Fowler");
    }
    public void pelicula_9(){
        Mostrar_Descripcion("Accion", "139min","Jamie Lee Curtis, Ke Huy Quan, Michelle Yeoh", "Dan Kwan, Daniel Scheinert");
    }
    public void pelicula_10(){
        Mostrar_Descripcion("Acción", "131min", "Tom Cruise, Val Kilmer", "Joseph Kosinski");

    }
    public void Elige_Peli(){
        Añadir_Formatos();
        Scanner input = new Scanner(System.in);
        int Op;
        System.out.print("Elige el formato: ");
        Op = input.nextInt();
        switch(Op){
            case 1:
                ESTRENOS();
            break;
            case 2:
                CARTELERA();
            break;
            case 3:
                Ventas_Anticipadas();
            break;
            case 4:
                Peliculas_2D();
            break;
            case 5:
                Peliculas_3D();
            break;
            case 6:
                Peliculas_4D();
            break;
            case 7:
                Peliculas_XD();
            break;
            case 8:
                Peliculas_DBOX();
            break;
            case 9:
                PREMIUM_CLASS();
            break;
            case 10:
                COMFORT_PEL();
            break;
            case 11:
                PROXIMAMENTE();
            break;
            default: System.err.println("!Error¡. no ingreso ninguna de las opciones.");
        }
    }
    public void ESTRENOS(){
        int Op;
        System.out.println("1. CADAVER EXQUISITO");
        System.out.println("2. EL HOMBRE DEL NORTE");
        System.out.println("3. TODO EN TODAS PARTES AL MISMO TIEMPO");
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cual pelicula quieres ver?");
        Op = input.nextInt();
        switch(Op){
            case 1:
            System.out.println("1. CADAVER EXQUISITO");
            pelicula_1();
            break;
            case 2:
            System.out.println("2. EL HOMBRE DEL NORTE");
            pelicula_4();
            break;
            case 3:
            System.out.println("3. TODO EN TODAS PARTES AL MISMO TIEMPO");
            pelicula_9();
            break;
            default: System.err.println("!Error¡. no ingreso ninguna de las opciones.");
        }
    }
    public void CARTELERA(){
        Añadir_Peli();
        int Op;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cual pelicula quieres ver?");
        Op = input.nextInt();
        switch(Op){
            case 1:
                System.out.println("1. CADAVER EXQUISITO");
                pelicula_1();
            break;
            case 2:
                System.out.println("2. DR STRANGE EN EL MULTIVERSO DE LA LOCURA");
                pelicula_2();
            break;
            case 3:
                System.out.println("3. EL HOMBRE DEL NORTE");
                pelicula_3();
            break;
            case 4:
                System.out.println("4. GEMELO SINIESTRO");
                pelicula_4();
            break;
            case 5:
                System.out.println("5. JURASSIC WORLD DOMINIO");
                pelicula_5();
            break;
            case 6:
                System.out.println("6. LIGHTYEAR");
                pelicula_6();
            break;
            case 7:
                System.out.println("7. SHIRLEY");
                pelicula_7();
            break;
            case 8:
                System.out.println("8. SONIC 2");
                pelicula_8();
            break;
            case 9:
                System.out.println("9. TODO EN TODAS PARTES AL MISMO TIEMPO");
                pelicula_9();
            break;
            case 10:
                System.out.println("10. TOP GUN MAVERICK");
                pelicula_10();
            break;
            default: System.err.println("!Error¡. no ingreso ninguna de las opciones.");
            }   
    }
    public void Ventas_Anticipadas(){
        System.out.println("LIGHTYEAR");
        pelicula_6();
    }
    public void Peliculas_2D(){
        Añadir_Peli();
        int Op;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cual pelicula quieres ver?");
        Op = input.nextInt();
        switch(Op){
            case 1:
            System.out.println("1. CADAVER EXQUISITO");
            pelicula_1();
            break;
            case 2:
            System.out.println("2. DR STRANGE EN EL MULTIVERSO DE LA LOCURA");
            pelicula_2();
            break;
            case 3:
            System.out.println("3. EL HOMBRE DEL NORTE");
            pelicula_3();
            break;
            case 4:
            System.out.println("4. GEMELO SINIESTRO");
            pelicula_4();
            break;
            case 5:
            System.out.println("5. JURASSIC WORLD DOMINIO");
            pelicula_5();
            break;
            case 6:
            System.out.println("LIGHTYEAR");
            pelicula_6();
            break;
            case 7:
            System.out.println("SHIRLEY");
            pelicula_7();
            break;
            case 8:
            System.out.println("SONIC 2");
            pelicula_8();
            break;
            case 9:
            System.out.println("TODO EN TODAS PARTES AL MISMO TIEMPO");
            pelicula_9();
            break;
            case 10:
            System.out.println("TOP GUN MAVERICK");
            pelicula_10();
            break;
            default: System.err.println("!Error¡. no ingreso ninguna de las opciones.");
        }  
    }
    public void Peliculas_3D(){
        System.out.println("1. DR STRANGE EN EL MULTIVERSO DE LA LOCURA");
        System.out.println("2. JURASSIC WORLD DOMINIO");
        System.out.println("3. LIGHTYEAR");
        int Op;
        Scanner input = new Scanner(System.in);
        System.out.prinln("¿Cual pelicula quieres ver?");
        Op = input.nextInt();
        switch(Op){
            case 1:
            System.out.println("DR STRANGE EN EL MULTIVERSO DE LA LOCURA");
                pelicula_2();
            break;
            case 2:
                System.out.println("JURASSIC WORLD DOMINIO");
                pelicula_5();
            break;
            case 3:
            System.out.println("LIGHTYEAR");
                pelicula_6();
            break;
            default: System.err.println("!Error¡. no ingreso ninguna de las opciones.");
    }
}
    public void Peliculas_4D(){
        System.out.println("1. JURASSIC WORLD DOMINIO");
        System.out.println("2. LIGHTYEAR");
        System.out.println("3. TOP GUN MAVERICK");
        int Op;
        Scanner input = new Scanner(System.in);
        System.out.prinln("¿Cual pelicula quieres ver?");
        Op = input.nextInt();
        switch(Op){
            case 1:
                System.out.println("JURASSIC WORLD DOMINIO");
                pelicula_6();
            break;
            case 2:
                System.out.println("LIGHTYEAR");
                pelicula_5();
            break;
            case 3:
                System.out.println("TOP GUN MAVERICK");
                pelicula_10();
            break;
            default: System.err.println("!Error¡. no ingreso ninguna de las opciones.");
        }
    }
    public void Peliculas_XD(){
        System.out.println("1. JURASSIC WORLD DOMINIO");
        System.out.println("2. LIGHTYEAR");
        int Op;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cual pelicula quieres ver?");
        Op = input.nextInt();
        switch(Op){
            case 1:
                System.out.println("JURASSIC WORLD DOMINIO");
                pelicula_6();
            break;
            case 2:
                System.out.println("LIGHTYEAR");
                pelicula_5();
            break;
            default: System.err.println("!Error¡. no ingreso ninguna de las opciones.");
        }
    }
    public void Peliculas_DBOX(){
        System.out.printtln("3. DOCTOR STRANGE EN EL MULTIVERSO DE LA LOCURA");
        System.out.printtln("1. JURASSIC WORLD DOMINIO");
        System.out.printtln("2. LIGHTYEAR");
        
        int Op;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cual pelicula quieres ver?");
        Op = input.nextInt();
        switch(Op){
            case 1:
                System.out.println("DOCTOR STRANGE EN EL MULTIVERSO DE LA LOCURA");
                pelicula_2();
            case 2:
                System.out.println("JURASSIC WORLD DOMINIO");
                pelicula_6();
            break;
            case 3:
                System.out.println("LIGHTYEAR");
                pelicula_5();
            break;
            default: System.err.println("!Error¡. no ingreso ninguna de las opciones.");
        }
    }
    public void PREMIUM_CLASS(){
        System.out.println("1. JURASSIC WORLD DOMINIO");
        System.out.println("2. LIGHTYEAR");
        System.out.println("3. TOP GUN MAVERICK");
        int Op;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cual pelicula quieres ver?");
        Op = input.nextInt();
        switch(Op){
            case 1:
                System.out.println("JURASSIC WORLD DOMINIO");
                pelicula_6();
            break;
            case 2:
                System.out.println("LIGHTYEAR");
                pelicula_5();
            break;
            case 3:
                System.out.println("TOP GUN MAVERICK");
                pelicula_10();
            break;
            default: System.err.println("!Error¡. no ingreso ninguna de las opciones.");
        }
    }
    public void COMFORT_PEL(){
        System.out.println("1. JURASSIC WORLD DOMINIO");
        System.out.println("2. LIGHTYEAR");
        System.out.println("3. TOP GUN MAVERICK");
        int Op;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cual pelicula quieres ver?");
        Op = input.nextInt();
        switch(Op){
            case 1:
                System.out.println("JURASSIC WORLD DOMINIO");
                pelicula_6();
            break;
            case 2:
                System.out.println("LIGHTYEAR");
                pelicula_5();
            break;
            case 3:
                System.out.println("TOP GUN MAVERICK");
                pelicula_10();
            break;
            default: System.err.println("!Error¡. no ingreso ninguna de las opciones.");
        }
    }
    public void PROXIMAMENTE(){
        System.out.println("EL ULTIMO JUEGO");
        System.out.println("LA VOZ DEL AMOR");
        System.out.println("LIGHTYEAR");
        System.out.println("DOG UN VIAJE SALVAJE");
        System.out.println("EL TELEFONO NEGRO");
        System.out.println("MINIONS 2");
        System.out.println("THOR AMOR Y TRUENO");
        System.out.println("ELVIS");
        System.out.println("!NOP¡");
        System.out.println("BUENA SUERTE LEO GRANDE");
        System.out.println("DC LIGA DE SUPER MASCOTAS");
        System.out.println("ESCALERA AL INFIERNO");
        System.out.println("TREN BALA");
        System.out.println("AFTER AMOR INFINITO");
        System.out.println("SUPER ¿QUIEN?");
        System.out.println("AVATAR EL CAMINO DEL AGUA");
    }
}