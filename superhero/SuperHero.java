package superhero;

public class SuperHero implements Comparable<SuperHero> {

private String title; 
private String name;
private String height; 
private int intelligence; 
private int strength; 
private int speed; 
private int agility; 
private int fightingskills;
private String backstory; 


public SuperHero  (String title, String name, String height, int intelligence, int strength,
        int speed, int agility, int fightingskills, String backstory){
    this.name = name;
    this.title = title; 
    this.height = height; 
    this.intelligence = intelligence; 
    this.strength = strength; 
    this.speed = speed; 
    this.agility = agility; 
    this.fightingskills = fightingskills; 
    this.backstory = backstory; 

} 

@Override
public String toString(){
return "------------------------------------------------------------------------------\n" +
"Title                  "+title + 
"\nReal name              "+name +
"\nHeight (cm)            "+height +
"\nIntelligence           "+intelligence +
"\nStrength               "+strength +
"\nSpeed                  "+speed +
"\nAgility                "+agility +
"\nFighting skills        "+fightingskills +
"\nBack story             "+backstory +
"\n------------------------------------------------------------------------------";  
 
}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getFightingskills() {
        return fightingskills;
    }

    public void setFightingskills(int fightingskills) {
        this.fightingskills = fightingskills;
    }

    public String getBackstory() {
        return backstory;
    }

    public void setBackstory(String backstory) {
        this.backstory = backstory;
    }

    @Override
    public int compareTo(SuperHero t) {
        SuperHero other = (SuperHero) t;

  String title = (String) this.title;
  String title2 = (String) other.title;

  return title.compareTo(title2);
    }
    
}





