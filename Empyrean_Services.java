
import java.util.Random;
import java.util.Scanner;

class Node {
	Node head;
	Node nxt;
	Node prv;
	
	String orderid;
	String name;
	int option;
	String data;
	
	Node(String id,String nme,String x){
		data=x;
		nxt=null;
		prv=null;
		name=nme;
		orderid=id;
	}
}

class LinkedList {
	Node head=null;
	
	void insertLast(String a,String b,String d){
        if(head==null){
            head=new Node(a,b,d);
        }
        
        else{
            Node temp=head;
            while(temp.nxt!=null)
{
                temp=temp.nxt;
            }
            Node t1=new Node(a,b,d);
            temp.nxt=t1;
            t1.prv=temp;
        }
    }
	
	void call1Node(String oo,String nn,int ch,String a2,long a3) {
		if (ch==0) {
			insertLast(oo,nn,"Welcome to Empyrean Services where all your needs are met. \nChoose among one of the following services offered to you at your doorstep.\n1. Car \n2. House and \n3. Electronics services");
			display();
			System.out.println("************");
			
		}
		else if (ch ==1 ) {
			insertLast(oo,nn,"Since you have chosen Car services, choose one of the following options which will enable us to help you more. \n1. Battery Recharge \n2. Monthly Car Service \n3. Car Wash\n4. Engine Failure");
			display();
		}
		else if (ch ==2 ) {
			insertLast(oo,nn,"Since you have chosen Home Services, choose one of the following options which will enable us to help you more. \n1. Professional House Cleaners \n2. Dry Cleaning the couch \n3. Fixing Home Appliances");
			display();
		}
		else if (ch==3) {
			insertLast(oo,nn,"Since you have chosen Electronic Services, one of our men will try to call you soon on the number "+a3+" to get a better understanding of your issue.");
			display();
			System.out.println("************");
		}
	}
	void call2Node(String oo,String nn,int ch) {
		if (ch==1) {
			insertLast(oo, nn, "Our Service men will be collecting the payment from you. Please leave them a good tip to encourage them.");
			display();
			System.out.println(" ");
			System.out.println("-------------------------------------------");
		}
		else {
			insertLast(oo, nn,  "Kindly click on the link to open the Netbanking portal.");
			display();
			System.out.println(" ");
			System.out.println("-------------------------------------------");
		}
	}
	void call3Node(String oo,String nn,int cc,int ch,String a2,long a3) {
		if (cc==1) {
			if (ch==1) {
				insertLast(oo,nn,"Thank you for choosing Empyrean Services. One of our men will try to reach you soon to help you with your Car's Battery Recharge at your doorstep at "+a2);
				display();
			}
			else if (ch==2) {
				insertLast(oo,nn,"Thank you for choosing Empyrean Services. One of our men will try to reach you soon to help you with your Car's Monthly Service at your doorstep at "+a2);
				display();
				System.out.println("************");
			}
			else if (ch==3){
				insertLast(oo,nn,"Thank you for choosing Empyrean Services. One of our men will try to reach you soon to help you with your Car's Wash at your doorstep at "+a2);
				display();
				System.out.println("************");
			}
			else if (ch==4) {
				insertLast(oo,nn,"Thank you for choosing Empyrean Services. One of our men will try to reach you soon");
				display();
				System.out.println("************");
			}
		}
		else if (cc==2) {
			if (ch==1) {
				insertLast(oo,nn,"Thank you for choosing Empyrean Services. Our Professional Cleaners will soon be at your doorstep  at your doorstep at "+a2);
				display();
				System.out.println("************");
				
			}
			
			else if (ch==2){
				insertLast(oo,nn,"Thank you for choosing Empyrean Services. Dry Cleaners to dry clean your couch will soon be there at your doorstep at "+a2);
				display();
				System.out.println("************");
			}
			
			else {
				insertLast(oo,nn,"Thank you for choosing Empyrean Services. One of our men will soon be there at your doorstep at "+a2);
				display();
				System.out.println("************");
			}
		}
		else if (cc==3) {
			System.out.println("************");
		}
	}
	void displayinvoice(String oo,String nn, String a2, long a3, int s,int ss){
		int cost=0;
		System.out.println("\t\t"+oo);
		System.out.println("-------------------------------------------");
		System.out.print("Name: "+nn);
		System.out.println("\t  Mobile Number: "+a3);
		System.out.println("Address: "+a2);
		System.out.println("-------------------------------------------");
		System.out.print("Sl No. ");
		System.out.print("\tService              	      ");
		System.out.println("Cost");
		System.out.println("-------------------------------------------");
		
        if (s==1) {
        	if (ss==1) {
        		System.out.print("1.");
        		System.out.print("\tCar's Battery Recharge ");
        		cost=25000;
        		System.out.print("\t     "+cost);
        		
        	}
        	else if (ss==2) {
        		System.out.print("1.");
        		System.out.print("\tCar's Monthly Service");
        		cost=10000;
        		System.out.print("\t      "+cost);
        	}
        	else if (ss==3) {
        		System.out.print("1.");
        		System.out.print("\tCar's Wash           ");
        		cost=5000;
        		System.out.print("\t      "+cost);
        	}
        	else if (ss==4) {
        		System.out.print("1.");
        		System.out.print("\tCar's Engine Failure ");
        		cost=150000;
        		System.out.print("\t      "+cost);
        	}
        	else {
        		System.out.print("Invalid");
        	}
        }
        else if (s==2) {
        	if (ss==1) {
        		System.out.print("1.");
        		System.out.print("\t Professional House Cleaning ");
        		cost=50000;
        		System.out.print(" "+cost);
        	}
        	else if (ss==2) {
        		System.out.print("1.");
        		System.out.print("\tDry Cleaning of the couch");
        		cost=30000;
        		System.out.print("     "+cost);
        	}
        	else if (ss==3) {
        		System.out.print("1.");
        		System.out.print("\tFixing of Home Appliances");
        		cost=0;
        		System.out.print("    COD(after completion)");
        	}
        	else {
        		System.out.print("Invalid");
        	}
        }
        else if (s==3){
        	System.out.print("1.");
    		System.out.print("\tElectronic Services");
    		cost=0;
    		System.out.print("\t     COD(after completion)");
        }
        System.out.println("   "); 
        
        System.out.print("\t         ");
        System.out.print("Total Cost           "+cost);
    }
	void display(){
        Node temp=head;
        while(temp.nxt!=null){
            temp=temp.nxt;
        }
        System.out.println("Dear "+temp.name+" with OrderID "+temp.orderid);
        System.out.println(temp.data);
    }
	
