package convere_stringbuffbuilder;

public class Convere_stringbuffbuilder {
	
		public static void main(String[] args)
		{
			
			String str = "Kani";

			
			StringBuffer sbr = new StringBuffer(str);

			
			sbr.reverse();

			
			System.out.println(sbr);

			
			StringBuilder sbl = new StringBuilder(str);

		
			sbl.append("mozhi");

		
			System.out.println(sbl);
		}
	}

	

