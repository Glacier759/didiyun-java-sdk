// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/ebs.proto

package com.didiyun.compute.v1;

public interface AttachEbsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.AttachEbsRequest)
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
   * <code>repeated .didi.cloud.compute.v1.AttachEbsRequest.Input ebs = 2;</code>
   */
  java.util.List<com.didiyun.compute.v1.AttachEbsRequest.Input> 
      getEbsList();
  /**
   * <code>repeated .didi.cloud.compute.v1.AttachEbsRequest.Input ebs = 2;</code>
   */
  com.didiyun.compute.v1.AttachEbsRequest.Input getEbs(int index);
  /**
   * <code>repeated .didi.cloud.compute.v1.AttachEbsRequest.Input ebs = 2;</code>
   */
  int getEbsCount();
  /**
   * <code>repeated .didi.cloud.compute.v1.AttachEbsRequest.Input ebs = 2;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.AttachEbsRequest.InputOrBuilder> 
      getEbsOrBuilderList();
  /**
   * <code>repeated .didi.cloud.compute.v1.AttachEbsRequest.Input ebs = 2;</code>
   */
  com.didiyun.compute.v1.AttachEbsRequest.InputOrBuilder getEbsOrBuilder(
      int index);
}