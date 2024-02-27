# printStackTrace()와 getMessage()
- printStackTrace() : 예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
- getMessage() : 발생한 예외 클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.

# 멀티 catch블럭
내용이 같은 catch블럭을 하나로 합친 것

        try{
        }catch(ExceptionA e1){
            e1.printStackTrace();
        }catch(ExceptionB e2){
            e2.printStackTrace();
        }
위 내용이 동일한 코드를 중복 제거

        try{
        }catch(ExceptionA | ExceptionB e){
        e.printStackTrace();
        }

위 방법의 문제는 에러가 일어났을 때 에러가 A인지 B인지 모른다.

그렇기에 두 에러의 공통 메서드만 사용해야하고 정 각각의 메서드를 사용하고싶다면
아래와 같이 형변환을 해야하는데 이러면 멀티캐치블럭의 의미가 없어진다...

        if(e instanceof ExceptionA){
            ExceptionA e1 = (ExceptionA)e;
        }