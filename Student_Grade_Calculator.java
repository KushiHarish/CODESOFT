
package codesoft;

import java.util.Scanner;
public class Student_Grade_Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter The Number of Subjects:");
        int N = scanner.nextInt();
        scanner.nextLine();
        
        String sub[] = new String[N];
        int marks[] = new int[N];
        int total= 0;
        
        for(int i =0;i<N;i++){
            System.out.println("Enter Subject " + (i+1) + ":" );
            sub[i] = scanner.nextLine();
            
        }
        for(int i=0;i<N;i++){
            System.out.println("Enter the marks in "+ sub[i] + ":");
            marks[i]=scanner.nextInt();
            
        }
        for(int i=0;i<N;i++){
            total=total+marks[i];
                      
        }
         float per= (total/N);
         System.out.println("Total Marks:"+total);
         System.out.println("Percentage:"+per+"%");
         if (per>=90)
             System.out.println("Grade A+");
         else if (per>=80)
             System.out.println("Grade A");
         else if (per>=70)
             System.out.println("Grade B+");
         else if (per>=60)
             System.out.println("Grade B");
         else if (per>=50)
             System.out.println("Grade C+");
         else if (per>=40)
             System.out.println("Grade C");
         else
             System.out.println("Grade D");
         
    }
    
}
