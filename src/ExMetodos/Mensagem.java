package ExMetodos;

import java.time.LocalDateTime;

public class Mensagem {

	public static void horaDoDia() {
		
		double hora = LocalDateTime.now().getHour();
		
		if (hora >= 5 && hora <= 11.59) {
			System.out.println("Bom Dia!");
		} else if (hora >= 12 && hora <= 17.59){
			System.out.println("Boa Tarde!");
		} else {
			System.out.println("Boa Noite!");
		}		
	}
}
