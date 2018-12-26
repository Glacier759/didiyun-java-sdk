// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/sg.proto

package com.didiyun.compute.v1;

/**
 * Protobuf type {@code didi.cloud.compute.v1.GetSgRuleTotalCntRequest}
 */
public  final class GetSgRuleTotalCntRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.compute.v1.GetSgRuleTotalCntRequest)
    GetSgRuleTotalCntRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSgRuleTotalCntRequest.newBuilder() to construct.
  private GetSgRuleTotalCntRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSgRuleTotalCntRequest() {
    sgUuid_ = "";
    dc2Uuid_ = "";
    type_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetSgRuleTotalCntRequest(
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
            com.didiyun.base.v1.Header.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(com.didiyun.base.v1.Header.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            sgUuid_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            dc2Uuid_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
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
    return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_GetSgRuleTotalCntRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_GetSgRuleTotalCntRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.compute.v1.GetSgRuleTotalCntRequest.class, com.didiyun.compute.v1.GetSgRuleTotalCntRequest.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private com.didiyun.base.v1.Header header_;
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public com.didiyun.base.v1.Header getHeader() {
    return header_ == null ? com.didiyun.base.v1.Header.getDefaultInstance() : header_;
  }
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int SGUUID_FIELD_NUMBER = 2;
  private volatile java.lang.Object sgUuid_;
  /**
   * <pre>
   *查看此SG下的SGRule数量
   * </pre>
   *
   * <code>string sgUuid = 2;</code>
   */
  public java.lang.String getSgUuid() {
    java.lang.Object ref = sgUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sgUuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *查看此SG下的SGRule数量
   * </pre>
   *
   * <code>string sgUuid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSgUuidBytes() {
    java.lang.Object ref = sgUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sgUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DC2UUID_FIELD_NUMBER = 3;
  private volatile java.lang.Object dc2Uuid_;
  /**
   * <pre>
   *查看此DC2遵循的SGRule数量
   * </pre>
   *
   * <code>string dc2Uuid = 3;</code>
   */
  public java.lang.String getDc2Uuid() {
    java.lang.Object ref = dc2Uuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dc2Uuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *查看此DC2遵循的SGRule数量
   * </pre>
   *
   * <code>string dc2Uuid = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDc2UuidBytes() {
    java.lang.Object ref = dc2Uuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dc2Uuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object type_;
  /**
   * <pre>
   *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
   * </pre>
   *
   * <code>string type = 4;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
   * </pre>
   *
   * <code>string type = 4;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (!getSgUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sgUuid_);
    }
    if (!getDc2UuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dc2Uuid_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (!getSgUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sgUuid_);
    }
    if (!getDc2UuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dc2Uuid_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, type_);
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
    if (!(obj instanceof com.didiyun.compute.v1.GetSgRuleTotalCntRequest)) {
      return super.equals(obj);
    }
    com.didiyun.compute.v1.GetSgRuleTotalCntRequest other = (com.didiyun.compute.v1.GetSgRuleTotalCntRequest) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && getSgUuid()
        .equals(other.getSgUuid());
    result = result && getDc2Uuid()
        .equals(other.getDc2Uuid());
    result = result && getType()
        .equals(other.getType());
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    hash = (37 * hash) + SGUUID_FIELD_NUMBER;
    hash = (53 * hash) + getSgUuid().hashCode();
    hash = (37 * hash) + DC2UUID_FIELD_NUMBER;
    hash = (53 * hash) + getDc2Uuid().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.compute.v1.GetSgRuleTotalCntRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.GetSgRuleTotalCntRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetSgRuleTotalCntRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.GetSgRuleTotalCntRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetSgRuleTotalCntRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.GetSgRuleTotalCntRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetSgRuleTotalCntRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.GetSgRuleTotalCntRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetSgRuleTotalCntRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.GetSgRuleTotalCntRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetSgRuleTotalCntRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.GetSgRuleTotalCntRequest parseFrom(
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
  public static Builder newBuilder(com.didiyun.compute.v1.GetSgRuleTotalCntRequest prototype) {
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
   * Protobuf type {@code didi.cloud.compute.v1.GetSgRuleTotalCntRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.compute.v1.GetSgRuleTotalCntRequest)
      com.didiyun.compute.v1.GetSgRuleTotalCntRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_GetSgRuleTotalCntRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_GetSgRuleTotalCntRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.compute.v1.GetSgRuleTotalCntRequest.class, com.didiyun.compute.v1.GetSgRuleTotalCntRequest.Builder.class);
    }

    // Construct using com.didiyun.compute.v1.GetSgRuleTotalCntRequest.newBuilder()
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
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      sgUuid_ = "";

      dc2Uuid_ = "";

      type_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_GetSgRuleTotalCntRequest_descriptor;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.GetSgRuleTotalCntRequest getDefaultInstanceForType() {
      return com.didiyun.compute.v1.GetSgRuleTotalCntRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.compute.v1.GetSgRuleTotalCntRequest build() {
      com.didiyun.compute.v1.GetSgRuleTotalCntRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.GetSgRuleTotalCntRequest buildPartial() {
      com.didiyun.compute.v1.GetSgRuleTotalCntRequest result = new com.didiyun.compute.v1.GetSgRuleTotalCntRequest(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.sgUuid_ = sgUuid_;
      result.dc2Uuid_ = dc2Uuid_;
      result.type_ = type_;
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
      if (other instanceof com.didiyun.compute.v1.GetSgRuleTotalCntRequest) {
        return mergeFrom((com.didiyun.compute.v1.GetSgRuleTotalCntRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.compute.v1.GetSgRuleTotalCntRequest other) {
      if (other == com.didiyun.compute.v1.GetSgRuleTotalCntRequest.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (!other.getSgUuid().isEmpty()) {
        sgUuid_ = other.sgUuid_;
        onChanged();
      }
      if (!other.getDc2Uuid().isEmpty()) {
        dc2Uuid_ = other.dc2Uuid_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
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
      com.didiyun.compute.v1.GetSgRuleTotalCntRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.compute.v1.GetSgRuleTotalCntRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.didiyun.base.v1.Header header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder> headerBuilder_;
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.Header getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.didiyun.base.v1.Header.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder setHeader(com.didiyun.base.v1.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder setHeader(
        com.didiyun.base.v1.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder mergeHeader(com.didiyun.base.v1.Header value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            com.didiyun.base.v1.Header.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.Header.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.didiyun.base.v1.Header.getDefaultInstance() : header_;
      }
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private java.lang.Object sgUuid_ = "";
    /**
     * <pre>
     *查看此SG下的SGRule数量
     * </pre>
     *
     * <code>string sgUuid = 2;</code>
     */
    public java.lang.String getSgUuid() {
      java.lang.Object ref = sgUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sgUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *查看此SG下的SGRule数量
     * </pre>
     *
     * <code>string sgUuid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSgUuidBytes() {
      java.lang.Object ref = sgUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sgUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *查看此SG下的SGRule数量
     * </pre>
     *
     * <code>string sgUuid = 2;</code>
     */
    public Builder setSgUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sgUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查看此SG下的SGRule数量
     * </pre>
     *
     * <code>string sgUuid = 2;</code>
     */
    public Builder clearSgUuid() {
      
      sgUuid_ = getDefaultInstance().getSgUuid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查看此SG下的SGRule数量
     * </pre>
     *
     * <code>string sgUuid = 2;</code>
     */
    public Builder setSgUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sgUuid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dc2Uuid_ = "";
    /**
     * <pre>
     *查看此DC2遵循的SGRule数量
     * </pre>
     *
     * <code>string dc2Uuid = 3;</code>
     */
    public java.lang.String getDc2Uuid() {
      java.lang.Object ref = dc2Uuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dc2Uuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *查看此DC2遵循的SGRule数量
     * </pre>
     *
     * <code>string dc2Uuid = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDc2UuidBytes() {
      java.lang.Object ref = dc2Uuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dc2Uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *查看此DC2遵循的SGRule数量
     * </pre>
     *
     * <code>string dc2Uuid = 3;</code>
     */
    public Builder setDc2Uuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dc2Uuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查看此DC2遵循的SGRule数量
     * </pre>
     *
     * <code>string dc2Uuid = 3;</code>
     */
    public Builder clearDc2Uuid() {
      
      dc2Uuid_ = getDefaultInstance().getDc2Uuid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查看此DC2遵循的SGRule数量
     * </pre>
     *
     * <code>string dc2Uuid = 3;</code>
     */
    public Builder setDc2UuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dc2Uuid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
     * </pre>
     *
     * <code>string type = 4;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
     * </pre>
     *
     * <code>string type = 4;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
     * </pre>
     *
     * <code>string type = 4;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
     * </pre>
     *
     * <code>string type = 4;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
     * </pre>
     *
     * <code>string type = 4;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
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


    // @@protoc_insertion_point(builder_scope:didi.cloud.compute.v1.GetSgRuleTotalCntRequest)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.compute.v1.GetSgRuleTotalCntRequest)
  private static final com.didiyun.compute.v1.GetSgRuleTotalCntRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.compute.v1.GetSgRuleTotalCntRequest();
  }

  public static com.didiyun.compute.v1.GetSgRuleTotalCntRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSgRuleTotalCntRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetSgRuleTotalCntRequest>() {
    @java.lang.Override
    public GetSgRuleTotalCntRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetSgRuleTotalCntRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetSgRuleTotalCntRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSgRuleTotalCntRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.compute.v1.GetSgRuleTotalCntRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

