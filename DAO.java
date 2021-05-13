package laboratorio.lab5.a;

import java.util.List;
import java.util.Optional;

    interface DAO<T> {

        Optional<T> getId(Aluno id);

        List<T> getAll();

        void save(T t);

        void update(T t);

        void delete(T t);
    }
