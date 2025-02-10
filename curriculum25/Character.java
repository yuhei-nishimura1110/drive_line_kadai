package curriculum25;

public class Character {
	private String name;
	private int hp;
	private int mp;
	private int attackPoint;
	private int quick;
	private int gardPoint;
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getMp() {
		return this.mp;
	}
	public int getAttackPoint() {
		return this.attackPoint;
	}
	public int getQuick() {
		return this.quick;
	}
	public int getGardPoint() {
		return this.gardPoint;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	public void setQuick(int quick) {
		this.quick = quick;
	}
	public void setGardPoint(int gardPoint) {
		this.gardPoint = gardPoint;
	}
}
