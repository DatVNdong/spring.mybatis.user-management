package springboot.mybatis.crud.user.domain;

public class UserType {

    private int idUserType;
    private String username;
    private int idType;

    public UserType() {
        super();
    }

    public UserType(String username, int idType) {
        super();
        this.username = username;
        this.idType = idType;
    }

    public int getIdType() {
        return idType;
    }

    public int getIdUserType() {
        return idUserType;
    }

    public String getUsername() {
        return username;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public void setIdUserType(int idUserType) {
        this.idUserType = idUserType;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
