// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base/v1/base.proto

package com.didiyun.base.v1;

/**
 * <pre>
 *任务返回定义
 * </pre>
 *
 * Protobuf type {@code didi.cloud.base.v1.JobInfo}
 */
public  final class JobInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.base.v1.JobInfo)
    JobInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobInfo.newBuilder() to construct.
  private JobInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobInfo() {
    jobUuid_ = "";
    resourceUuid_ = "";
    progress_ = 0D;
    type_ = "";
    done_ = false;
    success_ = false;
    result_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JobInfo(
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

            jobUuid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceUuid_ = s;
            break;
          }
          case 25: {

            progress_ = input.readDouble();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 40: {

            done_ = input.readBool();
            break;
          }
          case 48: {

            success_ = input.readBool();
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            result_ = s;
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
    return com.didiyun.base.v1.Base.internal_static_didi_cloud_base_v1_JobInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.base.v1.Base.internal_static_didi_cloud_base_v1_JobInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.base.v1.JobInfo.class, com.didiyun.base.v1.JobInfo.Builder.class);
  }

  public static final int JOBUUID_FIELD_NUMBER = 1;
  private volatile java.lang.Object jobUuid_;
  /**
   * <pre>
   *任务Uuid
   * </pre>
   *
   * <code>string jobUuid = 1;</code>
   */
  public java.lang.String getJobUuid() {
    java.lang.Object ref = jobUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobUuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *任务Uuid
   * </pre>
   *
   * <code>string jobUuid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getJobUuidBytes() {
    java.lang.Object ref = jobUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jobUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCEUUID_FIELD_NUMBER = 2;
  private volatile java.lang.Object resourceUuid_;
  /**
   * <pre>
   *资源Uuid
   * </pre>
   *
   * <code>string resourceUuid = 2;</code>
   */
  public java.lang.String getResourceUuid() {
    java.lang.Object ref = resourceUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceUuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *资源Uuid
   * </pre>
   *
   * <code>string resourceUuid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getResourceUuidBytes() {
    java.lang.Object ref = resourceUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROGRESS_FIELD_NUMBER = 3;
  private double progress_;
  /**
   * <pre>
   *任务进度，最大100
   * </pre>
   *
   * <code>double progress = 3;</code>
   */
  public double getProgress() {
    return progress_;
  }

  public static final int TYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object type_;
  /**
   * <pre>
   *任务类型
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
   *任务类型
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

  public static final int DONE_FIELD_NUMBER = 5;
  private boolean done_;
  /**
   * <pre>
   *任务是否完成
   * </pre>
   *
   * <code>bool done = 5;</code>
   */
  public boolean getDone() {
    return done_;
  }

  public static final int SUCCESS_FIELD_NUMBER = 6;
  private boolean success_;
  /**
   * <pre>
   *任务是否成功
   * </pre>
   *
   * <code>bool success = 6;</code>
   */
  public boolean getSuccess() {
    return success_;
  }

  public static final int RESULT_FIELD_NUMBER = 7;
  private volatile java.lang.Object result_;
  /**
   * <pre>
   *任务的详细结果,json需要不同情况解析
   * </pre>
   *
   * <code>string result = 7;</code>
   */
  public java.lang.String getResult() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      result_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *任务的详细结果,json需要不同情况解析
   * </pre>
   *
   * <code>string result = 7;</code>
   */
  public com.google.protobuf.ByteString
      getResultBytes() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      result_ = b;
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
    if (!getJobUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, jobUuid_);
    }
    if (!getResourceUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourceUuid_);
    }
    if (progress_ != 0D) {
      output.writeDouble(3, progress_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, type_);
    }
    if (done_ != false) {
      output.writeBool(5, done_);
    }
    if (success_ != false) {
      output.writeBool(6, success_);
    }
    if (!getResultBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, result_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getJobUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, jobUuid_);
    }
    if (!getResourceUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resourceUuid_);
    }
    if (progress_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, progress_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, type_);
    }
    if (done_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, done_);
    }
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, success_);
    }
    if (!getResultBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, result_);
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
    if (!(obj instanceof com.didiyun.base.v1.JobInfo)) {
      return super.equals(obj);
    }
    com.didiyun.base.v1.JobInfo other = (com.didiyun.base.v1.JobInfo) obj;

    boolean result = true;
    result = result && getJobUuid()
        .equals(other.getJobUuid());
    result = result && getResourceUuid()
        .equals(other.getResourceUuid());
    result = result && (
        java.lang.Double.doubleToLongBits(getProgress())
        == java.lang.Double.doubleToLongBits(
            other.getProgress()));
    result = result && getType()
        .equals(other.getType());
    result = result && (getDone()
        == other.getDone());
    result = result && (getSuccess()
        == other.getSuccess());
    result = result && getResult()
        .equals(other.getResult());
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
    hash = (37 * hash) + JOBUUID_FIELD_NUMBER;
    hash = (53 * hash) + getJobUuid().hashCode();
    hash = (37 * hash) + RESOURCEUUID_FIELD_NUMBER;
    hash = (53 * hash) + getResourceUuid().hashCode();
    hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getProgress()));
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + DONE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDone());
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.base.v1.JobInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.base.v1.JobInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.base.v1.JobInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.base.v1.JobInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.base.v1.JobInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.base.v1.JobInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.base.v1.JobInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.base.v1.JobInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.base.v1.JobInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.base.v1.JobInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.base.v1.JobInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.base.v1.JobInfo parseFrom(
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
  public static Builder newBuilder(com.didiyun.base.v1.JobInfo prototype) {
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
   *任务返回定义
   * </pre>
   *
   * Protobuf type {@code didi.cloud.base.v1.JobInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.base.v1.JobInfo)
      com.didiyun.base.v1.JobInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.base.v1.Base.internal_static_didi_cloud_base_v1_JobInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.base.v1.Base.internal_static_didi_cloud_base_v1_JobInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.base.v1.JobInfo.class, com.didiyun.base.v1.JobInfo.Builder.class);
    }

    // Construct using com.didiyun.base.v1.JobInfo.newBuilder()
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
      jobUuid_ = "";

      resourceUuid_ = "";

      progress_ = 0D;

      type_ = "";

      done_ = false;

      success_ = false;

      result_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.base.v1.Base.internal_static_didi_cloud_base_v1_JobInfo_descriptor;
    }

    @java.lang.Override
    public com.didiyun.base.v1.JobInfo getDefaultInstanceForType() {
      return com.didiyun.base.v1.JobInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.base.v1.JobInfo build() {
      com.didiyun.base.v1.JobInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.base.v1.JobInfo buildPartial() {
      com.didiyun.base.v1.JobInfo result = new com.didiyun.base.v1.JobInfo(this);
      result.jobUuid_ = jobUuid_;
      result.resourceUuid_ = resourceUuid_;
      result.progress_ = progress_;
      result.type_ = type_;
      result.done_ = done_;
      result.success_ = success_;
      result.result_ = result_;
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
      if (other instanceof com.didiyun.base.v1.JobInfo) {
        return mergeFrom((com.didiyun.base.v1.JobInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.base.v1.JobInfo other) {
      if (other == com.didiyun.base.v1.JobInfo.getDefaultInstance()) return this;
      if (!other.getJobUuid().isEmpty()) {
        jobUuid_ = other.jobUuid_;
        onChanged();
      }
      if (!other.getResourceUuid().isEmpty()) {
        resourceUuid_ = other.resourceUuid_;
        onChanged();
      }
      if (other.getProgress() != 0D) {
        setProgress(other.getProgress());
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (other.getDone() != false) {
        setDone(other.getDone());
      }
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (!other.getResult().isEmpty()) {
        result_ = other.result_;
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
      com.didiyun.base.v1.JobInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.base.v1.JobInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object jobUuid_ = "";
    /**
     * <pre>
     *任务Uuid
     * </pre>
     *
     * <code>string jobUuid = 1;</code>
     */
    public java.lang.String getJobUuid() {
      java.lang.Object ref = jobUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *任务Uuid
     * </pre>
     *
     * <code>string jobUuid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getJobUuidBytes() {
      java.lang.Object ref = jobUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jobUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *任务Uuid
     * </pre>
     *
     * <code>string jobUuid = 1;</code>
     */
    public Builder setJobUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jobUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务Uuid
     * </pre>
     *
     * <code>string jobUuid = 1;</code>
     */
    public Builder clearJobUuid() {
      
      jobUuid_ = getDefaultInstance().getJobUuid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务Uuid
     * </pre>
     *
     * <code>string jobUuid = 1;</code>
     */
    public Builder setJobUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jobUuid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resourceUuid_ = "";
    /**
     * <pre>
     *资源Uuid
     * </pre>
     *
     * <code>string resourceUuid = 2;</code>
     */
    public java.lang.String getResourceUuid() {
      java.lang.Object ref = resourceUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *资源Uuid
     * </pre>
     *
     * <code>string resourceUuid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getResourceUuidBytes() {
      java.lang.Object ref = resourceUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *资源Uuid
     * </pre>
     *
     * <code>string resourceUuid = 2;</code>
     */
    public Builder setResourceUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *资源Uuid
     * </pre>
     *
     * <code>string resourceUuid = 2;</code>
     */
    public Builder clearResourceUuid() {
      
      resourceUuid_ = getDefaultInstance().getResourceUuid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *资源Uuid
     * </pre>
     *
     * <code>string resourceUuid = 2;</code>
     */
    public Builder setResourceUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceUuid_ = value;
      onChanged();
      return this;
    }

    private double progress_ ;
    /**
     * <pre>
     *任务进度，最大100
     * </pre>
     *
     * <code>double progress = 3;</code>
     */
    public double getProgress() {
      return progress_;
    }
    /**
     * <pre>
     *任务进度，最大100
     * </pre>
     *
     * <code>double progress = 3;</code>
     */
    public Builder setProgress(double value) {
      
      progress_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务进度，最大100
     * </pre>
     *
     * <code>double progress = 3;</code>
     */
    public Builder clearProgress() {
      
      progress_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     *任务类型
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
     *任务类型
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
     *任务类型
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
     *任务类型
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
     *任务类型
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

    private boolean done_ ;
    /**
     * <pre>
     *任务是否完成
     * </pre>
     *
     * <code>bool done = 5;</code>
     */
    public boolean getDone() {
      return done_;
    }
    /**
     * <pre>
     *任务是否完成
     * </pre>
     *
     * <code>bool done = 5;</code>
     */
    public Builder setDone(boolean value) {
      
      done_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务是否完成
     * </pre>
     *
     * <code>bool done = 5;</code>
     */
    public Builder clearDone() {
      
      done_ = false;
      onChanged();
      return this;
    }

    private boolean success_ ;
    /**
     * <pre>
     *任务是否成功
     * </pre>
     *
     * <code>bool success = 6;</code>
     */
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <pre>
     *任务是否成功
     * </pre>
     *
     * <code>bool success = 6;</code>
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务是否成功
     * </pre>
     *
     * <code>bool success = 6;</code>
     */
    public Builder clearSuccess() {
      
      success_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object result_ = "";
    /**
     * <pre>
     *任务的详细结果,json需要不同情况解析
     * </pre>
     *
     * <code>string result = 7;</code>
     */
    public java.lang.String getResult() {
      java.lang.Object ref = result_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        result_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *任务的详细结果,json需要不同情况解析
     * </pre>
     *
     * <code>string result = 7;</code>
     */
    public com.google.protobuf.ByteString
        getResultBytes() {
      java.lang.Object ref = result_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        result_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *任务的详细结果,json需要不同情况解析
     * </pre>
     *
     * <code>string result = 7;</code>
     */
    public Builder setResult(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务的详细结果,json需要不同情况解析
     * </pre>
     *
     * <code>string result = 7;</code>
     */
    public Builder clearResult() {
      
      result_ = getDefaultInstance().getResult();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务的详细结果,json需要不同情况解析
     * </pre>
     *
     * <code>string result = 7;</code>
     */
    public Builder setResultBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      result_ = value;
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


    // @@protoc_insertion_point(builder_scope:didi.cloud.base.v1.JobInfo)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.base.v1.JobInfo)
  private static final com.didiyun.base.v1.JobInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.base.v1.JobInfo();
  }

  public static com.didiyun.base.v1.JobInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobInfo>
      PARSER = new com.google.protobuf.AbstractParser<JobInfo>() {
    @java.lang.Override
    public JobInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JobInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.base.v1.JobInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
