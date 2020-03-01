/*
 * This file is generated by jOOQ.
 */
package database.generated.tables.records;


import database.generated.tables.Epochs;

import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpochsRecord extends UpdatableRecordImpl<EpochsRecord> implements Record4<Integer, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = -1298688238;

    /**
     * Setter for <code>epochs.id</code>.
     */
    public EpochsRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>epochs.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>epochs.started_at</code>.
     */
    public EpochsRecord setStartedAt(Timestamp value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>epochs.started_at</code>.
     */
    public Timestamp getStartedAt() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>epochs.completed_at</code>.
     */
    public EpochsRecord setCompletedAt(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>epochs.completed_at</code>.
     */
    public Timestamp getCompletedAt() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>epochs.term_id</code>.
     */
    public EpochsRecord setTermId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>epochs.term_id</code>.
     */
    public Integer getTermId() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Epochs.EPOCHS.ID;
    }

    @Override
    public Field<Timestamp> field2() {
        return Epochs.EPOCHS.STARTED_AT;
    }

    @Override
    public Field<Timestamp> field3() {
        return Epochs.EPOCHS.COMPLETED_AT;
    }

    @Override
    public Field<Integer> field4() {
        return Epochs.EPOCHS.TERM_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Timestamp component2() {
        return getStartedAt();
    }

    @Override
    public Timestamp component3() {
        return getCompletedAt();
    }

    @Override
    public Integer component4() {
        return getTermId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Timestamp value2() {
        return getStartedAt();
    }

    @Override
    public Timestamp value3() {
        return getCompletedAt();
    }

    @Override
    public Integer value4() {
        return getTermId();
    }

    @Override
    public EpochsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public EpochsRecord value2(Timestamp value) {
        setStartedAt(value);
        return this;
    }

    @Override
    public EpochsRecord value3(Timestamp value) {
        setCompletedAt(value);
        return this;
    }

    @Override
    public EpochsRecord value4(Integer value) {
        setTermId(value);
        return this;
    }

    @Override
    public EpochsRecord values(Integer value1, Timestamp value2, Timestamp value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EpochsRecord
     */
    public EpochsRecord() {
        super(Epochs.EPOCHS);
    }

    /**
     * Create a detached, initialised EpochsRecord
     */
    public EpochsRecord(Integer id, Timestamp startedAt, Timestamp completedAt, Integer termId) {
        super(Epochs.EPOCHS);

        set(0, id);
        set(1, startedAt);
        set(2, completedAt);
        set(3, termId);
    }
}
