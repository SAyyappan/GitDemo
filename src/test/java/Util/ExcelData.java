package Util;

public class ExcelData{	
		
	Xls_Reader xlsReader = new Xls_Reader("C:\\Users\\Ayyappan\\eclipse-workspace-shrtask\\shareTaskTest\\src\\test\\java\\Configurations\\TestData.xlsx");
	
	//*******************************Login and Register Data*********************************
	int rowNumber = 3;
	

	
	
	/*public void setExcelCounter(int Counter)
	{
		rowNumber = Counter;
	}*/
	
		public String browser() {	
			System.out.println("trace Test base inside browser ");

			String browser = xlsReader.getCellData("LoginAndRegister", "Browser", rowNumber);
			System.out.println("trace 06 Test base prining browser ");
			System.out.print(browser);
			return browser;
		}
		
		public String url() {	
			System.out.println("trace 06 Test base inside url ");
			String url = xlsReader.getCellData("LoginAndRegister", "URL", rowNumber);
			System.out.println("trace 06 Test base prining url ");
			System.out.print(url);
			return url;

		}
		
		public String First_Name(String First_Name) {	
			First_Name = xlsReader.getCellData("LoginAndRegister", "First_Name", rowNumber);
			return First_Name;
		}
		
		public String Last_Name(String Last_Name) {	
			Last_Name = xlsReader.getCellData("LoginAndRegister", "Last_Name", rowNumber);
			return Last_Name;
		}
		
		public String Email_Address(String Email_Address) {	
			Email_Address = xlsReader.getCellData("LoginAndRegister", "Email_Address", rowNumber);
			return Email_Address;
		}
		
		public String username(String username) {	
			username = xlsReader.getCellData("LoginAndRegister", "Email_Address", rowNumber);
			return username;
		}
		
		public String password(String password) {
			password = xlsReader.getCellData("LoginAndRegister", "Password", rowNumber);
			return password;
		}
		
	//****************************************************************************************
		
	//**************************************Account Data**************************************
		
		public String Tagline(String Tagline) {
			Tagline = xlsReader.getCellData("AccountData", "Tagline", rowNumber);
			return Tagline;
		}

		public String Location(String Location) {
			Location = xlsReader.getCellData("AccountData", "Location", rowNumber);
			return Location;
		}
		
		public String Birthday(String Birthday) {
			Birthday = xlsReader.getCellData("AccountData", "Birthday", rowNumber);
			return Birthday;
		}
		
		public String Registration_VAT_Nr(String Registration_VAT_Nr) {
			Registration_VAT_Nr = xlsReader.getCellData("AccountData", "Registration_VAT_Nr", rowNumber);
			return Registration_VAT_Nr;
		}
		
		public String Post_Tasks(String Post_Tasks) {
			Post_Tasks  = xlsReader.getCellData("AccountData", "Post_Tasks", rowNumber);
			return Post_Tasks;
		}
		
		public String Run_Tasks(String Run_Tasks) {
			Run_Tasks = xlsReader.getCellData("AccountData", "Run_Tasks", rowNumber);
			return Run_Tasks;
		}
		
		public String Hourly_Rate(String Hourly_Rate) {
			Hourly_Rate = xlsReader.getCellData("AccountData", "Hourly_Rate", rowNumber);
			return Hourly_Rate;
		}
		
		public String Description(String Description) {
			Description = xlsReader.getCellData("AccountData", "Description", rowNumber);
			return Description;
		}
		
	//****************************************************************************************
		
	//**************************************Skills Data***************************************
		
		public String Specialities(String Specialities) {
			Specialities = xlsReader.getCellData("SkillsData", "Specialities", rowNumber);
			return Specialities;
		}
		
		public String Transportation(String Transportation) {
			Transportation = xlsReader.getCellData("SkillsData", "Transportation", rowNumber);
			return Transportation;
		}
		
		public String Languages(String Languages) {
			Languages = xlsReader.getCellData("SkillsData", "Languages", rowNumber);
			return Languages;
		}
		
		public String Education(String Education) {
			Education = xlsReader.getCellData("SkillsData", "Education", rowNumber);
			return Education;
		}
		
		public String WorkExperience(String WorkExperience) {
			WorkExperience = xlsReader.getCellData("SkillsData", "Work_Experience", rowNumber);
			return WorkExperience;
		}
		
	//****************************************************************************************
		
	//**************************************Skills Data***************************************
		
