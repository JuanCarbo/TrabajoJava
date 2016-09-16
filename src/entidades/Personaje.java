package entidades;

public class Personaje {
	private int id;
	private int atk, def, ene, eva, hp;
	private String nombre;
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
	

}
