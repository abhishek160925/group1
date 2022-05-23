package TEST;

class StudentGrade {
public static void determineGrade(String reg, Float[] marks){
if(marks.length == 0) {
System.out.println("Grades for " + reg);
System.out.println("You have not registered for any course");
return;}else {
	System.out.println("Grades for " + reg);
	for (Float m : marks) {
	if (m >= 90 & m <= 100)
	System.out.println("Grade 'S' for " + m);
	else if (m >= 80 & m <= 89)
	System.out.println("Grade 'A' for " + m);
	else if (m >= 70 & m <= 79)
	System.out.println("Grade 'B' for " + m);
	else if (m >= 60 & m <= 69)
	System.out.println("Grade 'C' for " + m);
	else if (m >= 55 & m <= 59)
	System.out.println("Grade 'D' for " + m);
	else if (m >= 50 & m <= 54)
	System.out.println("Grade 'E' for " + m);
	else if (m <= 50)
	System.out.println("Grade 'D' for " + m);}return;
	}
}
}


public class Student {public static void main(String[] args) {
	Float[] marks1 = {96.0f,94.0f,87.0f,85f};
	StudentGrade.determineGrade("17BCE0048", marks1);
	System.out.println("\n");
	Float[] marks2 = {};
	StudentGrade.determineGrade("17BIT0098", marks2);
	System.out.println("\n");
	Float[] marks3 = {57f,36f,66f};
	StudentGrade.determineGrade("17BCE0662", marks3);
	System.out.println("\n");
	Float[] marks4 = {98f,82.5f,79f,63f};
	StudentGrade.determineGrade("17BCE0049", marks4);
	}

}