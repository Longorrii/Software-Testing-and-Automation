package mobile_testing_app;


import mobile_testing_app.MobileTesting;

import io.appium.java_client.android.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.interactions.*;

public class Assignment {
	private static String[] loginPageElements = {"com.experitest.ExperiBank:id/usernameTextField", "com.experitest.ExperiBank:id/passwordTextField", "com.experitest.ExperiBank:id/loginButton"};
	private static String[] summaryPageElements = {"com.experitest.ExperiBank:id/makePaymentButton", "com.experitest.ExperiBank:id/logoutButton"};
	private static String[] paymentPageElements = {"com.experitest.ExperiBank:id/phoneTextField", "com.experitest.ExperiBank:id/nameTextField", "com.experitest.ExperiBank:id/nameTextField",
											"com.experitest.ExperiBank:id/amountLabel", "com.experitest.ExperiBank:id/amount", "com.experitest.ExperiBank:id/countryTextField",
											"com.experitest.ExperiBank:id/countryButton", "com.experitest.ExperiBank:id/sendPaymentButton", "com.experitest.ExperiBank:id/cancelButton"};
	

	/* Start Here */
	
	public static void run() throws NoSuchElementException {
		AndroidDriver<AndroidElement> driver = (AndroidDriver<AndroidElement>) MobileTesting.getDriver();
		
		long timeout = 6; // 6 seconds
		WebDriverWait wait = new WebDriverWait(driver, timeout);

		/* Start testing */
		AndroidElement element;
		Actions action = new Actions(driver);
		Alert alert;
		
		// (1) Check if on login page
		/* WRITE HERE */
		
		MobileTesting.printTest(1);
		
		// (2) Type the string "company" to the username field
		/* WRITE HERE */

		
		MobileTesting.printTest(2);
		
		// (3) Focus the password field
		/* WRITE HERE */

		
		MobileTesting.printTest(3);
		
		// (4) Type the string "company" to the password field
		/* WRITE HERE */

		
		MobileTesting.printTest(4);
		
		// (5) Focus the username field
		/* WRITE HERE */

		
		MobileTesting.printTest(5);
		
		// (6) Empty out the username field
		/* WRITE HERE */

		
		MobileTesting.printTest(6);
		
		// (7) Press the login button and ensure still on login page
		/* WRITE HERE */

		
		MobileTesting.printTest(7);
		
		// (8) Re-type "company" to the username field
		/* WRITE HERE */

		
		MobileTesting.printTest(8);
		
		// (9) Press the login button and ensure now on summary page with $100
		/* WRITE HERE */

		
		MobileTesting.printTest(9);
		
		// (10) Press the make payment button and ensure now on payment page
		/* WRITE HERE */

		
		MobileTesting.printTest(10);
		
		// (11) Type the string "612-555-0112" to the phone field
		/* WRITE HERE */

		
		MobileTesting.printTest(11);
		
		// (12) Type the string "Alice" to the name text field
		/* WRITE HERE */

		
		MobileTesting.printTest(12);
		
		// (13) Drag the amount slider to $35
		/* WRITE HERE */

		
		MobileTesting.printTest(13);
		
		// (14) Press the send payment button and ensure still on payment page
		/* WRITE HERE */

		
		MobileTesting.printTest(14);
		
		// (15) Type the string "United States" to the country text field
		/* WRITE HERE */

		
		MobileTesting.printTest(15);
		
		// (16) Press the cancel button and ensure now on summary page with $100
		/* WRITE HERE */

		
		MobileTesting.printTest(16);
		
		// (17) Press the make payment button and ensure now on payment page with default values
		/* WRITE HERE */

		
		MobileTesting.printTest(17);
		
		// (18) Type the string "612-555-0355" to the phone field
		/* WRITE HERE */

		
		MobileTesting.printTest(18);
				
		// (19) Type the string "Bob" to the name text field
		/* WRITE HERE */

		
		MobileTesting.printTest(19);
		
		// (20) Drag the amount slider to $55
		/* WRITE HERE */

		
		MobileTesting.printTest(20);
		
		// (21) Press the country button
		/* WRITE HERE */

		
		MobileTesting.printTest(21);
		
		// (22) Select France from the country list (13th on the list)
		/* WRITE HERE */

		
		MobileTesting.printTest(22);
		
		// (23) Press the send payment button and ensure alert appears
		/* WRITE HERE */
		
		
		MobileTesting.printTest(23);
		
		// (24) Dismiss the alert and ensure now on payment page
		/* WRITE HERE */
		
		
		MobileTesting.printTest(24);
		
		// (25) Press the send payment button and ensure alert appears again
		/* WRITE HERE */
		
		
		MobileTesting.printTest(25);
		
		// (26) Accept the alert and ensure now on summary page
		/* WRITE HERE */
		
		
		MobileTesting.printTest(26);
		
		// (27) Press the logout button and ensure now on login page
		/* WRITE HERE */
		
		
		MobileTesting.printTest(27);
	}
}
