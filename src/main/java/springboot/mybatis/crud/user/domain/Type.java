package springboot.mybatis.crud.user.domain;

public class Type {

    private int idType;
    private String nameType;

    public Type() {
        super();
    }

    public Type(int idType, String nameType) {
        super();
        this.idType = idType;
        this.nameType = nameType;
    }

    public int getIdType() {
        return idType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
}
