package curriculum25;

public class Hero extends Character{
	public Hero(String name){
		setName(name);
		setHp(new java.util.Random().nextInt(1000));
		setMp(new java.util.Random().nextInt(1000));
		setAttackPoint(new java.util.Random().nextInt(1000));
		setQuick(new java.util.Random().nextInt(1000));
		setGardPoint(new java.util.Random().nextInt(100));
		
		System.out.println(" こんにちは 「 " + getName() + " 」 さん\n"
			+ " ステータス\n"
			+ " HP：" + getHp() + "\n"
			+ " MP：" + getMp() + "\n"
			+ " 攻撃力：" + getAttackPoint() + "\n"
			+ " 素早さ：" + getQuick() + "\n"
			+ " 防御力：" + getGardPoint() + "\n"
			+ "\n"
			+ " さあ冒険に出かけよう！");
	}
}
