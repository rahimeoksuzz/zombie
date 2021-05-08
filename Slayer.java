package Zombie;

public class Slayer extends Thread{
    ZombieCounter zc;
    public Slayer(ZombieCounter zc){
        this.zc = zc;
    }

    @Override
    public void run(){
        while(!zc.tooManyZombiesInTheRoom() && !zc.killed100Zombies()){
            
            zc.zombieKilled();

            try{//every 2
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
    
}
