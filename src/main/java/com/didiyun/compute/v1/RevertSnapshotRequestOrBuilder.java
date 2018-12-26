// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/snap.proto

package com.didiyun.compute.v1;

public interface RevertSnapshotRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.RevertSnapshotRequest)
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
   * <code>repeated .didi.cloud.compute.v1.RevertSnapshotRequest.Input snap = 2;</code>
   */
  java.util.List<com.didiyun.compute.v1.RevertSnapshotRequest.Input> 
      getSnapList();
  /**
   * <code>repeated .didi.cloud.compute.v1.RevertSnapshotRequest.Input snap = 2;</code>
   */
  com.didiyun.compute.v1.RevertSnapshotRequest.Input getSnap(int index);
  /**
   * <code>repeated .didi.cloud.compute.v1.RevertSnapshotRequest.Input snap = 2;</code>
   */
  int getSnapCount();
  /**
   * <code>repeated .didi.cloud.compute.v1.RevertSnapshotRequest.Input snap = 2;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.RevertSnapshotRequest.InputOrBuilder> 
      getSnapOrBuilderList();
  /**
   * <code>repeated .didi.cloud.compute.v1.RevertSnapshotRequest.Input snap = 2;</code>
   */
  com.didiyun.compute.v1.RevertSnapshotRequest.InputOrBuilder getSnapOrBuilder(
      int index);

  /**
   * <pre>
   *还原前，是否执行关闭DC2(若DC2已处于关闭状态，则不需要传此参数）
   * </pre>
   *
   * <code>bool stopDc2 = 3;</code>
   */
  boolean getStopDc2();

  /**
   * <pre>
   *还原后是否需要同时启动DC2
   * </pre>
   *
   * <code>bool startDc2 = 4;</code>
   */
  boolean getStartDc2();
}
