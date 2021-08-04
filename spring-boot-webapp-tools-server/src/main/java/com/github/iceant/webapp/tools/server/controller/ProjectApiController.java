package com.github.iceant.webapp.tools.server.controller;

import com.github.iceant.webapp.tools.server.api.Response;
import com.github.iceant.webapp.tools.server.dto.ProjectCreateDTO;
import com.github.iceant.webapp.tools.server.services.IToolsService;
import com.github.iceant.webapp.tools.server.storage.entities.ProjectEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/api/project/v1"})
public class ProjectApiController {

    final IToolsService toolsService;

    public ProjectApiController(IToolsService toolsService) {
        this.toolsService = toolsService;
    }

    @PostMapping(path = {"/create"})
    public Object create(@Validated @RequestBody ProjectCreateDTO dto){
        ProjectEntity projectEntity = toolsService.saveProject(ProjectEntity.builder().name(dto.getName()).build());
        return Response.success(projectEntity);
    }
}
