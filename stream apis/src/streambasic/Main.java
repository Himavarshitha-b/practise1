package streambasic;

import java.util.ArrayList;
import java.util.List;
public class Main
{

private static Object getName;

public static void main(String[] args) {
	List<Student> list = new ArrayList<>();
	  list.add(new Student (11,"manoj",70.7,"EEE"));
	  list.add(new Student (12,"sunny",75.7,"CSC"));
	  list.add(new Student (13,"rocky",99.7,"EEE"));
	  list.add(new Student (14,"Aravindh",99.7,"electrical engg"));
	  list.add(new Student (15,"spdy",70.7,"ECE"));
	  list.add(new Student (16,"bala",75.7,"MEC"));
	  list.add(new Student (17,"abc",99.7,"IT"));
	  list.add(new Student (18,"Arocky",99.7,"electrical engg"));
	  
	  
	  System.out.println("Highest percent in the given list :");
	  Student higest =StudentImplementation.highestPercentage(list);
	  System.out.println(higest);
	  System.out.println("--------------------------");
	  
	  
	  
	  System.out.println("80% above percent in the given list :");
	  List<Student> higest80 =StudentImplementation.percentage80(list);
	  System.out.println(higest80);
	  System.out.println("--------------------------");
	  
	  
	  
	  System.out.println("students who got more than 90% are : ");
	  long higest90 =StudentImplementation.percentage90(list);
	  System.out.println(higest90);
	  System.out.println("--------------------------");
	  
	  

		  System.out.println("students are in electrical brach");
		  long eleStudents =StudentImplementation.electriclStudents(list);
		  System.out.println(eleStudents);
		  System.out.println("--------------------------");
		  
		  
		  System.out.println("names starts with --A :");
		  List<Student> startsA =StudentImplementation.startsWithALetter(list);
		  System.out.println(startsA);
		  System.out.println("--------------------------");
		  
		  
		  
		  System.out.println("selected branch  :");
		  long selBranch =StudentImplementation.selectBranch(list);
		  System.out.println("studends in selected branch are "+selBranch);
		  System.out.println("--------------------------");
		  
		  }

}