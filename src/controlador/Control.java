package controlador;

public class Control {

		public static int nuevoPJ(String HPs, String DEFs, String ATKs, String EVAs, String ENEs, String NOM){
			int id=0;
			int HP=Integer.parseInt(HPs);
			int DEF=Integer.parseInt(DEFs);
			int ATK=Integer.parseInt(ATKs);
			int EVA=Integer.parseInt(EVAs);
			int ENE=Integer.parseInt(ENEs);
			if (HP+DEF+ATK+EVA+ENE<=200 && DEF<=20 && EVA<=80) {
			entidades.Personaje pers= new entidades.Personaje(HP, DEF, EVA, ATK, ENE, NOM);
			id=data.DBInteract.guardarpers(pers);
			};
			
			return id;
		};
		public void turnoCombate(){};
}
