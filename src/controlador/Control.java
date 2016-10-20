package controlador;

import ui.NombreInvalido;
import entidades.Personaje;

public class Control {

		public static int nuevoPJ(String HPs, String DEFs, String ATKs, String EVAs, String ENEs, String NOM){
			//convierte datos de entrada a unidades pertinentes, Verifica reglas de puntos maximos y nombre.
			int id=0;
			int HP=Integer.parseInt(HPs);
			int DEF=Integer.parseInt(DEFs);
			int ATK=Integer.parseInt(ATKs);
			int EVA=Integer.parseInt(EVAs);
			int ENE=Integer.parseInt(ENEs);
			if (NOM==null) {NombreInvalido.main(null);}
			else{
				if (data.DBInteract.controlNombre(NOM)){
			if (HP+DEF+ATK+EVA+ENE<=200 && DEF<=20 && EVA<=80) {
			entidades.Personaje pers = null;
			pers = new entidades.Personaje(HP, DEF, EVA, ATK, ENE, NOM);
			// Esto ya funciona
			id=data.DBInteract.guardarpers(pers);
			ui.ConfirmacionPje.confirma(id);};}
			else {NombreInvalido.main(null);}
			
		};
			return id;}
		public void turnoCombate(){};
		public static void inicializaDB(){};
		public static int modificaPJ(Personaje per){
			//convierte datos de entrada a unidades pertinentes, Verifica reglas de puntos maximos y nombre.
			int id=per.getId();
			int HP=per.getHp();
			int DEF=per.getDef();
			int ATK=per.getAtk();
			int EVA=per.getEva();
			int ENE=per.getEne();
			String NOM=per.getNombre();
			if (NOM==null || data.DBInteract.controlNombreMod(NOM, id) ) {NombreInvalido.main(null);}
			else{
				if (HP+DEF+ATK+EVA+ENE<=200 && DEF<=20 && EVA<=80) {
					id=data.DBInteract.modificaPers(per);
					ui.ConfirmacionMod.confirma(id);};}
			
			return id;}
		public static Personaje[] turnocombate(Personaje perAtk, Personaje perRec, int energastada) 
		{ 
			int atk = perAtk.getAtk();
			int ene = perAtk.getEne();
			int hp = perRec.getHp();
			int eva = perRec.getEva();
			
			if (energastada<ene)
				{ene=ene-energastada;
				if (Math.random()*100>eva)
			{
				hp=hp-atk;
			}};
			perAtk.setEne(ene);
			perRec.setHp(hp);
			Personaje[] pers=new Personaje[2];
			pers[1]=perAtk;
			pers[2]=perRec;
			return null;
		};
		public static boolean muerte(Personaje per){
			if (per.getHp()<=0) {
				return true;
			}
			else{
				return false;
			}
		}
		
		
}


