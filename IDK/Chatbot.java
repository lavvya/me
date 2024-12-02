import java.util.Scanner;

//list: YESNO, QUIT, new method, MENU, !! options for would you like to add anything else, cost

public class Chatbot {
static String[] allResp = new String[100];
        static int respCount = 0;
        static double price = 0.0;
        static String[] menuOptions = {"menu", "do you have", "ice cream", "food", "yes", "yeah", "yep", "mhm", "yea", "right", "ok", "please"};
        static String[] flavors = {"chocolate", "vanilla", "orange", "strawberry", "pineapple", "peppermint"};
        static String[] sizeOptions = {"large", "medium", "small"};
        static String[] cupOrCone = {"cup", "cone"};
        static String[] napkins = {"yes", "no", "yeah", "yep", "mhm", "yea", "right", "ok","no", "nope", "nuh-uh", "nah"};

        static String[] yes = {"yes", "yeah", "yep", "mhm", "yea", "right", "ok"};
        static String[] no = {"no", "nope", "nuh-uh", "nah"};
        static String[] goodBye = {"bye", "quit", "goodbye", "farewell", "exit"};



        public static void menu(String userResp){
                if(byee(userResp)){
                        System.err.println(ConsoleColors.BLACK + "Thank you for your time! Have a nice day!" + ConsoleColors.RESET);
                        System.exit(0);
                }
                if(userResp.indexOf("please")>0){
                       userResp = userResp.substring(0, userResp.indexOf("please"));
                }
                while(!error(userResp, menuOptions) || userResp.split(" ").length > 1){
                        String[] botErrorResp = {"Sorry, I don't understand. \n", "Please refrain from typing gibberish\n","please try again.\n", "Sorry, I didn't get that. Please try again.\n", "I'm sorry I don't seem to understand. Please tell me what it is I can do: \n"};
                        int y = (int) (Math.random() * 5);
                        System.err.println(ConsoleColors.BLACK + botErrorResp[y] + ConsoleColors.RESET);
                        Scanner in = new Scanner (System.in);
                        userResp = in.nextLine().toLowerCase();
                        if(userResp.indexOf("please")>0){
                                userResp = userResp.substring(0, userResp.indexOf("please"));
                         }
                }
        }
    
        public static void flavor(String userResp){
                if(byee(userResp)){
                        System.err.println(ConsoleColors.BLACK + "Thank you for your time! Have a nice day!" + ConsoleColors.RESET);
                        System.exit(0);
                }
                if(userResp.indexOf("please")>0){
                        userResp = userResp.substring(0, userResp.indexOf("please"));
                 }
                while (!error(userResp, flavors) || userResp.split(" ").length > 1) {
                String[] botErrorResp = {"Sorry, that doesn't seem right. Please choose only one of the flavors listed. Only write the NAME of ONE flavor: \n", "You can only choose one flavor. Please type the NAME of ONE flavor: \n", "Hmmm I didn't get that. Please choose 1 flavor.\n", "Sorry, I didn't get that. Please try again. Only enter the NAME of ONE flavor: \n", "I'm sorry, I don't seem to understand. Please type in the NAME of ONE flavor: \n"};
                int y = (int) (Math.random() * 5);
                System.err.println(ConsoleColors.BLACK + botErrorResp[y] + ConsoleColors.RESET);
                Scanner in = new Scanner (System.in);
                userResp = in.nextLine().toLowerCase();
                if(userResp.indexOf("please")>0){
                        userResp = userResp.substring(0, userResp.indexOf("please"));
                 }
        }
             
                allResp[respCount] = userResp;
                respCount++;
                String[] botFlavResp = {"Good choice!\n", "I love that!", "Yum!\n", "...to each their own, I suppose.\n", "Very popular!\n" };
                int x = (int) (Math.random() * 5);
                System.err.println(ConsoleColors.BLACK + botFlavResp[x] + ConsoleColors.RESET);
             
            } 

