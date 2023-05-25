package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
//자바 까지 살아있게 하겠다. 컴파일 하면 사라진다.
@Target(ElementType.TYPE)
public @interface Type {
    String name();
	//어트리뷰트 타입, 벨류
    int value();
}

@Retention(RetentionPolicy.CLASS)
//클래스까지 살아남게 하겠다. 컴파일 해도 살아있다.
//뉴 하면 객체 생성 되면서 어노테이션이 없어진다.
@Target(ElementType.FIELD)
@interface Field {
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface Constructor {
	int value() default 0; //기본값 설정
} //객체 생성 후에도 어노테이션이 존재한다.

//RetentionPolicy의 기본값이 CLASS이다.
@Target(ElementType.METHOD)
@interface Method {
	
}

@Target(ElementType.PARAMETER)
@interface Param {
	
}

@Target(ElementType.LOCAL_VARIABLE)
@Annotation
@interface Local {
	
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation {
	
}

@Target({ElementType.TYPE, ElementType.FIELD})
@interface Universal {
	
}
/* 
 * @ : 어노테이션 타입을 만드는 문법이다.
 * @Target(ElementType.TYPE) 타입이라는 어노테이션을 
 * 타입 클래스에 쓰겠다. 
 * 메소드에는 쓸 수 없고 클래스에 쓸 수 있다.
 * @Retention(RetentionPolicy.SOURCE) 자바 타입에만 있겠다. 
 */
