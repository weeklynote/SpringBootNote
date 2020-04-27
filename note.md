1.SpringBoot的设计是为了尽快的跑起来Spring应用程序并且尽可能少的减少配置文件(Spring/Spring MVC需要配置一大堆Beans等)。
2.SpringBoot通过起步依赖(将某些功能的坐标打包到一起，并提供默认的功能)、自动配置(自动将一些配置类的Bean注册进IOC容器)。
3.在使用Person自定义配置时，在application.properties属性文件中spring.http.encoding.force-response=true会导致中文乱码
4.使用自定义属性值时@ConfigurationProperties注解需要为对象设置setXXX方法，否则属性设置值不能生效；在使用@Value时没有该限制。
5.源码分析
1. 依赖管理
为什么不需要指定jar包的版本？
在父依赖spring-boot-starter-parent指定了配置文件的加载顺序，属性配置、插件管理等；接下载在去spring-boot-starter-parent的父依赖spring-boot-dependencies中去查找原因，可以看到在这个配置里面定义了一些常用的框架的版本号，并在下面的dependency标签中使用了改版本号，这就是为什么在使用Springboot时对一些常用框架我们没有指定版本号的原因；但是当pom.xml依赖的文件不是SpringBoot管理时，我们依然要使用version标签指定版本号。
运行时jar包哪里来的？
通过官网的starter
https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/html/using-spring-boot.html#using-boot-starter
可以知道是因为我们引入了spring-boot-starter-web这个启动器，引入了相关Spring MVC等jar包。
2. 自动配置
@SpringBootApplication
@AutoConfigurationPackage
3. 自定义starter(了解)
4. 执行原理，查看SpringApplication.run()源码工程。

6.数据访问(了解mybatis与redis)
7.视图技术(了解了thymeleaf，需要掌握其常用标签及表达式)
8.缓存(了解原生缓存及Redis自定义序列化机制)
