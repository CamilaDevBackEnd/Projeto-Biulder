package model;

public class McLanche {
	
		
	    private String bebida;
	    private String sanduiche;
	    private String batataFrita;
	    private String milkShake;
	    
	    public McLanche(String bebida, String sanduiche, String batataFrita, String milkShake) {        
	        this.bebida = bebida;
	        this.sanduiche = sanduiche;
	        this.batataFrita = batataFrita;
	        this.milkShake = milkShake;
	    }


	    public String getBebida() {
	        return this.bebida;
	    }

	    public void setBebida(String bebida) {
	        this.bebida = bebida;
	    }

	    public String getSanduiche() {
	        return this.sanduiche;
	    }

	    public void setSanduiche(String sanduiche) {
	        this.sanduiche = sanduiche;
	    }

	    public String getBatataFrita() {
	        return this.batataFrita;
	    }

	    public void setBatataFrita(String batataFrita) {
	        this.batataFrita = batataFrita;
	    }

	    public String getMilkShake() {
	        return this.milkShake;
	    }

	    public void setMilkShake(String milkShake) {
	        this.milkShake = milkShake;
	    }


		@Override
		public String toString() {
			return "bebida: " + bebida + ", sanduiche: " + sanduiche + ", batataFrita: " + batataFrita
					+ ", milkShake: " + milkShake;
		}
	 

	}