	void displayendNode(){
		
        Node temp=head;
        while(temp.nxt!=null){
            temp=temp.nxt;
        }
        System.out.println("Dear "+temp.name+" with OrderID "+temp.orderid);
        System.out.println(temp.data);
        
    }
}
class queues {
	String Q[];
	int front, rear;
	int Max = 13;

	queues() {
		front = 0;
		Q = new String[Max];
		rear = -1;
	}

	queues(int ss) {
		front = 0;
		Q = new String[ss];
		rear = -1;
		Max = ss;
	}

	void enqueue(String orderid) {
		if (rear == 12)
			System.out.println("All the appointments are currently booked, kindly try again in a few hours.");
		else {
			rear++;
			Q[rear] = orderid;
		}
	}

	void dequeue() {
		if (rear == -1) {
			System.out.println("No appointment is pending.");
		} else {
			String t = Q[front];
			++front;
			System.out.println("The order id " + t + " has been processed.");
		}
	}

	void display() {
		System.out.println("All the order ids that are left to process ");
		for (int i = front; i <= rear; i++)
			System.out.println(Q[i]);
	}

	void peek() {
		if (rear == -1) {
			System.out.println("All appointments are done.");
		} else {
			System.out.println("The next appointment is " + Q[front]);
		}
	}
}

