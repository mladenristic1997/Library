package biblioteka_2018_1_24;

import java.util.ArrayList;

public class CheckAccount {
	
	public static boolean CheckAccountExists(ArrayList<Account> lista, int numID) {
		for(Account account : lista)
		{
			if(account.getNum() == numID)
			{
				return true; //account with this number exists
			}
		}
		return false; //account with this number is available
	}
	
	public static boolean isUserIDValid(int numID) {
		return numID > 0;
	}
	
	public static boolean isOverLimit(ArrayList<Account> lista, int AccNum) {
		for(Account ac : lista)
		{
			if(ac.getNum() == AccNum && ac.getNumOfBooksTaken() > 3)
			{
				return true;
			}
		}
		return false;
	}
}
