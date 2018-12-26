// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base/v1/base.proto

package com.didiyun.base.v1;

/**
 * <pre>
 *公共的错误信息返回
 * </pre>
 *
 * Protobuf type {@code didi.cloud.base.v1.Error}
 */
public  final class Error extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.base.v1.Error)
    ErrorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Error.newBuilder() to construct.
  private Error(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Error() {
    errno_ = 0;
    errmsg_ = "";
    requestId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Error(
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

            errno_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            errmsg_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            requestId_ = s;
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
    return com.didiyun.base.v1.Base.internal_static_didi_cloud_base_v1_Error_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.base.v1.Base.internal_static_didi_cloud_base_v1_Error_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.base.v1.Error.class, com.didiyun.base.v1.Error.Builder.class);
  }

  public static final int ERRNO_FIELD_NUMBER = 1;
  private int errno_;
  /**
   * <pre>
   *错误码
   * </pre>
   *
   * <code>int32 errno = 1;</code>
   */
  public int getErrno() {
    return errno_;
  }

  public static final int ERRMSG_FIELD_NUMBER = 2;
  private volatile java.lang.Object errmsg_;
  /**
   * <pre>
   *错误信息
   * </pre>
   *
   * <code>string errmsg = 2;</code>
   */
  public java.lang.String getErrmsg() {
    java.lang.Object ref = errmsg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errmsg_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *错误信息
   * </pre>
   *
   * <code>string errmsg = 2;</code>
   */
  public com.google.protobuf.ByteString
      getErrmsgBytes() {
    java.lang.Object ref = errmsg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errmsg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUESTID_FIELD_NUMBER = 3;
  private volatile java.lang.Object requestId_;
  /**
   * <pre>
   *请求ID
   * </pre>
   *
   * <code>string requestId = 3;</code>
   */
  public java.lang.String getRequestId() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *请求ID
   * </pre>
   *
   * <code>string requestId = 3;</code>
   */
  public com.google.protobuf.ByteString
      getRequestIdBytes() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      requestId_ = b;
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
    if (errno_ != 0) {
      output.writeInt32(1, errno_);
    }
    if (!getErrmsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errmsg_);
    }
    if (!getRequestIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, requestId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (errno_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, errno_);
    }
    if (!getErrmsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errmsg_);
    }
    if (!getRequestIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, requestId_);
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
    if (!(obj instanceof com.didiyun.base.v1.Error)) {
      return super.equals(obj);
    }
    com.didiyun.base.v1.Error other = (com.didiyun.base.v1.Error) obj;

    boolean result = true;
    result = result && (getErrno()
        == other.getErrno());
    result = result && getErrmsg()
        .equals(other.getErrmsg());
    result = result && getRequestId()
        .equals(other.getRequestId());
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
    hash = (37 * hash) + ERRNO_FIELD_NUMBER;
    hash = (53 * hash) + getErrno();
    hash = (37 * hash) + ERRMSG_FIELD_NUMBER;
    hash = (53 * hash) + getErrmsg().hashCode();
    hash = (37 * hash) + REQUESTID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.base.v1.Error parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.base.v1.Error parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.base.v1.Error parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.base.v1.Error parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.base.v1.Error parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.base.v1.Error parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.base.v1.Error parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.base.v1.Error parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.base.v1.Error parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.base.v1.Error parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.base.v1.Error parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.base.v1.Error parseFrom(
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
  public static Builder newBuilder(com.didiyun.base.v1.Error prototype) {
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
   * <pre>
   *公共的错误信息返回
   * </pre>
   *
   * Protobuf type {@code didi.cloud.base.v1.Error}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.base.v1.Error)
      com.didiyun.base.v1.ErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.base.v1.Base.internal_static_didi_cloud_base_v1_Error_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.base.v1.Base.internal_static_didi_cloud_base_v1_Error_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.base.v1.Error.class, com.didiyun.base.v1.Error.Builder.class);
    }

    // Construct using com.didiyun.base.v1.Error.newBuilder()
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
      errno_ = 0;

      errmsg_ = "";

      requestId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.base.v1.Base.internal_static_didi_cloud_base_v1_Error_descriptor;
    }

    @java.lang.Override
    public com.didiyun.base.v1.Error getDefaultInstanceForType() {
      return com.didiyun.base.v1.Error.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.base.v1.Error build() {
      com.didiyun.base.v1.Error result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.base.v1.Error buildPartial() {
      com.didiyun.base.v1.Error result = new com.didiyun.base.v1.Error(this);
      result.errno_ = errno_;
      result.errmsg_ = errmsg_;
      result.requestId_ = requestId_;
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
      if (other instanceof com.didiyun.base.v1.Error) {
        return mergeFrom((com.didiyun.base.v1.Error)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.base.v1.Error other) {
      if (other == com.didiyun.base.v1.Error.getDefaultInstance()) return this;
      if (other.getErrno() != 0) {
        setErrno(other.getErrno());
      }
      if (!other.getErrmsg().isEmpty()) {
        errmsg_ = other.errmsg_;
        onChanged();
      }
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
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
      com.didiyun.base.v1.Error parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.base.v1.Error) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int errno_ ;
    /**
     * <pre>
     *错误码
     * </pre>
     *
     * <code>int32 errno = 1;</code>
     */
    public int getErrno() {
      return errno_;
    }
    /**
     * <pre>
     *错误码
     * </pre>
     *
     * <code>int32 errno = 1;</code>
     */
    public Builder setErrno(int value) {
      
      errno_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *错误码
     * </pre>
     *
     * <code>int32 errno = 1;</code>
     */
    public Builder clearErrno() {
      
      errno_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object errmsg_ = "";
    /**
     * <pre>
     *错误信息
     * </pre>
     *
     * <code>string errmsg = 2;</code>
     */
    public java.lang.String getErrmsg() {
      java.lang.Object ref = errmsg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errmsg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *错误信息
     * </pre>
     *
     * <code>string errmsg = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrmsgBytes() {
      java.lang.Object ref = errmsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errmsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *错误信息
     * </pre>
     *
     * <code>string errmsg = 2;</code>
     */
    public Builder setErrmsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errmsg_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *错误信息
     * </pre>
     *
     * <code>string errmsg = 2;</code>
     */
    public Builder clearErrmsg() {
      
      errmsg_ = getDefaultInstance().getErrmsg();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *错误信息
     * </pre>
     *
     * <code>string errmsg = 2;</code>
     */
    public Builder setErrmsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errmsg_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object requestId_ = "";
    /**
     * <pre>
     *请求ID
     * </pre>
     *
     * <code>string requestId = 3;</code>
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *请求ID
     * </pre>
     *
     * <code>string requestId = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *请求ID
     * </pre>
     *
     * <code>string requestId = 3;</code>
     */
    public Builder setRequestId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      requestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *请求ID
     * </pre>
     *
     * <code>string requestId = 3;</code>
     */
    public Builder clearRequestId() {
      
      requestId_ = getDefaultInstance().getRequestId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *请求ID
     * </pre>
     *
     * <code>string requestId = 3;</code>
     */
    public Builder setRequestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      requestId_ = value;
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


    // @@protoc_insertion_point(builder_scope:didi.cloud.base.v1.Error)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.base.v1.Error)
  private static final com.didiyun.base.v1.Error DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.base.v1.Error();
  }

  public static com.didiyun.base.v1.Error getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Error>
      PARSER = new com.google.protobuf.AbstractParser<Error>() {
    @java.lang.Override
    public Error parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Error(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Error> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Error> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.base.v1.Error getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
