
import com.sun.deploy.nativesandbox.NativeSandboxBroker;
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
    private JSlider RadioVolume;
    private JSlider TVvolume;
    private JButton radioButton;
    private JButton TVButton;
    private JTextField onTV;
    private JTextField onRadio;


    public static void main(String[] args) {
        JFrame window = new JFrame();

                window.setTitle("cookie remote control");
                window.setSize(400, 100);
                window.setLocationRelativeTo(null);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setVisible(true);

            }
    public remote(){
        radioButton.addActionListener(new ButtonClicked(radioButton.getText()));
        TVButton.addActionListener(new ButtonClicked(TVButton.getText()));
        channelAfterButton.addActionListener(new ButtonClicked(channelAfterButton.getText()));
        channelBeforeButton.addActionListener(new ButtonClicked(channelBeforeButton.getText()));
            nextPlageButton.addActionListener(new ButtonClicked(nextPlageButton.getText()));
        plageBeforeButton.addActionListener(new ButtonClicked(plageBeforeButton.getText()));
        radioMuteCheckBox.addActionListener(new ButtonClicked(radioMuteCheckBox.getText()));
        TVMuteCheckBox.addActionListener(new ButtonClicked(TVMuteCheckBox.getText()));
    }

    private class ButtonClicked implements ActionListener{
        private String value;
        public ButtonClicked(String value){
            this.value=value;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (radioButton.) {
                value = "Radio on";
                onRadio.setText(value);
            }
            else if (TVButton.addActionListener()) {
                value = "TV is on";
                onTV.setText(value);
            }
        }
    }
