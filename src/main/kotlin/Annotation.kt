//要声明注解，需要在class前添加annotation
/*
 *可给注解添加一些属性
 * @Target指定注解的对象
 * @Retention指定注解是否存储在编译后的class文件中，以及运行时能否通过反射可见（默认都是true）
 * @Repeatable允许在单个元素上多次使用相同的注解
 * @MustBeDocumented指定注解是共有API的一部分，并且应该包含在生成的API文档中显示的类或方法的签名中
 */
annotation class Annotation