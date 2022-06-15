public class Principal extends Cartelera{
    public Principal(){
    }
    public static void main(String[] args) {
        Cartelera user1 = new Cartelera();
        Horarios user1_1 = new Horarios();
        Entrada user1_2 = new Entrada();
        Asientos user1_3 = new Asientos();
        Candy user1_4 = new Candy();
        Payment user1_5 = new Payment();
        user1.Elige_Peli();
        user1_1.Elige_Horario();
        user1_2.Metodo_Pago();
        user1_3.Sala();
        user1_4.Seleccion_Candy();
        user1_5.Eleccion_Tarjeta();
    }
}