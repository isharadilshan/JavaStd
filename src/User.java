public class User {
    public static final int USR_ADMIN = 1;
    public static final int USR_NORMAL = 2;
    
    private String username;
    private String password;
    private String name;
    private String email;
    private int userLevel;

    public void setUsername(String username) { this.username = username; }
    public String getUsername() { return username; }
    
    public void setPassword(String password) { this.password = password; }
    public String getPassword() { return password; }
    
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    
    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }
    
    public void setUserLevel(int userLevel) { this.userLevel = userLevel; }
    public int getUserLevel() { return userLevel; }
    
    @Override
    public String toString() {
        return username + "|" + password + "|" + name + "|" + email + "|" + userLevel;
    }
    
    public static User retrieve(String username) {
        return DataConnection.getUser(username);
    }
}
