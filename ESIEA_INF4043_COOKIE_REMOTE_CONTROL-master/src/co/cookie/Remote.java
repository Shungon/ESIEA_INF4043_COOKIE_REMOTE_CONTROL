
import com.sun.deploy.nativesandbox.NativeSandboxBroker;
import com.sun.deploy.panel.NetworkSettingsDialog;
import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


  public remote(){
        radioButton.addActionListener(new PowerButtonClicked(radioButton.getText()));
        TVButton.addActionListener(new PowerButtonClicked(TVButton.getText()));
        channelAfterButton.addActionListener(new ChannelButtonClicked(channelAfterButton.getText()));
        channelBeforeButton.addActionListener(new ChannelButtonClicked(channelBeforeButton.getText()));
        nextPlageButton.addActionListener(new PlageButtonClicked(nextPlageButton.getText()));
            plageBeforeButton.addActionListener(new PlageButtonClicked(plageBeforeButton.getText()));
        radioMuteCheckBox.addActionListener(new MuteButtonClicked(radioMuteCheckBox.getText()));
        TVMuteCheckBox.addActionListener(new MuteButtonClicked(TVMuteCheckBox.getText()));
        radioVolUpButton.addActionListener(new VolButtonClicked(radioVolUpButton.getText()));
        radioVolDownButton.addActionListener(new VolButtonClicked(radioVolDownButton.getText()));
        TVVolDownButton.addActionListener(new VolButtonClicked(TVVolDownButton.getText()));
        TVvolUpButton.addActionListener(new VolButtonClicked(TVvolUpButton.getText()));
    }

    private class PowerButtonClicked implements ActionListener{
        private String value;
        public PowerButtonClicked(String value){
            this.value=value;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (radioButton.addActionListener()) {
                value = "Radio on";
                onRadio.setText(value);
            }
            else if (TVButton.addActionListener()) {
                value = "TV is on";
                onTV.setText(value);
            }
        }
    }
    private class VolButtonClicked implements ActionListener{
        private String value;
        this.value = value;
        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }
    private class MuteButtonClicked implements ActionListener{
        private String mute;
        this.mute=mute;

        @Override
        public void actionPerformed(ActionEvent e){

        }
    }
    private class PlageButtonClicked implements ActionListener {
        private String value;
        this.value =value;

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class ChannelButtonClicked implements ActionListener {
        private String value;
        this.value =value;

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    

}
