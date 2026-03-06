package clases;

public class Vehiculo {
	private String marca;
    private String color;
    private int    anio;

  
    public Vehiculo() {
    }

    
    public Vehiculo(String marca, String color, int anio) {
        this.marca = marca;
        this.color = color;
        this.anio  = anio;
    }

    
    public void encender() {
        System.out.println(marca + " está encendido y listo para moverse.");
    }

    
    public void desplazarse() {
        System.out.println(marca + " se está desplazando.");
    }

  
    public String getMarca() { return marca; }
    public void   setMarca(String marca) { this.marca = marca; }

    public String getColor() { return color; }
    public void   setColor(String color) { this.color = color; }

    public int  getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

}
