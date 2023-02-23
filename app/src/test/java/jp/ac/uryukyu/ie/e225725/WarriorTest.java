package jp.ac.uryukyu.ie.e225725;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
void attackTest() {
    int defaultHeroHp = 100;
    Warrior demoHero = new Warrior("デモ勇者", defaultHeroHp, 100);
    Enemy slime = new Enemy("スライムもどき", 10, 100);
    for(int count=0; count<10; count++){
        demoHero.attackWithWeponSkill(slime); // over kill
    }
    slime.attack(demoHero);
    assertEquals(defaultHeroHp, demoHero.getHitPoint());
}
}
    
