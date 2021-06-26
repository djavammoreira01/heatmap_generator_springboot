package heatmap.system.port;

import heatmap.system.domain.model.Coordinate;

import java.util.List;

public interface CoordinateRepository {

    Coordinate search (Integer id);
    List<Coordinate> searchInterval (List<Integer> ids);
    boolean register (Coordinate c);
    boolean delete (Coordinate c);
    boolean update (Coordinate c);
}
