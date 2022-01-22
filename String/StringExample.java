//Reference Compare
//concatination
public class StringExample {
    public static void main(String[] args) {
        // Creating two string literals
        String s1 = "geeks";
        String s2 = "geeks";
        
        // Checking if both point to the
        // same object or not
        if(s1 == s2)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        // Creating a string using 
        // new operator
        String s3 = new String("geeks");
        
        // Checking if both point to the
        // same object or not
        if(s1 == s3)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    /*public static void main(String args[]) 
    {
        // Creating two string literals
        String s1 = "geeks";
        String s2 = s1;
        
        // Creates a new object "geeksforgeeks"
        // Now s1 points to this new string
        s1 = s1 + "forgeeks";
        // or
        // s1 = s1.concat("forgeeks");
        
        System.out.println(s1);
        
        // Since s2 is still pointing 
        // to initial "geeks"
        // and s1 is pointing to a new 
        // object "geeksforgeeks"
        System.out.println(s1 == s2);
    }*/
}
