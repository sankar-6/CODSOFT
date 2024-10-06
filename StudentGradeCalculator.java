import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects:-");
        int sub =sc.nextInt();
        String [] sub_name = new String[sub];
        int [] marks = new int [sub];
        double total=0;
        for(int i=0;i<sub;i++){
            System.out.println("Enter subject name:-");
            sub_name[i]= sc.next();
            System.out.println("Enter marks from (0 to 100):-");
            marks[i]= sc.nextInt();
            total +=marks[i];
        }
        System.out.println("Marks are:-");
        for(int i=0;i<sub;i++){
            System.out.printf("%s : ",sub_name[i]);
            System.out.printf("%d\t\n",marks[i]);
        }
        double Average = (double)total/sub;
        System.out.printf("\nTotal marks are : %.2f\n",total);
        System.out.printf("Average percentage is: %.2f %%\n",Average);
        if(Average>90){
            System.out.println("Grade is :O");
        }
        else if(Average>80 && Average<90){
            System.out.println("Grade is :A");
        }
        else if(Average>75 && Average<80){
            System.out.println("Grade is :B");
        }
        else if(Average>50 && Average<75){
            System.out.println("Grade is :C");
        }
        else if(Average>35 && Average<50){
            System.out.println("Grade is :D");
        }
        else{
            System.out.println("Grade is :Fail");
        }
        sc.close();
    }
}
