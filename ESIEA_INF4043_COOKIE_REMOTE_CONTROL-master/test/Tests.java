/**
 * Created by moi on 22/01/17.
 */
import co.cookie.Mediator;
import co.cookie.Radio;
import co.cookie.Tv;
import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testTurnOnTV() {
        Tv tester = new Tv();
        Mediator testerMediator = new Mediator();
        tester.turn_on();
        assertEquals(true, tester.state);
        assertEquals("turn_on_tv",testerMediator.lastAction);
    }

    @Test
    public void testTurnOffTV() {
        Tv tester = new Tv();
        Mediator testerMediator = new Mediator();
        tester.turn_off();
        assertEquals(false, tester.state);
        assertEquals("turn_off_tv",testerMediator.lastAction);
    }

    @Test
    public void testTurnOnRadio() {
        Radio tester = new Radio();
        Mediator testerMediator = new Mediator();
        tester.turn_on();
        assertEquals(true, tester.state);
        assertEquals("turn_on_radio",testerMediator.lastAction);
    }

    @Test
    public void testTurnOffRadio() {
        Radio tester = new Radio();
        Mediator testerMediator = new Mediator();
        tester.turn_off();
        assertEquals(false, tester.state);
        assertEquals("turn_off_radio",testerMediator.lastAction);
    }

    @Test
    public void testTurnOnAll() {
        Tv testerTv = new Tv();
        Radio testerRadio = new Radio();
        Mediator testerMediator = new Mediator();
        testerMediator.turn_on_all(testerTv, testerRadio);
        assertEquals(testerTv, testerRadio);
        assertEquals(true, testerTv);
        assertEquals(true, testerRadio);
        assertEquals("turn_on_all",testerMediator.lastAction);
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
        int channelStart = tester.channel;
        tester.channel_up();
        if(channelStart == 10) {
            assertEquals(channelStart, tester.channel);
        }
        else{
            assertEquals(channelStart+1, tester.channel);
        }
        assertEquals("channel_up_tv",testerMediator.lastAction);
    }

    @Test
    public void testChannelDownTV() {
        Tv tester = new Tv();
        Mediator testerMediator = new Mediator();
        int channelStart = tester.channel;
        tester.channel_up();
        if(channelStart == 0) {
            assertEquals(channelStart, tester.channel);
        }
        else{
            assertEquals(channelStart-1, tester.channel);
        }
        assertEquals("channel_down_tv",testerMediator.lastAction);
    }

    @Test
    public void testChannelUpRadio() {
        Radio tester = new Radio();
        Mediator testerMediator = new Mediator();
        int channelStart = tester.channel;
        tester.channel_up();
        if(channelStart == 10) {
            assertEquals(channelStart, tester.channel);
        }
        else{
            assertEquals(channelStart+1, tester.channel);
        }
        assertEquals("channel_up_radio",testerMediator.lastAction);
    }

    @Test
    public void testChannelDownRadio() {
        Radio tester = new Radio();
        Mediator testerMediator = new Mediator();
        int channelStart = tester.channel;
        tester.channel_up();
        if(channelStart == 0) {
            assertEquals(channelStart, tester.channel);
        }
        else{
            assertEquals(channelStart-1, tester.channel);
        }
        assertEquals("channel_down_radio",testerMediator.lastAction);
    }

    @Test
    public void testVolumeUpTV() {
        Tv tester = new Tv();
        Mediator testerMediator = new Mediator();
        int volumeStart = tester.volume;
        tester.volume_up();
        if(volumeStart == 10) {
            assertEquals(volumeStart, tester.volume);
        }
        else{
            assertEquals(volumeStart+1, tester.volume);
        }
        assertEquals("volume_up_tv",testerMediator.lastAction);
    }

    @Test
    public void testVolumeDownTV() {
        Tv tester = new Tv();
        Mediator testerMediator = new Mediator();
        int volumeStart = tester.volume;
        tester.volume_down();
        if(volumeStart == 0) {
            assertEquals(volumeStart, tester.volume);
        }
        else{
            assertEquals(volumeStart-1, tester.volume);
        }
        assertEquals("volume_down_tv",testerMediator.lastAction);
    }

    @Test
    public void testVolumeUpRadio() {
        Radio tester = new Radio();
        Mediator testerMediator = new Mediator();
        int volumeStart = tester.volume;
        tester.volume_up();
        if(volumeStart == 10) {
            assertEquals(volumeStart, tester.volume);
        }
        else{
            assertEquals(volumeStart+1, tester.volume);
        }
        assertEquals("volume_up_radio",testerMediator.lastAction);
    }

    @Test
    public void testVolumeDownRadio() {
        Radio tester = new Radio();
        Mediator testerMediator = new Mediator();
        int volumeStart = tester.volume;
        tester.volume_down();
        if(volumeStart == 0) {
            assertEquals(volumeStart, tester.volume);
        }
        else{
            assertEquals(volumeStart-1, tester.volume);
        }
        assertEquals("volume_down_radio",testerMediator.lastAction);
    }

    @Test
    public void testUndo() {
        Tv testerTv = new Tv();
        Radio testerRadio = new Radio();
        Mediator testerMediator = new Mediator();
        String lastActionAuCasOu = testerMediator.lastAction;
        int volumeTvStart = testerTv.volume;
        int volumeRadioStart = testerRadio.volume;
        int channelTvStart = testerTv.channel;
        int channelRadioStart = testerRadio.channel;
        testerMediator.undo(testerTv, testerRadio);
        if(lastActionAuCasOu.equals("turn_on_tv")){
            assertEquals(false, testerTv.state);
        } else if(lastActionAuCasOu.equals("turn_off_tv")) {
            assertEquals(true, testerTv.state);
        } else if(lastActionAuCasOu.equals("turn_on_radio")){
            assertEquals(false, testerRadio.state);
        } else if(lastActionAuCasOu.equals("turn_off_radio")) {
            assertEquals(true, testerRadio.state);
        } else if(lastActionAuCasOu.equals("turn_on_all")) {
            assertEquals(testerRadio.state, testerTv.state);
            assertEquals(true, testerTv.state);
            assertEquals(true, testerRadio.state);
        } else if(lastActionAuCasOu.equals("volume_up_tv")) {
            assertEquals(volumeTvStart-1, testerTv.volume);
        } else if(lastActionAuCasOu.equals("volume_down_tv")) {
            assertEquals(volumeTvStart+1, testerTv.volume);
        } else if(lastActionAuCasOu.equals("volume_up_radio")) {
            assertEquals(volumeRadioStart-1, testerRadio.volume);
        } else if(lastActionAuCasOu.equals("volume_down_radio")) {
            assertEquals(volumeRadioStart+1, testerRadio.volume);
        } else if(lastActionAuCasOu.equals("channel_up_tv")) {
            assertEquals(channelTvStart-1, testerTv.channel);
        } else if(lastActionAuCasOu.equals("channel_down_tv")) {
            assertEquals(channelTvStart+1, testerTv.channel);
        } else if(lastActionAuCasOu.equals("channel_up_radio")) {
            assertEquals(channelRadioStart-1, testerRadio.channel);
        } else if(lastActionAuCasOu.equals("channel_down_radio")) {
            assertEquals(channelRadioStart+1, testerRadio.channel);
        }
    }
}