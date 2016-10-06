package controlador;

import ui.NombreInvalido;

public class Control {

		public static int nuevoPJ(String HPs, String DEFs, String ATKs, String EVAs, String ENEs, String NOM){
			//convierte datos de entrada a unidades pertinentes, Verifica reglas de puntos maximos y nombre.
			int id=1;
			int HP=Integer.parseInt(HPs);
			int DEF=Integer.parseInt(DEFs);
			int ATK=Integer.parseInt(ATKs);
			int EVA=Integer.parseInt(EVAs);
			int ENE=Integer.parseInt(ENEs);
			if (NOM==null) {NombreInvalido.main(null);}
			else{
			if (HP+DEF+ATK+EVA+ENE<=200 && DEF<=20 && EVA<=80) {
			entidades.Personaje pers = null;
			pers = new entidades.Personaje(HP, DEF, EVA, ATK, ENE, NOM);
			System.out.println(pers.getNombre());
			// Esto ya funciona
			id=data.DBInteract.guardarpers(pers);
			ui.ConfirmacionPje.confirma(id);};}
			return id;
			
		};
		public void turnoCombate(){};
		public static void inicializaDB(){};
}


