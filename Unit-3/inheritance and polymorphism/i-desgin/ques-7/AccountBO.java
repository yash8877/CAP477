public class AccountBO {
    public FixedAccount getAccountDetail(String detail){
        String[] accinfo = detail.split(",");
        FixedAccount fa = new FixedAccount();
        fa.accountNumber = accinfo[0];
        fa.balance = Double.parseDouble(accinfo[1]);
        fa.accountHolderName = accinfo[2];
        fa.minimumBalance = Integer.parseInt(accinfo[3]);
        fa.setLockingperoid(Integer.parseInt(accinfo[4]));  
        return fa;
    }
}