		public String MobileNo(String MobileNo) {
			MobileNo = xlsReader.getCellData("VerificationData", "Mobile_Number", rowNumber);
			return MobileNo;
		}
		
		public String EnterOTP(String EnterOTP) {
			EnterOTP = xlsReader.getCellData("VerificationData", "OTP", rowNumber);
			return EnterOTP;
		}
		
		public String Credit_Card_Number(String Credit_Card_Number) {
			Credit_Card_Number = xlsReader.getCellData("VerificationData", "Credit_Card_Number", rowNumber);
			return Credit_Card_Number;
		}
		
		public String Exp_Month(String Exp_Month) {
			Exp_Month = xlsReader.getCellData("VerificationData", "Exp_Month", rowNumber);
			return Exp_Month;
		}
		
		public String Exp_Year(String Exp_Year) {
			Exp_Year = xlsReader.getCellData("VerificationData", "Exp_Year", rowNumber);
			return Exp_Year;
		}
		
		public String CVCNo(String CVCNo) {
			CVCNo = xlsReader.getCellData("VerificationData", "CVCNo", rowNumber);
			return CVCNo;
		}
		
		public String Address_First_Line(String Address_First_Line) {
			Address_First_Line = xlsReader.getCellData("VerificationData", "Address_First_Line", rowNumber);
			return Address_First_Line;
		}
		
		public String city(String city) {
			city = xlsReader.getCellData("VerificationData", "City", rowNumber);
			return city;
		}
		
		public String Post_Code(String Post_Code) {
			Post_Code = xlsReader.getCellData("VerificationData", "Post_Code", rowNumber);
			return Post_Code;
		}
		
		public String State(String State) {
			State = xlsReader.getCellData("VerificationData", "State", rowNumber);
			return State;
		}
		
		public String Acc_Name(String Acc_Name) {
			Acc_Name = xlsReader.getCellData("VerificationData", "Acc_Name", rowNumber);
			return Acc_Name;
		}
		
		public String IBAN(String IBAN) {
			IBAN = xlsReader.getCellData("VerificationData", "IBAN", rowNumber);
			return IBAN;
		}
		
		public String Acc_Type(String Acc_Type) {
			Acc_Type = xlsReader.getCellData("VerificationData", "Acc_Type", rowNumber);
			return Acc_Type;
		}
		
		public String National_Reg_No(String National_Reg_No) {
			National_Reg_No = xlsReader.getCellData("VerificationData", "National_Reg_No", rowNumber);
			return National_Reg_No;
		}
		
		public String VAT_TVA_No(String VAT_TVA_No) {
			VAT_TVA_No = xlsReader.getCellData("VerificationData", "VAT_TVA_No", rowNumber);
			return VAT_TVA_No;
		}
		
		public String LinkedIn(String LinkedIn) {
			LinkedIn = xlsReader.getCellData("VerificationData", "LinkedIn", rowNumber);
			return LinkedIn;
		}
		
		
	//****************************************************************************************
		
	//**************************************VAT Data******************************************
		
		public String Client_Email(String Client_Email) {
			Client_Email = xlsReader.getCellData("VATData", "Client_Email", rowNumber);
			return Client_Email;
		}
		
		public String Client_Password(String Client_Password) {
			Client_Password= xlsReader.getCellData("VATData", "Client_Password", rowNumber);
			return Client_Password;
		}
		
		public String Client_Budget(String Client_Budget) {
			Client_Budget= xlsReader.getCellData("VATData", "Client_Budget", rowNumber);
			return Client_Budget;
		}
		
		public void setActual_Client_Budget(String Actual_Client_Budget){
			xlsReader.setCellData("VATData", "Actual_Client_Budget", rowNumber, Actual_Client_Budget);			
		}
		
		public String Client_PlatformFee(String Client_PlatformFee) {
			Client_PlatformFee= xlsReader.getCellData("VATData", "Client_PlatformFee", rowNumber);
			return Client_PlatformFee;
		}
		
		public void setActual_PlatformFee(String Actual_PlatformFee) {
			xlsReader.setCellData("VATData", "Actual_PlatformFee", rowNumber, Actual_PlatformFee);
		}
		
		public String Client_VAT(String Client_VAT) {
			Client_VAT= xlsReader.getCellData("VATData", "Client_VAT", rowNumber);
			return Client_VAT;
		}
		
		public void setActual_VAT(String Actual_VAT) {
			xlsReader.setCellData("VATData", "Actual_VAT", rowNumber, Actual_VAT);
		}
		
