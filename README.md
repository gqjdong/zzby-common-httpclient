此工具是对apache httpclient的封装，定义了一套对外的类和接口，隐藏了httpclient的api。


这样在更换底层第三方库的时候，调用方都无需更改。


目前只写了httpclient3的实现

client对象可以是线程内共享，也可以是jvm内共享


支持https调用，对get和post方法定义了许多重载方法


使用方可以灵活配置参数，如超时时间，连接池等


调用方式请参照test包下的例子
