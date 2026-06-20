public class Project {

    private String projectNames;
    private int budget;
    ;

    private ContractEmployee ContractEmployee;


    public Project(String projectNames, int budget) {
        this.projectNames = projectNames;

        setBudget(budget);

    }




    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;


    }
public void displayprojectDetails(){
    System.out.println(  "Employee Details");

    System.out.println(  "Project Name: " + projectNames);
    System.out.println(  "Budget: " + budget);




}


}
