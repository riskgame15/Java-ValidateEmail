
public class EmailTest {
    private static EmailExample emailExample;
    public static final String[] validEmails = {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmails = {"@gmail.com", "ab@gmail.", "@#abc@gmail.com", "abc@ymailcom"};

    public static void main(String[] args) {
        emailExample = new EmailExample();

        for (String email : validEmails) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email " + email + " is valid? " + isValid);
        }

        for (String email : invalidEmails) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email " + email + " is valid? " + isValid);
        }
    }
}
