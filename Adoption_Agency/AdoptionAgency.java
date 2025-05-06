import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This is where the form for the adoption application will take place
 * we will also compare the person's attributes to the pets to see who will be
 * the best fitting pet for this person
 * 
 * @author Becca Fondo
 * @version April 2025
 */

public class AdoptionAgency {

    /**
     * Main method where we will ask the user for input for the application
     * try and catch for the inputs
     * analysis of person to determine best pet match
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pet> petList = new ArrayList<>();
        ApplicationReview review = new ApplicationReview();

        System.out.println("Welcome to our adoption agency!\nHere are our available pets for adoption:");

        Pet p1 = new Pet("Samoa", 10, 'F', false, false, true, "Cat", "DSH", "Tortoiseshell", false, false, false,"Samoa is beautiful tortoiseshell cat who loves kids and loves to cuddle on her terms.\nShe is best in a home without cats or dogs.\nHer favorite activity is sun bathing.", 0);
        Pet p2 = new Pet("Biscuit", 3, 'M', true, true, true, "Cat", "Ragdoll", "Grey/White", false, false, false,"Biscuit is a playful Ragdoll that loves all creatures. She is a very adaptable pet to everything, but food.\nBiscuit is a food connoisseur and demands only the finest FancyFeast food.\nHis favorite acitivty is catnip (yes he is picky about the kind of catnip too).", 0);
        Pet p3 = new Pet("Bagheera", 8, 'M', true, true, false, "Cat", "DLH", "Black", true, true, false,"Bagheera is named after his resemblance to the black panther in the, 'Jungle Book'.\nMuch like the character, he gets alongs with all animals, but is hesitant around certain humans.\nBagheera does not like small humans or females.\nHe is look for a responsible male bachelor to build a life long relationship and help with his diabetes.\nHis favorite activity is climbing.", 0);
        Pet p4 = new Pet("Roscoe", 5, 'M', true, true, true, "Dog", "Terrier-Mix", "Red", true, false, false,"Roscoe is a gentle soul who loves all beings. Cats, dogs, kids, turtles you name it he will befriend them.\nRoscoe does have some hotspots going on right now, but with a little love, attention and vet prescribed cream\nhe will be right back to 100% health.\nHis favorite activity is going to the beach.", 0);
        Pet p5 = new Pet("Zion", 4, 'M', false, false, true, "Dog", "Rottweiler", "Black/Tan", false, true, false,"Zion is a lovable rottweiler who enjoys eating, naping and the ocasional frisbee game.\nHe is excellent with young children, bu he does not get along with cats or other dogs.\nZion also feels more comfortable around men.\nHe can be quiet shy and hesitant around the ladies.\nHis favorite acitivty is playing frisbee in a grassy field.", 0);
        Pet p6 = new Pet("Veera", 6, 'F', true, true, false, "Dog", "Pitbull", "Grey", false, false, true, "Veera is a sweet gal who loves cats and dogs.\nShe isn't great with kids, she gets annoyed easily.\nShe is also hesitant around men.\nVeera is looking for a gal pal to take nice long walks with.\nHer favorite activity is rolling around.",0);

        petList.add(p1);
        petList.add(p2);
        petList.add(p3);
        petList.add(p4);
        petList.add(p5);
        petList.add(p6);

        for (Pet p : petList) {
            p.print();
        }

        System.out.println(
                "The application process will begin now. After completing the form we will recommend the best pet match for your home.");

        System.out.println("Are you interested in adopting a cat or dog: ");
        String preference = input.nextLine();

        // check that input was either dog or cat
        if (!preference.equalsIgnoreCase("cat") && !preference.equalsIgnoreCase("dog")) {
            System.out.println("We're sorry. We only have cats and dogs available. Please enter a valid choice: ");
            preference = input.nextLine();
        }

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter the gender you align with (M/F/X): ");
        char gender = input.next().charAt(0);
        System.out.println("Do you currently live with cats (true/false): ");
        
        boolean cats;
        try {
            cats = input.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("You must enter either true or false: ");
            cats = input.nextBoolean();
        }

        System.out.println("Do you currently live with dogs (true/false): ");
        boolean dogs;
        try {
            dogs = input.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("You must enter either true or false: ");
            dogs = input.nextBoolean();
        }

        System.out.println("Do you currently live with kids (true/false): ");
        boolean kids;
        try {
            kids = input.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("You must enter either true or false: ");
            kids = input.nextBoolean();
        }

        System.out.println("Have you owned a pet before (true/false): ");
        boolean priorPets;
        try {
            priorPets = input.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("You must enter either true or false: ");
            priorPets = input.nextBoolean();
        }

        // create Person object with input
        Person person = new Person(name, age, gender, cats, dogs, kids, priorPets, preference);
        person.checkAge(person.getAge());

        /**
         * check if the person wants a cat or dog
         * pass petList to modify and person to compare stats
         */
        review.catsOrDogs(petList, person);
        /*System.out.println("Cat or Dog human preference");
        for (Pet p : petList) {
            System.out.println(p.getName());
        }*/

        /*
         * check for the gender preference of pet
         * pass PetList to modify and person to compare stats
         */
        review.petGenderPreference(petList, person);
        /*System.out.println("Pet preference for human gender");
        for (Pet p : petList) {
            System.out.println(p.getName());
        }*/

        /*
         * check for the medical condition of pet
         * pass PetList to modify and person to compare stats
         */
        review.checkMedicalConditionMatch(petList, person);
        /*System.out.println("Checking medical condition");
        for (Pet p : petList) {
            System.out.println(p.getName());
        }*/

        /*
         * compare pet's stats with person's information, modify scores, sort arraylist based on score value, print result
         * pass PetList to modify and person to compare stats
         */
        review.setScore(petList, person);
        /*System.out.println("Setting the score");
        for (Pet p : petList) {
            System.out.println(p.getName());
            System.out.println(p.getScore());
        }*/

    }

}