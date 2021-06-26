package heatmap.system.port;

import heatmap.system.domain.model.HeatMap;
import heatmap.system.domain.model.User;

public interface UserRepository {

    User search (Integer id);
    boolean register (User u);
    boolean update (User u);
    boolean delete (Integer u);
    User login (String email, String passwd);
    User addHeatMap (User u, HeatMap heatMap);
}