public class Empyrean_Services {

	public static String getRandomNumberString() {
		// It will generate 6 digit random Number.
		// from 0 to 999999
		Random rnd = new Random();
		int number = rnd.nextInt(999999);

		// this will convert any number sequence into 6 character.
		return String.format("%06d", number);
	}

	static String fname;
	static String lname;
	static String mail;
	static String pwd;
	String cpwd;
	static String cmail;
	static String lopwd;

	Scanner a = new Scanner(System.in);
	Scanner b = new Scanner(System.in);

	void Signup() {

		System.out.print("First Name : ");
		fname = a.nextLine();

		System.out.print("Last Name : ");
		lname = a.nextLine();

		System.out.println("E-mail Address : ");
		mail = b.nextLine();

		System.out.println("Password : ");
		pwd = b.nextLine();

		System.out.println("Confirm password : ");
		cpwd = a.nextLine();
		try {
			if (pwd.equals(cpwd)) {
				System.out.println("CONGRATULATIONS!! You are now a member of Empyrean Services");
			} else {
				throw new IllegalArgumentException("Passwords are not matching");
			}
		} catch (IllegalArgumentException er) {
			System.out.println("caught" + er);

			while (!pwd.equals(cpwd)) {
				System.out.println("Confirm password : ");
				cpwd = a.nextLine();
			}
			System.out.println("CONGRATULATIONS!! You are now a member of Empyrean Services");
		}
	}

