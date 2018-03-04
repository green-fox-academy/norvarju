package Pirate;

public class Pirate {

    private Boolean isDrunk;
    private int levelOfIntoxcation;
    private Boolean isDead;
    private int chance;
    private String name;
    private Boolean isCaptain;

    public Pirate() {
        this.isDrunk = false;
        this.levelOfIntoxcation = (int) (Math.random()*5 + 0);
        this.isDead = false;
        this.chance = (int) (Math.random()*3 + 1);
        this.name = RandomName.generateName();
        this.isCaptain = false;
    }

    public void drinkSomeRum(){
        if (isDead == false) {
            isDrunk = true;
            levelOfIntoxcation++;
        } else {
            System.out.println("He's dead");
        }
    }

    public Boolean getIsDrunk(){
        return isDrunk;
    }

    public String consumedRum(){
        if(levelOfIntoxcation > 0){
            return "Consumed rum";
        } else {
            return "Sober";
        }
    }

    public String status(){
        if(levelOfIntoxcation > 4 && isDead == false){
            return "Passed out";
        } else if(isDead == true) {
            return "Dead";
        } else {
            return "Alive";
        }
    }

    public int getLevelOfIntoxcation(){
        return levelOfIntoxcation;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = "CAPTAIN " + name;
    }

    public Boolean getIsDead(){
        return isDead;
    }

    public void setIsCaptain(){
        isCaptain = true;
    }

    public Boolean getIsCaptain(){
        return isCaptain;
    }

    public void howsItGoingMate(){
        if(levelOfIntoxcation <= 4 && isDead == false){
            System.out.print("Pour me anudder!");
        } else if (isDead == true) {
            System.out.print("He's dead...");
        } else {
            System.out.print("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public void brawl(Pirate pirate){
        if (chance == 1){
            pirate.die();
            die();
            System.out.println("I'm sorry, you are both dead");
        } else if (chance == 2){
            pirate.die();
            System.out.println("Hurray, you killed your opponent");
        } else {
            die();
            System.out.println("Ooops, your opponent killed you.");
        }
    }

    public void die(){
        isDead = true;
    }

}
