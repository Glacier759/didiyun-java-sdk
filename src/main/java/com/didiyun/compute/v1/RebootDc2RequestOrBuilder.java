// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/dc2.proto

package com.didiyun.compute.v1;

public interface RebootDc2RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.RebootDc2Request)
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
   * <code>repeated .didi.cloud.compute.v1.RebootDc2Request.Input dc2 = 2;</code>
   */
  java.util.List<com.didiyun.compute.v1.RebootDc2Request.Input> 
      getDc2List();
  /**
   * <code>repeated .didi.cloud.compute.v1.RebootDc2Request.Input dc2 = 2;</code>
   */
  com.didiyun.compute.v1.RebootDc2Request.Input getDc2(int index);
  /**
   * <code>repeated .didi.cloud.compute.v1.RebootDc2Request.Input dc2 = 2;</code>
   */
  int getDc2Count();
  /**
   * <code>repeated .didi.cloud.compute.v1.RebootDc2Request.Input dc2 = 2;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.RebootDc2Request.InputOrBuilder> 
      getDc2OrBuilderList();
  /**
   * <code>repeated .didi.cloud.compute.v1.RebootDc2Request.Input dc2 = 2;</code>
   */
  com.didiyun.compute.v1.RebootDc2Request.InputOrBuilder getDc2OrBuilder(
      int index);
}
