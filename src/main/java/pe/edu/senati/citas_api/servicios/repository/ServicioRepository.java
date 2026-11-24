package pe.edu.senati.citas_api.servicios.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.senati.citas_api.servicios.entity.Servicio;

public interface ServicioRepository extends JpaRepository<Servicio, Long> {

    List<Servicio> findByTituloContainingIgnoreCase(String texto);

    List<Servicio> findByActivoTrue();

    boolean existsByTituloIgnoreCase(String titulo);

    boolean existsByTituloIgnoreCaseAndIdNot(String titulo, Long id);
}