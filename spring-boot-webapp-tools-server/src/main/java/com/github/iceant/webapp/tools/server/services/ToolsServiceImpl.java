package com.github.iceant.webapp.tools.server.services;

import com.github.iceant.webapp.tools.server.storage.entities.ProjectEntity;
import com.github.iceant.webapp.tools.server.storage.repo.ProjectEntityRepository;
import org.springframework.stereotype.Service;

@Service
public class ToolsServiceImpl implements IToolsService{
    final ProjectEntityRepository projectEntityRepository;

    public ToolsServiceImpl(ProjectEntityRepository projectEntityRepository) {
        this.projectEntityRepository = projectEntityRepository;
    }


    @Override
    public ProjectEntity saveProject(ProjectEntity project) {
        return projectEntityRepository.saveAndFlush(project);
    }
}
