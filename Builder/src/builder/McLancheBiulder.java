package builder;

import model.McLanche;

public class McLancheBiulder {
	
	private String side;

    private String bebida;
    private String sanduiche;
    private String batataFrita;
    private String milkShake;
    
    public McLancheBiulder(String side) {
        this.side = side;
    }

    public McLancheBiulder comBebida(String bebida) {
        this.bebida = bebida;
        return this;
    }

     public McLancheBiulder comSanduiche(String sanduiche) {
        this.sanduiche = sanduiche;
        return this;
    }

     public McLancheBiulder comBatataFrita(String batataFrita) {
        this.batataFrita = batataFrita;
        return this;
    }

    public McLancheBiulder comMilkShake(String milkShake) {
        this.milkShake = milkShake;
        return this;
    }
    
    public McLanche soIsso() {
    	return new McLanche(bebida, sanduiche, batataFrita, milkShake);
    }

}
