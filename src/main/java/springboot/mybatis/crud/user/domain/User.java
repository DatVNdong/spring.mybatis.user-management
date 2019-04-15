package springboot.mybatis.crud.user.domain;

import java.util.List;

public class User {

    private int id;
    private List<Integer> listServices;
    private String services;
    private List<Integer> listTypes;
    private String types;
    private int company;
    private int branch;
    private int team;
    private String userId;
    private String username;
    private String password;

    public User() {

    }

    public User(int id, int company, int branch, int team, String userId, String username, String password) {
        super();
        this.id = id;
        this.company = company;
        this.branch = branch;
        this.team = team;
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public int getBranch() {
        return branch;
    }

    public int getCompany() {
        return company;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getListServices() {
        return listServices;
    }

    public List<Integer> getListTypes() {
        return listTypes;
    }

    public String getPassword() {
        return password;
    }

    public String getServices() {
        return services;
    }

    public int getTeam() {
        return team;
    }

    public String getTypes() {
        return types;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public void setCompany(int company) {
        this.company = company;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListServices(List<Integer> listServices) {
        this.listServices = listServices;
    }

    public void setListTypes(List<Integer> listTypes) {
        this.listTypes = listTypes;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        String result = "{ " + String.valueOf(this.id) + ", " + String.valueOf(this.company) + ", "
                + String.valueOf(this.branch) + ", " + String.valueOf(this.team) + ", " + this.userId + ", "
                + this.username + ", " + this.password + " }";
        return result;
    }
}