	static String getAlphaNumericString(int n) {
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		LinkedList L1 = new LinkedList();
		Empyrean_Services es = new Empyrean_Services();
		Scanner c = new Scanner(System.in);

		System.out.println("*****SIGNUP*****");
		es.Signup();

		System.out.println("*****LOGIN*****");
		System.out.println("E-mail : ");
		cmail = c.nextLine();
		try {
			if (mail.equals(cmail)) {
				System.out.println("Password : ");
				lopwd = c.nextLine();
				try {
					if (pwd.equals(lopwd)) {
						System.out.println("SUCCESSFULLY LOGGED IN!!!");
						String nnn = fname+lname;
						System.out.println("Name : "+nnn);
						

						Scanner scane = new Scanner(System.in);
						System.out.println("Enter your address ");
						String a2 = scane.nextLine();

						
						System.out.println("Your phone number");

						long a3 = scane.nextInt();
						System.out.println(a3);
						int size = 0;
						String str = Long.toString(a3);
						size = str.length();
						boolean plm = true;

						while (plm = true) {
							if (size != 10) {
								Scanner scannef = new Scanner(System.in);
								System.out.println("Invalid number. Please enter again.");
								a3 = scannef.nextInt();

								str = Long.toString(a3);
								size = str.length();
								System.out.println(size);
								scannef.close();
							} else {
								plm = false;
								break;
							}
						}

						System.out.println(" ");
						System.out.println("************************************");

						int n = 6;
						String oo = getAlphaNumericString(n);

						L1.insertLast(nnn, a2, str);

						L1.call1Node(oo, nnn, 0, a2, a3);// first node

						Scanner s2 = new Scanner(System.in);
						System.out.println("Enter your choice");
						int ch = s2.nextInt();

						L1.call1Node(oo, nnn, ch, a2, a3);

						if (ch == 3) {
							System.out.println("1. Minor Electric Service \n2. Major Electric Service");
							System.out.println("Enter your choice: ");
						}
						Scanner scan = new Scanner(System.in);
						int a1 = scan.nextInt();

						L1.call3Node(oo, nnn, ch, a1, a2, a3);

						// Payment
						Scanner ca = new Scanner(System.in);
						System.out.println("Would you like to pay for your service by (1)COD or through (2)Netbanking ");
						int cah = ca.nextInt();
						L1.call2Node(oo, nnn, cah);

						// Invoice
						L1.displayinvoice(oo, nnn, a2, a3, ch, a1);
						System.out.println(" ");
						System.out.println("*********************************");
						System.out.println(" ");

						// Working of the service dispatch
						queues q2 = new queues(13);
						Scanner sc = new Scanner(System.in);
						int choice = 1;

						while (choice != 5) {
							switch (choice) {
							case 1:
								q2.enqueue(oo);
								choice = 4;
								break;
							case 2:
								q2.dequeue();
								choice = 5;
								break;
							/*
							 * case 3: q2.display(); choice=; break;
							 */
							case 4:
								q2.peek();
								choice = 2;
							}
						}

						System.out.println(" ");
						System.out.println("*********************************");
						System.out.println(
								"Your order id has been processed. We will be with you shortly. Thank you for choosing to trust us here at Empyrean Services.");
						
					} else {
						throw new IllegalArgumentException("Incorrect Password");
					}
				} catch (IllegalArgumentException er) {
					System.out.println("caught" + er);

					while (!pwd.equals(lopwd)) {
						int i = c.nextInt();
						if (i == 0) {
							System.out.println("Password : ");
							lopwd = c.nextLine();
							System.out.println("Forgot Password -> press(1)");
						} else if (i == 1) {
							Scanner scanne = new Scanner(System.in);
							System.out.println("Your phone number");
							long a3 = scanne.nextLong();
							int size = 0;
							String str = Long.toString(a3);
							size = str.length();

							boolean plm;
							while (plm = true) {
								if (size != 10) {
									Scanner scannef = new Scanner(System.in);
									System.out.println("Invalid number. Please enter again.");
									a3 = scannef.nextInt();
									str = Long.toString(a3);
									size = str.length();
									System.out.println(size);
								} else {
									plm = false;
									break;
								}
								int OTP = Integer.parseInt(getRandomNumberString());

								System.out.println("We have sent an OTP to " + a3);
								System.out.println("***Message***\nYour OTP is " + a3);
								System.out.println("Enter OTP: ");
								int eOTP = c.nextInt();
								if (eOTP == OTP) {
									System.out.println("SUCCESSFULLY LOGGED IN!!!");
									String nnn = fname+lname;
									System.out.println("Name : "+nnn);
									

									Scanner scane = new Scanner(System.in);
									System.out.println("Enter your address ");
									String a2 = scane.nextLine();

									
									System.out.println("Your phone number");

									a3 = scanne.nextInt();
									System.out.println(a3);
									size = 0;
									str = Long.toString(a3);
									size = str.length();
									plm = true;

									while (plm = true) {
										if (size != 10) {
											Scanner scannef = new Scanner(System.in);
											System.out.println("Invalid number. Please enter again.");
											a3 = scannef.nextInt();

											str = Long.toString(a3);
											size = str.length();
											System.out.println(size);
											scannef.close();
										} else {
											plm = false;
											break;
										}
									}

									System.out.println(" ");
									System.out.println("************************************");

									int n = 6;
									String oo = getAlphaNumericString(n);

									L1.insertLast(nnn, a2, str);

									L1.call1Node(oo, nnn, 0, a2, a3);// first node

									Scanner s2 = new Scanner(System.in);
									System.out.println("Enter your choice");
									int ch = s2.nextInt();

									L1.call1Node(oo, nnn, ch, a2, a3);

									if (ch == 3) {
										System.out.println("1. Minor Electric Service \n2. Major Electric Service");
										System.out.println("Enter your choice: ");
									}
									Scanner scan = new Scanner(System.in);
									int a1 = scan.nextInt();

									L1.call3Node(oo, nnn, ch, a1, a2, a3);

									// Payment
									Scanner ca = new Scanner(System.in);
									System.out.println("Would you like to pay for your service by (1)COD or through (2)Netbanking ");
									int cah = ca.nextInt();
									L1.call2Node(oo, nnn, cah);

									// Invoice
									L1.displayinvoice(oo, nnn, a2, a3, ch, a1);
									System.out.println(" ");
									System.out.println("*********************************");
									System.out.println(" ");

									// Working of the service dispatch
									queues q2 = new queues(13);
									Scanner sc = new Scanner(System.in);
									int choice = 1;

									while (choice != 5) {
										switch (choice) {
										case 1:
											q2.enqueue(oo);
											choice = 4;
											break;
										case 2:
											q2.dequeue();
											choice = 5;
											break;
										/*
										 * case 3: q2.display(); choice=; break;
										 */
										case 4:
											q2.peek();
											choice = 2;
										}
									}

									System.out.println(" ");
									System.out.println("*********************************");
									System.out.println(
											"Your order id has been processed. We will be with you shortly. Thank you for choosing to trust us here at Empyrean Services.");
									
								}

							}
						}

					}
				}

			} else {
				throw new IllegalArgumentException("E-mail dosen't exist");
			}

		} catch (IllegalArgumentException e) {
			while(!mail.equals(cmail)) {
			System.out.println("caught" + e);
			System.out.println("Re-enter the E-mail");
			cmail = c.nextLine();
			}
			System.out.println("Password : ");
			lopwd = c.nextLine();
			try {
				if (pwd.equals(lopwd)) {
					System.out.println("SUCCESSFULLY LOGGED IN!!!");
					String nnn = fname+lname;
					System.out.println("Name : "+nnn);
					

					Scanner scane = new Scanner(System.in);
					System.out.println("Enter your address ");
					String a2 = scane.nextLine();

					
					System.out.println("Your phone number");

					long a3 = scane.nextInt();
					System.out.println(a3);
					int size = 0;
					String str = Long.toString(a3);
					size = str.length();
					boolean plm = true;

					while (plm = true) {
						if (size != 10) {
							Scanner scannef = new Scanner(System.in);
							System.out.println("Invalid number. Please enter again.");
							a3 = scannef.nextInt();

							str = Long.toString(a3);
							size = str.length();
							System.out.println(size);
							scannef.close();
						} else {
							plm = false;
							break;
						}
					}

					System.out.println(" ");
					System.out.println("************************************");

					int n = 6;
					String oo = getAlphaNumericString(n);

					L1.insertLast(nnn, a2, str);

					L1.call1Node(oo, nnn, 0, a2, a3);// first node

					Scanner s2 = new Scanner(System.in);
					System.out.println("Enter your choice");
					int ch = s2.nextInt();

					L1.call1Node(oo, nnn, ch, a2, a3);

					if (ch == 3) {
						System.out.println("1. Minor Electric Service \n2. Major Electric Service");
						System.out.println("Enter your choice: ");
					}
					Scanner scan = new Scanner(System.in);
					int a1 = scan.nextInt();

					L1.call3Node(oo, nnn, ch, a1, a2, a3);

					// Payment
					Scanner ca = new Scanner(System.in);
					System.out.println("Would you like to pay for your service by (1)COD or through (2)Netbanking ");
					int cah = ca.nextInt();
					L1.call2Node(oo, nnn, cah);

					// Invoice
					L1.displayinvoice(oo, nnn, a2, a3, ch, a1);
					System.out.println(" ");
					System.out.println("*********************************");
					System.out.println(" ");

					// Working of the service dispatch
					queues q2 = new queues(13);
					Scanner sc = new Scanner(System.in);
					int choice = 1;

					while (choice != 5) {
						switch (choice) {
						case 1:
							q2.enqueue(oo);
							choice = 4;
							break;
						case 2:
							q2.dequeue();
							choice = 5;
							break;
						/*
						 * case 3: q2.display(); choice=; break;
						 */
						case 4:
							q2.peek();
							choice = 2;
						}
					}

					System.out.println(" ");
					System.out.println("*********************************");
					System.out.println(
							"Your order id has been processed. We will be with you shortly. Thank you for choosing to trust us here at Empyrean Services.");
					
				} else {
					throw new IllegalArgumentException("Incorrect Password");
				}
			} catch (IllegalArgumentException er) {
				while (!pwd.equals(lopwd)) {
				System.out.println("caught" + er);

				
					int i = c.nextInt();
					if (i == 0) {
						System.out.println("Password : ");
						lopwd = c.nextLine();
						System.out.println("Forgot Password -> press(1)");
					} else if (i == 1) {
						Scanner scanne = new Scanner(System.in);
						System.out.println("Your phone number");
						long a3 = scanne.nextLong();
						int size = 0;
						String str = Long.toString(a3);
						size = str.length();

						boolean plm;
						while (plm = true) {
							if (size != 10) {
								Scanner scannef = new Scanner(System.in);
								System.out.println("Invalid number. Please enter again.");
								a3 = scannef.nextInt();
								str = Long.toString(a3);
								size = str.length();
								System.out.println(size);
							} else {
								plm = false;
								break;
							}
							int OTP = Integer.parseInt(getRandomNumberString());

							System.out.println("We have sent an OTP to " + a3);
							System.out.println("***Message***\nYour OTP is " + a3);
							System.out.println("Enter OTP: ");
							int eOTP = c.nextInt();
							if (eOTP == OTP) {
								System.out.println("SUCCESSFULLY LOGGED IN!!!");
								String nnn = fname+" "+lname;
								System.out.println("Name : "+nnn);
								

								Scanner scane = new Scanner(System.in);
								System.out.println("Enter your address ");
								String a2 = scane.nextLine();

								
								System.out.println("Your phone number");

								a3 = scanne.nextInt();
								System.out.println(a3);
								size = 0;
								str = Long.toString(a3);
								size = str.length();
								plm = true;

								while (plm = true) {
									if (size != 10) {
										Scanner scannef = new Scanner(System.in);
										System.out.println("Invalid number. Please enter again.");
										a3 = scannef.nextInt();

										str = Long.toString(a3);
										size = str.length();
										System.out.println(size);
										scannef.close();
									} else {
										plm = false;
										break;
									}
								}

								System.out.println(" ");
								System.out.println("************************************");

								int n = 6;
								String oo = getAlphaNumericString(n);

								L1.insertLast(nnn, a2, str);

								L1.call1Node(oo, nnn, 0, a2, a3);// first node

								Scanner s2 = new Scanner(System.in);
								System.out.println("Enter your choice");
								int ch = s2.nextInt();

								L1.call1Node(oo, nnn, ch, a2, a3);

								if (ch == 3) {
									System.out.println("1. Minor Electric Service \n2. Major Electric Service");
									System.out.println("Enter your choice: ");
								}
								Scanner scan = new Scanner(System.in);
								int a1 = scan.nextInt();

								L1.call3Node(oo, nnn, ch, a1, a2, a3);

								// Payment
								Scanner ca = new Scanner(System.in);
								System.out.println("Would you like to pay for your service by (1)COD or through (2)Netbanking ");
								int cah = ca.nextInt();
								L1.call2Node(oo, nnn, cah);

								// Invoice
								L1.displayinvoice(oo,nnn,a2,a3,ch,a1);
								System.out.println(" ");
								System.out.println("-------------------------------------------");
								System.out.println(" ");

								// Working of the service dispatch
								queues q2 = new queues(13);
								Scanner sc = new Scanner(System.in);
								int choice = 1;

								while (choice != 5) {
									switch (choice) {
									case 1:
										q2.enqueue(oo);
										choice = 4;
										break;
									case 2:
										q2.dequeue();
										choice = 5;
										break;
									/*
									 * case 3: q2.display(); choice=; break;
									 */
									case 4:
										q2.peek();
										choice = 2;
									}
								}
								sc.close();
								System.out.println(" ");
								System.out.println("*********************************");
								L1.insertLast(oo, nnn,"Your order id has been processed. We will be with you shortly. \nThank you for choosing to trust us here at Empyrean Services.");
								L1.displayendNode();
							}

						}
					}

				}
			}
		}
		
	}
	
}