package entidades;

public class Personaje {
	
	public Personaje() {
		// TODO Auto-generated constructor stub
	}

	private int id;
	private int atk, def, ene, eva, hp;
	private String nombre;
	public Personaje(int ID,int HP,int DEF,int EVA,int ATK, int ENE,String NOM){
		this.id=ID;
		this.hp=HP;
		this.atk=ATK;
		this.def=DEF;
		this.ene=ENE;
		this.eva=EVA;
		this.nombre=NOM;}

	public Personaje(int HP,int DEF,int EVA,int ATK, int ENE,String NOM){
		this.hp=HP;
		this.atk=ATK;
		this.def=DEF;
		this.ene=ENE;
		this.eva=EVA;
		this.nombre=NOM;
	};
	public int getId() {
		return id;
	}
	public int getAtk() {
		return atk;
	}
	public int getDef() {
		return def;
	}
	public int getEne() {
		return ene;
	}
	public int getEva() {
		return eva;
	}
	public int getHp() {
		return hp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public void setEne(int ene) {
		this.ene = ene;
	}
	public void setEva(int eva) {
		this.eva = eva;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return (nombre != null ?  nombre : "") + "[id=" + id + ", atk=" + atk + ", def=" + def + ", ene=" + ene + ", eva=" + eva + ", hp=" + hp
				+  "]";
	}	

}
