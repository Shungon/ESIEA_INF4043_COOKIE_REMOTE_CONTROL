package co.cookie;

import java.util.concurrent.TimeUnit;

/**
 * Created by farsight on 20/01/17.
 */
public class Radio implements Actions
{
    public Boolean state;
    public int channel;
    public int volume;

    public Radio()
    {
        this.state = false;
        this.channel = 1;
        this.volume = 5;
    }

    @Override
    public void channel_down() {

        if(this.channel > 0)
        {
            this.channel -= 1;
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void channel_up() {

        if(this.channel < 10)
        {
            this.channel += 1;
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
    public void turn_on() {
        this.state = true;
    }

    @Override
    public void turn_off() {
        this.state = false;
    }
}
