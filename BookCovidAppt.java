// -------------------------------------------------------
// Assignment #2
// Written by: Cleopatr-Aliak Manoukian 40211001
// For COMP 248 Section ECDX-LAB � Fall 2021
// --------------------------------------------------------
import java.util.Scanner;

public class BookCovidAppt
{
	/*----------------------------------------------------------------------------------------------------------------------
	 * This program allows the user to book a Covid 19 vaccine appointment. First, it displays a welcoming message and asks
	 * the user to choose which vaccine they would like or exit the program. Once the user has chosen which vaccine they 
	 * want to take, the locations at which the vaccine is available will be displayed. Once the user has chosen a location,
	 * all availabale time slots for the vaccine at that location will be displayed. Once the user has chosen a valid time 
	 * slot, they will be asked if they are taking the first or second dose of vaccine. Once all the information has been
	 * gathered, a confirmation message confirming the time, place, dose and vaccine will be displayed. A closing message
	 * will then be displayed and the program will end. If at any point the user enters an invalid number, the user will be
	 * asked to enter a valid number. When a vaccine is unavailable or an appointment is not booked because of a program exit,
	 *  the user will be asked to choose to start over or exit the program. If the user chooses to exit the program at 
	 *  any point, the closing message will be  displayed and the program will end.
	 */

