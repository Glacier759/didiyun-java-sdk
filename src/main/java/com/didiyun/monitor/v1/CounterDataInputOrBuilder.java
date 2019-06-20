// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: monitor/v1/counter.proto

package com.didiyun.monitor.v1;

public interface CounterDataInputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.monitor.v1.CounterDataInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *资源类型
   * </pre>
   *
   * <code>string resourceType = 1;</code>
   */
  java.lang.String getResourceType();
  /**
   * <pre>
   *资源类型
   * </pre>
   *
   * <code>string resourceType = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceTypeBytes();

  /**
   * <pre>
   *资源Uuid
   * </pre>
   *
   * <code>string resourceUuid = 2;</code>
   */
  java.lang.String getResourceUuid();
  /**
   * <pre>
   *资源Uuid
   * </pre>
   *
   * <code>string resourceUuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getResourceUuidBytes();

  /**
   * <pre>
   *要查询的曲线tags,多个用逗号分隔
   * </pre>
   *
   * <code>string monitorTags = 3;</code>
   */
  java.lang.String getMonitorTags();
  /**
   * <pre>
   *要查询的曲线tags,多个用逗号分隔
   * </pre>
   *
   * <code>string monitorTags = 3;</code>
   */
  com.google.protobuf.ByteString
      getMonitorTagsBytes();

  /**
   * <pre>
   *要查询的指标名称
   * </pre>
   *
   * <code>string metric = 4;</code>
   */
  java.lang.String getMetric();
  /**
   * <pre>
   *要查询的指标名称
   * </pre>
   *
   * <code>string metric = 4;</code>
   */
  com.google.protobuf.ByteString
      getMetricBytes();

  /**
   * <pre>
   *开始时间，单位为秒时间戳
   * </pre>
   *
   * <code>int64 startTime = 5;</code>
   */
  long getStartTime();

  /**
   * <pre>
   *结束时间，单位为秒时间戳
   * </pre>
   *
   * <code>int64 endTime = 6;</code>
   */
  long getEndTime();
}