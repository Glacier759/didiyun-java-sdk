// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill/v1/bill.proto

package com.didiyun.bill.v1;

public interface FactorRuleDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.bill.v1.FactorRuleDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *int64 ruleId = 1;               //标识这个计费因子的规则id
   *int64 leftUsage = 2;            //当前计费rule的余量
   *int64 nextRuleId = 3;           //下个阶段的ruleId
   * </pre>
   *
   * <code>int64 autoRenewCnt = 4;</code>
   */
  long getAutoRenewCnt();

  /**
   * <pre>
   *到期是否自动转为按时长
   * </pre>
   *
   * <code>bool autoSwitch = 5;</code>
   */
  boolean getAutoSwitch();

  /**
   * <pre>
   *扣费类型字符串描述
   * </pre>
   *
   * <code>string payType = 6;</code>
   */
  java.lang.String getPayType();
  /**
   * <pre>
   *扣费类型字符串描述
   * </pre>
   *
   * <code>string payType = 6;</code>
   */
  com.google.protobuf.ByteString
      getPayTypeBytes();
}
