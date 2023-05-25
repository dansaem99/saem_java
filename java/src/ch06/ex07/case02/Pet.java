package ch06.ex07.case02;

public sealed class Pet permits Dog, Bird {

}
//sealed permits는 짝꿍이라 항상 같이 다녀야 한다.