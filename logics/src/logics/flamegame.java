package logics;

import java.io.*;
import java.util.Scanner;
public class flamegame
{

    public static void main(String args[]) throws IOException
  {
                	int m;
			  Scanner s=new Scanner(System.in);//  BufferedReader br=new BufferedReader(new
		        //InputStreamReader(System.in));
			    System.out.println("Enter ur name: ");
			    StringBuffer s1=new StringBuffer();//s.nextLine();//String first=br.readLine();
			    System.out.println("Enter ur partner's name: ");
			    StringBuffer s2=new StringBuffer();//s.nextLine();//String second=br.readLine();
				StringBuffer s3=new StringBuffer(s1);//StringBuffer s1=new StringBuffer(first);
				StringBuffer s4=new StringBuffer(s2); //StringBuffer s2=new StringBuffer(second);
				int a=s3.length();
				int b=s4.length();

			    //comparing two names
				label: for(int i=0;i<a;i++)
				{
					char c=s1.charAt(i);
				//	System.out.println(c);
					for(int j=0;j<b;j++)
					{
						char d=s2.charAt(j);
						if(c==d)
						{
							 ////k++;
							 s3.deleteCharAt(i);
							 s4.deleteCharAt(j);
							 ////System.out.println(s1 +" " +s2);
							 a=s1.length();
							 //m=a;
							 b=s2.length();
							 i=0;
							 j=0;
							// continue label;
						}
								}

			////	System.out.println(k);
				}
			  int d=(a+b);
			  System.out.println("the number is : " +d);
			  //int n=-1,l=0,p=0;
			  StringBuffer s5=new StringBuffer("flames");
			  //StringBuffer s6=new StringBuffer();

		label1:	for(int i=0;i<5;i++)
				{int n=-1,l=0,p=0;
					for(int j=1;j<=d;j++)
					{
					n++;
					l++;
					//int p=0;
					if(n>s5.length()-1)
						{
						char e=s5.charAt(p);
						if(l==d)
							{
							s5.deleteCharAt(p);
							//String s6=new String();
						String s6=s5.substring(p,s5.length());
							////System.out.println(s4);
							//s6.delete(p,s5.length());
							////System.out.println(s3);
						
							s5.insert(0,s6);
							////System.out.println(s3);
							break;
							}
							else{ p++;
							     if(p==s3.length())
							     {p=0;
							     }
		                        }
						}
					else
						{
						char e=s5.charAt(n);
						if(l==d)
							{
							s5.deleteCharAt(n);
							s6=s5.substring(n,s5.length());//strings7=(String)s6;
							////System.out.println(s4);
							s5.delete(n,s5.length());
					    	////System.out.println(s3);
							s5.insert(0,s6);
							////System.out.println(s3);
					    	break;
							}
							//break;
			    		}

		    		}
		   		 }
		    ////System.out.println(s3);
		    char result=s3.charAt(0);
		    switch(result){
		    	case 'f':
		    	     System.out.println(s2+" is ur Friend");
		    	     break;
		    	case 'l':
		    		 System.out.println(s2+" is ur Love");
		    		 break;
		        case 'a':
		        	 System.out.println(s2+" is ur Affection");
		        	 break;
		        case 'm':
		        	 System.out.println("u r going to marry "+ s2);
		        	 break;
		        case 'e':
		        	 System.out.println(s2+ " is ur Enemy");
		        	 break;
		        case 's':
		        	 System.out.println(s2 +" is ur Sister");
		        	 break;
		    		      }
			}
		

	}


