// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill/v1/bill.proto

package com.didiyun.bill.v1;

public interface GetEbsChargeInfoAndSpecResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.bill.v1.GetEbsChargeInfoAndSpecResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  boolean hasError();
  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  com.didiyun.base.v1.Error getError();
  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  com.didiyun.base.v1.ErrorOrBuilder getErrorOrBuilder();

  /**
   * <code>repeated .didi.cloud.bill.v1.EbsChargeInfoAndSpec data = 2;</code>
   */
  java.util.List<com.didiyun.bill.v1.EbsChargeInfoAndSpec> 
      getDataList();
  /**
   * <code>repeated .didi.cloud.bill.v1.EbsChargeInfoAndSpec data = 2;</code>
   */
  com.didiyun.bill.v1.EbsChargeInfoAndSpec getData(int index);
  /**
   * <code>repeated .didi.cloud.bill.v1.EbsChargeInfoAndSpec data = 2;</code>
   */
  int getDataCount();
  /**
   * <code>repeated .didi.cloud.bill.v1.EbsChargeInfoAndSpec data = 2;</code>
   */
  java.util.List<? extends com.didiyun.bill.v1.EbsChargeInfoAndSpecOrBuilder> 
      getDataOrBuilderList();
  /**
   * <code>repeated .didi.cloud.bill.v1.EbsChargeInfoAndSpec data = 2;</code>
   */
  com.didiyun.bill.v1.EbsChargeInfoAndSpecOrBuilder getDataOrBuilder(
      int index);
}
