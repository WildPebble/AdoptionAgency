/**
 * Pet class contructs pet objects 
 * getter methods for attributes specfic to Pets
 * compareTo method to organize the pets by score
 * print methods for inital info and then more detailed info after application is complete
 *
 * @author  Becca Fondo
 * @version May 06, 2025
 */
public class Pet extends Idenitity implements Comparable <Pet> {
    private String species;
    private String fur;
    private String breed;
    private boolean medicalCondition;
    private boolean prefersMen;
    private boolean prefersWomen;
    private String petDetails;
    private int score;

    
    //constructor to set up pet objects
    //use super to take advantage of superclass Identity 
    Pet(String name, int age, char sex, boolean catCompatable, boolean dogCompatable, boolean kidCompatable,
            String species, String breed, String fur, boolean medicalCondition, boolean prefersMen,
            boolean prefersWomen, String petDetails, int score) {
        super(name, age, sex, catCompatable, dogCompatable, kidCompatable);
        this.species = species;
        this.fur = fur;
        this.breed = breed;
        this.medicalCondition = medicalCondition;
        this.prefersMen = prefersMen;
        this.prefersWomen = prefersWomen;
        this.petDetails = petDetails;
        this.score = score;
    }

    /**
     * method to compare pets scores and organize the petList by score
     * 
     * @param Pet p ->object
     * @return int ->determines if pet object's score is higher lower or same 
     */
    public int compareTo(Pet p) {
        if(this.getScore()>p.getScore()){
            return -1;
        }else if (this.getScore()<p.getScore()){
            return 1;
        }else{
            return 0;
        }
    }
    
    /**
     * getter method for medical condition
     * 
     * @return medicalCondition     boolean/does the pet have a medical condition
     */
    public boolean getMeidcalCondition() {
        return this.medicalCondition;
    }

    /**
     * getter method for species
     * 
     * @return species -> String
     */
    public String getSpecies() {
        return this.species;
    }

    
    /**
     * getter method for breed
     * 
     * @return breed -> String
     */
    public String getBreed() {
        return this.breed;
    }

    /**
     * getter method for fur type
     * 
     * @return fur -> String
     */
    public String getFur() {
        return this.fur;
    }

    /**
     * Getter method for male preference 
     * 
     * @return perfersMen ->boolean 
     */
    public boolean getMalePreference() {
        return this.prefersMen;
    }

     /**
     * Getter method for female preference 
     * 
     * @return perfersWomen ->boolean 
     */
    public boolean getFemalePreference() {
        return this.prefersWomen;
    }

    /**
     * Void method that prints out the pet's information
     * 
     */
    public void print() {
        System.out.println("====================");
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Sex: " + this.getSex());
        System.out.println("Species: " + this.getSpecies());
        System.out.println("Breed: " + this.getBreed());
        System.out.println("Fur: " + this.getFur());
        System.out.println("====================");

    }

    /*
     * Method prints pets detailed description
     * Only use for the best matching pet(s)
     */
    public void printPetDetails() {
        System.out.println(this.petDetails);
    }

    /**
     * This method prints out the result message with the name of the pet 
     * 
     */
    public void printResult() {
       
        System.out.println("====================");
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Sex: " + this.getSex());
        System.out.println("Species: " + this.getSpecies());
        System.out.println("Breed: " + this.getBreed());
        System.out.println("Fur: " + this.getFur());
        System.out.println("Cat Friendly: " + this.getCatCompatability());
        System.out.println("Dog Friendly: " + this.getDogCompatability());
        System.out.println("Kid Friendly: " + this.getKidCompatability());
        System.out.println("Has a medical condition: " + this.getMeidcalCondition());
        System.out.println("====================");
        //System.out.println("SCORE: "+this.getScore());

    }
    
    /**
     * Method that adds a point to each pet's score 
     * 
     * @param   score ->int 
     */
    public void addScore(int score) {
        this.score += score;
    }

    /**
     * Getter method for score 
     * 
     * @return  score->int
     */
    public int getScore() {
        return score;
    }



   

}