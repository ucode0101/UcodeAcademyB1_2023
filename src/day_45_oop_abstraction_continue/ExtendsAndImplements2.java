package day_45_oop_abstraction_continue;

interface ExtendsAndImplements2 {


}
interface I44{

}

interface I33 extends ExtendsAndImplements2, I44 {

}

abstract class A22{

}
// Extending one abstract class, and multiple interfaces
 class A3 extends A22 implements ExtendsAndImplements2, I44, I33 {

}