import kotlin.reflect.KClass

annotation class Ann(val arg: Array<out Class<out KClass<*>>>)

// method: Ann::arg
// jvm signature:     ()[Ljava/lang/Class;
// generic signature: ()[Ljava/lang/Class<+Lkotlin/reflect/KClass<*>;>;
