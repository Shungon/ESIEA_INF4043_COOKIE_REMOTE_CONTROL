/**
 * Created by Charlotte on 20/01/2017.
 */
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
    public JPanel remoteView;


    public static void main(String[] args) {
        JFrame window = new JFrame("Cookie Remote Control");
        JTextField onTV = new JTextField();
                window.add(onTV);
        JTextField onRadio = new JTextField();
            window.add(onRadio);
        JButton channelBeforeButton = new JButton();
            window.add(channelBeforeButton);
        JButton channelAfterButton = new JButton();
            window.add(channelAfterButton);
        JButton plageBeforeButton = new JButton();
            window.add(plageBeforeButton);
        JButton nextPlageButton = new JButton();
            window.add(nextPlageButton);
        JButton radioButton = new JButton();
            window.add(radioButton);
        JButton TVButton = new JButton();
            window.add(TVButton);
        JButton radioVolUpButton = new JButton();
            window.add(radioVolUpButton);
        JButton radioVolDownButton = new JButton();
            window.add(radioVolDownButton);
        JButton TVVolDownButton = new JButton();
            window.add(TVVolDownButton);
        JButton TVvolUpButton = new JButton();
            window.add(TVvolUpButton);
        JCheckBox muteTV = new JCheckBox();
            window.add(muteTV);
        JCheckBox muteRadio = new JCheckBox();
            window.add(muteRadio);

        window.setContentPane( new remote().remoteView);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.pack();
                window.setVisible(true);

            }


    public remote() {

        radioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onRadio.setText("Radio on ! ");
            }
        });
        TVButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onTV.setText("TV on !");
            }
        });
        channelAfterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onTV.setText("you are on the next channel");
            }
        });
        channelBeforeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onTV.setText("you are on the channel before");
            }
        });
        nextPlageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onRadio.setText("That's the next Station");
            }
        });
        plageBeforeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onRadio.setText("That's the radio before yours ;)");
            }
        });
        radioMuteCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onRadio.setText("You've muted the radio");
            }
        });
        TVMuteCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onTV.setText("You've muted your TV");
            }
        });
        radioVolUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onRadio.setText("Volume is up, maybe too loud ? ");
            }
        });
        radioVolDownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onRadio.setText("Are you sure you can hear it ?");
            }
        });
        TVVolDownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onTV.setText("TV's volume up");
            }
        });
        TVvolUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onTV.setText("TV's volume is down");
            }
        });
    }



}
