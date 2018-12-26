// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/vpc.proto

package com.didiyun.compute.v1;

/**
 * Protobuf type {@code didi.cloud.compute.v1.VpcAvailableCidr}
 */
public  final class VpcAvailableCidr extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.compute.v1.VpcAvailableCidr)
    VpcAvailableCidrOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VpcAvailableCidr.newBuilder() to construct.
  private VpcAvailableCidr(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VpcAvailableCidr() {
    availableCidr_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VpcAvailableCidr(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              availableCidr_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            availableCidr_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        availableCidr_ = availableCidr_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.compute.v1.VpcOuterClass.internal_static_didi_cloud_compute_v1_VpcAvailableCidr_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.compute.v1.VpcOuterClass.internal_static_didi_cloud_compute_v1_VpcAvailableCidr_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.compute.v1.VpcAvailableCidr.class, com.didiyun.compute.v1.VpcAvailableCidr.Builder.class);
  }

  public static final int AVAILABLECIDR_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList availableCidr_;
  /**
   * <pre>
   *可用网段
   * </pre>
   *
   * <code>repeated string availableCidr = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getAvailableCidrList() {
    return availableCidr_;
  }
  /**
   * <pre>
   *可用网段
   * </pre>
   *
   * <code>repeated string availableCidr = 1;</code>
   */
  public int getAvailableCidrCount() {
    return availableCidr_.size();
  }
  /**
   * <pre>
   *可用网段
   * </pre>
   *
   * <code>repeated string availableCidr = 1;</code>
   */
  public java.lang.String getAvailableCidr(int index) {
    return availableCidr_.get(index);
  }
  /**
   * <pre>
   *可用网段
   * </pre>
   *
   * <code>repeated string availableCidr = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAvailableCidrBytes(int index) {
    return availableCidr_.getByteString(index);
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
    for (int i = 0; i < availableCidr_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, availableCidr_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < availableCidr_.size(); i++) {
        dataSize += computeStringSizeNoTag(availableCidr_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAvailableCidrList().size();
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
    if (!(obj instanceof com.didiyun.compute.v1.VpcAvailableCidr)) {
      return super.equals(obj);
    }
    com.didiyun.compute.v1.VpcAvailableCidr other = (com.didiyun.compute.v1.VpcAvailableCidr) obj;

    boolean result = true;
    result = result && getAvailableCidrList()
        .equals(other.getAvailableCidrList());
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
    if (getAvailableCidrCount() > 0) {
      hash = (37 * hash) + AVAILABLECIDR_FIELD_NUMBER;
      hash = (53 * hash) + getAvailableCidrList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.compute.v1.VpcAvailableCidr parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.VpcAvailableCidr parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.VpcAvailableCidr parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.VpcAvailableCidr parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.VpcAvailableCidr parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.VpcAvailableCidr parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.VpcAvailableCidr parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.VpcAvailableCidr parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.VpcAvailableCidr parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.VpcAvailableCidr parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.VpcAvailableCidr parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.VpcAvailableCidr parseFrom(
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
  public static Builder newBuilder(com.didiyun.compute.v1.VpcAvailableCidr prototype) {
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
   * Protobuf type {@code didi.cloud.compute.v1.VpcAvailableCidr}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.compute.v1.VpcAvailableCidr)
      com.didiyun.compute.v1.VpcAvailableCidrOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.compute.v1.VpcOuterClass.internal_static_didi_cloud_compute_v1_VpcAvailableCidr_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.compute.v1.VpcOuterClass.internal_static_didi_cloud_compute_v1_VpcAvailableCidr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.compute.v1.VpcAvailableCidr.class, com.didiyun.compute.v1.VpcAvailableCidr.Builder.class);
    }

    // Construct using com.didiyun.compute.v1.VpcAvailableCidr.newBuilder()
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
      availableCidr_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.compute.v1.VpcOuterClass.internal_static_didi_cloud_compute_v1_VpcAvailableCidr_descriptor;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.VpcAvailableCidr getDefaultInstanceForType() {
      return com.didiyun.compute.v1.VpcAvailableCidr.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.compute.v1.VpcAvailableCidr build() {
      com.didiyun.compute.v1.VpcAvailableCidr result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.VpcAvailableCidr buildPartial() {
      com.didiyun.compute.v1.VpcAvailableCidr result = new com.didiyun.compute.v1.VpcAvailableCidr(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        availableCidr_ = availableCidr_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.availableCidr_ = availableCidr_;
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
      if (other instanceof com.didiyun.compute.v1.VpcAvailableCidr) {
        return mergeFrom((com.didiyun.compute.v1.VpcAvailableCidr)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.compute.v1.VpcAvailableCidr other) {
      if (other == com.didiyun.compute.v1.VpcAvailableCidr.getDefaultInstance()) return this;
      if (!other.availableCidr_.isEmpty()) {
        if (availableCidr_.isEmpty()) {
          availableCidr_ = other.availableCidr_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAvailableCidrIsMutable();
          availableCidr_.addAll(other.availableCidr_);
        }
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
      com.didiyun.compute.v1.VpcAvailableCidr parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.compute.v1.VpcAvailableCidr) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList availableCidr_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAvailableCidrIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        availableCidr_ = new com.google.protobuf.LazyStringArrayList(availableCidr_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     *可用网段
     * </pre>
     *
     * <code>repeated string availableCidr = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getAvailableCidrList() {
      return availableCidr_.getUnmodifiableView();
    }
    /**
     * <pre>
     *可用网段
     * </pre>
     *
     * <code>repeated string availableCidr = 1;</code>
     */
    public int getAvailableCidrCount() {
      return availableCidr_.size();
    }
    /**
     * <pre>
     *可用网段
     * </pre>
     *
     * <code>repeated string availableCidr = 1;</code>
     */
    public java.lang.String getAvailableCidr(int index) {
      return availableCidr_.get(index);
    }
    /**
     * <pre>
     *可用网段
     * </pre>
     *
     * <code>repeated string availableCidr = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAvailableCidrBytes(int index) {
      return availableCidr_.getByteString(index);
    }
    /**
     * <pre>
     *可用网段
     * </pre>
     *
     * <code>repeated string availableCidr = 1;</code>
     */
    public Builder setAvailableCidr(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAvailableCidrIsMutable();
      availableCidr_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *可用网段
     * </pre>
     *
     * <code>repeated string availableCidr = 1;</code>
     */
    public Builder addAvailableCidr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAvailableCidrIsMutable();
      availableCidr_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *可用网段
     * </pre>
     *
     * <code>repeated string availableCidr = 1;</code>
     */
    public Builder addAllAvailableCidr(
        java.lang.Iterable<java.lang.String> values) {
      ensureAvailableCidrIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, availableCidr_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *可用网段
     * </pre>
     *
     * <code>repeated string availableCidr = 1;</code>
     */
    public Builder clearAvailableCidr() {
      availableCidr_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *可用网段
     * </pre>
     *
     * <code>repeated string availableCidr = 1;</code>
     */
    public Builder addAvailableCidrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAvailableCidrIsMutable();
      availableCidr_.add(value);
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


    // @@protoc_insertion_point(builder_scope:didi.cloud.compute.v1.VpcAvailableCidr)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.compute.v1.VpcAvailableCidr)
  private static final com.didiyun.compute.v1.VpcAvailableCidr DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.compute.v1.VpcAvailableCidr();
  }

  public static com.didiyun.compute.v1.VpcAvailableCidr getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VpcAvailableCidr>
      PARSER = new com.google.protobuf.AbstractParser<VpcAvailableCidr>() {
    @java.lang.Override
    public VpcAvailableCidr parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VpcAvailableCidr(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VpcAvailableCidr> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VpcAvailableCidr> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.compute.v1.VpcAvailableCidr getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
