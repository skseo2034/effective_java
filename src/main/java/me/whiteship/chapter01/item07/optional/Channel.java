package me.whiteship.chapter01.item07.optional;

import java.util.Optional;
import java.util.OptionalLong;

public class Channel {

    private int numOfSubscribers;

    // Optional 을 리턴 타입으로 사용할 것을 권장한다.
    // 그 이외에는 권장하지 않는다. 가령 메소드의 파라메터로 사용한다 던지.
    //  defaultMemberShip(Optional<MemberShip> optional)
    // 이려면 넘기는 쪽에서 null 넘길수 있다. 그래서 또 검사를 해야 한다.
    // if (optinal != null) 와 같이 그래서 크게 의미가 없다.
    // 오히려 코딩이 더 귀찬아진다.. null 인지 검사, 그 안에 또 뭐가 있는지 검사 등등 해야 한다.
    // Colletion 에 optional 을 감싸지 마라. 이미 Colletion 자체게 null 검사 메소드가 있다.
    // Option 에서 null 을 리턴하지마라 optioanl 을 사용하는 의미가 없다. Optional.empty() 리턴
    public Optional<MemberShip> defaultMemberShip() {
        if (this.numOfSubscribers < 2000) {
            return Optional.empty();
        } else {
            return Optional.of(new MemberShip());
        }
    }
}
