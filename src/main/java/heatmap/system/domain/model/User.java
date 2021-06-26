package heatmap.system.domain.model;

import java.util.List;

public class User {

    private Integer id;
    private String name;
    private String email;
    private String passwd;
    private List<HeatMap> heatMaps;

    public User() {
        this.id = 1;
        this.name = "Djavam";
        this.email = "djavam@p.p";
        this.passwd = "123";
        this.heatMaps = null;
    }

    public User(Integer id, String name, String email, String passwd, List<HeatMap> heatMaps) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passwd = passwd;
        this.heatMaps = heatMaps;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public List<HeatMap> getHeatMaps() {
        return heatMaps;
    }

    public void setHeatMaps(List<HeatMap> heatMaps) {
        this.heatMaps = heatMaps;
    }
}
