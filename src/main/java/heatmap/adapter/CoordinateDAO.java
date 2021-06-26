package heatmap.adapter;

import org.springframework.transaction.annotation.Transactional;
import heatmap.system.domain.model.Coordinate;
import heatmap.system.port.CoordinateRepository;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

@Named
public class CoordinateDAO implements CoordinateRepository {

    @Transactional
    public Coordinate search (Integer id) {
        if (!isNull(id)) {
            // chama o metodo de busca
            return new Coordinate();
        }
        return null;
    }

    @Transactional
    public List<Coordinate> searchInterval (List<Integer> ids) {
        if (!isNull(ids)) {
            // chama o metodo de busca varios
            return new ArrayList<>();
        }
        return null;
    }

    @Transactional
    public boolean register (Coordinate c) {
        if (!isNull(c)) {
            // chama metodo de cadastro
            return true;
        }
        return false;
    }

    @Transactional
    public boolean delete (Coordinate c) {
        if (!isNull(c)) {
            // chama metodo de remoção
            return true;
        }
        return false;
    }

    @Transactional
    public boolean update (Coordinate c) {
        if (!isNull(c)) {
            // chama metodo de atualização
            return true;
        }
        return false;
    }
}
