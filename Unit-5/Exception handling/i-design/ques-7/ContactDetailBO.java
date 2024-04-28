class ContactDetailBO {
    public static void validate(String mobile, String alternateMobile) throws DuplicateMobileNumberException {
        if (mobile.equals(alternateMobile)) {
            throw new DuplicateMobileNumberException("Mobile number and alternate mobile number are same");
        }
    }
}