public class User implements UserActions {

    private String user_id;
    private String name;
    private String email;
    private String password;

    public User(String user_id, String name, String email, String password) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void setUser_id(String user_id){
        this.user_id = user_id;
    }

    public String getUser_id(){
        return user_id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }


    public void login(){
        System.out.println(name + " logged in successfully.");
    }


    public void logout(){
        System.out.println(name + " logged out successfully.");
    }


    public void register(){
        System.out.println("User " + name + " registered successfully.");
    }

    public void updateProfile(){
        System.out.println("Profile updated for user: " + name);
    }
}
