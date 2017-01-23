package co.cookie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class remote extends JFrame{

    private JLabel onRadio;
    private JLabel onTV;
    private JButton channelBeforeButton;
    private JButton plageBeforeButton;
    private JButton nextPlageButton;
    private JButton channelAfterButton;
    private JButton radioButton;
    private JButton TVButton;
    private JButton radioVolUpButton;
    private JButton radioVolDownButton;
    private JButton TVvolUpButton;
    private JButton TVVolDownButton;

    private remote(){
        this.setTitle("Cookie Remote Control");
        this.setSize(1200  , 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints(); //define size
        gc.insets = new Insets(0, 0, 0, 0);
        gc.ipady = gc.anchor = GridBagConstraints.CENTER;
        gc.weightx = 2;
        gc.weighty=5;

        gc.gridx = 0;
        gc.gridy = 0;
        JLabel onRadio = new JLabel("actions on radio");
        panel.add(onRadio,gc);

        gc.gridx = 1;
        gc.gridy = 0;
        JLabel onTV = new JLabel("action on TV");
        panel.add(onTV,gc);

        gc.gridx = 0;
        gc.gridy = 1;
        JButton radioButton = new JButton("power on radio");
        panel.add(radioButton,gc);

        gc.gridx = 1;
        gc.gridy = 1;
        JButton TVButton = new JButton("power on TV");
        panel.add(TVButton,gc);


        gc.gridx = 0;
        gc.gridy = 2;
        JButton nextPlageButton = new JButton("next radio");
        panel.add(nextPlageButton,gc);

        gc.gridx = 1;
        gc.gridy = 2;
        JButton nextChannelButton = new JButton("next TV channel");
        panel.add(nextChannelButton,gc);

        gc.gridx = 0;
        gc.gridy = 3;
        JButton plageBeforeButton = new JButton("radio before");
        panel.add(plageBeforeButton,gc);

        gc.gridx = 1;
        gc.gridy = 3;
        JButton channelBeforeButton = new JButton("TV channel before");
        panel.add(channelBeforeButton,gc);

        gc.gridx = 0;
        gc.gridy = 4;
        JButton radioVolUpButton = new JButton("radio volume up");
        panel.add(radioVolUpButton,gc);

        gc.gridx = 1;
        gc.gridy = 4;
        JButton TVvolUpButton = new JButton("TV volume up");
        panel.add(TVvolUpButton,gc);

        gc.gridx = 0;
        gc.gridy = 5;
        JButton radioVolDownButton = new JButton("radio volume down");
        panel.add(radioVolDownButton,gc);

        gc.gridx = 1;
        gc.gridy = 5;
        JButton TVVolDownButton = new JButton("TV volume down");
        panel.add(TVVolDownButton,gc);

        this.add(panel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void actions ()
    {
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
    public static void main(String[] args) {

        remote window = new remote();
    }


}
