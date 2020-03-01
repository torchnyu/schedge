/*
 * This file is generated by jOOQ.
 */
package database.generated.tables.records;


import database.generated.tables.Sections;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SectionsRecord extends UpdatableRecordImpl<SectionsRecord> implements Record19<Integer, Integer, Integer, String, String, Integer, Integer, Integer, Integer, String, Float, Float, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 526804933;

    /**
     * Setter for <code>sections.id</code>.
     */
    public SectionsRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sections.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>sections.registration_number</code>.
     */
    public SectionsRecord setRegistrationNumber(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sections.registration_number</code>.
     */
    public Integer getRegistrationNumber() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>sections.course_id</code>.
     */
    public SectionsRecord setCourseId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sections.course_id</code>.
     */
    public Integer getCourseId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>sections.section_code</code>.
     */
    public SectionsRecord setSectionCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sections.section_code</code>.
     */
    public String getSectionCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sections.instructor</code>.
     */
    public SectionsRecord setInstructor(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>sections.instructor</code>.
     */
    public String getInstructor() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sections.section_type</code>.
     */
    public SectionsRecord setSectionType(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>sections.section_type</code>.
     */
    public Integer getSectionType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>sections.section_status</code>.
     */
    public SectionsRecord setSectionStatus(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>sections.section_status</code>.
     */
    public Integer getSectionStatus() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>sections.associated_with</code>.
     */
    public SectionsRecord setAssociatedWith(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>sections.associated_with</code>.
     */
    public Integer getAssociatedWith() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>sections.waitlist_total</code>.
     */
    public SectionsRecord setWaitlistTotal(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>sections.waitlist_total</code>.
     */
    public Integer getWaitlistTotal() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>sections.section_name</code>.
     */
    public SectionsRecord setSectionName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>sections.section_name</code>.
     */
    public String getSectionName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sections.min_units</code>.
     */
    public SectionsRecord setMinUnits(Float value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>sections.min_units</code>.
     */
    public Float getMinUnits() {
        return (Float) get(10);
    }

    /**
     * Setter for <code>sections.max_units</code>.
     */
    public SectionsRecord setMaxUnits(Float value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>sections.max_units</code>.
     */
    public Float getMaxUnits() {
        return (Float) get(11);
    }

    /**
     * Setter for <code>sections.campus</code>.
     */
    public SectionsRecord setCampus(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>sections.campus</code>.
     */
    public String getCampus() {
        return (String) get(12);
    }

    /**
     * Setter for <code>sections.description</code>.
     */
    public SectionsRecord setDescription(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>sections.description</code>.
     */
    public String getDescription() {
        return (String) get(13);
    }

    /**
     * Setter for <code>sections.notes</code>.
     */
    public SectionsRecord setNotes(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>sections.notes</code>.
     */
    public String getNotes() {
        return (String) get(14);
    }

    /**
     * Setter for <code>sections.instruction_mode</code>.
     */
    public SectionsRecord setInstructionMode(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>sections.instruction_mode</code>.
     */
    public String getInstructionMode() {
        return (String) get(15);
    }

    /**
     * Setter for <code>sections.grading</code>.
     */
    public SectionsRecord setGrading(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>sections.grading</code>.
     */
    public String getGrading() {
        return (String) get(16);
    }

    /**
     * Setter for <code>sections.room_number</code>.
     */
    public SectionsRecord setRoomNumber(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>sections.room_number</code>.
     */
    public String getRoomNumber() {
        return (String) get(17);
    }

    /**
     * Setter for <code>sections.prerequisites</code>.
     */
    public SectionsRecord setPrerequisites(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>sections.prerequisites</code>.
     */
    public String getPrerequisites() {
        return (String) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, Integer, Integer, String, String, Integer, Integer, Integer, Integer, String, Float, Float, String, String, String, String, String, String, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, Integer, Integer, String, String, Integer, Integer, Integer, Integer, String, Float, Float, String, String, String, String, String, String, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Sections.SECTIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Sections.SECTIONS.REGISTRATION_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Sections.SECTIONS.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Sections.SECTIONS.SECTION_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Sections.SECTIONS.INSTRUCTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Sections.SECTIONS.SECTION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Sections.SECTIONS.SECTION_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Sections.SECTIONS.ASSOCIATED_WITH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Sections.SECTIONS.WAITLIST_TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Sections.SECTIONS.SECTION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Float> field11() {
        return Sections.SECTIONS.MIN_UNITS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Float> field12() {
        return Sections.SECTIONS.MAX_UNITS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Sections.SECTIONS.CAMPUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Sections.SECTIONS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Sections.SECTIONS.NOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Sections.SECTIONS.INSTRUCTION_MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Sections.SECTIONS.GRADING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return Sections.SECTIONS.ROOM_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return Sections.SECTIONS.PREREQUISITES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getRegistrationNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSectionCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getInstructor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getSectionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getSectionStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getAssociatedWith();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getWaitlistTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getSectionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float component11() {
        return getMinUnits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float component12() {
        return getMaxUnits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getCampus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getInstructionMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getGrading();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getRoomNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getPrerequisites();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRegistrationNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSectionCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getInstructor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getSectionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getSectionStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getAssociatedWith();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getWaitlistTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getSectionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float value11() {
        return getMinUnits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float value12() {
        return getMaxUnits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getCampus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getInstructionMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getGrading();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getRoomNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getPrerequisites();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value2(Integer value) {
        setRegistrationNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value3(Integer value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value4(String value) {
        setSectionCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value5(String value) {
        setInstructor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value6(Integer value) {
        setSectionType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value7(Integer value) {
        setSectionStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value8(Integer value) {
        setAssociatedWith(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value9(Integer value) {
        setWaitlistTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value10(String value) {
        setSectionName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value11(Float value) {
        setMinUnits(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value12(Float value) {
        setMaxUnits(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value13(String value) {
        setCampus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value14(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value15(String value) {
        setNotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value16(String value) {
        setInstructionMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value17(String value) {
        setGrading(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value18(String value) {
        setRoomNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord value19(String value) {
        setPrerequisites(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SectionsRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, Integer value6, Integer value7, Integer value8, Integer value9, String value10, Float value11, Float value12, String value13, String value14, String value15, String value16, String value17, String value18, String value19) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SectionsRecord
     */
    public SectionsRecord() {
        super(Sections.SECTIONS);
    }

    /**
     * Create a detached, initialised SectionsRecord
     */
    public SectionsRecord(Integer id, Integer registrationNumber, Integer courseId, String sectionCode, String instructor, Integer sectionType, Integer sectionStatus, Integer associatedWith, Integer waitlistTotal, String sectionName, Float minUnits, Float maxUnits, String campus, String description, String notes, String instructionMode, String grading, String roomNumber, String prerequisites) {
        super(Sections.SECTIONS);

        set(0, id);
        set(1, registrationNumber);
        set(2, courseId);
        set(3, sectionCode);
        set(4, instructor);
        set(5, sectionType);
        set(6, sectionStatus);
        set(7, associatedWith);
        set(8, waitlistTotal);
        set(9, sectionName);
        set(10, minUnits);
        set(11, maxUnits);
        set(12, campus);
        set(13, description);
        set(14, notes);
        set(15, instructionMode);
        set(16, grading);
        set(17, roomNumber);
        set(18, prerequisites);
    }
}
