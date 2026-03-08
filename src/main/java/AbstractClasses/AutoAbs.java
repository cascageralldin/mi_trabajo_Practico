package AbstractClasses;

public class AutoAbs extends VehiculoAbstract {
	public AutoAbs() {
    }

    public AutoAbs(String marca) {
        this.marca = marca;   // accede al protected del padre
    }

    @Override
    public void desplazarse() {
        System.out.println(marca + " rueda por la autopista usando sus 4 ruedas.");
    }
	

}
