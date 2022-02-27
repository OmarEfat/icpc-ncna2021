import java.util.Scanner;

public class Espresso {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int cap = scn.nextInt();

        int result = 0;
        int current_cap = cap;
        int refills = 0;
        for(int i =  0 ; i<t ; i++)
        {
            String request = scn.next();
            char[] array = request.toCharArray();
            if(array.length==1) {
                result = array[0] - '0';
                if(current_cap-result>=0)
                    current_cap-= result;
                else
                {
                    refills++;
                    current_cap = cap;
                    current_cap-= result;

                }
            }
            else {
                result=(array[0]-'0')+1;
                if(current_cap-result>=0)
                    current_cap-= result;
                else
                {
                    refills++;
                    current_cap = cap;
                    current_cap-= result;
                }
            }


        }
        /*if(result<=cap)
            System.out.println(0);
        else
        {
            if((result-cap)%cap==0)
                System.out.println((result-cap)/cap);
            else {
                int value = (result-cap)/cap +1;
                System.out.println(value);
            }
        }*/
        System.out.println(refills);
    }


}
