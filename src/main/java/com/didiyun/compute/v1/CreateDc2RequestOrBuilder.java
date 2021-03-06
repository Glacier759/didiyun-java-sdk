// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/dc2.proto

package com.didiyun.compute.v1;

public interface CreateDc2RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.CreateDc2Request)
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
   *批量购买参数，不传默认购买一台DC2，不能超过20
   * </pre>
   *
   * <code>int32 count = 2;</code>
   */
  int getCount();

  /**
   * <pre>
   *是否设置DC2自动续费
   * </pre>
   *
   * <code>bool autoContinue = 3;</code>
   */
  boolean getAutoContinue();

  /**
   * <pre>
   *购买包月时长，单位为月，不传或传0表示后付费
   * </pre>
   *
   * <code>int32 payPeriod = 4;</code>
   */
  int getPayPeriod();

  /**
   * <pre>
   *使用优惠券Id
   * </pre>
   *
   * <code>string couponId = 5;</code>
   */
  java.lang.String getCouponId();
  /**
   * <pre>
   *使用优惠券Id
   * </pre>
   *
   * <code>string couponId = 5;</code>
   */
  com.google.protobuf.ByteString
      getCouponIdBytes();

  /**
   * <pre>
   *使用何镜像创建DC2，与snapUuid二选一
   * </pre>
   *
   * <code>string imgUuid = 6;</code>
   */
  java.lang.String getImgUuid();
  /**
   * <pre>
   *使用何镜像创建DC2，与snapUuid二选一
   * </pre>
   *
   * <code>string imgUuid = 6;</code>
   */
  com.google.protobuf.ByteString
      getImgUuidBytes();

  /**
   * <pre>
   *使用何快照创建DC2，与imgUuid二选一
   * </pre>
   *
   * <code>string snapUuid = 7;</code>
   */
  java.lang.String getSnapUuid();
  /**
   * <pre>
   *使用何快照创建DC2，与imgUuid二选一
   * </pre>
   *
   * <code>string snapUuid = 7;</code>
   */
  com.google.protobuf.ByteString
      getSnapUuidBytes();

  /**
   * <pre>
   *在此指定子网下创建DC2
   * </pre>
   *
   * <code>string subnetUuid = 8;</code>
   */
  java.lang.String getSubnetUuid();
  /**
   * <pre>
   *在此指定子网下创建DC2
   * </pre>
   *
   * <code>string subnetUuid = 8;</code>
   */
  com.google.protobuf.ByteString
      getSubnetUuidBytes();

  /**
   * <pre>
   *要创建的DC2型号
   * </pre>
   *
   * <code>string dc2Model = 9;</code>
   */
  java.lang.String getDc2Model();
  /**
   * <pre>
   *要创建的DC2型号
   * </pre>
   *
   * <code>string dc2Model = 9;</code>
   */
  com.google.protobuf.ByteString
      getDc2ModelBytes();

  /**
   * <pre>
   *使用公钥Uuid列表进行DC2创建，与password二选一
   * </pre>
   *
   * <code>repeated string pubKeyUuids = 10;</code>
   */
  java.util.List<java.lang.String>
      getPubKeyUuidsList();
  /**
   * <pre>
   *使用公钥Uuid列表进行DC2创建，与password二选一
   * </pre>
   *
   * <code>repeated string pubKeyUuids = 10;</code>
   */
  int getPubKeyUuidsCount();
  /**
   * <pre>
   *使用公钥Uuid列表进行DC2创建，与password二选一
   * </pre>
   *
   * <code>repeated string pubKeyUuids = 10;</code>
   */
  java.lang.String getPubKeyUuids(int index);
  /**
   * <pre>
   *使用公钥Uuid列表进行DC2创建，与password二选一
   * </pre>
   *
   * <code>repeated string pubKeyUuids = 10;</code>
   */
  com.google.protobuf.ByteString
      getPubKeyUuidsBytes(int index);

  /**
   * <pre>
   *使用密码进行创建，需将原密码进行16进制编码传递，与pubKeyUuids二选一
   * </pre>
   *
   * <code>string password = 11;</code>
   */
  java.lang.String getPassword();
  /**
   * <pre>
   *使用密码进行创建，需将原密码进行16进制编码传递，与pubKeyUuids二选一
   * </pre>
   *
   * <code>string password = 11;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <pre>
   *根盘大小，单位GB，当所选规格族为通用型（e1,g1,g2）时需要传递，需大于等于40，且小于等于500
   * </pre>
   *
   * <code>int32 rootDiskSize = 12;</code>
   */
  int getRootDiskSize();

  /**
   * <pre>
   *根盘类型（"HDD"或"SSD"），当所选规格族为通用型（e1,g1,g2）时需要传递
   * </pre>
   *
   * <code>string rootDiskType = 13;</code>
   */
  java.lang.String getRootDiskType();
  /**
   * <pre>
   *根盘类型（"HDD"或"SSD"），当所选规格族为通用型（e1,g1,g2）时需要传递
   * </pre>
   *
   * <code>string rootDiskType = 13;</code>
   */
  com.google.protobuf.ByteString
      getRootDiskTypeBytes();

  /**
   * <pre>
   *此DC2将要加入的安全组列表
   * </pre>
   *
   * <code>repeated string sgUuids = 14;</code>
   */
  java.util.List<java.lang.String>
      getSgUuidsList();
  /**
   * <pre>
   *此DC2将要加入的安全组列表
   * </pre>
   *
   * <code>repeated string sgUuids = 14;</code>
   */
  int getSgUuidsCount();
  /**
   * <pre>
   *此DC2将要加入的安全组列表
   * </pre>
   *
   * <code>repeated string sgUuids = 14;</code>
   */
  java.lang.String getSgUuids(int index);
  /**
   * <pre>
   *此DC2将要加入的安全组列表
   * </pre>
   *
   * <code>repeated string sgUuids = 14;</code>
   */
  com.google.protobuf.ByteString
      getSgUuidsBytes(int index);

  /**
   * <pre>
   *DC2标签
   * </pre>
   *
   * <code>repeated string tags = 15;</code>
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <pre>
   *DC2标签
   * </pre>
   *
   * <code>repeated string tags = 15;</code>
   */
  int getTagsCount();
  /**
   * <pre>
   *DC2标签
   * </pre>
   *
   * <code>repeated string tags = 15;</code>
   */
  java.lang.String getTags(int index);
  /**
   * <pre>
   *DC2标签
   * </pre>
   *
   * <code>repeated string tags = 15;</code>
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <pre>
   *DC2名字
   * </pre>
   *
   * <code>string name = 16;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   *DC2名字
   * </pre>
   *
   * <code>string name = 16;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   *是否同时安装专业版安全agnet
   * </pre>
   *
   * <code>bool proSecurityAgentEnabled = 17;</code>
   */
  boolean getProSecurityAgentEnabled();

  /**
   * <pre>
   *是否同时安装监控agent
   * </pre>
   *
   * <code>bool monitoringAgentEnabled = 18;</code>
   */
  boolean getMonitoringAgentEnabled();

  /**
   * <pre>
   *同时创建的EIP信息
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.CreateDc2Request.Eip eip = 19;</code>
   */
  boolean hasEip();
  /**
   * <pre>
   *同时创建的EIP信息
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.CreateDc2Request.Eip eip = 19;</code>
   */
  com.didiyun.compute.v1.CreateDc2Request.Eip getEip();
  /**
   * <pre>
   *同时创建的EIP信息
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.CreateDc2Request.Eip eip = 19;</code>
   */
  com.didiyun.compute.v1.CreateDc2Request.EipOrBuilder getEipOrBuilder();

  /**
   * <pre>
   *同时创建的EBS信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateDc2Request.Ebs ebs = 20;</code>
   */
  java.util.List<com.didiyun.compute.v1.CreateDc2Request.Ebs> 
      getEbsList();
  /**
   * <pre>
   *同时创建的EBS信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateDc2Request.Ebs ebs = 20;</code>
   */
  com.didiyun.compute.v1.CreateDc2Request.Ebs getEbs(int index);
  /**
   * <pre>
   *同时创建的EBS信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateDc2Request.Ebs ebs = 20;</code>
   */
  int getEbsCount();
  /**
   * <pre>
   *同时创建的EBS信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateDc2Request.Ebs ebs = 20;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.CreateDc2Request.EbsOrBuilder> 
      getEbsOrBuilderList();
  /**
   * <pre>
   *同时创建的EBS信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateDc2Request.Ebs ebs = 20;</code>
   */
  com.didiyun.compute.v1.CreateDc2Request.EbsOrBuilder getEbsOrBuilder(
      int index);

  /**
   * <pre>
   *创建DC2指定UserData
   * </pre>
   *
   * <code>string userData = 21;</code>
   */
  java.lang.String getUserData();
  /**
   * <pre>
   *创建DC2指定UserData
   * </pre>
   *
   * <code>string userData = 21;</code>
   */
  com.google.protobuf.ByteString
      getUserDataBytes();
}
