package main;

import builder.McLancheBiulder;
import model.McLanche;

public class Main {
	
	public static void main(String[] args) {
        McLanche burguerCombo = new McLancheBiulder("Batata Frita")
                .comBebida("Coca cola")
                .comBatataFrita("Batata Frita")
                .soIsso();
        System.out.println(burguerCombo);

        McLanche soBatata = new McLancheBiulder("Batata Frita")
                .soIsso();
        System.out.println(soBatata);

        McLanche comboGula = new McLancheBiulder("Batata Frita Grande")
                .comBebida("Coca-Cola")
                .comMilkShake("Ovomaltine")
                .comBatataFrita("Batata Frita Grande")
                .comSanduiche("Big Mac")
                .soIsso();
        System.out.println(comboGula);
    }
}


