package com.github.iceant.webapp.tools.server.services;

import com.github.iceant.webapp.tools.server.storage.entities.ProjectEntity;

public interface IToolsService {
    ProjectEntity saveProject(ProjectEntity project);
}
