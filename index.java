import java.util.Scanner;


class index
{
        public static void main(String[] args) {
            System.out.println("Enter the program to Check Pass or Fail");
            Scanner bc = new Scanner(System.in);
            int m1, m2, m3, m4;
            System.out.println("Enter the Marks of Physics");
            m1 = bc.nextInt();
            System.out.println("Enter the Marks of Maths");
            m2 = bc.nextInt();
            System.out.println("Enter the Marks of English");
            m3 = bc.nextInt();
            System.out.println("Enter the Marks of Sanskrit");
            m4 = bc.nextInt();
            float total = m1+m2+m3+m4;
            float avg = total/4;
            System.out.println("The total Percentage is " + avg);

            if(m1>33 && m2>33 && m3>33 && m4>33)
            {
                System.out.println("your are Promoted Bro");
            }
            else
            {
                System.out.println("Better Luck Try it next Time");
            }
           
        }
}#   c o n d i t i o n a l  
 