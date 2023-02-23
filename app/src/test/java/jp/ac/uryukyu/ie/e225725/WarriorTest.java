package jp.ac.uryukyu.ie.e225725;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
void attackTest() {
    int defaultHeroHp = 100;
    Warrior demoHero = new Warrior("デモ勇者", defaultHeroHp, 10);
    Enemy slime = new Enemy("スライムもどき", 100, 1);
    for(int count=0; count<3; count++){
        demoHero.attackWithWeponSkill(slime); 
    }
    slime.attack(demoHero);
    assertEquals(55, slime.getHitPoint());
}
}
    
