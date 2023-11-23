package me.whiteship.chapter01.item07.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ChannelTest {

    @Test
    void npe() {
        Channel channel = new Channel();
        Optional<MemberShip> optional = channel.defaultMemberShip();
//        MemberShip memberShip = optional.get(); // NoSuchElementException 발생. 비어 잇는데서 꺼낼려고 함.
//        memberShip.hello();
        optional.ifPresent(MemberShip::hello);


    }

}