package org.visapps.universityschedule.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@Document(collection = "teachers")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class Teacher {

    @Id
    private String id;

    private Person person;
    private String comment;
    @XmlElement(name = "class_id")
    private Integer classId;
    @XmlElement(name = "subject_id")
    private Integer subjectId;
    @XmlElement(name = "room_id")
    private Integer roomId;
    @XmlElement(name = "chair_id")
    private Integer chairId;
    @XmlElement(name = "method_days")
    private Integer methodDays;
    @XmlElement(name = "max_windows")
    private Integer maxWindows;
    @XmlElementWrapper(name="work_hours")
    @XmlElement(name = "week")
    private List<Week> workHours;
    private String status;

}
