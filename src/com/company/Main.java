package com.company;

public class Main {

    public static void main(String[] args) {
	    Camioneta camioneta1 = new Camioneta("Toyota Hilux", "Toyota", "0", 28000.0, "nuevo", "900 kg");
        System.out.println(camioneta1.toString());
        camioneta1.pagarCuota(5000.0);
        System.out.println(camioneta1.toString());
    }
}
