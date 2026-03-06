package clases;

public class Auto extends Vehiculo {
	private int numeroPuertas;

    
    public Auto() {
    }

    
    public Auto(String marca, String color, int anio, int numeroPuertas) {
        super(marca, color, anio);   
        this.numeroPuertas = numeroPuertas;
    }

  
    public void tocarBocina() {
        System.out.println(getMarca() + " hace: ¡Beep beep!");
    }

    
    @Override
    public void desplazarse() {
        System.out.println(getMarca() + " rueda por la carretera a alta velocidad.");
    }

   
    public int  getNumeroPuertas() { return numeroPuertas; }
    public void setNumeroPuertas(int numeroPuertas) { this.numeroPuertas = numeroPuertas; }

}
