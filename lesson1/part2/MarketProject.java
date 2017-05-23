public class MarketProject {

    private String name;
    private int age;
    private String position;
    private String skills;
    private String team;
    private String catchphrase;
    private String role;

    public MarketProject(String name, String position, String role) {
        this.name = name;
        this.position = position;
        this.role = role;
    }

    //get methods:
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getSkills() {
        return skills;
    }

    public String getTeam() {
        return team;
    }

    public String getCatchphrase() {
        return catchphrase;
    }

    public String getRole() {
        return role;
    }

    //set methods:
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setCatchphrase(String catchphrase) {
        this.catchphrase = catchphrase;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //actions with objects:
    public static void main(String args[]) {
        MarketProject object1 = new MarketProject("Vitalik", "manager", "tasks maker");
        MarketProject object2 = new MarketProject("Sasha", "developer", "makeup man fucker");
        MarketProject object3 = new MarketProject("Vlad", "developer", "scrum master");
        MarketProject object4 = new MarketProject("Dima", "developer", "unit tests lover");
        object1.setCatchphrase("Hi, guys! How do you like the new layout?");
        object2.setCatchphrase("Total bullshit!");
        object3.setCatchphrase("Feel like naebalovo!");
        object4.setCatchphrase("But it is not exactly...");
        System.out.println("One day in Market project\n" + object1.getName() + ":\n-" + object1.getCatchphrase() +
                "\n" + object2.getName() + ":\n-" + object2.getCatchphrase() +
                "\n" + object3.getName() + ":\n-" + object3.getCatchphrase() +
                "\n" + object4.getName() + ":\n-" + object4.getCatchphrase());

    }
}