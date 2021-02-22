package com.tts.Twitter.repository;

import com.tts.Twitter.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import javax.management.relation.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}
