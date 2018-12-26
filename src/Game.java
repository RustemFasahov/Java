import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    private JPanel panel;
    private JPanel panelRefresh;
    private JButton[][] buttons;
    private JButton refresh;

    public Game() throws HeadlessException {
        initArea();
        playerHit();
    }

    public void initArea() {
        setTitle("Крестики-нолики");
        setBounds(200, 200, 300, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        panel = new JPanel(new GridLayout(3, 3));
        panelRefresh = new JPanel(new BorderLayout());
        setContentPane(panel);
        buttons = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                panel.add(buttons[i][j]);
            }
        }
        setVisible(true);
    }

    public void playerHit() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int x = i, y = j;
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        buttons[x][y].setText("X");
                        buttons[x][y].setEnabled(false);
                        if(checkVin("X")) vinFrame("Игрок выиграл!");
                        else if(checkFull())vinFrame("Поле полное.");
                        else if (checkFull() == false){
                            aiHit();
                            if (checkVin("O"))vinFrame("Победил компьютер!");
                        }
                    }
                });
            }
        }

    }

    public void aiHit() {
        int number1;
        int number2;
        do {
            number1 = (int) (Math.random() * 3);
            number2 = (int) (Math.random() * 3);
        } while (buttons[number1][number2].getText() == "X" || buttons[number1][number2].getText() == "O");
        buttons[number1][number2].setText("O");
        buttons[number1][number2].setEnabled(false);
    }

    public boolean checkVin(String sym) {
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText() == buttons[i][1].getText() &&
                    buttons[i][0].getText() == buttons[i][2].getText() &&
                    buttons[i][0].getText() == sym) return true;

            else if (buttons[0][i].getText() == buttons[1][i].getText() &&
                    buttons[0][i].getText() == buttons[2][i].getText() &&
                    buttons[0][i].getText() == sym) return true;
        }
        if (buttons[0][0].getText() == buttons[1][1].getText() &&
                buttons[0][0].getText() == buttons[2][2].getText() &&
                buttons[0][0].getText() == sym) return true;
        else if (buttons[0][2].getText() == buttons[1][1].getText() &&
                buttons[0][2].getText() == buttons[2][0].getText() &&
                buttons[0][2].getText() == sym) return true;
        return false;
    }

    public boolean checkFull(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(buttons[i][j].getText() == "") return false;
            }
        }
        return true;
    }

    public void setBut(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setEnabled(true);
                panel.add(buttons[i][j]);
            }
        }
    }

    public void vinFrame(String result){
        setBounds(200,200,300,300);
        setTitle(result);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                panel.remove(buttons[i][j]);
            }
        }
        setContentPane(panelRefresh);
        refresh = new JButton("Переиграть");
        panelRefresh.add(refresh, BorderLayout.CENTER);
        setVisible(true);
        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(refresh);
                setBut();
                setTitle("Игра продолжается");
                setContentPane(panel);
                setVisible(true);
            }
        });
    }
}


