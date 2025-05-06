/**
 *Idenitity is the parent class of Pet and Person
 *contains getter methods for attributes 
 *
 * @author  Becca Fondo
 * @version May 06, 2025
 */
public abstract class Idenitity {
    private int age;
    private String name;
    protected char sex;
    private boolean catCompatable;
    private boolean dogCompatable;
    private boolean kidCompatable;

    //constructor to set up the common attributes betwen pet and person
    Idenitity(String name, int age, char sex, boolean catCompatable, boolean dogCompatable, boolean kidCompatable) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.catCompatable = catCompatable;
        this.dogCompatable = dogCompatable;
        this.kidCompatable = kidCompatable;
    }
    
     /**
     * getter method for name
     * 
     * @return name -> String
     */
     public String getName() {
         return this.name;
     }
    
    /**
     * getter method for age
     * 
     * @return age      age of pet/person
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Getter method for sex 
     * 
     * @return sex      sex of pet/person
     */
    public char getSex() {
        return this.sex;
    }

     /**
     * getter method for cat compatability
     * 
     * @return catCompatable     boolean/can the pet live with cats
     */
    public boolean getCatCompatability() {
        return this.catCompatable;
    }

     /**
     * getter method for dog compatability
     * 
     * @return dogCompatable     boolean/can the pet live with dogs
     */
     public boolean getDogCompatability() {
         return this.dogCompatable;
     }
    
      /**
     * getter method for kid compatability
     * 
     * @return kidCompatable     boolean/can the pet live with kids
     */
    public boolean getKidCompatability() {
        return this.kidCompatable;
    }

}