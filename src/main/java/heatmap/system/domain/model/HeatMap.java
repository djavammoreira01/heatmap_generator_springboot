package heatmap.system.domain.model;

import java.util.List;

public class HeatMap {

    private Integer id;
    private String name;
    private List<Coordinate> coordinates;

    public HeatMap() {
        this.id = 1;
        this.name = "Mapa";
        this.coordinates = null;
    }

    public HeatMap(Integer id, String name, List<Coordinate> coordinates) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
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

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }
}
