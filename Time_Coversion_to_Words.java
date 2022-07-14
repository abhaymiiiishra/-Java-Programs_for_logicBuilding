import java.util.*;
class Time {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m, h; // m for minute and h for Hours
        String p = "";
        String ar[] = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN",
                "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY",
                "TWENTY ONE", "TWENTY TWO", "TWENTY THREE", "TWENTY FOUR", "TWENTY FIVE", "TWENTY SIX", "TWENTY SEVEN",
                "TWENTY EIGHT", "TWENTY NINE", "THIRTY", "THIRTY ONE", "THIRTY TWO", "THIRTY THREE", "THIRTY FOUR",
                "THIRTY FIVE", "THIRTY SIX", "THIRTY SEVEN", "THIRTY EIGHT", "THIRTY NINE", "FOURTY", "FOURTY ONE",
                "FOURTY TWO", "FOURTY THREE", "FOURTY FOUR", "FOURTY FIVE", "FOURTY SIX", "FOURTY SEVEN",
                "FOURTY EIGHT", "FOURTY NINE", "FIFTY", "FIFTY ONE", "FIFTY TWO", "FIFTY THREE", "FIFTY FOUR",
                "FIFTY FIVE", "FIFTY SIX", "FIFTY SEVEN", "FIFTY EIGHT", "FIFTY NINE", "SIXTY" };
        System.out.println("Enter hour");
        h = sc.nextInt(); // Takes Input for hour
        System.out.println("Enter minutes");
        m = sc.nextInt(); // Takes Input for Minutes
        if (h > 0 && h <= 12 && m >= 0 && m < 60) {
            if (m == 0)
                p = ar[h - 1];
            if (m <= 30) // conditions for the time in words if minutes are less than or equal to 30
            {
                if (m == 15)
                    p = "QUARTER PAST " + ar[h - 1];
                else if (m == 30)
                    p = "HALF PAST " + ar[h - 1];
                else if (m == 1)
                    p = ar[m - 1] + " MINUTE PAST " + ar[h - 1];
                else
                    p = ar[m - 1] + " MINUTES PAST " + ar[h - 1];
            } else // conditions for the time in words if minutes are greater than 30
            {
                if (h == 12) // if it's 12th hour
                {
                    if (m == 45)
                        p = "QUARTER TO ONE";
                    else if (m == 59)
                        p = ar[0] + " MINUTE TO ONE";
                    else
                        p = ar[59 - m] + " MINUTES TO ONE";
                } else {
                    if (m == 45)
                        p = "QUARTER TO " + ar[h];
                    else if (m == 59)
                        p = ar[0] + " MINUTE TO " + ar[h];
                    else
                        p = ar[59 - m] + " MINUTES TO " + ar[h];
                }
            }
            System.out.println(p);
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}

