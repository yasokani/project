package main_project;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ticket
{
	public static void main(String[] args) 
	{
		System.out.println("-----------------------Welcome to XYZ theatre-------------------------------------");

		System.out.println("Are you 1)Admin or 2)Customer (1/2)?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1)
		{
			System.out.println("Do you want to update your password (Y/N)?");
			String p = sc.next();
			
			if(p.equalsIgnoreCase("Y"))
			{
				System.out.println("Enter new Password which have atleast 1 Capital and small letter, 1 digit and 1 special character");
				String password = sc.next();
				
				
				Pattern sp = Pattern.compile("^([A-Z]*[.@_-]*[0-9]*[a-z]*)$");
				Matcher sm = sp.matcher(password);
				if(sm.matches()&&(password.length()>=10)){
					 System.out.println("Hurreh!Your password is updated");
				}
				else
					System.out.println("New password is of length 10 must be present if not it's invalid");
			}
			else
			{
				System.exit(0);
			}

		}
		else if(n == 2)
		{
			boolean flag = true;
			List<List<String>> mainList = new ArrayList<List<String>>();
		
			while(flag){
				List<String> list = new ArrayList<String>();
				String mveName = "", time = ""; int fare = 0, totFare = 0;
				String date="";
				System.out.println("Movie1-> The Prestige \nMovie 2-> The Exorcist \nMovie3-> Avatar \nMovie4-> Titanic\n");
				System.out.println("Select movie for booking tickets \nMovie1 - Rs.250 \nMovie2 - Rs.180 \nMovie3 - Rs.280 \nMovie4 - Rs.350");
				System.out.println("\n");
				int movie = sc.nextInt();
				if(movie == 1)
				{
					mveName = "The Prestige";
					fare = 250;
				}
				else if(movie == 2)
				{
					mveName = "The Exorcist";
					fare = 180;
				}
				else if(movie == 3)
				{
					mveName = "Avatar";
					fare = 280;
				}
				else if(movie == 4)
				{
					mveName = "Titanic";
					fare = 350;
				}
				else
				{
					System.out.println("Warning! Select correct option");

					break;
				}
				list.add(mveName);
				list.add(String.valueOf(fare));
				System.out.println("Available Show dates for these movies \n1.06.08.2022 \n2.07.08.2022 \n3.08.08.2022");
				int v = sc.nextInt();
				if(v == 1)
				{
					date = "06.08.2022";
				} 
				else if(v == 2)
				{
					date= "07.08.2022";
				} 
				else if(v == 3)
				{
					date = "08.08.2022";
				}
				else
				{
					System.out.println("Select valid show dates");
					break;
				}
				list.add(date);
				
				System.out.println("Select Show time \n1.9Am - 12Pm \n2.1pm - 4pm \n3.6pm - 9pm");
				int show = sc.nextInt();
				if(show == 1)
				{
					time = "9Am - 12Pm";
				} 
				else if(show == 2)
				{
					time = "1pm - 4pm";
				} 
				else if(show == 3)
				{
					time = "6pm - 9pm";
				}
				else
				{
					System.out.println("Warning! Select correct option");

					break;
				}
				list.add(time);
				System.out.println("Select row from A-F");
				String row=sc.next();
				
				if(row.equalsIgnoreCase("A")||row.equalsIgnoreCase("B")||row.equalsIgnoreCase("C")||row.equalsIgnoreCase("D")||row.equalsIgnoreCase("E")||row.equalsIgnoreCase("F"))
				{
			
				}
				else
				{
					System.out.println("Warning!Enter correct row which starts from A-F!");
					break;
				}
	
				String seatno ="";
		
				
				System.out.println("How many seats do you want to grab?");
				int q=sc.nextInt();
	
				System.out.println("Select seat number in"+row+"row which starts from "+row+ "1" +" to "+row+"10");
				int[] seat =new int[q];
				for(int i=0;i<q;i++)
				{
					seat[i] = sc.nextInt();
				}
				list.add(seatno);
				mainList.add(list);
				System.out.println("Do you wish to continue (Y/N)");
				if(sc.next().equalsIgnoreCase("Y"))
				{
					flag = false;
					if(mainList.size() > 0)
					{
						for(List<String> entry: mainList)
						{
							List<String> li = entry;
							System.out.println("Movie : "+li.get(0));
							System.out.println("Fare : "+li.get(1));
							System.out.println("Date : "+li.get(2));
							System.out.println("Timing : "+li.get(3));
							
							System.out.println("Seat number allocated:");
							for (int i=0;i<q;i++)
							{
								System.out.println(row+"-"+String.valueOf(seat[i]));
							}
							totFare =totFare+q* Integer.parseInt(li.get(1));
						}
						System.out.println("Total Fare : "+totFare);
						System.out.println("Do you wish to pay to book tickets?(Y/N)");
						if(sc.next().equalsIgnoreCase("Y"))
							System.out.println("Ticket Booked Successfully! Have a nice day :)");
						else
							System.out.println("Ticket is not booked :(");	
					}
					else
					{
						
						System.out.println("No problem, Nice to see you again!");
					}
					System.exit(0);
				}
				
				
				else
				{
					flag=true;
		
				}
			}
		}
		else
		{
			System.out.println("Warning! Select correct option");
		}
	}
}
