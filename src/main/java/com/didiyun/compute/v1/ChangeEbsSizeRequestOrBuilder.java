// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/ebs.proto

package com.didiyun.compute.v1;

public interface ChangeEbsSizeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.ChangeEbsSizeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  com.didiyun.base.v1.Header getHeader();
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>string couponId = 2;</code>
   */
  java.lang.String getCouponId();
  /**
   * <code>string couponId = 2;</code>
   */
  com.google.protobuf.ByteString
      getCouponIdBytes();

  /**
   * <code>repeated .didi.cloud.compute.v1.ChangeEbsSizeRequest.Input ebs = 3;</code>
   */
  java.util.List<com.didiyun.compute.v1.ChangeEbsSizeRequest.Input> 
      getEbsList();
  /**
   * <code>repeated .didi.cloud.compute.v1.ChangeEbsSizeRequest.Input ebs = 3;</code>
   */
  com.didiyun.compute.v1.ChangeEbsSizeRequest.Input getEbs(int index);
  /**
   * <code>repeated .didi.cloud.compute.v1.ChangeEbsSizeRequest.Input ebs = 3;</code>
   */
  int getEbsCount();
  /**
   * <code>repeated .didi.cloud.compute.v1.ChangeEbsSizeRequest.Input ebs = 3;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.ChangeEbsSizeRequest.InputOrBuilder> 
      getEbsOrBuilderList();
  /**
   * <code>repeated .didi.cloud.compute.v1.ChangeEbsSizeRequest.Input ebs = 3;</code>
   */
  com.didiyun.compute.v1.ChangeEbsSizeRequest.InputOrBuilder getEbsOrBuilder(
      int index);
}