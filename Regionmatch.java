
public class Regionmatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String searchme = " i have ten java codes";
		String Findme = "java";
		
		int searchlen = searchme.length();
		int findlen = Findme.length();
		
		boolean foundit= false;
		
		for(int i=0; i <= (searchlen - findlen); i++) {
			if(searchme.regionMatches(i, Findme, 0, findlen)) {
				foundit =true;
				String fs ;
				fs = searchme.substring(i,i + findlen);
				System.out.println("The word is "+ fs);
				break;
			}
		}
			if(!foundit) 
			
			System.out.println("Not Found");
		}

	}
	


