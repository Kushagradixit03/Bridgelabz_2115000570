import java.util.HashSet;
import java.util.Set;

public class L_Three_7 {
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean areOTPsUnique(int[] otpArray) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otpArray) {
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }
        for (int otp : otpArray) {
            System.out.println(otp);
        }
        System.out.println(areOTPsUnique(otpArray) ? "\nAll OTPs are unique!" : "\nSome OTPs are not unique.");
    }
}
