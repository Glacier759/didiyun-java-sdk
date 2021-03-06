// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/dc2.proto

package com.didiyun.compute.v1;

public interface ListDc2RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.ListDc2Request)
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
   * <pre>
   *列表开始位置
   * </pre>
   *
   * <code>int32 start = 2;</code>
   */
  int getStart();

  /**
   * <pre>
   *取出数量
   * </pre>
   *
   * <code>int32 limit = 3;</code>
   */
  int getLimit();

  /**
   * <pre>
   *是否仅输出简要信息
   * </pre>
   *
   * <code>bool simplify = 4;</code>
   */
  boolean getSimplify();

  /**
   * <pre>
   *过滤条件
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.ListDc2Condition condition = 5;</code>
   */
  boolean hasCondition();
  /**
   * <pre>
   *过滤条件
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.ListDc2Condition condition = 5;</code>
   */
  com.didiyun.compute.v1.ListDc2Condition getCondition();
  /**
   * <pre>
   *过滤条件
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.ListDc2Condition condition = 5;</code>
   */
  com.didiyun.compute.v1.ListDc2ConditionOrBuilder getConditionOrBuilder();
}
