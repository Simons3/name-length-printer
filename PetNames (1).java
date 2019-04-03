import java.util.*;
public class PetNames{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String names = "", newName = "";
        int petCount = 0, counter = 0;
    
        System.out.println("How many pets do you have? ");
        petCount = input.nextInt();
    
        while(counter < petCount){
        
            System.out.println("What is your pet's name? ");
            newName = input.next();
        
            names = add(names, newName);
            
            counter++;
        }
    
        System.out.println("I would like to meet " + names + "!");
    }

    public static String add(String listOfNames, String thisName){
        listOfNames = listOfNames + " ";
        return(listOfNames.concat(thisName));
    }
}