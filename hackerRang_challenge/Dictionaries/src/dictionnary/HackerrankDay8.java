package dictionnary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HackerrankDay8 {

	public static void main(String[] args) {
		Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++){
            String name = in.nextLine();
            int phone = Integer.parseInt(in.nextLine());
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.nextLine();
            Integer phoneNumber = phoneBook.get(s);
            System.out.println(
                (phoneNumber != null) 
                ? s + "=" + phoneNumber 
                : "Not found"
            );
        }
        in.close();
	}

}
