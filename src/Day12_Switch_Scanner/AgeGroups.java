package Day12_Switch_Scanner;

public class AgeGroups {
   /*2. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF

    */
   public static void main(String[] args) {
       int age = 19;
       String ageGroup = "";

       if(age > 0 && age <= 150) {

           if (age < 21) {
               ageGroup = "Teenager";
           } else if (age <= 55) { //(age >= 21 && age <= 55){
               ageGroup = "Adult";
           } else {
               ageGroup = "Senior";
           }

       }else {
           ageGroup = "Invalid";
       }

           System.out.println(ageGroup);






   }

}
