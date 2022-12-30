//CODECLAUSE PROJECT 1
// Program to convert local timezone into a country timezone which is provided by the user
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.*;

class timezoneconversion
{

    public static void main(String[]args)

    {
        int ch=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("........WELCOME TO  MY TIMEZONE CONVERSION PROJECT.......");
        while (ch!=0)
        {

            System.out.println("ENTER 1 TO KNOW ABOUT THE LOCAL DATE,TIME AND TIMEZONE");
            System.out.println("ENTER 2 TO KNOW ABOUT ALL THE TIMEZONES THAT EXISTS");
            System.out.println("ENTER 3 TO CONVERT THE LOCAL TIME TO ANY OTHER COUNTRY TIME ZONE");
            int nu= sc.nextInt();

        switch(nu){

            case 1:
                // TO SHOW THE CURRENT DATE,TIME AND TIMEZONE
                String date1 = new SimpleDateFormat("dd-MM-yy hh:mm:ss").format(Calendar.getInstance().getTime());
                String date2 = Calendar.getInstance().getTimeZone().getID();
                System.out.println("LOCAL DATE AND TIME:" + date1);
                System.out.println("LOCAL TIMEZONE :" + date2);
                break;
            case 2:
                // TO SHOW THE AVAILABLE TIMEZONES
                String[] id = TimeZone.getAvailableIDs();
                System.out.println("The available Timezones  are as follows:");
                for (int i = 0; i < id.length; i++)
                {
                    System.out.println(id[i]);
                }
                break;
            case 3:
                //TO CONVERT THE THE LOCAL TIMEZONE INTO THE COUNTRY TIMEZONE PROVIDED BY THE USER
                Scanner mz = new Scanner(System.in);
                String tz;
                System.out.println("Enter your Timezone id");
                tz = mz.nextLine();
                TimeZone.setDefault(TimeZone.getTimeZone(tz));
                SimpleDateFormat date_format=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
                Date date=new Date();
                String current_date_time=date_format.format(date);

                System.out.println("NOW THE TIMEZONE HAS BEEN CHANGED");
                System.out.println("CURRENT TIME AND DATE :" + current_date_time);
                System.out.println("CURRENT TIMEZONE :" + tz );
                break;
            default:
                System.out.println(" Enter 1 2 and 3 only");

        }
            Scanner t=new Scanner(System.in);
            System.out.println("DO YOU WANT TO CONTINUE?");
            System.out.println(("IF YES TYPE 1 ELSE TYPE 0"));
            ch= t.nextInt();

    }System.out.println(".........THANK YOU..........");
    }
}
