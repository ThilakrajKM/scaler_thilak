package in.thilakraj;

public class ExcelColumnTitle {

    public static void main(String[] args) {
        //  System.out.println(convertToTitle(980089));
        System.out.println(convertToTitle(943566)); //BAQTZ
    }


    public static String convertToTitle(int A) {

        int numOfAZ = 26;
        StringBuilder builder = new StringBuilder();
        int num = A;
        while (num != 0) {
            int rem = num % numOfAZ;
            num = num / numOfAZ;
            if (rem == 0) {
                rem = 26;
                num--;
            }
            char c = (char) ('A' + rem - 1);
            builder.append(c);
        }

        return builder.reverse().toString();
    }

}