public class Character {

    private String name;
    private int HP;
    private String item;
    
    //Constructors
    public Character() {
        name = "unknown";
        HP = 100;
        item = "none";
    }

    public Character(String name, int HP, String item) {
        this.name = name;
        this.HP = HP;
        this.item = item;
    }

    //Setters
    public void setHP(int HP) {
        this.HP = HP;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setItem(String item) {
        this.item = item;
    }

    //Getters
    public int getHP() {
        return this.HP;
    }
    public String getName() {
        return this.name;
    }
    public String getItem() {
        return this.item;
    }

}
