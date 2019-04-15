package spring.mybatis.user.domain;

public class Serv {

    private int idService;
    private String nameService;

    public Serv() {
        super();
    }

    public Serv(int idService, String nameService) {
        super();
        this.idService = idService;
        this.nameService = nameService;
    }

    public int getIdService() {
        return idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }
}
