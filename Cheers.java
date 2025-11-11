
public class Cheers {
        public static void main(String[] args) {
	int times = Integer.parseInt("" + args[1]);
        String s = args[0];
        String upperS = s.toUpperCase();

        int i=0;
        String special = "AEFHILMNORSX";
        
        int length= upperS.length();
        while (i<length) { 
            char letter= upperS.charAt(i);
            if(special.indexOf(letter)!=-1)
                System.out.println("Give me an "+letter+": "+letter+"!");
             else   
                System.out.println("Give me a "+letter+": "+letter+"!");

            i++;
        }
        System.out.println("What does that spell?");
        int j=0;
        while (j<times) { 
           System.out.println(upperS+"!!!"); 
           j++;
        }



        }
}
