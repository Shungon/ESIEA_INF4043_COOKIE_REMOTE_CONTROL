package co.cookie;

/**
 * Created by farsight on 20/01/17.
 */
public class Mediator
{
    private String lastAction;

    Mediator()
    {
        lastAction = "nothing to be seen";
    }

    public void turn_off_tv(Tv tv) {
        tv.turn_off();
        lastAction = "turn_off_tv";
    }
    public void turn_on_tv(Tv tv) {
        tv.turn_on();
        lastAction ="turn_on_tv";
    }
    public void channel_down_tv(Tv tv) {
        tv.channel_down();
        lastAction = "channel_down_tv";
    }
    public void channel_up_tv(Tv tv) {
        tv.channel_up();
        lastAction = "channel_up_tv";
    }
    public void volume_up_tv(Tv tv) {
        tv.volume_up();
        lastAction = "volume_up_tv";
    }
    public void volume_down_tv(Tv tv) {
        tv.volume_down();
        lastAction = "volume_down_tv";
    }
    public void turn_on_radio(Radio radio) {
        radio.turn_on();
        lastAction = "turn_on_radio";
    }
    public void turn_off_radio(Radio radio) {
        radio.turn_off();
        lastAction = "turn_off_radio";
    }
    public void channel_down_radio(Radio radio) {
        radio.channel_down();
        lastAction = "channel_down_radio";
    }
    public void channel_up_radio(Radio radio) {
        radio.channel_up();
        lastAction = "channel_up_radio";
    }
    public void volume_up_radio(Radio radio) {
        radio.volume_up();
        lastAction = "volume_up_radio";
    }
    public void volume_down_radio(Radio radio) {
        radio.volume_down();
        lastAction = "volume_down_radio";
    }
    public void turn_on_all(Tv tv, Radio radio) {
        tv.turn_on();
        radio.turn_on();
        lastAction = "turn_on_all";
    }
    public void undo(Tv tv, Radio radio) {
        if(lastAction.equals("nothing to be seen"))
        {
            if (lastAction.equals("turn_on_tv")) {
                tv.turn_off();

            } else if (lastAction.equals("turn_off_tv")) {
                tv.turn_on();

            } else if (lastAction.equals("channel_down_tv")) {
                tv.channel_up();

            } else if (lastAction.equals("channel_up_tv")) {
                tv.channel_up();

            } else if (lastAction.equals("volume_up_tv")) {
                tv.volume_down();

            } else if (lastAction.equals("volume_down_tv")) {
                tv.volume_up();

            } else if (lastAction.equals("turn_on_radio")) {
                radio.turn_off();

            } else if (lastAction.equals("turn_off_radio")) {
                radio.turn_on();

            } else if (lastAction.equals("channel_down_radio")) {
                radio.channel_up();

            } else if (lastAction.equals("channel_up_radio")) {
                radio.channel_down();

            } else if (lastAction.equals("volume_up_radio")) {
                radio.volume_down();

            } else if (lastAction.equals("volume_down_radio")) {
                radio.volume_up();

            } else if (lastAction.equals("turn_on_all")) {
                tv.turn_off();
                radio.turn_off();

            }
        }
    }
}