package p26thread;

public class ThreadJoin2 {
	//사진 'p26Join이 필요한 이유' 참고
	/* 말로 풀어서 설명하면, 
	   예를들어서 가비지 컬렉터란 데몬쓰레드가 있다.
	   예컨데, 이 데몬쓰레드는 1분마다 한번씩 돌아가며 메모리를 정리해준다.
	   근데 1분마다가 아니어도 메모리가 당장 모자라거나 필요할 때, 가비지컬렉터를 interrupt로 깨우는 코드가 있다고 치자.
	   그런데 만약 join()을 사용하지 않고 가비지 컬렉터를 깨운 다음 바로 메모리를 사용해버리면
	   아직 충분한 메모리가 확보되지않았음에도 사용하려 해서 충돌이 날 수 있다.
	   그래서 가비지 컬렉터가 충분한 메모리를 확보할 시간을 기다려주는 것을 join()메서드로 구현해주는 메커니즘이다.
	   join(100)을 줘서 0.1초간 기다렸다가 들어간다던지 하는식이다.
	 */
}