    public static void size(String userRespSize){
        if(byee(userRespSize)){
                System.err.println(ConsoleColors.BLACK + "Thank you for your time! Have a nice day!" + ConsoleColors.RESET);
                System.exit(0);
        }
        if(userRespSize.indexOf("please")>0){
                userRespSize = userRespSize.substring(0, userRespSize.indexOf("please"));
         }
        while(!error(userRespSize, sizeOptions) || userRespSize.split(" ").length > 1){
                String[] botErrorSize = {"Sorry, that doesn't seem right. Please choose one of the sizes provided", "You moron! It says type a size in ENGLISH. ENGLISH.", "Hmmm I didn't get that. Please choose a size.", "Please try again. Enter a size: ", "I'm sorry I don't seem to understand. Please type in a size: \n"};
                int b = (int)(Math.random()*5);
                System.err.println(ConsoleColors.BLACK + botErrorSize[b] + ConsoleColors.RESET);
                Scanner in = new Scanner (System.in);
                userRespSize = in.nextLine().toLowerCase();
                if(userRespSize.indexOf("please")>0){
                        userRespSize = userRespSize.substring(0, userRespSize.indexOf("please"));
                 }
        }
                if (userRespSize.equals("l") || userRespSize.contains("large")){
                        allResp[respCount] = userRespSize;
                        respCount++;
                        price += 4.99;
                        System.err.println(ConsoleColors.BLACK + "$4.99 has been added to your order total\n" + ConsoleColors.RESET);
                        String[] fattie = {"Looks like you're a bit chubby!\n", "Big Back\n", "Erm....okay ig\n", "I love a good foodie!\n", "A big size for a big person!\n"};
                        int bigback = (int)(Math.random()*5);
                        System.err.println(ConsoleColors.BLACK + fattie[bigback] + ConsoleColors.RESET);
                }
                if (userRespSize.equals("m") || userRespSize.contains("medium") || userRespSize.equals("s") || userRespSize.contains("small")){
                        allResp[respCount] = userRespSize;
                        respCount++;
                        if(userRespSize.equals("medium")){
                                price += 3.99;
                                System.err.println(ConsoleColors.BLACK + "$3.99 has been added to your order total\n" + ConsoleColors.RESET);

                        }
                        else{
                                price += 2.99;
                                System.err.println(ConsoleColors.BLACK + "$2.99 has been added to your order total\n" + ConsoleColors.RESET);

                        }
                        
                        String[] botSizeResp = {"Good choice!\n", "I love that!\n", "Yum!\n", "Great!\n", "Very popular!\n"};
                        int sizenotbig = (int)(Math.random()*5);
                        System.err.println(ConsoleColors.BLACK + botSizeResp[sizenotbig] + ConsoleColors.RESET);
                }
        }

              

    public static void cupcone(String userRespContainer){
        if(byee(userRespContainer)){
                System.out.println(ConsoleColors.BLACK + "Thank you for your time! Have a nice day!" + ConsoleColors.RESET);
                System.exit(0);
        }
        if(userRespContainer.indexOf("please")>0){
                userRespContainer = userRespContainer.substring(0, userRespContainer.indexOf("please"));
         }
        while(!error(userRespContainer, cupOrCone) || userRespContainer.split(" ").length > 1){
                String[] botErrorCont = {"Sorry, that doesn't seem right. Please choose one cup or cone?", "You stupido! It says type cup or cone. Cup. Or. Cone.", "Hmmm I didn't get that. Please choose cup or cone.", "Please try again. Enter cup or cone: ", "I'm sorry I don't seem to understand. Please type in cup or cone: \n"};
                int b = (int)(Math.random()*5);
                System.out.println(ConsoleColors.BLACK + botErrorCont[b] + ConsoleColors.RESET);
                Scanner in = new Scanner (System.in);
                userRespContainer = in.nextLine().toLowerCase();
                if(userRespContainer.indexOf("please")>0){
                        userRespContainer = userRespContainer.substring(0, userRespContainer.indexOf("please"));
                 }
        }
                if(userRespContainer.equals("cone") || userRespContainer.equals("cup")){
                        allResp[respCount] = userRespContainer;
                        respCount++;
                        String[] botContainerResp = {"Good choice!\n", "I love that!\n", "Yum!\n", "...to each their own, I suppose.\n", "Very popular!\n"};
                        int container = (int)(Math.random()*5);
                        System.out.println(ConsoleColors.BLACK + botContainerResp[container] + ConsoleColors.RESET);
                }
        }

public static void fullOrder(){
        int countx = 0;
        System.out.println(ConsoleColors.BLACK + "\n Your order consists of: " + ConsoleColors.RESET);
        for (String lol : allResp){
                if(lol != null){
                        countx++;
                }
        }
        for (int i = 0; i < countx; i++){
                
                if(i%3==0){
                        System.out.print("- a " + allResp[i]);
                }
                if (i%3==1){
                        System.out.print(" " + allResp[i]);
                }
                if (i%3==2){
                        System.out.println(" " + allResp[i] + ".");
                }
        }
        System.out.println(ConsoleColors.BLACK + "Your total price is: $" + price + "." + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLACK + "Thank you for your purchase! Have a nice day!" + ConsoleColors.RESET);
}

public static boolean error(String input, String[] option) {
        int hi = 0; 
        String[] words = input.split(" "); 
        for (String word : words) { 
            for (String x : option) { 
                if (word.equals(x)) { 
                    hi++; 

                }
            }
        }
        return hi == 1;
    }

public static boolean byee(String userResp){
        for (String option : goodBye){
                if (userResp.equals(option)){
                        return true;
                }
        }
        return false;
       
}

public static boolean yess(String input){
        for (String option : yes){
                if (input.contains(option)){
                        return true;
                }
        }
        return false;
}

public static boolean noo(String input){
        for (String option : no){
                if (input.contains(option)){
                        return true;
                }
        }
        return false;
}

}
