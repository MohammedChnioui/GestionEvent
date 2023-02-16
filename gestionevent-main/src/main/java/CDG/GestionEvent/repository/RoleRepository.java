package CDG.GestionEvent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import CDG.GestionEvent.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	@Query("SELECT r FROM Role r WHERE r.name = :name")
	public Role findByName(@Param("name")String name);

}
