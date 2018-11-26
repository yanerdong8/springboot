package com.yed.teamviewer.mapper;

import com.yed.teamviewer.model.Teamviewer;
import org.apache.ibatis.annotations.*;


@Mapper
public interface TeamviewerMapper {

    Teamviewer get();
    int update(Teamviewer teamviewer);

}
