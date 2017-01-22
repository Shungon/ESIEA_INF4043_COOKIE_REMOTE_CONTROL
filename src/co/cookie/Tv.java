package co.cookie;

/**
 * Created by farsight on 20/01/17.
 */
public class Tv implements Actions
{
    private Boolean state;
    private int channel;
    private int volume;

    Tv()
    {
        this.state = false;
        this.channel = 1;
        this.volume = 5;
    }

    @Override
    public void volume_up() {

        if(this.volume < 10)
        {
            this.volume += 1;
        }
    }

    @Override
    public void volume_down() {

        if(this.volume > 0)
        {
            this.volume -= 1;
        }
    }

    @Override
    public void turn_off() {
        this.state = false;

    }

    @Override
    public void turn_on() {
        this.state = true;
    }

    @Override
    public void channel_down()
    {
        if(this.channel > 0)
        {
            this.channel -= 1;
        }
    }

    @Override
    public void channel_up()
    {
        if(this.channel < 10)
        {
            this.channel += 1;
        }
    }
}
