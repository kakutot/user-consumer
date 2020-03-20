package com.larecette.kafka;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum EventType {
  CREATE, DELETE, UPDATE,  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"com.larecette.kafka.EventType\",\"namespace\":\"com.larecette.kafka\",\"symbols\":[\"CREATE\",\"UPDATE\",\"DELETE\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
