public class FiveTime
{
import javax.swing.JOptionPane;

    public static void main(String args []) {
        String name;
        String string1;
        String city;
        String profession;
        String animalType;
        String petName;
        


        
	//I have added some comments
        
        name= JOptionPane.showInputDialog("Enter your name : ");
        string1=JOptionPane.showInputDialog("Enter your  age");
        int age=Integer.parseInt(string1) ;
        city=JOptionPane.showInputDialog("Enter your city name: ");
        profession=JOptionPane.showInputDialog("Enter your profession: ");
        animalType=JOptionPane.showInputDialog("Enter what type of animal you have: ");
        petName=JOptionPane.showInputDialog("Enter your pet name: ");

	//I have added a comment here too
        JOptionPane.showMessageDialog(null,"There once was a person named"+ name+ " who lived in "+ city+"."+ "At the age of"+ age+","+name+" went to college at"+ college+"."+ name+ " graduated and went to work as a "+ profession+ "."+ "Then\,"+ name+ " adopted a(n)" +  animalType+ " named "+ petName+"\.They both lived happily ever after\!");
        System.exit(0);
    }
    
}

   
