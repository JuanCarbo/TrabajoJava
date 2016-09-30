package controlador;

public class Control {

		public int nuevoPJ(int HP, int DEF, int ATK, int EVA, int ENE, String NOM){
			int id=0;
			if (true) {
			entidades.Personaje pers= new entidades.Personaje(HP, DEF, EVA, ATK, ENE, NOM);
			data.DBInteract basedatos = new data.DBInteract();
			id=basedatos.guardarpers(pers);
			};
			
			return id;
		};
		public void turnoCombate(){};
}
