import java.util.Date;

import javax.swing.JOptionPane;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;


public class LocalClockTest {


	public static void main(String[] args) 
	{
		String choose	=JOptionPane.showInputDialog(null,"1-Computer's time \n2-When a user enters hours");
		if (choose.equalsIgnoreCase("1"))
		{

			Date nowtime=new Date();
			String nowtimeSTRING=nowtime.toString();
			int hours=Integer.parseInt(nowtimeSTRING.substring(11,13));
			int minutes=Integer.parseInt(nowtimeSTRING.substring(14,16));
			int seconds=Integer.parseInt(nowtimeSTRING.substring(17,19));
			Clock Turkeyslocaltime=new Clock(hours,minutes,seconds);
			Turkeyslocaltime.displayTime();
			int messageType=1;
			int choose2=Integer.parseInt(JOptionPane.showInputDialog(null,"1-USA's Time\n2-Germany's Time\n3-Spain's Time\n4-Australia's Time\n5-Iraq's Time\n6-Argentina's Time\n7-Brazil's Time\n8-France's Time\n9-Iran's Time\n10-Mexico's Time"));
			chooseMethod(Turkeyslocaltime,choose2);
			
		}
		else if(choose.equalsIgnoreCase("2"))
		{
			int hours=Integer.parseInt(JOptionPane.showInputDialog("Please enter hour"));
			int minutes=Integer.parseInt(JOptionPane.showInputDialog("Please enter minute"));
			int seconds=Integer.parseInt(JOptionPane.showInputDialog("Please enter second"));
			Clock Turkeyslocaltime=new Clock(hours,minutes,seconds);
			
			
			int choose2=Integer.parseInt(JOptionPane.showInputDialog(null,"1-USA's Time\n2-Germany's Time\n3-Spain's Time\n4-Australia's Time\n5-Iraq's Time\n6-Argentina's Time\n7-Brazil's Time\n8-France's Time\n9-Iran's Time\n10-Mexico's Time"));
			chooseMethod(Turkeyslocaltime,choose2);
			
		}
		else
		{
			JOptionPane.showInputDialog(null,"Yours choose is wrong");
			
		}

		}
	private static void chooseMethod(Clock Turkeyslocaltime,int choose2)
	{
		switch (choose2) 
		{
		case 1:
			
			Turkeyslocaltime.incrementHours(-11);	
			
			Turkeyslocaltime.setName("USA's Time");
			JOptionPane.showConfirmDialog(null,Turkeyslocaltime.displayTime());
		
			break;
		case 2:
			Turkeyslocaltime.incrementHours(-1);
			Turkeyslocaltime.setName("Germany's Time");
			JOptionPane.showConfirmDialog(null,Turkeyslocaltime.displayTime());
			
			break;

		case 3:
			Turkeyslocaltime.incrementHours(-1);
			Turkeyslocaltime.setName("Spain's Time");
			JOptionPane.showConfirmDialog(null,Turkeyslocaltime.displayTime());
			
			break;

		case 4:
			Turkeyslocaltime.incrementHours(+9);	
			Turkeyslocaltime.setName("Australia's Time");
			JOptionPane.showConfirmDialog(null,Turkeyslocaltime.displayTime());
			
			break;

		case 5:
			Turkeyslocaltime.incrementHours(+1);	
			Turkeyslocaltime.setName("Iraq's Time");
			JOptionPane.showConfirmDialog(null,Turkeyslocaltime.displayTime());
		
			break;

		case 6:
			Turkeyslocaltime.incrementHours(-5);	
			Turkeyslocaltime.setName("Argentina's Time");
			JOptionPane.showConfirmDialog(null,Turkeyslocaltime.displayTime());
			
			break;

		case 7:
			Turkeyslocaltime.incrementHours(-6);	
			Turkeyslocaltime.setName("Brazil's Time");
			JOptionPane.showConfirmDialog(null,Turkeyslocaltime.displayTime());
			
			break;

		case 8:
			Turkeyslocaltime.incrementHours(-1);	
			Turkeyslocaltime.setName("France's Time");
			JOptionPane.showConfirmDialog(null,Turkeyslocaltime.displayTime());
		
			break;
		case 9:
			Turkeyslocaltime.incrementMinutes(90);	
			Turkeyslocaltime.setName("Iran's Time");
			JOptionPane.showConfirmDialog(null,Turkeyslocaltime.displayTime());
	
			break;
		case 10:
			Turkeyslocaltime.incrementHours(-8);
			Turkeyslocaltime.setName("Mexico's Time");
			JOptionPane.showConfirmDialog(null,Turkeyslocaltime.displayTime());
			
			break;

		default:
			JOptionPane.showInputDialog(null,"Yours choose is wrong");
			break;
			
		}
	}


	}


