import java.util.*;

 

public class World extends Main {

	public Integer fite;
	

	public World(){
		
		setFite((int )(Math.random() * 100 + 1));
		
		
		
	}


	public Integer getFite() {
		return fite;
	}


	public void setFite(int fite) {
		this.fite = fite;
	}
	
	

	
	
}