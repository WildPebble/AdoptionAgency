/**
 * Testing class for person's age
 *
 * @author  Becca Fondo
 * @version May 06, 2025
 */
public class AdoptionAgencyTEST {
    public static void main(String[] args) {
       testInvalidAge();
       
       
       }
       /**
       * Test Case: testUnderage
       * 
       * Input: p1 (Person with negative age)
       * Expected Output: "We are sorry, you must be 18 years or older to adopt a pet.
       * Please come apply again once you are of age."
       */
    public static void testInvalidAge() {
        try {
            Person p1 = new Person("P2: Invalid Age", -17, 'F', false, false, false, false, "dog");
            p1.checkAge(p1.getAge());
            System.out.println("---- FAIL --> testInvalidAge: FAIL (Expected exception, but application succeeded)");
        } catch (IllegalArgumentException e) {
            System.out.println("++++ PASS --> testInvalidAge: Correctly threw exception for negative number as age.");
        }
    }


   
    
}