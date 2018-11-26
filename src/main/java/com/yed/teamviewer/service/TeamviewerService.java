package com.yed.teamviewer.service;

import com.yed.teamviewer.mapper.TeamviewerMapper;
import com.yed.teamviewer.model.Teamviewer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamviewerService {

    @Autowired
    private TeamviewerMapper teamviewerMapper;

    public String saveTeamviewer(Teamviewer teamviewer){
        Teamviewer oldTeamviewer = teamviewerMapper.get();
        oldTeamviewer.setAccount(teamviewer.getAccount());
        oldTeamviewer.setPassword(teamviewer.getPassword());
        int nResult = teamviewerMapper.update(oldTeamviewer);
        if (0 == nResult)
        {
           return "{\"msg\":\"err\",\"code\":\"999999\"}";
        }else{
           return "{\"msg\":\"OK\",\"code\":\"000000\"}";
        }
    }
}
