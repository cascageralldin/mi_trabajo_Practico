package clases;

public class Moto extends Vehiculo{
	private boolean tieneSidecar;

    
    public Moto() {
    }

    
    public Moto(String marca, String color, int anio, boolean tieneSidecar) {
        super(marca, color, anio);
        this.tieneSidecar = tieneSidecar;
    }

   
    public void hacer_caballito() {
        System.out.println(getMarca() + " levanta la rueda delantera: ¡caballito!");
    }

   
    @Override
    public void desplazarse() {
        System.out.println(getMarca() + " zigzaguea entre el tráfico en 2 ruedas.");
    }

 
    public boolean isTieneSidecar() { return tieneSidecar; }
    public void    setTieneSidecar(boolean tieneSidecar) { this.tieneSidecar = tieneSidecar; }

}
