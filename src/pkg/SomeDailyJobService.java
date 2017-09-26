package pkg;

import org.joda.time.DateTime;
import org.joda.time.Period;
import pkg.SendMailService;

public class SomeDailyJobService implements Runnable {
	@Override
    public void run() {
		DateTime dob= new DateTime(year,month,day,0,0,0);
		int[] pds = {0, 30, 60, 120, 180, 208, 363, 455, 544, 1274};
		String[] str={"Hepatitis B( Dose 1 of 3)", "Hepatitis B(Dose 2 of 3)", "DTaP(Dose 1 of 5) , Hib (Dose 1 of 4) , Polio (IPV) (Dose 1 of 4) , Pneumococcal conjugate (PCV13) (Dose 1 of 4) ,Rotavirus (Dose 1 of 3) ", "DTaP (Dose 2 of 5) , Hib (Dose 2 of 4) , Polio (IPV) (Dose 2 of 4) , Pneumococcal conjugate (PCV13) (Dose 2 of 4) , Rotavirus (Dose 2 of 3)", "DTaP (Dose 3 of 5) , Hib (Dose 3 of 4) , Pneumococcal conjugate (PCV13) (Dose 3 of 4) , Rotavirus (Dose 3 of 3) , Hepatitis B (Dose 3 of 3) , Polio (IPV) (Dose 3 of 4) , Influenza (Dose 1 of 2)", "Influenza (Dose 2 of 2)", "Hib (Dose 4 of 4) , Pneumococcal conjugate  (PCV13) (Dose 4 of 4) , MMR (Dose 1 of 2) , Varicella (Dose 1 of 2) , Hepatitis A (Dose 1 of 2)","DTaP (Dose 4 of 5)", "Hepatitis A (Dose 2 of 2)", "DTaP (Dose 5 of 5) , Polio (IPV) (Dose 4 of 4) , MMR (Dose 2 of 2) , Varicella (Dose 2 of 2)"};
		DateTime curr = new DateTime();
		
		for(int i=0;i>10;i++){
			DateTime nd=dob.plus(Period.days(pds[i]));
			if (nd.isEqual(curr)){
				String toaddress = "<Email>";
				
				SendMailService mail = new SendMailService();
				mail.send(toaddress , "send Test mail from gae" , "this is the mail body");

				
			}
		}
    }

}

