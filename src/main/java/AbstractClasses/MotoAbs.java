package AbstractClasses;

public class MotoAbs extends VehiculoAbstract {
	public MotoAbs() {
    }

    public MotoAbs(String marca) {
        this.marca = marca;
    }

    @Override
    public void desplazarse() {
        System.out.println(marca + " acelera entre el tráfico en solo 2 ruedas.");
    }

}
