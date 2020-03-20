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
public class UserCookedRecipeKafka extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6775579521113248562L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserCookedRecipeKafka\",\"namespace\":\"com.larecette.kafka\",\"fields\":[{\"name\":\"userId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"recipeId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"createdAt\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UserCookedRecipeKafka> ENCODER =
      new BinaryMessageEncoder<UserCookedRecipeKafka>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UserCookedRecipeKafka> DECODER =
      new BinaryMessageDecoder<UserCookedRecipeKafka>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<UserCookedRecipeKafka> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<UserCookedRecipeKafka> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<UserCookedRecipeKafka>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this UserCookedRecipeKafka to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a UserCookedRecipeKafka from a ByteBuffer. */
  public static UserCookedRecipeKafka fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private String userId;
   private String recipeId;
   private String createdAt;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserCookedRecipeKafka() {}

  /**
   * All-args constructor.
   * @param userId The new value for userId
   * @param recipeId The new value for recipeId
   * @param createdAt The new value for createdAt
   */
  public UserCookedRecipeKafka(String userId, String recipeId, String createdAt) {
    this.userId = userId;
    this.recipeId = recipeId;
    this.createdAt = createdAt;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return userId;
    case 1: return recipeId;
    case 2: return createdAt;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: userId = (String)value$; break;
    case 1: recipeId = (String)value$; break;
    case 2: createdAt = (String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public String getUserId() {
    return userId;
  }

  /**
   * Sets the value of the 'userId' field.
   * @param value the value to set.
   */
  public void setUserId(String value) {
    this.userId = value;
  }

  /**
   * Gets the value of the 'recipeId' field.
   * @return The value of the 'recipeId' field.
   */
  public String getRecipeId() {
    return recipeId;
  }

  /**
   * Sets the value of the 'recipeId' field.
   * @param value the value to set.
   */
  public void setRecipeId(String value) {
    this.recipeId = value;
  }

  /**
   * Gets the value of the 'createdAt' field.
   * @return The value of the 'createdAt' field.
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the value of the 'createdAt' field.
   * @param value the value to set.
   */
  public void setCreatedAt(String value) {
    this.createdAt = value;
  }

  /**
   * Creates a new UserCookedRecipeKafka RecordBuilder.
   * @return A new UserCookedRecipeKafka RecordBuilder
   */
  public static UserCookedRecipeKafka.Builder newBuilder() {
    return new UserCookedRecipeKafka.Builder();
  }

  /**
   * Creates a new UserCookedRecipeKafka RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserCookedRecipeKafka RecordBuilder
   */
  public static UserCookedRecipeKafka.Builder newBuilder(UserCookedRecipeKafka.Builder other) {
    return new UserCookedRecipeKafka.Builder(other);
  }

  /**
   * Creates a new UserCookedRecipeKafka RecordBuilder by copying an existing UserCookedRecipeKafka instance.
   * @param other The existing instance to copy.
   * @return A new UserCookedRecipeKafka RecordBuilder
   */
  public static UserCookedRecipeKafka.Builder newBuilder(UserCookedRecipeKafka other) {
    return new UserCookedRecipeKafka.Builder(other);
  }

  /**
   * RecordBuilder for UserCookedRecipeKafka instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserCookedRecipeKafka>
    implements org.apache.avro.data.RecordBuilder<UserCookedRecipeKafka> {

    private String userId;
    private String recipeId;
    private String createdAt;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(UserCookedRecipeKafka.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = data().deepCopy(fields()[0].schema(), other.userId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.recipeId)) {
        this.recipeId = data().deepCopy(fields()[1].schema(), other.recipeId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[2].schema(), other.createdAt);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing UserCookedRecipeKafka instance
     * @param other The existing instance to copy.
     */
    private Builder(UserCookedRecipeKafka other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = data().deepCopy(fields()[0].schema(), other.userId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.recipeId)) {
        this.recipeId = data().deepCopy(fields()[1].schema(), other.recipeId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[2].schema(), other.createdAt);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public String getUserId() {
      return userId;
    }

    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public UserCookedRecipeKafka.Builder setUserId(String value) {
      validate(fields()[0], value);
      this.userId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public UserCookedRecipeKafka.Builder clearUserId() {
      userId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'recipeId' field.
      * @return The value.
      */
    public String getRecipeId() {
      return recipeId;
    }

    /**
      * Sets the value of the 'recipeId' field.
      * @param value The value of 'recipeId'.
      * @return This builder.
      */
    public UserCookedRecipeKafka.Builder setRecipeId(String value) {
      validate(fields()[1], value);
      this.recipeId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'recipeId' field has been set.
      * @return True if the 'recipeId' field has been set, false otherwise.
      */
    public boolean hasRecipeId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'recipeId' field.
      * @return This builder.
      */
    public UserCookedRecipeKafka.Builder clearRecipeId() {
      recipeId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'createdAt' field.
      * @return The value.
      */
    public String getCreatedAt() {
      return createdAt;
    }

    /**
      * Sets the value of the 'createdAt' field.
      * @param value The value of 'createdAt'.
      * @return This builder.
      */
    public UserCookedRecipeKafka.Builder setCreatedAt(String value) {
      validate(fields()[2], value);
      this.createdAt = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'createdAt' field has been set.
      * @return True if the 'createdAt' field has been set, false otherwise.
      */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'createdAt' field.
      * @return This builder.
      */
    public UserCookedRecipeKafka.Builder clearCreatedAt() {
      createdAt = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UserCookedRecipeKafka build() {
      try {
        UserCookedRecipeKafka record = new UserCookedRecipeKafka();
        record.userId = fieldSetFlags()[0] ? this.userId : (String) defaultValue(fields()[0]);
        record.recipeId = fieldSetFlags()[1] ? this.recipeId : (String) defaultValue(fields()[1]);
        record.createdAt = fieldSetFlags()[2] ? this.createdAt : (String) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UserCookedRecipeKafka>
    WRITER$ = (org.apache.avro.io.DatumWriter<UserCookedRecipeKafka>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UserCookedRecipeKafka>
    READER$ = (org.apache.avro.io.DatumReader<UserCookedRecipeKafka>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
