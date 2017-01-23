import com.sun.deploy.panel.NetworkSettingsDialog;
import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class remote  {

    private JButton channelBeforeButton;
    private JButton plageBeforeButton;
    private JCheckBox TVMuteCheckBox;
    private JButton nextPlageButton;
    private JCheckBox radioMuteCheckBox;
    private JButton channelAfterButton;
    private JButton radioButton;
    private JButton TVButton;
    private JTextField onTV;
    private JTextField onRadio;
    private JButton radioVolUpButton;
    private JButton radioVolDownButton;
    private JButton TVvolUpButton;
    private JButton TVVolDownButton;
    private JPanel remoteView;


    public static void main(String[] args) {
        JFrame window = new JFrame("Cookie Remote Control");

                window.setContentPane( new remote().remoteView);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.pack();
                window.setVisible(true);

            }
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
