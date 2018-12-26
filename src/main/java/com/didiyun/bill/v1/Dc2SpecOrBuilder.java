// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill/v1/bill.proto

package com.didiyun.bill.v1;

public interface Dc2SpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.bill.v1.Dc2Spec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *CPU数
   * </pre>
   *
   * <code>int32 cpuNum = 1;</code>
   */
  int getCpuNum();

  /**
   * <pre>
   *GPU数
   * </pre>
   *
   * <code>int32 gpuNum = 2;</code>
   */
  int getGpuNum();

  /**
   * <pre>
   *内存大小
   * </pre>
   *
   * <code>int64 memorySize = 3;</code>
   */
  long getMemorySize();

  /**
   * <pre>
   *根盘大小
   * </pre>
   *
   * <code>int64 diskSize = 4;</code>
   */
  long getDiskSize();

  /**
   * <pre>
   *型号
   * </pre>
   *
   * <code>string model = 5;</code>
   */
  java.lang.String getModel();
  /**
   * <pre>
   *型号
   * </pre>
   *
   * <code>string model = 5;</code>
   */
  com.google.protobuf.ByteString
      getModelBytes();
}