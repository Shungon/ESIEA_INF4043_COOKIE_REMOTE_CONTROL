package co.cookie;

/**
 * Created by farsight on 20/01/17.
 */
public class RemoteControl
{

    public void turn_off_tv(Mediator med, Tv tv) {
        med.turn_off_tv(tv);
    }

    public void turn_on_tv(Mediator med, Tv tv) {
        med.turn_off_tv(tv);
    }

    public void turn_on_radio(Mediator med, Radio radio) {
        med.turn_on_radio(radio);
    }

    public void turn_off_radio(Mediator med, Radio radio) {
        med.turn_off_radio(radio);
    }

    public void turn_on_all(Mediator med, Tv tv, Radio radio) {
        med.turn_on_all(tv, radio);
    }

    public void channel_down_tv(Mediator med, Tv tv) {
        med.channel_down_tv(tv);
    }

    public void channel_up_tv(Mediator med, Tv tv) {
        med.channel_up_tv(tv);
    }

    public void channel_down_radio(Mediator med, Radio radio) {
        med.channel_down_radio(radio);
    }

    public void channel_up_radio(Mediator med, Radio radio) {
        med.channel_up_radio(radio);
    }

    public void volume_up_radio(Mediator med, Radio radio) {
        med.volume_up_radio(radio);
    }

    public void volume_down_radio(Mediator med, Radio radio) {
        med.volume_down_radio(radio);
    }

    public void volume_up_tv(Mediator med, Tv tv) {
        med.volume_up_tv(tv);
    }

    public void volume_down_tv(Mediator med, Tv tv) {
        med.volume_down_tv(tv);
    }

    public void undo(String lastActions) {

    }
}
