import java.util.Scanner;
public class App
{
    //CREATE INSTANCE VARIABLES HERE. Ensure they are static.
    //May want to create an array of goodbye answers.
    //list: yes/no, quit, new method, menu?, more options for would you like to add anything else, cost

        
        static boolean hi = true;

       public static void main(String[] args)
       {
        System.err.println(ConsoleColors.BLACK + "Hi! Welcome to Meadowlark Dairy here at Pleasanton! I hope you are doing well!" + ConsoleColors.RESET);
        System.err.println(ConsoleColors.BLACK + "If, at any point, you wish to leave, please type in \"quit\", \"exit\", or \"goodbye\"." + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + "Please refrain from typing responses with more than one word!" + ConsoleColors.RESET);
        Scanner in = new Scanner(System.in);
        System.err.println(ConsoleColors.BLACK +"\n Would you like our menu?" + ConsoleColors.RESET);
        String ab = in.nextLine().toLowerCase();
        Chatbot.menu(ab);
        
        while(hi){
                System.err.println(ConsoleColors.BLACK + "Well then, Here are our flavors: \n Chocolate - A rich blend of velvety cocoa and creamy decadence in every scoop. \n Vanilla - A rich blend of pure, aromatic vanilla beans that delight the senses. \n Strawberry - A rich blend of sweet, sun-ripened strawberries bursting with flavor. \n Orange - A rich blend of zesty, refreshing orange for a tangy twist. \n Pineapple - A rich blend of tropical pineapple that transports you to paradise. \n And this month's special flavor: Peppermint - A rich blend of cool, minty freshness that invigorates your taste buds. \n  Enter the NAME of ONE flavor (your answer should be one word): \n" + ConsoleColors.RESET);
                String a = in.nextLine().toLowerCase();
                Chatbot.flavor(a);


                System.err.println(ConsoleColors.BLACK + "Here are the size options: \n - Large - $4.99 \n - Medium - $3.99 \n - Small - $2.99 \n Enter a size: " + ConsoleColors.RESET);
                String b = in.nextLine().toLowerCase();
                Chatbot.size(b);

                System.err.println(ConsoleColors.BLACK + "Would you like a... \n - Cup? or \n - a Cone? \n Enter a container option: " + ConsoleColors.RESET);
                String c = in.nextLine().toLowerCase();
                Chatbot.cupcone(c);
        
        
                System.err.println(ConsoleColors.BLACK + "Would you like to add anything else to your order? Type no if you would like to proceed with your payment" + ConsoleColors.RESET);
                while(true){
                        String f = in.nextLine().toLowerCase().trim(); //trim method is used to remove leading and trailing spaces from a string (this is the new method not formally taught in class)
                        if(Chatbot.noo(f)){
                                System.err.println(ConsoleColors.BLACK + "Thank you for your order! Proceeding with payment..." + ConsoleColors.RESET);
                                hi = false;
                                break;
                        }
                        else if (Chatbot.yess(f) || f.contains("add") || f.contains("order")){
                                break;
                        }
                        else{
                                String[] botErrorCont = {"Sorry, that doesn't seem right.", "You stupid.", "Hmmm I didn't get that..", "Please try again.", "I'm sorry I don't seem to understand. \n"};
                                int blah = (int)(Math.random()*5);
                                System.err.println(ConsoleColors.BLACK + botErrorCont[blah] + ConsoleColors.RESET);
                                //System.err.println("");
                        }
                }

        }
       Chatbot.fullOrder();
        }
}
