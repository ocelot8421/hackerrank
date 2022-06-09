package hackerrank.a02time24;

public class time24Main {
    public static void main(String[] args) {

        String input = "12:05:45AM";
        method1(input);
    }

    private static void method1(String input) {

        String[] arr = input.split("");
        String index8 = arr[8];
        int hour = Integer.parseInt(arr[0]) * 10 + Integer.parseInt(arr[1]);

        if (index8.equals("P") && hour < 12){
            hour += 12;
        }
        if (index8.equals("A") && hour >= 12){
            hour -= 12;
        }

        String time24 = String.format("%02d", hour);
        for (int i = 2; i < 8; i++) {
            time24 += arr[i];
        }
        System.out.println(time24);
    }
}
