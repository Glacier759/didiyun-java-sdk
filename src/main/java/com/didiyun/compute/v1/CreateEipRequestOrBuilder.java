// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/eip.proto

package com.didiyun.compute.v1;

public interface CreateEipRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.CreateEipRequest)
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
   *购买包月时长，单位为月，范围[0,36]，不传或传0表示后付费
   * </pre>
   *
   * <code>int32 payPeriod = 2;</code>
   */
  int getPayPeriod();

  /**
   * <pre>
   *到期是否自动续费
   * </pre>
   *
   * <code>bool autoContinue = 3;</code>
   */
  boolean getAutoContinue();

  /**
   * <pre>
   *批量购买参数，不传默认购买一个EIP，不能超过20
   * </pre>
   *
   * <code>int32 count = 4;</code>
   */
  int getCount();

  /**
   * <pre>
   *优惠券Id
   * </pre>
   *
   * <code>string couponId = 5;</code>
   */
  java.lang.String getCouponId();
  /**
   * <pre>
   *优惠券Id
   * </pre>
   *
   * <code>string couponId = 5;</code>
   */
  com.google.protobuf.ByteString
      getCouponIdBytes();

  /**
   * <pre>
   *eip标签
   * </pre>
   *
   * <code>repeated string tags = 6;</code>
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <pre>
   *eip标签
   * </pre>
   *
   * <code>repeated string tags = 6;</code>
   */
  int getTagsCount();
  /**
   * <pre>
   *eip标签
   * </pre>
   *
   * <code>repeated string tags = 6;</code>
   */
  java.lang.String getTags(int index);
  /**
   * <pre>
   *eip标签
   * </pre>
   *
   * <code>repeated string tags = 6;</code>
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <pre>
   *是否要按流量计费（为按流量计费时，默认为后付费）
   * </pre>
   *
   * <code>bool chargeWithFlow = 7;</code>
   */
  boolean getChargeWithFlow();

  /**
   * <pre>
   *要购买eip的带宽
   * </pre>
   *
   * <code>int32 bandwidth = 8;</code>
   */
  int getBandwidth();

  /**
   * <pre>
   *同时绑定的dc2的uuid
   * </pre>
   *
   * <code>string bindingUuid = 9;</code>
   */
  java.lang.String getBindingUuid();
  /**
   * <pre>
   *同时绑定的dc2的uuid
   * </pre>
   *
   * <code>string bindingUuid = 9;</code>
   */
  com.google.protobuf.ByteString
      getBindingUuidBytes();

  /**
   * <pre>
   *同时绑定的资源类型,"DC2"或"CPORT"
   * </pre>
   *
   * <code>string bindingType = 10;</code>
   */
  java.lang.String getBindingType();
  /**
   * <pre>
   *同时绑定的资源类型,"DC2"或"CPORT"
   * </pre>
   *
   * <code>string bindingType = 10;</code>
   */
  com.google.protobuf.ByteString
      getBindingTypeBytes();
}
