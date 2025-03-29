public class Enemy {
    String nama;
    int life;
    String sprite;
    Boolean isFinish;

    public Enemy() {
        this.life = 3;
    }

    public void startDialog(){

    }

    public void actionDialog(int action){

    }

    public void defeatDialog(){

    }

    public void victoryDialog(){

    }

    public String getSprite(){
        return sprite;
    }

    public void cekEnemy(){
        if(life == 0){
            isFinish = true;
        }
    }
}
