/**
 * Created by moi on 22/01/17.
 */
import co.cookie.Mediator;
import co.cookie.Radio;
import co.cookie.Tv;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testTurnOnTV() {
        Tv tester = new Tv();
        Mediator testerMediator = new Mediator();
        testerMediator.turn_on_tv(tester);
        assertEquals(true, tester.getState());
        assertEquals("turn_on_tv",testerMediator.getlastAction());
    }

    @Test
    public void testTurnOffTV() {
        Tv tester = new Tv();
        Mediator testerMediator = new Mediator();
        testerMediator.turn_off_tv(tester);
        assertEquals(false, tester.getState());
        assertEquals("turn_off_tv",testerMediator.getlastAction());
    }

    @Test
    public void testTurnOnRadio() {
        Radio tester = new Radio();
        Mediator testerMediator = new Mediator();
        testerMediator.turn_on_radio(tester);
        assertEquals(true, tester.getState());
        assertEquals("turn_on_radio",testerMediator.getlastAction());
    }

    @Test
    public void testTurnOffRadio() {
        Radio tester = new Radio();
        Mediator testerMediator = new Mediator();
        testerMediator.turn_off_radio(tester);
        assertEquals(false, tester.getState());
        assertEquals("turn_off_radio",testerMediator.getlastAction());
    }

    @Test
    public void testTurnOnAll() {
        Tv testerTv = new Tv();
        Radio testerRadio = new Radio();
        Mediator testerMediator = new Mediator();
        testerMediator.turn_on_all(testerTv, testerRadio);
        assertEquals(true, testerTv.getState());
        assertEquals(true, testerRadio.getState());
        assertEquals("turn_on_all",testerMediator.getlastAction());
    }

    /*@Test
    public void testTurnOffAll() {
        Tv testerTv = new Tv();
        Radio testerRadio = new Radio();
        Mediator testerMediator = new Mediator();
        testerMediator.turn_off_all(testerTv, testerRadio);
        assertEquals(testerTv, testerRadio);
        assertEquals(false, testerTv);
        assertEquals(false, testerRadio);
        assertEquals("turn_off_all",testerMediator.lastAction);
    }*/

    @Test
    public void testChannelUpTV() {
        Tv tester = new Tv();
        Mediator testerMediator = new Mediator();
        int channelStart = tester.getChannel();
        testerMediator.channel_up_tv(tester);
        assertEquals(channelStart+1, tester.getChannel());
        tester.setChannel(10);
        testerMediator.channel_up_tv(tester);
        assertEquals(10, tester.getChannel());
        assertEquals("channel_up_tv",testerMediator.getlastAction());
    }

    @Test
    public void testChannelDownTV() {
        Tv tester = new Tv();
        Mediator testerMediator = new Mediator();
        int channelStart = tester.getChannel();
        testerMediator.channel_down_tv(tester);
        assertEquals(channelStart-1, tester.getChannel());
        tester.setChannel(0);
        testerMediator.channel_down_tv(tester);
        assertEquals(0, tester.getChannel());
        assertEquals("channel_down_tv",testerMediator.getlastAction());
    }

    @Test
    public void testChannelUpRadio() {
        Radio tester = new Radio();
        Mediator testerMediator = new Mediator();
        int channelStart = tester.getChannel();
        testerMediator.channel_up_radio(tester);
        assertEquals(channelStart+1, tester.getChannel());
        tester.setChannel(10);
        testerMediator.channel_up_radio(tester);
        assertEquals(10, tester.getChannel());
        assertEquals("channel_up_radio",testerMediator.getlastAction());
    }

    @Test
    public void testChannelDownRadio() {
        Radio tester = new Radio();
        Mediator testerMediator = new Mediator();
        int channelStart = tester.getChannel();
        testerMediator.channel_down_radio(tester);
        assertEquals(channelStart-1, tester.getChannel());
        tester.setChannel(0);
        testerMediator.channel_down_radio(tester);
        assertEquals(0, tester.getChannel());
        assertEquals("channel_down_radio",testerMediator.getlastAction());
    }

    @Test
    public void testVolumeUpTV() {
        Tv tester = new Tv();
        Mediator testerMediator = new Mediator();
        int volumeStart = tester.getVolume();
        testerMediator.volume_up_tv(tester);
        assertEquals(volumeStart+1, tester.getVolume());
        tester.setVolume(10);
        testerMediator.volume_up_tv(tester);
        assertEquals(10, tester.getVolume());
        assertEquals("volume_up_tv",testerMediator.getlastAction());
    }

    @Test
    public void testVolumeDownTV() {
        Tv tester = new Tv();
        Mediator testerMediator = new Mediator();
        int volumeStart = tester.getVolume();
        testerMediator.volume_down_tv(tester);
        assertEquals(volumeStart-1, tester.getVolume());
        tester.setVolume(0);
        testerMediator.volume_down_tv(tester);
        assertEquals(0, tester.getVolume());
        assertEquals("volume_down_tv",testerMediator.getlastAction());
    }

    @Test
    public void testVolumeUpRadio() {
        Radio tester = new Radio();
        Mediator testerMediator = new Mediator();
        int volumeStart = tester.getVolume();
        testerMediator.volume_up_radio(tester);
        assertEquals(volumeStart+1, tester.getVolume());
        tester.setVolume(10);
        testerMediator.volume_up_radio(tester);
        assertEquals(10, tester.getVolume());
        assertEquals("volume_up_radio",testerMediator.getlastAction());
    }

    @Test
    public void testVolumeDownRadio() {
        Radio tester = new Radio();
        Mediator testerMediator = new Mediator();
        int volumeStart = tester.getVolume();
        testerMediator.volume_down_radio(tester);
        assertEquals(volumeStart-1, tester.getVolume());
        tester.setVolume(0);
        testerMediator.volume_down_radio(tester);
        assertEquals(0, tester.getVolume());
        assertEquals("volume_down_radio",testerMediator.getlastAction());
    }

    @Test
    public void testUndo() {
        Tv testerTv = new Tv();
        Radio testerRadio = new Radio();
        Mediator testerMediator = new Mediator();
        String lastActionAuCasOu = testerMediator.getlastAction();
        int volumeTvStart = testerTv.getVolume();
        int volumeRadioStart = testerRadio.getVolume();
        int channelTvStart = testerTv.getChannel();
        int channelRadioStart = testerRadio.getChannel();
        testerMediator.undo(testerTv, testerRadio);
        if(lastActionAuCasOu.equals("turn_on_tv")){
            assertEquals(false, testerTv.getState());
        } else if(lastActionAuCasOu.equals("turn_off_tv")) {
            assertEquals(true, testerTv.getState());
        } else if(lastActionAuCasOu.equals("turn_on_radio")){
            assertEquals(false, testerRadio.getState());
        } else if(lastActionAuCasOu.equals("turn_off_radio")) {
            assertEquals(true, testerRadio.getState());
        } else if(lastActionAuCasOu.equals("turn_on_all")) {
            assertEquals(testerRadio.getState(), testerTv.getState());
            assertEquals(true, testerTv.getState());
            assertEquals(true, testerRadio.getState());
        } else if(lastActionAuCasOu.equals("volume_up_tv")) {
            assertEquals(volumeTvStart-1, testerTv.getVolume());
        } else if(lastActionAuCasOu.equals("volume_down_tv")) {
            assertEquals(volumeTvStart+1, testerTv.getVolume());
        } else if(lastActionAuCasOu.equals("volume_up_radio")) {
            assertEquals(volumeRadioStart-1, testerRadio.getVolume());
        } else if(lastActionAuCasOu.equals("volume_down_radio")) {
            assertEquals(volumeRadioStart+1, testerRadio.getVolume());
        } else if(lastActionAuCasOu.equals("channel_up_tv")) {
            assertEquals(channelTvStart-1, testerTv.getChannel());
        } else if(lastActionAuCasOu.equals("channel_down_tv")) {
            assertEquals(channelTvStart+1, testerTv.getChannel());
        } else if(lastActionAuCasOu.equals("channel_up_radio")) {
            assertEquals(channelRadioStart-1, testerRadio.getChannel());
        } else if(lastActionAuCasOu.equals("channel_down_radio")) {
            assertEquals(channelRadioStart+1, testerRadio.getChannel());
        }
    }
}