package com.github.iceant.webapp.tools.server.storage.repo;


import com.github.iceant.webapp.tools.server.storage.entities.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectEntityRepository extends JpaRepository<ProjectEntity, Long> {

}
