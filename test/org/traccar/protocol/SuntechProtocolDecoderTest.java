package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolDecoderTest;

public class SuntechProtocolDecoderTest extends ProtocolDecoderTest {

    @Test
    public void testDecode() throws Exception {

        SuntechProtocolDecoder decoder = new SuntechProtocolDecoder(new SuntechProtocol());
        
        verifyNothing(decoder, text(
                "SA200ALV;317652"));
        
        verifyPosition(decoder, text(
                "ST910;Alert;123456;410;20141018;18:30:12;+37.478774;+126.889690;000.000;000.00;0;4.0;1;6002"),
                position("2014-10-18 18:30:12.000", true, 37.47877, 126.88969));

        verifyPosition(decoder, text(
                "ST910;Alert;123456;410;20141018;18:30:12;+37.478774;+126.889690;000.000;000.00;0;4.0;1;6002;02;0;0310000100;450;01;-282;70;255;3;0"));

        verifyPosition(decoder, text(
                "SA200STT;317652;042;20120718;15:37:12;16d41;-15.618755;-056.083241;000.024;000.00;8;1;41548;12.17;100000;2;1979"),
                position("2012-07-18 15:37:12.000", true, -15.61876, -56.08324));

        verifyPosition(decoder, text(
                "SA200STT;317652;042;20120721;19:04:30;16d41;-15.618743;-056.083221;000.001;000.00;12;1;41557;12.21;000000;1;3125"));

        verifyPosition(decoder, text(
                "SA200STT;317652;042;20120722;00:24:23;4f310;-15.618767;-056.083214;000.011;000.00;11;1;41557;12.21;000000;1;3205"));

        verifyPosition(decoder, text(
                "SA200STT;315198;042;20120808;20:37:34;3fac25;-15.618731;-056.083216;000.007;000.00;12;1;48;0.00;000000;1;0127"));

        verifyPosition(decoder, text(
                "SA200STT;315198;042;20120809;13:43:34;4f310;-15.618709;-056.083223;000.025;000.00;8;1;49;12.10;100000;2;0231"));

        verifyPosition(decoder, text(
                "SA200EMG;317652;042;20120718;15:35:41;16d41;-15.618740;-056.083252;000.034;000.00;8;1;41548;12.17;110000;1"));

        verifyPosition(decoder, text(
                "SA200ALT;317652;042;20120829;14:25:58;16d41;-15.618770;-056.083242;000.029;000.00;0;0;2404240;0.00;000000;10"));

        verifyPosition(decoder, text(
                "SA200STT;430070;133;20130615;22:22:32;151347;+02.860514;-060.653351;000.003;000.00;12;1;0;12.39;000000;1;0208"));

        verifyPosition(decoder, text(
                "ST910;Location;344506;017;20130727;14:10:00;-25.398714;-049.296818;000.187;000.00;1;4.32;1;1;0001"));

        verifyPosition(decoder, text(
                "ST300STT;205027329;03;374;20150108;17:54:42;177b38;-23.566052;-046.477588;000.000;000.00;0;0;0;12.11;000000;1;0312"));
        
        verifyPosition(decoder, text(
                "ST910;Emergency;205283272;500;20150716;19:12:01;-23.659019;-046.695403;000.602;000.00;0;4.2;1;1;02;10820;2fdb090736;724;05;0;2311;255;0;100"));

    }

}
