import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainClass {
    public static void main (String[] args) {

        Scanner scan= new Scanner(System.in);
        int a1,b1,c1,d1;
        double p1,q1,r1,s1;
        String i;
        
        JOptionPane.showMessageDialog(null,"Choose Your Data Type :");
        JOptionPane.showMessageDialog(null,"1.Integer \n2.Double");
       
       
        i= JOptionPane.showInputDialog("Choose Your Choice : ");
         int option =Integer.parseInt(i);
         
        if(option==1)
        {
            
        JOptionPane.showMessageDialog(null,"Number of Variable :\n2.Two\n3.Three\n4.Four\n");
       
            
            i = JOptionPane.showInputDialog("Choose Your Choice : ");
           int ab = Integer.parseInt(i);
            if(ab==2)
            {
               i = JOptionPane.showInputDialog("Choose first integer : ");
             a1 =  Integer.parseInt(i);
              i = JOptionPane.showInputDialog("Choose second integer : ");
               b1 = Integer.parseInt(i);
                CalculationSystem cal1 = new CalculationSystem(a1,b1);
            }
            else if(ab==3)
            {
               i = JOptionPane.showInputDialog("Choose first integer : ");
              a1 = Integer.parseInt(i);
              i =JOptionPane.showInputDialog("Choose second integer : ");
               b1 =  Integer.parseInt(i);
               i = JOptionPane.showInputDialog("Choose third integer : ");
              c1 =  Integer.parseInt(i);
                CalculationSystem cal2 = new CalculationSystem(a1,b1,c1);

            }
            else if(ab==4)
            {
              i =  JOptionPane.showInputDialog("Choose first integer : ");
              a1 = Integer.parseInt(i);
              i =  JOptionPane.showInputDialog("Choose second integer : ");
             b1 =  Integer.parseInt(i);
               i= JOptionPane.showInputDialog("Choose third integer : ");
             c1 = Integer.parseInt(i);
               i = JOptionPane.showInputDialog("Choose forth integer : ");
               d1 =  Integer.parseInt(i);
                CalculationSystem cal3 = new CalculationSystem(a1,b1,c1,d1);
            }

        }
        if(option==2)
        {
            JOptionPane.showMessageDialog(null,"Number of Variable :\n2.Two\n3.Three\n4.Four\n");
            
            i = JOptionPane.showInputDialog("Choose Your Choice : ");
           int ab = Integer.parseInt(i);
           
            if(ab==2)
            {
                 i =  JOptionPane.showInputDialog("Choose first double number : ");
              p1 = Double.parseDouble(i);
              
              i =  JOptionPane.showInputDialog("Choose second double number : ");
             q1 =  Double.parseDouble(i);
               
                

                CalculationSystem cal4 = new CalculationSystem(p1,q1);
            }
            else if(ab==3)
            {
                
                 i =  JOptionPane.showInputDialog("Choose first double number : ");
              p1 = Double.parseDouble(i);
              
              i =  JOptionPane.showInputDialog("Choose second double number : ");
             q1 =  Double.parseDouble(i);
             
              i =  JOptionPane.showInputDialog("Choose third double number : ");
             r1 =  Double.parseDouble(i);
               
                CalculationSystem cal5 = new CalculationSystem(p1,q1,r1);
            }
            else if(ab==4)
            {
                
                  i =  JOptionPane.showInputDialog("Choose first double number : ");
              p1 = Double.parseDouble(i);
              
              i =  JOptionPane.showInputDialog("Choose second double number : ");
             q1 =  Double.parseDouble(i);
             
              i =  JOptionPane.showInputDialog("Choose third double number : ");
             r1 =  Double.parseDouble(i);
             
             i =  JOptionPane.showInputDialog("Choose forth double number : ");
             s1 =  Double.parseDouble(i);
                
                CalculationSystem cal6 = new CalculationSystem(p1,q1,r1,s1);
            }

        }

    }

}

class CalculationSystem {
    
       int a,b,c,d;
    double p,q,r,s;
    int result_int;
    double result_double;


    CalculationSystem(int m,int n)
    {
       a=m;
        b=n;

        result_int=a+b;                    
    }
    
    CalculationSystem(int m,int n,int x)
    {
        a=m;
        b=n;
        c=x;

        result_int=a+b+c;
        JOptionPane.showMessageDialog(null,"Sum of three integer : " + result_int);     
    }

    CalculationSystem(int m,int n,int x,int y)
    {
        a=m;
        b=n;
        c=x;
        d=y;

        result_int=a+b+c+d;
        
         JOptionPane.showMessageDialog(null,"Sum of four integer : " + result_int);     
       
    }
    
    CalculationSystem(double m,double n)
    {
        p=m;
        q=n;

        result_double=p+q;
        JOptionPane.showMessageDialog(null,"Sum of two double : " + result_double );
     
   }

    CalculationSystem(double m,double n,double x)
    {
        p=m;
        q=n;
        r=x;

        result_double=p+q+r;
        JOptionPane.showMessageDialog(null,"Sum of three double : " + result_double);       
    }

    CalculationSystem(double m,double n,double x,double y)
    {
        p=m;
        q=n;
        r=x;
        s=y;

        result_double=p+q+r+s;
        JOptionPane.showMessageDialog(null,"Sum of four double :" + result_double);     

    }




}
