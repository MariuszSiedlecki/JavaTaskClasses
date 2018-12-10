package task5;

import java.util.Random;

public class Lottery {
    private Players [] names;
    private String lottery;
    private Random random;


    public Lottery(int playersMaxSize, String lottery){
        this.names = new Players[playersMaxSize];
        this.lottery = lottery;
        this.random = new Random();
    }
    public void addPlayers(Players playerss){
        for (int i = 0; i <names.length ; i++) {
            if(names[i] == null) {
                names[i] = playerss;
                break;
            }
        }
    }

    public Players randomPlayers(){
        return names[random.nextInt(names.length)];
    }


}
