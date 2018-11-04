import java.util.*;

public class HackBI
{
   public static void main(String[] args)
   {
   String name1; 
   String place; 
   String action1; 
   String color1; 
   String clothing; 
   int temp; 
   String animal; 
   String action2; 
   int week; 
   String color2;
   String adjective; 
   String action3; 
   int month; 
   String action4; 
   int cont2; 

   
      Scanner input = new Scanner(System.in);
   
      System.out.println("Ocean acidification is causing many vulnerable species like plankton to die out,"); 
   
      System.out.println("which is disrupting the food chain and impacting larger animals like fish and whales.");
   
      System.out.println("Additionally, it is making it more difficult for animals to build calcium carbonate shells and skeletons.");
   
      System.out.println("Ocean acidification is the result of an overload of carbon dioxide in the atmosphere.");
   
      System.out.println("When carbon dioxide enters the atmosphere, it combines with seawater to produce carbonic acid.");
   
      System.out.println("The pH of the ocean has already fallen 0.1 units, a thirty percent increase in acidity.");
   
      System.out.println("Seemingly small drop in pH can actually represent a doubling of acidity but NRDC is working to reduce carbon");
   
      System.out.println("pollution and pushing for more funded research of this global issue. Thanks for listening and get"); 
   
      System.out.println("ready to start our ocean themed Mad libs game. Press 1 to continue.");
      int cont = input.nextInt();
   
      if (cont == 1){
         System.out.println(" ");
      
         System.out.println("Give a Name");
      
          name1 = input.next();
      
         System.out.println("Give a place");
      
          place = input.next();
      
         System.out.println("Give an action ending in -ed");
      
          action1 = input.next();
      
         System.out.println("Give a color");
      
          color1 = input.next();
      
         System.out.println("Give an article of clothing");
      
          clothing = input.next();
      
         System.out.println("Give a number");
      
          temp = input.nextInt();
      
         System.out.println("Give an animal");
      
          animal = input.next();
      
         System.out.println("Give an action ending in -ed");
      
          action2 = input.next();
      
         System.out.println("Give a number");
      
          week = input.nextInt();
      
         System.out.println("Give a color");
      
          color2 = input.next();
      
         System.out.println("Give an adjective");
      
          adjective = input.next();
      
         System.out.println("Give an action ending in -ed");
      
          action3 = input.next();
      
         System.out.println("Give a number");
      
          month = input.nextInt();
      
         System.out.println("Give an action ending in -ed");
      
          action4 = input.next();
      
         System.out.println("Ready to see the results? Click 2 to continue.");
      
          cont2 = input.nextInt();
      
         if (cont2 == 2){
            System.out.println("Last year, " + name1+ " and I went to " + place + " to go scuba diving for the first time. ");
            
               System.out.println(" I wanted to see how far I could dive.");
            
               System.out.println("I " + action1 + " into the sea, wearing just my " + color1 + " " + clothing + ".");
            
               System.out.println("The sea was " + temp + " degrees, but I didn't mind.");
            
               System.out.println("I started swimming. I did the " + animal + " stroke, and " + action2 + " at fifty miles per hour!");
            
               System.out.println("I had been swimming for almost " + week + " weeks, when I saw a(n) " + color2 + " blobfish swimming towards me!");
            
               System.out.println("The creature was " + adjective + ", but I wasn't scared. And when it got closer, it tried to eat me,");
            
               System.out.println("so I " + action3 + " away.");
            
               System.out.println("It opened its mouth and ate my " + clothing + ". I was horrified.");
            
               System.out.println("I swam after it for " + month + " months, but I gave up and left without my " + clothing + "."); 
            
               System.out.println(name1 + " asked me where my " + clothing + " was. I " + action4 + " and we drove back home.");
            
               System.out.println("I had to buy (a) new " + clothing + ".");
            
            
          } 
         
        }
      
    }

}
