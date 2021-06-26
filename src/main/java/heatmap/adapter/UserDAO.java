package heatmap.adapter;

import org.springframework.transaction.annotation.Transactional;
import heatmap.system.domain.model.HeatMap;
import heatmap.system.domain.model.User;
import heatmap.system.port.UserRepository;

import javax.inject.Named;

import static java.util.Objects.isNull;

@Named
public class UserDAO implements UserRepository {

    @Transactional
    public User search (Integer id) {
        if (!isNull(id)) {
            // chama o metodo de busca
            return new User();
        }
        return null;
    }

    @Transactional
    public boolean register (User u) {
        if (!isNull(u)) {
            // chama metodo de cadastro
            return true;
        }
        return false;
    }

    @Transactional
    public boolean delete (Integer id) {
        if (!isNull(id)) {
            // chama metodo de remoção
            return true;
        }
        return false;
    }

    @Transactional
    public boolean update (User u) {
        if (!isNull(u)) {
            // chama metodo de atualização
            return true;
        }
        return false;
    }

    @Transactional
    public User login (String email, String passwd) {
        if (!isNull(email) && !isNull(passwd)) {
            // chamar metodo de login
            return new User();
        }
        return null;
    }

    @Transactional
    public User addHeatMap (User u, HeatMap heatMap) {
        if (!isNull(u) && !isNull(heatMap)) {
            // adiciona o heatmap no banco
            // vincula heatmap com usuário
            return new User();
        }
        return null;
    }
}
