# 工厂模式实现火锅订单系统

**抽象产品** HotPot

**具体产品** MuttonHotPot TripeHotPot Two_FlavouredHotPot

**抽象工厂** HotPotStore

**具体工厂** MuttonHotPotStore TripeHotPot Store   Two_FlavouredHotPotStore

## 实现思路
* HotPot接口，定义所有的火锅都具有的特征，比如价格，比如人们对它的评价

* 具体的产品则负责实现火锅接口中定义的这些方法，每一种火锅都有不同的价格和不同的评价

* HotPotStore定义了抽象的产生火锅方法，具体产生什么火锅由它的子类实现,每个火锅店共有的一些功能，比如添加用户指定的食材，介绍火锅的历史。

* 具体的如MuttonHotPotStore则负责生成具体的火锅。

* TestHotPot用于测试
