package account;

public class AccountMain {
    public static void main(String[] args) {
        AccountManagement accountManagement = new AccountManagement(100);
        // AccountManagementList accountManagement = new AccountManagementList();
        accountManagement.run();
    }
}