	public static void main(String[] args)
	{
		//Declaring variables. The names indicate what they are.
		int vaxChoice, locationChoice,vaxTime, numShot;
		String vaxLoc=null,vaxName=null,vaccTime=null,endChoice;
		//Variables used to control while loops
		int setter1, setter2;
		//if end is true, program will stop at the end of the while loop.
		boolean booked,end;
		
		//Declaring Scanner.
	
		Scanner Key= new Scanner(System.in) ;
	
		//Welcome message.
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("     Welcome to Covid 19 Vaccine Appointment program!");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Here is the Covid 19 vaccine menu:");
		//Vaccine menu presentation
		System.out.println("1.Pfizer\n2.Moderna\n3.AstraZeneca\n4.Johnson & Johnson\n5.Sinovac\n6.Gamaleya\n7.Exit");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		//Assigning value false to boolean booked
		booked=false;
		
		//While loop used to restart the program when user indicates they would like to restart. This loop will go on until the value of booked is true.
		while(!booked)
		{
		
			//Setting initial values. This will make sure all loops will be executed once. It is positioned after the first while loop so that these values will be reset every times the while loop restarts.
			end=false;
			setter1=0;
			setter2=0;
			//Verifying validity of user's input
			while(true)
			{	
				System.out.print("\nPlease enter your choice (1-7):");
				//assigning vaxChoice to user input and type int
				vaxChoice= Key.nextInt();
				if (vaxChoice<=7 & vaxChoice>0)
					break;
				else
					System.out.print("Your input is invalid.");
					
			}
			//Using switch to determine whhat will be executed depending on user's choice of vaccine.
			switch(vaxChoice)
			{
				case 1: 
					vaxName="Pfizer";
					System.out.println("Your choice is: "+vaxName);
					//Choices presented, while loop used to control invalid entry.
					while(true)
					{
						//Displaying all locations for this specific vaccine.
						System.out.println("Please choose the location of vaccine "+vaxName+".\n\t1-Pharmaprix\n\t2-Jean Coutu");
						System.out.print("Please enter your choice:");
						locationChoice= Key.nextInt();
						if (locationChoice==1)
						{
							vaxLoc="Pharmaprix";
							break;
						}//end of if statement
						else if (locationChoice==2) 
						{
							vaxLoc=("Jean Coutu");
							break;
						}//end of else if statement
						else
							System.out.println("Invalid input.");
					}//end of while loop
					//while loop to control user input regarding vaccine time
					while (setter1==0) 
					{//beginning of while statement
						System.out.println("Please choose a time slot:");
						System.out.println("\t1- 2:00 - 2:15\n\t2- 2:20 - 2:35\n\t3- 2:40 - 2:55\n\t4- 3:00 - 3:15\n\t5- Exit");
						vaxTime=Key.nextInt();
						//setter1 assigned value 1 to make sure the loop wont go on.
						setter1=1;
						//booked true because if user gets to this point, the appointment has a 80 percent chance of being booked.
						booked= true;
						
						//
						switch (vaxTime) 
						{//beggining of switch statement
						case 1: 
							vaccTime="2:00-2:15";
							break;
						case 2: 
							vaccTime="2:20-2:35";
							break;
						case 3:
							vaccTime="2:40-2:55";
							break;
						case 4:
							vaccTime="3:00-3:15";
							break;
						case 5:
							//Only case where booked is false
							booked=false;
							break;
						default:
							//When there is an invalid input, this message will be shown and setter1 will be assigned value 0.The loop will continue.
							System.out.println("Invalid Input");
							setter1=0;	
						}//end of switch statement
						
					}//end of while loop
					//Break used to ignore the rest of the switch statement.
				    break;
				//This case has the same structure as case1. Some minor output changes have been made.
				case 2 :
					vaxName="Moderna";
					System.out.println("Your choice is: "+vaxName);
					while(true)
					{
						System.out.println("Please choose the location of vaccine "+vaxName+".\n\t1-Pharmaprix\n\t3-Uniprix Clinique\n\t5-Health Center");
						System.out.print("Please enter your choice:");
						locationChoice= Key.nextInt();
						if (locationChoice==1)
						{
							vaxLoc="Pharmaprix";
							break;
						}
						else if (locationChoice==3) 
						{
							vaxLoc=("Uniprix Clinique");
							break;
						}
						else if (locationChoice==5) 
						{
							vaxLoc=("Health Center");
							break;
						}
						else
							System.out.println("Invalid input.");
					}
					while (setter1==0) 
					{
						System.out.println("Please choose a time slot:");
						System.out.println("\t1- 2:00 - 2:15\n\t2- 2:20 - 2:35\n\t3- 2:40 - 2:55\n\t4- 3:00 - 3:15\n\t5- Exit");
						vaxTime=Key.nextInt();
						setter1=1;
						booked= true;
								
						switch (vaxTime) 
						{
						case 1: 
							vaccTime="2:00-2:15";
							break;
						case 2: 
							vaccTime="2:20-2:35";
							break;
						case 3:
							vaccTime="2:40-2:55";
							break;
						case 4:
							vaccTime="3:00-3:15";
							break;
						case 5:
							booked=false;
							break;
						default:
							System.out.println("Invalid Input");
							setter1=0;
						}
					}
					break;
				//Case 3 has the same structure as case1 and case2. Some minor output changes have been made.
				case 3:
					vaxName="AstraZeneca";
					System.out.println("Your choice is: "+vaxName);
					while(true)
					{
						System.out.println("Please choose the location of vaccine "+vaxName+".\n\t2-Jean Coutu\n\t3-Uniprix Clinique");
						System.out.print("Please enter your choice:");
						locationChoice= Key.nextInt();
						if (locationChoice==2)
						{
							vaxLoc="Jean Coutu";
							break;
						}
						else if (locationChoice==3) 
						{
							vaxLoc=("Uniprix Clinique");
							break;
						}
						else
							System.out.println("Invalid input.");
					}
					while (setter1==0) 
					{
						System.out.println("Please choose a time slot:");
						System.out.println("\t1- 2:00 - 2:15\n\t2- 2:20 - 2:35\n\t3- 2:40 - 2:55\n\t4- 3:00 - 3:15\n\t5- Exit");
						vaxTime=Key.nextInt();
						setter1=1;
						booked= true;
								
						switch (vaxTime) 
						{
						case 1: 
							vaccTime="2:00-2:15";
							break;
						case 2: 
							vaccTime="2:20-2:35";
							break;
						case 3:
							vaccTime="2:40-2:55";
							break;
						case 4:
							vaccTime="3:00-3:15";
							break;
						case 5:
							booked=false;
							break;
						default:
							System.out.println("Invalid Input");
							setter1=0;
						}
					}
					break;
				//This case has the same structure as the previous cases of this switch statement.
				case 4:
					vaxName="Johnson & Johnson";
					System.out.println("Your choice is: "+vaxName);
					while(true)
					{
						System.out.println("Please choose the location of vaccine "+vaxName+"\n\t5.Health Center");
						System.out.print("Please enter your choice:");
						locationChoice= Key.nextInt();
						if (locationChoice==5) 
						{
							vaxLoc=("Health Center");
							break;
						}
						else
							System.out.println("Invalid input.");
					}
					while (setter1==0) 
					{
						System.out.println("Please choose a time slot:");
						System.out.println("\t1- 2:00 - 2:15\n\t2- 2:20 - 2:35\n\t3- 2:40 - 2:55\n\t4- 3:00 - 3:15\n\t5- Exit");
						vaxTime=Key.nextInt();
						setter1=1;
						booked= true;
								
						switch (vaxTime) 
						{
						case 1: 
							vaccTime="2:00-2:15";
							break;
						case 2: 
							vaccTime="2:20-2:35";
							break;
						case 3:
							vaccTime="2:40-2:55";
							break;
						case 4:
							vaccTime="3:00-3:15";
							break;
						case 5:
							end=true;
							booked=false;
							break;
						default:
							System.out.println("Invalid Input");
							setter1=0;
						}
					}
					break;
				//If user chooses 5,output will state that the vaccine is not available and boolean booked will be false.
				case 5:
					System.out.println("Sorry, Sinovac is currently unavailable.");
					booked=false;
					break;
				//If user chooses 6, output will state that the vaccine is unavailable and boolean booked will be false.
				case 6:
					System.out.println("Sorry,Gamaleya is currently unavailable.");
					booked=false;
					break;
				//If user chooses to exit, boolean end will be true.
				case 7:
					end=true;
			}//End of switch statement for vaccine types.
			
		//In the case where boolean booked is false, this code will be executed.
			if (!booked)
			{
				//Checking if user wants to retry booking an appointment since if boolean booked is false, it means that an appointment has not been booked.
				while(setter2==0) 
				{ 
					//Controlling user input
					System.out.print("\nYour appointment has NOT been booked.Do you want to start over?(yes or no)");
					endChoice=Key.next();
					setter2=1;
					//Checking if answer is no
					if (endChoice.compareToIgnoreCase("NO")==0)
						end=true;
					//Checking if answer is yes, in which case boolean end will be false.
					else if (endChoice.compareToIgnoreCase("YES")==0)
						end= false;
					else
					{
						System.out.println("\nYour input is invaid. Please try again.");
						setter2=0;
					}
				}
					
			}
			//If boolean booked is true, so if an appointment has been booked, this segment of the code will be executed.
			if(booked)
			{ 
				//Controlling user input
				while(true)
				{
					//Checking wich shot the user will take
					System.out.print("\nPlease enter 1st or 2nd shot (1 or 2)");
					numShot=Key.nextInt();
					if ((numShot==1)||(numShot==2))
						break;
					else
						System.out.println("Invalid Input.");
				
				}
				//If it is the first shot, the output will be the following.
				if (numShot==1)
				{
					//System output
					System.out.println("Your booked appointment is: "+vaxName+" 1st dose.\nYour schedule is: "+vaccTime+" @ "+vaxLoc);
					end=true;
				}
				//If it is the second shot, the output will be the following.
				else if(numShot==2)
				{
					//System output.
					System.out.println("Your booked appointment is: "+vaxName+" 2nd dose.\nYour schedule is: "+vaccTime+" @ "+vaxLoc);
					end=true;
				}
			}
			//If user chooses to end the program, the big while loop will stop executing.
			if(end)
				break;
			
		}//Closing big while loop
		//Closing message
		System.out.println("\nThank you for using Covid 19 vaccine appointment program!");
		//Closing Scanner Key
		Key.close();
		
	}

}
