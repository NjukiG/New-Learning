public class PhoneNumberValidator {

    private String phoneNumber;

    public PhoneNumberValidator(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public boolean isValid(){
//        Copied this regex from stack overflow. Didnt understand it well.
        String regex = "^\\((?:[2-9][0-9]{2})\\)\\s?[2-9][0-9]{2}-[0-9]{4}$";

        return phoneNumber.matches(regex);
    }
}
