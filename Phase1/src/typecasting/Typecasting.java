package typecasting;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				float f=7.9f;
				long s=(long)f;
				
				long l=47852932;
				byte b=(byte) l;
				
				double d=97.5465;
				long g=(long) d;
				int x=(int) g;
				char ch=(char) x;
				
				
				int y=4;
				double d1=(double) y;
				long r=(long) d;
				
				
				System.out.println("float value:"+ f);
				System.out.println("float value to long:" + s);
				
				System.out.println("long value:" + l);
				System.out.println("long value to byte:" + b);
				
				System.out.println("Actual double value:" + d);
				System.out.println("double value to long:"+ l);
				System.out.println("long value to int:" + x);
				System.out.println("int value to char:" + ch);
				
				System.out.println("int value:" +y);
				System.out.println("int value to double:" + d1);
				System.out.println("double value to long:" + r);
					
				
			}


			



	}