		public String Client_SP_NetIncome(String Client_SP_NetIncome) {
			Client_SP_NetIncome= xlsReader.getCellData("VATData", "Client_SP_NetIncome", rowNumber);
			return Client_SP_NetIncome;
		}
		
		public void setActual_SP_NetIncome(String Actual_SP_NetIncome) {
			xlsReader.setCellData("VATData", "Actual_SP_NetIncome", rowNumber, Actual_SP_NetIncome);
		}
		
		public String SP_Email(String SP_Email) {
			SP_Email= xlsReader.getCellData("VATData", "SP_Email", rowNumber);
			return SP_Email;
		}
		
		public String SP_Password(String SP_Password) {
			SP_Password= xlsReader.getCellData("VATData", "SP_Password", rowNumber);
			return SP_Password;
		}
		
		public String SP_offerTaskBudget(String SP_offerTaskBudget) {
			SP_offerTaskBudget= xlsReader.getCellData("VATData", "SP_offerTaskBudget", rowNumber);
			return SP_offerTaskBudget;
		}
		
		public void setActual_offerTaskBudget(String Actual_offerTaskBudget) {
			xlsReader.setCellData("VATData", "Actual_offerTaskBudget", rowNumber, Actual_offerTaskBudget);
		}
		
		public String SP_OfferAmount(String SP_OfferAmount) {
			SP_OfferAmount= xlsReader.getCellData("VATData", "SP_OfferAmount", rowNumber);
			return SP_OfferAmount;
		}
		
		public void setActual_OfferAmount(String Actual_OfferAmount) {
			xlsReader.setCellData("VATData", "Actual_OfferAmount", rowNumber, Actual_OfferAmount);
		}
		
		public String SP_VAT(String SP_VAT) {
			SP_VAT= xlsReader.getCellData("VATData", "SP_VAT", rowNumber);
			return SP_VAT;
		}
		
		public void setActual_SP_VAT(String Actual_SP_VAT) {
			xlsReader.setCellData("VATData", "Actual_SP_VAT", rowNumber, Actual_SP_VAT);
		}
		
		public String SP_WillGet(String SP_WillGet) {
			SP_WillGet= xlsReader.getCellData("VATData", "SP_WillGet", rowNumber);
			return SP_WillGet;
		}
		
		public void setActual_SP_WillGet(String Actual_SP_WillGet) {
			xlsReader.setCellData("VATData", "Actual_SP_WillGet", rowNumber, Actual_SP_WillGet);
		}
		
		public String Bid_Amount(String Bid_Amount) {
			Bid_Amount= xlsReader.getCellData("VATData", "Bid_Amount", rowNumber);
			return Bid_Amount;
		}
		
		public void setActual_Bid_Amount(String Actual_Bid_Amount) {
			xlsReader.setCellData("VATData", "Actual_Bid_Amount", rowNumber, Actual_Bid_Amount);
		}
		
		public String Platform_Fees(String Platform_Fees) {
			Platform_Fees= xlsReader.getCellData("VATData", "Platform_Fees", rowNumber);
			return Platform_Fees;
		}
		
		public void setActual_Platform_Fees(String Actual_Platform_Fees) {
			xlsReader.setCellData("VATData", "Actual_Platform_Fees", rowNumber, Actual_Platform_Fees);
		}
		
		public String SP_offer_amount(String SP_offer_amount) {
			SP_offer_amount= xlsReader.getCellData("VATData", "SP_offer_amount", rowNumber);
			return SP_offer_amount;
		}
		
		public void setActual_SP_offer_amount(String Actual_SP_offer_amount) {
			xlsReader.setCellData("VATData", "Actual_SP_offer_amount", rowNumber, Actual_SP_offer_amount);
		}
		
		public String Final_VAT(String Final_VAT) {
			Final_VAT= xlsReader.getCellData("VATData", "Final_VAT", rowNumber);
			return Final_VAT;
		}
		
		public void setActaul_Final_VAT(String Actaul_Final_VAT) {
			xlsReader.setCellData("VATData", "Actaul_Final_VAT", rowNumber, Actaul_Final_VAT);
		}
		
		public String Payable_Amount(String Payable_Amount) {
			Payable_Amount= xlsReader.getCellData("VATData", "Payable_Amount", rowNumber);
			return Payable_Amount;
		}
		
		public void setActual_Payable_Amount(String Actual_Payable_Amount) {
			xlsReader.setCellData("VATData", "Actual_Payable_Amount", rowNumber, Actual_Payable_Amount);
		}

	//****************************************************************************************
	
		
}


