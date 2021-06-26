package heatmap.system.port;

import heatmap.system.domain.model.Coordinate;
import heatmap.system.domain.model.HeatMap;

import java.util.List;

public interface HeatMapRepository {

    HeatMap search (Integer id);
    List<HeatMap> searchInterval (List<Integer> ids);
    boolean register (HeatMap hp);
    boolean delete (HeatMap hp);
    boolean update (HeatMap hp);
    HeatMap addCoordinate (HeatMap hp, Coordinate c);
    List<Coordinate> getCoordinates (HeatMap hp);
}
