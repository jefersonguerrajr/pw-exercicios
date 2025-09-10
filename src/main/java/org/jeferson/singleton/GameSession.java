package org.jeferson.singleton;

import java.util.List;


public class GameSession {

    private static GameSession instance;

    private int level;
    private int score;
    private int life;

    private GameSession(){
        this.level = 0;
        this.score = 0;
        this.life = 100;
    }

    public static GameSession getInstance(){
        if(instance == null){
            instance = new GameSession();
        }
        return instance;
    }

    public int getLevel() {
        return level;
    }

    public int getLife() {
        return life;
    }

    public int getScore() {
        return score;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void addLevel(int value){
        this.level += value;
    }

    public void removeLife(int value){
        this.life -= value;
    }

    public void printCurrentStatus(){
        System.out.println("Level: " + level + " Score: " + score + " Life: " + life);
    }

}
