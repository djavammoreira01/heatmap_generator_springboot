package heatmap.system.domain.model;

import java.math.BigDecimal;

public class Coordinate {

    private Integer id;
    private BigDecimal lat;
    private BigDecimal lon;

    public Coordinate() {
        this.id = 1;
        this.lat = new BigDecimal("1.1");
        this.lon = new BigDecimal("2.2");
    }

    public Coordinate(Integer id, BigDecimal lat, BigDecimal lon) {
        this.id = id;
        this.lat = lat;
        this.lon = lon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLon() {
        return lon;
    }

    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }
}
