import java.util.ArrayList;
import java.util.Collections;

/**
 * Person and Pet objects will be compared by traits 
 * petList will be modified and each Pet's score will be set 
 * based on compatability
 *
 * @author  Becca Fondo
 * @version May 06, 2025
 */
public class ApplicationReview {
   /**
     * method that will change the ArrayList to either only dogs or cats based on
     * the person's preference
     * 
     * @param petList ArrayList of pets available
     * @return petList ArrayList containing either only dogs or cats
     */
    public ArrayList<Pet> catsOrDogs(ArrayList<Pet> petList, Person person) {
        if (person.getPetPreference().equalsIgnoreCase("Cat")) {
            for (int i = 0; i < petList.size(); i++) {
                if (petList.get(i).getSpecies().equalsIgnoreCase("Dog")) {
                    petList.remove(i);
                    i--;
                }
            }
        } else {
            for (int i = 0; i < petList.size(); i++) {
                if (petList.get(i).getSpecies().equalsIgnoreCase("Cat")) {
                    petList.remove(i);
                    i--;
                }
            }
        }
        return petList;
    }

    /**
     * check for the gender preference of the pet.
     * I have worked in animal facilities where only men or women can intereact with
     * certain animals so this felt important to me
     * check if the animal male/female preference is true and check the gender of
     * the person
     * loop through and remove that pet from the list
     * Ignore if pet does not have a preference false && || if the person responded
     * X
     * X is trans/nonBinary, person should follow direction of agency at
     * printResult() to scheduled a meeting and see if pet is compatable
     * 
     * @param petList -> ArrayList <Pet>
     * @return petList -> ArrayList modified for pet gender preference
     */
    public ArrayList<Pet> petGenderPreference(ArrayList<Pet> petList, Person person) {
        for (int i = 0; i < petList.size(); i++) {
            if (petList.get(i).getMalePreference() == true && person.getGender() == 'F') {
                petList.get(i).addScore(-100);
                //System.out.println("Score check Male preference: " + petList.get(i).getScore());
                petList.remove(i);
                i--;
            } else if (petList.get(i).getFemalePreference() == true && person.getGender() == 'M') {
                petList.get(i).addScore(-100);
                //System.out.println("Score check Female preference: " + petList.get(i).getScore());
                petList.remove(i);
                i--;
            }
        }
        return petList;
    }

    /**
     * check if pet medicalCondition is true, if true check if person priorPets is
     * true
     * a pet with a medical condition should have an expereinced pet owner as their
     * person
     * 
     * @param petList ->ArrayList <Pet>
     * @return petList ->ArrayList <Pet> modified list for checking medicalCondition
     *         and priorPets
     */
    public ArrayList<Pet> checkMedicalConditionMatch(ArrayList<Pet> petList, Person person) {
        for (int i = 0; i < petList.size(); i++) {
            if (petList.get(i).getMeidcalCondition() == true && person.getPriorPets() == false) {
                petList.get(i).addScore(-100);
                //System.out.println("Score check Medical condition: " + petList.get(i).getScore());
                petList.remove(i);
                i--;
            }
        }
        return petList;
    }

    /**
     * void method for adding and subtracting points from score
     *
     * @param petList ->ArrayList allows us to loop through Pet objects and apply
     *                points
     */

    public void setScore(ArrayList<Pet> petList, Person person) {
        if (petList.size() == 1) {
            System.out.println("We think " + petList.get(0).getName()
                    + " would be a great addition to your family! Below is their information. Contact the adoption agency to schedule a meeting! :)");
        } else {
            for (Pet p : petList) {
                if (p.getCatCompatability() == person.getCatCompatability()) {
                    p.addScore(5);
                    // System.out.println("Score check Cat Preference Add Point: " + p.getScore());
                } else if (p.getCatCompatability() != person.getCatCompatability()) {
                    p.addScore(-5);
                    // System.out.println("Score check Cat Preference Subtract Point: " +
                    // p.getScore());
                }
                if (p.getDogCompatability() == person.getDogCompatability()) {
                    p.addScore(5);
                    // System.out.println("Score check Dog Preference Add Point: " + p.getScore());
                } else if (p.getDogCompatability() != person.getDogCompatability()) {
                    p.addScore(-5);
                    // System.out.println("Score check Dog Preference Subtract Point: " +
                    // p.getScore());
                }
                if (p.getKidCompatability() == person.getKidCompatability()) {
                    p.addScore(5);
                } else if (p.getKidCompatability() != person.getKidCompatability()) {
                    p.addScore(-5);
                    // System.out.println("Score check Kid Preference Subtract Point: "+
                    //p.getScore());
                }

            }
        }
        // comparing scores and printing result
        if (petList.isEmpty()) {
            System.out.println(
                    "We are sorry we don't seem to have any pets that would be a good fit right now. Please try again another time");
        } else if (petList.size() == 1) {
            petList.get(0).printResult();
            petList.get(0).printPetDetails();
        } else if (petList.size() == 2 && petList.get(0).getScore() == petList.get(1).getScore()) {
            System.out.println("Looks like there are two pets who are great matches for you! They are "
                    + petList.get(0).getName() + " and " + petList.get(1).getName()
                    + ". Their detailed information is listed below. Please contact the agency to schedule a meeting. ");
            petList.get(0).printResult();
            petList.get(0).printPetDetails();
            petList.get(1).printResult();
            petList.get(1).printPetDetails();
        } else {
            Collections.sort(petList);
            // Print list of Pets in order from best match to least
            System.out.println(
                    "Here is the list of Pets we think could make a great addition to your family! \nWe organized the list to start with the best matching pet and it is "
                            + petList.get(0).getName().toUpperCase() + "!");
            petList.get(0).printPetDetails();
            for (Pet p : petList) {
                p.printResult();
            }
            System.out.println(
                    "Contact the agency to schedule a meeting with the pet of your choice. We hope to hear from you soon!");
        }

    }


}
