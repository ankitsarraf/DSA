package interview_question;

import java.util.Scanner;

public class MyMain {
	public static void main(String...z) 
	{
		String exit="";
		Scanner sc=new Scanner(System.in);
		MyController controller=MyController.getControl();
		do {
		System.out.println("1)Do you want to assign?\n2)Do you want to see the status\n3)exit");
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice)
			{
			case 1:assignLane(sc,controller);
				break;
			case 2:showAllAssigning(controller);
				break;
			case 3: return;
			
			default:
				System.out.println("wrong choice");
			}
		System.out.println("1)Do you want to continue(yes/no)");
		exit=sc.nextLine();
		}while("yes".equalsIgnoreCase(exit));
	}
	private static void showAllAssigning(MyController controller) {
		System.out.println(controller.getAssignedList());
		
	}
	public static void assignLane(Scanner sc,MyController control)
	{
		System.out.println("please tell us the lane number");
		int choice=Integer.parseInt(sc.nextLine());
		if(choice<=8) {
		if(control.checkLane(choice))
		{
			System.out.println("please tell us the runner name");
			String runnerName=sc.nextLine();
			control.assignLane(choice,runnerName);
		}
		else
		{
			System.out.println("lane is already assigned");
		}
		}else
		{
			System.out.println("sorry we have only 8 lane");
		}	
	}
}
