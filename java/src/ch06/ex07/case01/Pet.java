package ch06.ex07.case01;

public sealed class Pet permits Dog, Cat{
	
}
/* sealed 자식으로 오는 것을 제한한다. permits 이하n으로.*/