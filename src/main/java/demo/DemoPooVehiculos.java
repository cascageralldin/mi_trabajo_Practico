package demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import AbstractClasses.AutoAbs;
import AbstractClasses.MotoAbs;
import AbstractClasses.VehiculoAbstract;
import clases.Auto;
import clases.Moto;
import clases.Vehiculo;

import java.util.ArrayList;
import java.util.List;
@SpringBootApplication

public class DemoPooVehiculos implements CommandLineRunner {
	public static void main(String[] args) {
        SpringApplication.run(DemoPooVehiculos.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("---------------------------------");
        function1();
        System.out.println("---------------------------------");
    }

    // ============================================================
    // Uso de clases abstractas
    // ============================================================
    public void function4() { // uso de clases abstractas
        List<VehiculoAbstract> vehiculos = new ArrayList<>();
        vehiculos.add(new AutoAbs("Toyota"));
        vehiculos.add(new MotoAbs("Yamaha"));

        vehiculos.forEach(v -> {
            v.desplazarse();           // método abstracto: cada uno lo hace distinto
            v.recargarCombustible();   // método concreto heredado del padre
        });
    }

    // ============================================================
    //Polimorfismo
    // ============================================================
    public void function3() { // polimorfismo
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("Toyota", "Rojo", 2022, 4));
        vehiculos.add(new Moto("Honda", "Negro", 2021, false));

        /*for(Vehiculo v : vehiculos){
            v.desplazarse();
        }*/
        vehiculos.forEach(v -> v.desplazarse()); // mismo método, comportamiento distinto
    }

    // ============================================================
    // Herencia
    // ============================================================
    public void function2() { // ejemplo de herencia
        Auto auto = new Auto();
        auto.setMarca("Ford");       // setter heredado de Vehiculo
        auto.setColor("Azul");
        auto.setAnio(2020);
        auto.encender();             // método heredado de Vehiculo
        auto.tocarBocina();          // método propio de Auto
    }

    // ============================================================
    //Instanciación y Encapsulamiento
    // ============================================================
    public void function1() { // instanciacion y encapsulamiento
        Auto auto = new Auto("Toyota", "Rojo", 2022, 4);
        System.out.println(auto.getMarca());  
        System.out.println(auto.getColor());
        auto.tocarBocina();
    }

    public void holaMundo() { // simple hola mundo
        System.out.println("Hola mundo!");
    }
	

}
