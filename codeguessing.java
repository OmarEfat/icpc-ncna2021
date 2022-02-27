/*
 All possible options!
 AABB  --> It's possible if second A card is at 7
 BAAB  --> It's possible if A is at 2 at the other at 8
 BBAA --> It's possible if the first A is at 3
 
 ABAB --> It's possible if 6 7 8 9
 BABA --> It's possible if A is 3 and the other is 4
 
 ABBA

 */
import java.util.Scanner;

public class countEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int aliceCard1 = scn.nextInt();
        int aliceCard2 = scn.nextInt();
        String shuffle = scn.next();

        char[] array = shuffle.toCharArray();
        int firstA = -1;
        int secondA = -1;
        for(int i = 0 ; i< array.length ; i++)
        {
            if(array[i]=='A' && firstA==-1)
                firstA = i;
            if(array[i]=='A' &&firstA!=-1)
                secondA=i;
        }
        int distanceA = secondA - firstA;

        {
            /*
            ABBA
             */
            if(distanceA==3)
            {
                if(firstA==0 && secondA==3 && aliceCard2-aliceCard1==3)
                {
                    int first_value = aliceCard1+1;
                    int second_value = aliceCard1+2;
                    System.out.println(first_value+ " " +second_value);
                }
                else
                    System.out.println(-1);
            }
            /*
            ABAB
            BABA
             */
            else if(distanceA==2)
            {
                if(firstA==0 && secondA==2 && aliceCard2==8 && aliceCard1==6)
                    System.out.println("7 9");
                else if(firstA==1 && secondA==3 && aliceCard1==2 && aliceCard2==4)
                    System.out.println("1 3");
                else
                    System.out.println(-1);
            }
            /*
            AABB
            67BB
            BBAA
            BB34
            BAAB
            B28B
            So the cases are
            6 and 7 then 8 and 9
            or 3 and 4
            that's it!
             */
            else if(distanceA==1)
            {
                if(firstA==0 && secondA==1 && aliceCard2==7)
                    System.out.println("8 9");
                else if(firstA==2 && secondA==3 && aliceCard1==3)
                    System.out.println("1 2");
                else if(firstA==1 && secondA==2 && aliceCard1==2 && aliceCard2==8)
                    System.out.println("1 9");
                else
                    System.out.println(-1);
            }

            else
                System.out.println(-1);
        }


    }
}
