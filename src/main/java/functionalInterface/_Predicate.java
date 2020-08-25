package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("without Predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09085600000"));

        System.out.println("with Predicate");
        System.out.println((isPhoneNumberValidPredicate.test("07000000000")));
        System.out.println((isPhoneNumberValidPredicate.test("09085600000")));

        System.out.println("Is phone umber valid and contains number 3 = " +
                (isPhoneNumberValidPredicate.and(containsNumber3).test("07035600000")));

        System.out.println("Is phone umber valid and contains number 3 = " +
                (isPhoneNumberValidPredicate.and(containsNumber3).test("09035600000")));
    }


    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
                    phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

}
