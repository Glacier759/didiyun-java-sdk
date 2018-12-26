// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill/v1/bill.proto

package com.didiyun.bill.v1;

/**
 * Protobuf type {@code didi.cloud.bill.v1.EipSpec}
 */
public  final class EipSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.bill.v1.EipSpec)
    EipSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EipSpec.newBuilder() to construct.
  private EipSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EipSpec() {
    bandwidth_ = 0L;
    chargeType_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EipSpec(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            bandwidth_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            chargeType_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_EipSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_EipSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.bill.v1.EipSpec.class, com.didiyun.bill.v1.EipSpec.Builder.class);
  }

  public static final int BANDWIDTH_FIELD_NUMBER = 1;
  private long bandwidth_;
  /**
   * <pre>
   *带宽
   * </pre>
   *
   * <code>int64 bandwidth = 1;</code>
   */
  public long getBandwidth() {
    return bandwidth_;
  }

  public static final int CHARGETYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object chargeType_;
  /**
   * <pre>
   *计费类型 ("bandwidth"为按带宽计费，"flow"为按流量计费)
   * </pre>
   *
   * <code>string chargeType = 2;</code>
   */
  public java.lang.String getChargeType() {
    java.lang.Object ref = chargeType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      chargeType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *计费类型 ("bandwidth"为按带宽计费，"flow"为按流量计费)
   * </pre>
   *
   * <code>string chargeType = 2;</code>
   */
  public com.google.protobuf.ByteString
      getChargeTypeBytes() {
    java.lang.Object ref = chargeType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      chargeType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (bandwidth_ != 0L) {
      output.writeInt64(1, bandwidth_);
    }
    if (!getChargeTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, chargeType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bandwidth_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, bandwidth_);
    }
    if (!getChargeTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, chargeType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.didiyun.bill.v1.EipSpec)) {
      return super.equals(obj);
    }
    com.didiyun.bill.v1.EipSpec other = (com.didiyun.bill.v1.EipSpec) obj;

    boolean result = true;
    result = result && (getBandwidth()
        == other.getBandwidth());
    result = result && getChargeType()
        .equals(other.getChargeType());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BANDWIDTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBandwidth());
    hash = (37 * hash) + CHARGETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getChargeType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.bill.v1.EipSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.EipSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.EipSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.EipSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.EipSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.EipSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.EipSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.EipSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.bill.v1.EipSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.EipSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.bill.v1.EipSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.EipSpec parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.didiyun.bill.v1.EipSpec prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code didi.cloud.bill.v1.EipSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.bill.v1.EipSpec)
      com.didiyun.bill.v1.EipSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_EipSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_EipSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.bill.v1.EipSpec.class, com.didiyun.bill.v1.EipSpec.Builder.class);
    }

    // Construct using com.didiyun.bill.v1.EipSpec.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bandwidth_ = 0L;

      chargeType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_EipSpec_descriptor;
    }

    @java.lang.Override
    public com.didiyun.bill.v1.EipSpec getDefaultInstanceForType() {
      return com.didiyun.bill.v1.EipSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.bill.v1.EipSpec build() {
      com.didiyun.bill.v1.EipSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.bill.v1.EipSpec buildPartial() {
      com.didiyun.bill.v1.EipSpec result = new com.didiyun.bill.v1.EipSpec(this);
      result.bandwidth_ = bandwidth_;
      result.chargeType_ = chargeType_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.didiyun.bill.v1.EipSpec) {
        return mergeFrom((com.didiyun.bill.v1.EipSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.bill.v1.EipSpec other) {
      if (other == com.didiyun.bill.v1.EipSpec.getDefaultInstance()) return this;
      if (other.getBandwidth() != 0L) {
        setBandwidth(other.getBandwidth());
      }
      if (!other.getChargeType().isEmpty()) {
        chargeType_ = other.chargeType_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.didiyun.bill.v1.EipSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.bill.v1.EipSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long bandwidth_ ;
    /**
     * <pre>
     *带宽
     * </pre>
     *
     * <code>int64 bandwidth = 1;</code>
     */
    public long getBandwidth() {
      return bandwidth_;
    }
    /**
     * <pre>
     *带宽
     * </pre>
     *
     * <code>int64 bandwidth = 1;</code>
     */
    public Builder setBandwidth(long value) {
      
      bandwidth_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *带宽
     * </pre>
     *
     * <code>int64 bandwidth = 1;</code>
     */
    public Builder clearBandwidth() {
      
      bandwidth_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object chargeType_ = "";
    /**
     * <pre>
     *计费类型 ("bandwidth"为按带宽计费，"flow"为按流量计费)
     * </pre>
     *
     * <code>string chargeType = 2;</code>
     */
    public java.lang.String getChargeType() {
      java.lang.Object ref = chargeType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        chargeType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *计费类型 ("bandwidth"为按带宽计费，"flow"为按流量计费)
     * </pre>
     *
     * <code>string chargeType = 2;</code>
     */
    public com.google.protobuf.ByteString
        getChargeTypeBytes() {
      java.lang.Object ref = chargeType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        chargeType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *计费类型 ("bandwidth"为按带宽计费，"flow"为按流量计费)
     * </pre>
     *
     * <code>string chargeType = 2;</code>
     */
    public Builder setChargeType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      chargeType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *计费类型 ("bandwidth"为按带宽计费，"flow"为按流量计费)
     * </pre>
     *
     * <code>string chargeType = 2;</code>
     */
    public Builder clearChargeType() {
      
      chargeType_ = getDefaultInstance().getChargeType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *计费类型 ("bandwidth"为按带宽计费，"flow"为按流量计费)
     * </pre>
     *
     * <code>string chargeType = 2;</code>
     */
    public Builder setChargeTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      chargeType_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:didi.cloud.bill.v1.EipSpec)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.bill.v1.EipSpec)
  private static final com.didiyun.bill.v1.EipSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.bill.v1.EipSpec();
  }

  public static com.didiyun.bill.v1.EipSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EipSpec>
      PARSER = new com.google.protobuf.AbstractParser<EipSpec>() {
    @java.lang.Override
    public EipSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EipSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EipSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EipSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.bill.v1.EipSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

