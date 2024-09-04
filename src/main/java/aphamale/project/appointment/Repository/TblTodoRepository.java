package aphamale.project.appointment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import aphamale.project.appointment.Entity.TblTodoEntity;

@NoRepositoryBean
public interface TblTodoRepository extends JpaRepository<TblTodoEntity, String> {

    
}
