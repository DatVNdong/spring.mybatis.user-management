package spring.mybatis.user.domain;

public class UserServ {

    private int idUserService;
    private String username;
    private int idService;

    public UserServ() {
        super();
    }

    public UserServ(String username, int idService) {
        super();
        this.username = username;
        this.idService = idService;
    }

    public int getIdService() {
        return idService;
    }

    public int getIdUserService() {
        return idUserService;
    }

    public String getUsername() {
        return username;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public void setIdUserService(int idUserService) {
        this.idUserService = idUserService;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
