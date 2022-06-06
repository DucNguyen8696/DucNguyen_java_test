package entity;

public class User {

    int id;
    String fullname;
    String email;
    String password;
    Integer expInYear;
    int projectId;
    String proSkill;
    Role role;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", expInYear=" + expInYear +
                ", projectId=" + projectId +
                ", proSkill='" + proSkill + '\'' +
                ", role=" + role +
                '}';
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(Integer expInYear) {
        this.expInYear = expInYear;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public Role getRole() {
        return role;
    }

    public User(int id, String fullname, String email, String password, Integer expInYear, int projectId, String proSkill, Role role) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.expInYear = expInYear;
        this.projectId = projectId;
        this.proSkill = proSkill;
        this.role = role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
