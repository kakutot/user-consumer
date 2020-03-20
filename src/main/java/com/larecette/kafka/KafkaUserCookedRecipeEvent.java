/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.larecette.kafka;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class KafkaUserCookedRecipeEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -9189769653722596177L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"KafkaUserCookedRecipeEvent\",\"namespace\":\"com.larecette.kafka\",\"fields\":[{\"name\":\"userCookedRecipeKafka\",\"type\":{\"type\":\"record\",\"name\":\"UserCookedRecipeKafka\",\"fields\":[{\"name\":\"userId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"recipeId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"createdAt\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"eventType\",\"type\":{\"type\":\"enum\",\"name\":\"EventType\",\"symbols\":[\"CREATE\",\"UPDATE\",\"DELETE\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<KafkaUserCookedRecipeEvent> ENCODER =
      new BinaryMessageEncoder<KafkaUserCookedRecipeEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<KafkaUserCookedRecipeEvent> DECODER =
      new BinaryMessageDecoder<KafkaUserCookedRecipeEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<KafkaUserCookedRecipeEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<KafkaUserCookedRecipeEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<KafkaUserCookedRecipeEvent>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this KafkaUserCookedRecipeEvent to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a KafkaUserCookedRecipeEvent from a ByteBuffer. */
  public static KafkaUserCookedRecipeEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private UserCookedRecipeKafka userCookedRecipeKafka;
   private EventType eventType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public KafkaUserCookedRecipeEvent() {}

  /**
   * All-args constructor.
   * @param userCookedRecipeKafka The new value for userCookedRecipeKafka
   * @param eventType The new value for eventType
   */
  public KafkaUserCookedRecipeEvent(UserCookedRecipeKafka userCookedRecipeKafka, EventType eventType) {
    this.userCookedRecipeKafka = userCookedRecipeKafka;
    this.eventType = eventType;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return userCookedRecipeKafka;
    case 1: return eventType;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: userCookedRecipeKafka = (UserCookedRecipeKafka)value$; break;
    case 1: eventType = (EventType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'userCookedRecipeKafka' field.
   * @return The value of the 'userCookedRecipeKafka' field.
   */
  public UserCookedRecipeKafka getUserCookedRecipeKafka() {
    return userCookedRecipeKafka;
  }

  /**
   * Sets the value of the 'userCookedRecipeKafka' field.
   * @param value the value to set.
   */
  public void setUserCookedRecipeKafka(UserCookedRecipeKafka value) {
    this.userCookedRecipeKafka = value;
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
   * Creates a new KafkaUserCookedRecipeEvent RecordBuilder.
   * @return A new KafkaUserCookedRecipeEvent RecordBuilder
   */
  public static KafkaUserCookedRecipeEvent.Builder newBuilder() {
    return new KafkaUserCookedRecipeEvent.Builder();
  }

  /**
   * Creates a new KafkaUserCookedRecipeEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new KafkaUserCookedRecipeEvent RecordBuilder
   */
  public static KafkaUserCookedRecipeEvent.Builder newBuilder(KafkaUserCookedRecipeEvent.Builder other) {
    return new KafkaUserCookedRecipeEvent.Builder(other);
  }

  /**
   * Creates a new KafkaUserCookedRecipeEvent RecordBuilder by copying an existing KafkaUserCookedRecipeEvent instance.
   * @param other The existing instance to copy.
   * @return A new KafkaUserCookedRecipeEvent RecordBuilder
   */
  public static KafkaUserCookedRecipeEvent.Builder newBuilder(KafkaUserCookedRecipeEvent other) {
    return new KafkaUserCookedRecipeEvent.Builder(other);
  }

  /**
   * RecordBuilder for KafkaUserCookedRecipeEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<KafkaUserCookedRecipeEvent>
    implements org.apache.avro.data.RecordBuilder<KafkaUserCookedRecipeEvent> {

    private UserCookedRecipeKafka userCookedRecipeKafka;
    private UserCookedRecipeKafka.Builder userCookedRecipeKafkaBuilder;
    private EventType eventType;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(KafkaUserCookedRecipeEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userCookedRecipeKafka)) {
        this.userCookedRecipeKafka = data().deepCopy(fields()[0].schema(), other.userCookedRecipeKafka);
        fieldSetFlags()[0] = true;
      }
      if (other.hasUserCookedRecipeKafkaBuilder()) {
        this.userCookedRecipeKafkaBuilder = UserCookedRecipeKafka.newBuilder(other.getUserCookedRecipeKafkaBuilder());
      }
      if (isValidValue(fields()[1], other.eventType)) {
        this.eventType = data().deepCopy(fields()[1].schema(), other.eventType);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing KafkaUserCookedRecipeEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(KafkaUserCookedRecipeEvent other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.userCookedRecipeKafka)) {
        this.userCookedRecipeKafka = data().deepCopy(fields()[0].schema(), other.userCookedRecipeKafka);
        fieldSetFlags()[0] = true;
      }
      this.userCookedRecipeKafkaBuilder = null;
      if (isValidValue(fields()[1], other.eventType)) {
        this.eventType = data().deepCopy(fields()[1].schema(), other.eventType);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'userCookedRecipeKafka' field.
      * @return The value.
      */
    public UserCookedRecipeKafka getUserCookedRecipeKafka() {
      return userCookedRecipeKafka;
    }

    /**
      * Sets the value of the 'userCookedRecipeKafka' field.
      * @param value The value of 'userCookedRecipeKafka'.
      * @return This builder.
      */
    public KafkaUserCookedRecipeEvent.Builder setUserCookedRecipeKafka(UserCookedRecipeKafka value) {
      validate(fields()[0], value);
      this.userCookedRecipeKafkaBuilder = null;
      this.userCookedRecipeKafka = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'userCookedRecipeKafka' field has been set.
      * @return True if the 'userCookedRecipeKafka' field has been set, false otherwise.
      */
    public boolean hasUserCookedRecipeKafka() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'userCookedRecipeKafka' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public UserCookedRecipeKafka.Builder getUserCookedRecipeKafkaBuilder() {
      if (userCookedRecipeKafkaBuilder == null) {
        if (hasUserCookedRecipeKafka()) {
          setUserCookedRecipeKafkaBuilder(UserCookedRecipeKafka.newBuilder(userCookedRecipeKafka));
        } else {
          setUserCookedRecipeKafkaBuilder(UserCookedRecipeKafka.newBuilder());
        }
      }
      return userCookedRecipeKafkaBuilder;
    }

    /**
     * Sets the Builder instance for the 'userCookedRecipeKafka' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public KafkaUserCookedRecipeEvent.Builder setUserCookedRecipeKafkaBuilder(UserCookedRecipeKafka.Builder value) {
      clearUserCookedRecipeKafka();
      userCookedRecipeKafkaBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'userCookedRecipeKafka' field has an active Builder instance
     * @return True if the 'userCookedRecipeKafka' field has an active Builder instance
     */
    public boolean hasUserCookedRecipeKafkaBuilder() {
      return userCookedRecipeKafkaBuilder != null;
    }

    /**
      * Clears the value of the 'userCookedRecipeKafka' field.
      * @return This builder.
      */
    public KafkaUserCookedRecipeEvent.Builder clearUserCookedRecipeKafka() {
      userCookedRecipeKafka = null;
      userCookedRecipeKafkaBuilder = null;
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
    public KafkaUserCookedRecipeEvent.Builder setEventType(EventType value) {
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
    public KafkaUserCookedRecipeEvent.Builder clearEventType() {
      eventType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public KafkaUserCookedRecipeEvent build() {
      try {
        KafkaUserCookedRecipeEvent record = new KafkaUserCookedRecipeEvent();
        if (userCookedRecipeKafkaBuilder != null) {
          record.userCookedRecipeKafka = this.userCookedRecipeKafkaBuilder.build();
        } else {
          record.userCookedRecipeKafka = fieldSetFlags()[0] ? this.userCookedRecipeKafka : (UserCookedRecipeKafka) defaultValue(fields()[0]);
        }
        record.eventType = fieldSetFlags()[1] ? this.eventType : (EventType) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<KafkaUserCookedRecipeEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<KafkaUserCookedRecipeEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<KafkaUserCookedRecipeEvent>
    READER$ = (org.apache.avro.io.DatumReader<KafkaUserCookedRecipeEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
