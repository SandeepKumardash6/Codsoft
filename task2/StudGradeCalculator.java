//Student Grade Calculator using java code!!
package task2;
import java.util.Scanner;
public class StudGradeCalculator {
    public char Grade(double a){
        if(a>=90){
            return 'O';
        }
        else if (80 <= a && a <90) {
            return 'E';
        }
        else if (70<=a && a<80) {
            return 'A';
        }
        else if (60<=a && a<70) {
            return 'B';
        }
        else if (50<=a && a<60) {
            return 'C';
        }
        else if (40<=a && a<50) {
            return 'D';
        }
        else if (30<=a && a<40){
            return 'E';
        }
        else{
            return 'F';
        }
    }
    public void display(int a,double b,char c){
        System.out.println("Total marks Obtained: "+ a +" \nAverage Percentage is: "+b+"\nEquivalent grade is : "+c);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StudGradeCalculator st =new StudGradeCalculator();
        int i,tm=0;
        System.out.println("Enter the number of Subjects: ");
        int n=s.nextInt();
        String sn[]=new String[n];
        int sm[]=new int[n];
        System.out.println("Enter the name of subjects");
        for(i=0;i<n;i++){
            System.out.println("subject "+(i+1)+":");
            sn[i]=s.next();
        }
        for(i=0;i<n;i++){
            System.out.println("Enter the mark of "+ sn[i] + " out of 100 :");
            sm[i]=s.nextInt();
        }
        for(i=0;i<n;i++){
            tm=tm+sm[i];
        }
        double avg=tm/n;
        char grad=st.Grade(avg);
        st.display(tm,avg,grad);
    }  
}