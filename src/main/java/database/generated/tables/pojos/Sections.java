/*
 * This file is generated by jOOQ.
 */
package database.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sections implements Serializable {

    private static final long serialVersionUID = -1472592552;

    private final Integer id;
    private final Integer registrationNumber;
    private final Integer courseId;
    private final String  sectionCode;
    private final String  instructor;
    private final Integer sectionType;
    private final Integer sectionStatus;
    private final Integer associatedWith;
    private final Integer waitlistTotal;
    private final String  sectionName;
    private final Float   minUnits;
    private final Float   maxUnits;
    private final String  campus;
    private final String  description;
    private final String  notes;
    private final String  instructionMode;
    private final String  grading;
    private final String  roomNumber;
    private final String  prerequisites;

    public Sections(Sections value) {
        this.id = value.id;
        this.registrationNumber = value.registrationNumber;
        this.courseId = value.courseId;
        this.sectionCode = value.sectionCode;
        this.instructor = value.instructor;
        this.sectionType = value.sectionType;
        this.sectionStatus = value.sectionStatus;
        this.associatedWith = value.associatedWith;
        this.waitlistTotal = value.waitlistTotal;
        this.sectionName = value.sectionName;
        this.minUnits = value.minUnits;
        this.maxUnits = value.maxUnits;
        this.campus = value.campus;
        this.description = value.description;
        this.notes = value.notes;
        this.instructionMode = value.instructionMode;
        this.grading = value.grading;
        this.roomNumber = value.roomNumber;
        this.prerequisites = value.prerequisites;
    }

    public Sections(
        Integer id,
        Integer registrationNumber,
        Integer courseId,
        String  sectionCode,
        String  instructor,
        Integer sectionType,
        Integer sectionStatus,
        Integer associatedWith,
        Integer waitlistTotal,
        String  sectionName,
        Float   minUnits,
        Float   maxUnits,
        String  campus,
        String  description,
        String  notes,
        String  instructionMode,
        String  grading,
        String  roomNumber,
        String  prerequisites
    ) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        this.courseId = courseId;
        this.sectionCode = sectionCode;
        this.instructor = instructor;
        this.sectionType = sectionType;
        this.sectionStatus = sectionStatus;
        this.associatedWith = associatedWith;
        this.waitlistTotal = waitlistTotal;
        this.sectionName = sectionName;
        this.minUnits = minUnits;
        this.maxUnits = maxUnits;
        this.campus = campus;
        this.description = description;
        this.notes = notes;
        this.instructionMode = instructionMode;
        this.grading = grading;
        this.roomNumber = roomNumber;
        this.prerequisites = prerequisites;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getRegistrationNumber() {
        return this.registrationNumber;
    }

    public Integer getCourseId() {
        return this.courseId;
    }

    public String getSectionCode() {
        return this.sectionCode;
    }

    public String getInstructor() {
        return this.instructor;
    }

    public Integer getSectionType() {
        return this.sectionType;
    }

    public Integer getSectionStatus() {
        return this.sectionStatus;
    }

    public Integer getAssociatedWith() {
        return this.associatedWith;
    }

    public Integer getWaitlistTotal() {
        return this.waitlistTotal;
    }

    public String getSectionName() {
        return this.sectionName;
    }

    public Float getMinUnits() {
        return this.minUnits;
    }

    public Float getMaxUnits() {
        return this.maxUnits;
    }

    public String getCampus() {
        return this.campus;
    }

    public String getDescription() {
        return this.description;
    }

    public String getNotes() {
        return this.notes;
    }

    public String getInstructionMode() {
        return this.instructionMode;
    }

    public String getGrading() {
        return this.grading;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public String getPrerequisites() {
        return this.prerequisites;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Sections (");

        sb.append(id);
        sb.append(", ").append(registrationNumber);
        sb.append(", ").append(courseId);
        sb.append(", ").append(sectionCode);
        sb.append(", ").append(instructor);
        sb.append(", ").append(sectionType);
        sb.append(", ").append(sectionStatus);
        sb.append(", ").append(associatedWith);
        sb.append(", ").append(waitlistTotal);
        sb.append(", ").append(sectionName);
        sb.append(", ").append(minUnits);
        sb.append(", ").append(maxUnits);
        sb.append(", ").append(campus);
        sb.append(", ").append(description);
        sb.append(", ").append(notes);
        sb.append(", ").append(instructionMode);
        sb.append(", ").append(grading);
        sb.append(", ").append(roomNumber);
        sb.append(", ").append(prerequisites);

        sb.append(")");
        return sb.toString();
    }
}
