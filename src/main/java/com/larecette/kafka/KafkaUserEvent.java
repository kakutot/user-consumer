/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.larecette.kafka;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class KafkaUserEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1045655833231008449L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"KafkaUserEvent\",\"namespace\":\"com.larecette.kafka\",\"fields\":[{\"name\":\"userKafka\",\"type\":{\"type\":\"record\",\"name\":\"UserKafka\",\"fields\":[{\"name\":\"userId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"activity\",\"type\":\"int\"},{\"name\":\"blacklist\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"gender\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"height\",\"type\":\"double\"},{\"name\":\"weight\",\"type\":\"double\"},{\"name\":\"includeCooked\",\"type\":\"boolean\"}]}},{\"name\":\"eventType\",\"type\":{\"type\":\"enum\",\"name\":\"EventType\",\"symbols\":[\"CREATE\",\"UPDATE\",\"DELETE\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<KafkaUserEvent> ENCODER =
          new BinaryMessageEncoder<KafkaUserEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<KafkaUserEvent> DECODER =
          new BinaryMessageDecoder<KafkaUserEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<KafkaUserEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<KafkaUserEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<KafkaUserEvent>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this KafkaUserEvent to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a KafkaUserEvent from a ByteBuffer. */
  public static KafkaUserEvent fromByteBuffer(
          java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private UserKafka userKafka;
  private EventType eventType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public KafkaUserEvent() {}

  /**
   * All-args constructor.
   * @param userKafka The new value for userKafka
   * @param eventType The new value for eventType
   */
  public KafkaUserEvent(UserKafka userKafka, EventType eventType) {
    this.userKafka = userKafka;
    this.eventType = eventType;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0: return userKafka;
      case 1: return eventType;
      default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0: userKafka = (UserKafka)value$; break;
      case 1: eventType = (EventType)value$; break;
      default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'userKafka' field.
   * @return The value of the 'userKafka' field.
   */
  public UserKafka getUserKafka() {
    return userKafka;
  }

  /**
   * Sets the value of the 'userKafka' field.
   * @param value the value to set.
   */
  public void setUserKafka(UserKafka value) {
    this.userKafka = value;
  }

  /**
   * Gets the value of the 'eventType' field.
   * @return The value of the 'eventType' field.
   */
  public EventType getEventType() {
    return eventType;
  }

  /**
   * Sets the value of the 'eventType' field.
   * @param value the value to set.
   */
  public void setEventType(EventType value) {
    this.eventType = value;
  }

  /**
   * Creates a new KafkaUserEvent RecordBuilder.
   * @return A new KafkaUserEvent RecordBuilder
   */
  public static KafkaUserEvent.Builder newBuilder() {
    return new KafkaUserEvent.Builder();
  }

  /**
   * Creates a new KafkaUserEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new KafkaUserEvent RecordBuilder
   */
  public static KafkaUserEvent.Builder newBuilder(KafkaUserEvent.Builder other) {
    return new KafkaUserEvent.Builder(other);
  }

  /**
   * Creates a new KafkaUserEvent RecordBuilder by copying an existing KafkaUserEvent instance.
   * @param other The existing instance to copy.
   * @return A new KafkaUserEvent RecordBuilder
   */
  public static KafkaUserEvent.Builder newBuilder(KafkaUserEvent other) {
    return new KafkaUserEvent.Builder(other);
  }

  /**
   * RecordBuilder for KafkaUserEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<KafkaUserEvent>
          implements org.apache.avro.data.RecordBuilder<KafkaUserEvent> {

    private UserKafka userKafka;
    private UserKafka.Builder userKafkaBuilder;
    private EventType eventType;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(KafkaUserEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userKafka)) {
        this.userKafka = data().deepCopy(fields()[0].schema(), other.userKafka);
        fieldSetFlags()[0] = true;
      }
      if (other.hasUserKafkaBuilder()) {
        this.userKafkaBuilder = UserKafka.newBuilder(other.getUserKafkaBuilder());
      }
      if (isValidValue(fields()[1], other.eventType)) {
        this.eventType = data().deepCopy(fields()[1].schema(), other.eventType);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing KafkaUserEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(KafkaUserEvent other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.userKafka)) {
        this.userKafka = data().deepCopy(fields()[0].schema(), other.userKafka);
        fieldSetFlags()[0] = true;
      }
      this.userKafkaBuilder = null;
      if (isValidValue(fields()[1], other.eventType)) {
        this.eventType = data().deepCopy(fields()[1].schema(), other.eventType);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Gets the value of the 'userKafka' field.
     * @return The value.
     */
    public UserKafka getUserKafka() {
      return userKafka;
    }

    /**
     * Sets the value of the 'userKafka' field.
     * @param value The value of 'userKafka'.
     * @return This builder.
     */
    public KafkaUserEvent.Builder setUserKafka(UserKafka value) {
      validate(fields()[0], value);
      this.userKafkaBuilder = null;
      this.userKafka = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'userKafka' field has been set.
     * @return True if the 'userKafka' field has been set, false otherwise.
     */
    public boolean hasUserKafka() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'userKafka' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public UserKafka.Builder getUserKafkaBuilder() {
      if (userKafkaBuilder == null) {
        if (hasUserKafka()) {
          setUserKafkaBuilder(UserKafka.newBuilder(userKafka));
        } else {
          setUserKafkaBuilder(UserKafka.newBuilder());
        }
      }
      return userKafkaBuilder;
    }

    /**
     * Sets the Builder instance for the 'userKafka' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public KafkaUserEvent.Builder setUserKafkaBuilder(UserKafka.Builder value) {
      clearUserKafka();
      userKafkaBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'userKafka' field has an active Builder instance
     * @return True if the 'userKafka' field has an active Builder instance
     */
    public boolean hasUserKafkaBuilder() {
      return userKafkaBuilder != null;
    }

    /**
     * Clears the value of the 'userKafka' field.
     * @return This builder.
     */
    public KafkaUserEvent.Builder clearUserKafka() {
      userKafka = null;
      userKafkaBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'eventType' field.
     * @return The value.
     */
    public EventType getEventType() {
      return eventType;
    }

    /**
     * Sets the value of the 'eventType' field.
     * @param value The value of 'eventType'.
     * @return This builder.
     */
    public KafkaUserEvent.Builder setEventType(EventType value) {
      validate(fields()[1], value);
      this.eventType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'eventType' field has been set.
     * @return True if the 'eventType' field has been set, false otherwise.
     */
    public boolean hasEventType() {
      return fieldSetFlags()[1];
    }


    /**
     * Clears the value of the 'eventType' field.
     * @return This builder.
     */
    public KafkaUserEvent.Builder clearEventType() {
      eventType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public KafkaUserEvent build() {
      try {
        KafkaUserEvent record = new KafkaUserEvent();
        if (userKafkaBuilder != null) {
          record.userKafka = this.userKafkaBuilder.build();
        } else {
          record.userKafka = fieldSetFlags()[0] ? this.userKafka : (UserKafka) defaultValue(fields()[0]);
        }
        record.eventType = fieldSetFlags()[1] ? this.eventType : (EventType) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<KafkaUserEvent>
          WRITER$ = (org.apache.avro.io.DatumWriter<KafkaUserEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<KafkaUserEvent>
          READER$ = (org.apache.avro.io.DatumReader<KafkaUserEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
          throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
