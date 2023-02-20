 // Account interface
public interface Account {
    public void login();
    public void logout();
}

// ConcreteAccount class
public class ConcreteAccount implements Account {
    private String username;
    private String password;

    public ConcreteAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login() {
        // Check if the entered username and password match the stored values
        // If they do, print "Login successful"
        // If not, print "Incorrect username or password"
    }

    public void logout() {
        // Perform the logout logic
    }
}

// Decorator class
public abstract class AccountDecorator implements Account {
    protected Account account;

    public AccountDecorator(Account account) {
        this.account = account;
    }

    public void login() {
        account.login();
    }

    public void logout() {
        account.logout();
    }
}

// Concrete decorator class
public class SecureAccountDecorator extends AccountDecorator {
    public SecureAccountDecorator(Account account) {
        super(account);
    }

    public void login() {
        super.login();
        // Perform additional security checks
    }
}
