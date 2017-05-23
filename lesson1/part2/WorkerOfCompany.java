public class WorkerOfCompany {

    private String name;
    private String surname;
    private int age;
    private String department;
    private String rank;
    private String team;
    private int experience;
    private String skills;

    public WorkerOfCompany(String name, String surname, int age)

    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //get methods
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getRank() {
        return rank;
    }

    public String getTeam() {
        return team;
    }

    public int getExperience() {
        return experience;
    }

    public String getSkills() {
        return skills;
    }

    //set methods:
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    //actions with objects:
    public static void main(String args[]) {
        WorkerOfCompany object1 = new WorkerOfCompany("Lyonya", "Chernovetskiy", 50);
        object1.setTeam("young team");
        System.out.println("My name is " + object1.getName() + " " + object1.getSurname() +
                ". I and my " + object1.getTeam() + " do everything in our power!");
        WorkerOfCompany object2 = new WorkerOfCompany("Larisa", "Labutenova", 25);
        object2.setDepartment("management");
        object2.setRank("secretery");
        System.out.println("\n- This hot chick from " + object2.getDepartment() + " department \n- Her name is " +
        object2.getName() + ". She is " + object2.getRank() + "\n- I would test her skills");
    }
}