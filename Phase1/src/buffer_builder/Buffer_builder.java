package buffer_builder;

public class Buffer_builder {
	
		public static  void concat1(String s1)
		{
			s1 = s1 + "mozhi";
		}

		
		public static  void concat2(StringBuilder s2)
		{
			s2.append("mozhi");
		}

		
		public static void concat3(StringBuffer s3)
		{
			s3.append("mozhi");
		}

		
		public static void main(String[] args)
		{
			
			String s1 = "Kani";
			concat1(s1);		
			System.out.println("String: " + s1);		
			StringBuilder s2 = new StringBuilder("Kani");
			concat2(s2);
			System.out.println("StringBuilder: " + s2);
			StringBuffer s3 = new StringBuffer("Kani");		
			concat3(s3);
			System.out.println("StringBuffer: " + s3);
		}
	}

	


