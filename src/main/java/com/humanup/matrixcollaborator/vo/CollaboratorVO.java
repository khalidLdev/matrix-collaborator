package com.humanup.matrixcollaborator.vo;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString(of= {"mailAdresse","projectVOList"})
public class CollaboratorVO {
     String mailAdresse;
     List<ProjectVO> projectVOList;
}
