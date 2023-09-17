---
title: 模块流量控制
date: 2017-01-04
weight: 5
---

模块发布运维、基座 Pod 发布运维都会联动更新模块和基座 Deployment 对应的 K8S Service，从而实现模块发布运维过程中的业务流量完全无损。


## 模块发布运维切挂流过程
<尚待补充一张流程图>

您可以监听模块对应的 K8S Service，从而与您企业内部的流量控制系统打通，自动感知模块 IP 列表的更新并执行具体的切挂流动作，如模块所在 IP 的 RPC 挂切流和 HTTP 挂切流。