package rpgcreature;

import java.util.Random;

public class Golem extends Monster{
    public Golem(){
        super("ゴーレム",100,500);
    }

    @Override
    public void attack(Creature opponent){
        Random r=new Random();
        int damage=0;
        if(r.nextInt(100)<5){
            System.out.printf("%sのクリティカルヒット！\n",getName());
            damage=30;
        }else{
            System.out.printf("%sの攻撃！\n",getName());
            damage=r.nextInt(6)+5;
        }
        opponent.damaged(damage);

        displayMessage(opponent, damage);
    }
    
}
