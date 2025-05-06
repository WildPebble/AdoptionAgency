/**
 * Person class contructs the person object based on user input from AdoptionAgency
 * check age method for valid input and getter methods for attributes specific to Person
 *
 * @author  Becca Fondo
 * @version May 06, 2025
 */
public class Person extends Idenitity {
    private boolean priorPets;
    private String petPreference;

    // constructor to set up person objects
    // use super to take advantage of superclass Identity
    Person(String name, int age, char sex, boolean catCompatable, boolean dogCompatable, boolean kidCompatable,
            boolean priorPets, String petPrefence) {
        super(name, age, sex, catCompatable, dogCompatable, kidCompatable);
        this.priorPets = priorPets;
        this.petPreference = petPrefence;

    }

    /**
     * check age method, must be 18 or older to adopt pets
     * 
     * @param age ->int age of person
     */
    public void checkAge(int age) {
        if (age > 0 && age < 18) {
            System.out.println(
                    "We're sorry, you must be 18 or older to adopt a pet.\nPlease come back when you are of age.");
        }
        if (age < 0) {
            throw new IllegalArgumentException(
                    "Your age cannot be a negative number. Please restart the application process.");

        }
    }

    /**
     * getter method for priorPets
     * 
     * @return priorPets -> boolean tells if the person has owned pets before
     */
    public boolean getPriorPets() {
        return this.priorPets;
    }

    /**
     * getter method for petPreference
     * 
     * @return petPreference -> String (either cat or dog)
     */
    public String getPetPreference() {
        return this.petPreference;
    }

    /**
     * getter method for gender
     * 
     * @return gender -> char
     */
    public char getGender() {
        return this.sex;
    }


}