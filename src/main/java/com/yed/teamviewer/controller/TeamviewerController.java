package com.yed.teamviewer.controller;

import com.yed.teamviewer.model.Teamviewer;
import com.yed.teamviewer.service.TeamviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamviewerController {

    @Autowired
    private TeamviewerService teamviewerService;

    @RequestMapping(value = "/saveTeamviewer.php", method = RequestMethod.POST)
    public String saveTeamviewer(@RequestBody Teamviewer teamviewer) {

        return teamviewerService.saveTeamviewer(teamviewer);
    }

}
