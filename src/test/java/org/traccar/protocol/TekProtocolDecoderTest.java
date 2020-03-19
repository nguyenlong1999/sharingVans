package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class TekProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        TekProtocolDecoder decoder = new TekProtocolDecoder(null);

        verifyPosition(decoder, binary(
                "0501E304E00E76086107502100455111492C33332C3137303935342E302C353235352E393933344E2C30303833322E34333935572C322E312C3133342E382C322C302E30302C302E302C302E302C3234303931352C30362C3C45"));

        verifyAttributes(decoder, binary(
                "0501C2828E14750861075021004551047B00019700000082010F0A5B28770A5B28770A5B28760A5B28770A5B28770A5B28770A5B28770A5B28760A5B28760A5B28760A5B28770A5B28760A5B28760A5B28760A5D28770A5D28770A5D28770A5D28770A5D28770A5D28770A5D28770A5D28770A5D28770A5D28770A5F2877000000000000000000000000EEBA"));

        verifyAttributes(decoder, binary(
                "0509220886157E0863835020373564087B00018C0000018003160A6E28790A6E28790A6E287A0A6E287A0A6E287A0A6E287A0A6E287A0A6E287A0A6E287A0A6E287A000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000BD35"));

    }

}
