package day_54_java_versions_features;

public sealed class Java17SealedClass permits Test1,Test2 {

}


final class Test1 extends Java17SealedClass{

}
final class Test2 extends Java17SealedClass{

}

//final class Test3 extends  Java17SealedClass{
//
//}