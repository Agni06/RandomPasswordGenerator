// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {





                Scanner sc = new Scanner(System.in);
                System.out.println("How many passowrds do you want to generate?");
                int total = sc.nextInt();
                System.out.println("How long the passowrds do you want to generate?");

                        String[] passwords = new String[total];
                int length = sc.nextInt();
                for(int i=0 ; i<total; i++)
                {
                    String randomPass = "";

                    for(int j =0 ; j< length; j++)
                    {
                        randomPass += randomCharacter();

                    }
                    passwords[i] = randomPass;
                }

                    printPasswords(passwords);

            }
            public static void printPasswords(String[] pass)
            {
                for(int i=0;i<pass.length;i++)
                {
                    System.out.println(pass[i]);
                }
            }
            public static char randomCharacter()
            {
                int rand = (int)(Math.random()*62);
                if(rand <= 9 )
                // 48 - 57
                {
                    return (char)(rand+48);

                }
                else if(rand<= 35)
                //65 - 90
                {
                    return (char)(rand+55);//65-10

                }
                else
                //97 - 122
                {
                    return (char)(rand+61);//97 - 36
                }

            }


        }

