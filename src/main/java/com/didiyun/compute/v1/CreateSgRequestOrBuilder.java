// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/sg.proto

package com.didiyun.compute.v1;

public interface CreateSgRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.CreateSgRequest)
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
   *SG名称
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   *SG名称
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   *此SG要创建的VPC的uuid，不传则创建在指定region的默认VPC下
   * </pre>
   *
   * <code>string vpcUuid = 3;</code>
   */
  java.lang.String getVpcUuid();
  /**
   * <pre>
   *此SG要创建的VPC的uuid，不传则创建在指定region的默认VPC下
   * </pre>
   *
   * <code>string vpcUuid = 3;</code>
   */
  com.google.protobuf.ByteString
      getVpcUuidBytes();

  /**
   * <pre>
   *同时在此SG下创建的规则信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 4;</code>
   */
  java.util.List<com.didiyun.compute.v1.CreateSgRuleInput> 
      getSgRuleList();
  /**
   * <pre>
   *同时在此SG下创建的规则信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 4;</code>
   */
  com.didiyun.compute.v1.CreateSgRuleInput getSgRule(int index);
  /**
   * <pre>
   *同时在此SG下创建的规则信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 4;</code>
   */
  int getSgRuleCount();
  /**
   * <pre>
   *同时在此SG下创建的规则信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 4;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.CreateSgRuleInputOrBuilder> 
      getSgRuleOrBuilderList();
  /**
   * <pre>
   *同时在此SG下创建的规则信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 4;</code>
   */
  com.didiyun.compute.v1.CreateSgRuleInputOrBuilder getSgRuleOrBuilder(
      int index);

  /**
   * <pre>
   *需要同时添加至此SG的DC2信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSgRequest.DC2 dc2 = 5;</code>
   */
  java.util.List<com.didiyun.compute.v1.CreateSgRequest.DC2> 
      getDc2List();
  /**
   * <pre>
   *需要同时添加至此SG的DC2信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSgRequest.DC2 dc2 = 5;</code>
   */
  com.didiyun.compute.v1.CreateSgRequest.DC2 getDc2(int index);
  /**
   * <pre>
   *需要同时添加至此SG的DC2信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSgRequest.DC2 dc2 = 5;</code>
   */
  int getDc2Count();
  /**
   * <pre>
   *需要同时添加至此SG的DC2信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSgRequest.DC2 dc2 = 5;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.CreateSgRequest.DC2OrBuilder> 
      getDc2OrBuilderList();
  /**
   * <pre>
   *需要同时添加至此SG的DC2信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSgRequest.DC2 dc2 = 5;</code>
   */
  com.didiyun.compute.v1.CreateSgRequest.DC2OrBuilder getDc2OrBuilder(
      int index);
}
