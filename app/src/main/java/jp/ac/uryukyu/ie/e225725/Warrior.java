package jp.ac.uryukyu.ie.e225725;

public class Warrior extends Hero {
    public Warrior(String name, int hitPoint , int attack){
        super(name, hitPoint, attack);
    }

    @Override public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if (hitPoint<=0){
            dead=true;
        }
        if (this.dead == false){
            int damage = (int)(1.5* attack);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}