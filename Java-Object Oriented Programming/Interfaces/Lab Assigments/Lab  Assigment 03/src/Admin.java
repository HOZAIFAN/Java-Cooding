public class Admin extends User{
    private String admin_rights;

    public Admin(String user_id, String name, String email, String password, String admin_rights) {
        super(user_id, name, email, password);
        this.admin_rights = admin_rights;
    }

    public void setAdmin_rights(String admin_rights){
        this.admin_rights = admin_rights;
    }

    public String getAdmin_rights(){
        return admin_rights;
    }

    public void manageSystem(){
        System.out.println("Admin has right of: " + admin_rights);
    }
}
