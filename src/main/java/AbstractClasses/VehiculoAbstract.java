package AbstractClasses;

public abstract class VehiculoAbstract {
	protected String marca;

    // Método abstracto: cada subclase DEBE implementarlo
    public abstract void desplazarse();

    // Método concreto: heredado por todas las subclases sin cambios
    public void recargarCombustible() {
        System.out.println(marca + " está recargando combustible en la estación.");
    }

}
