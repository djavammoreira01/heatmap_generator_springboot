package heatmap.adapter;

import org.springframework.transaction.annotation.Transactional;
import heatmap.system.domain.model.Coordinate;
import heatmap.system.domain.model.HeatMap;
import heatmap.system.port.HeatMapRepository;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

@Named
public class HeatMapDAO implements HeatMapRepository {

    @Transactional
    public HeatMap search (Integer id) {
        if (!isNull(id)) {
            // chama o metodo de busca
            return new HeatMap();
        }
        return null;
    }

    @Transactional
    public List<HeatMap> searchInterval (List<Integer> ids) {
        if (!isNull(ids)) {
            // chama o metodo de busca varios
            return new ArrayList<>();
        }
        return null;
    }

    @Transactional
    public boolean register (HeatMap hp) {
        if (!isNull(hp)) {
            // chama metodo de cadastro
            return true;
        }
        return false;
    }

    @Transactional
    public boolean delete (HeatMap hp) {
        if (!isNull(hp)) {
            // chama metodo de remoção
            return true;
        }
        return false;
    }

    @Transactional
    public boolean update (HeatMap hp) {
        if (!isNull(hp)) {
            // chama metodo de atualização
            return true;
        }
        return false;
    }

    @Transactional
    public HeatMap addCoordinate (HeatMap hp, Coordinate c) {
        if (!isNull(hp) && !isNull(c)) {
            // adiciona o coodenadas no banco
            // vincula coordenada com heatmap
            return new HeatMap();
        }
        return null;
    }

    @Override
    public List<Coordinate> getCoordinates(HeatMap hp) {
        if (!isNull(hp)) {
            // chama metodo de busca de coordenadas
            return new ArrayList<>();
        }
        return null;
    }
}
