package BrokenLink;

import java.net.HttpURLConnection;
import java.net.URL;

public class invalidLink {
	static int invalid;

	public static void verifyLink(String link) {

		try {
			URL url = new URL(link);
			//HttpURLConnection it is class
			HttpURLConnection urlconnect = (HttpURLConnection) url.openConnection();
			urlconnect.setConnectTimeout(5000);
			// hitting url
			urlconnect.connect();

			if (urlconnect.getResponseCode() == 200) {

			} else {
				System.out.println(link + " : " + urlconnect.getResponseMessage() + " : " + urlconnect.HTTP_NOT_FOUND);
				invalid++;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void getInvalidCount() {
		System.out.println("total invalid links = " + invalid);
	}
}
