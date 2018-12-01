import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class QuizCardBuilder {
    private JTextArea question;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;
    private JFrame frame;

    public static void main(String[] args) {
        QuizCardBuilder builder = new QuizCardBuilder();
        builder.go();
    }
    public void go() {
        frame = new JFrame("Quiz Card Builder");
        JPanel panel = new JPanel();
        Font bigFont = new Font("sansserif", Font.BOLD, 24);

        initializeTextAreas(bigFont);
        JScrollPane questionScrollbar = new JScrollPane(question);
        JScrollPane answerScrollbar = new JScrollPane(answer);
        setScrollBarPolicies(questionScrollbar, answerScrollbar);

        JButton nextButton = new JButton("Next Card");
        cardList = new ArrayList<QuizCard>();
        JLabel questionLabel = new JLabel("Question:");
        JLabel answerLabel = new JLabel("Answer:");

        addComponentsToPanel(panel, questionScrollbar, answerScrollbar, nextButton, questionLabel, answerLabel);
        ComposeMenuBar(nextButton);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        setFrameDefaults();
    }

    private void setFrameDefaults() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setVisible(true);
    }

    private void ComposeMenuBar(JButton nextButton) {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        addEventListeners(nextButton, newMenuItem, saveMenuItem);
    }

    private void addEventListeners(JButton nextButton, JMenuItem newMenuItem, JMenuItem saveMenuItem) {
        nextButton.addActionListener(new NextCardListener());
        newMenuItem.addActionListener(new NewMenuListener());
        saveMenuItem.addActionListener(new SaveMenuListener());
    }

    private void addMenuItemListeners(JMenuItem newMenuItem, JMenuItem saveMenuItem) {
        newMenuItem.addActionListener(new NewMenuListener());
        saveMenuItem.addActionListener(new SaveMenuListener());
    }

    private void addComponentsToPanel(JPanel panel, JScrollPane questionScrollbar, JScrollPane answerScrollbar, JButton nextButton, JLabel questionLabel, JLabel answerLabel) {
        panel.add(questionLabel);
        panel.add(questionScrollbar);
        panel.add(answerLabel);
        panel.add(answerScrollbar);
        panel.add(nextButton);
    }

    private void setScrollBarPolicies(JScrollPane questionScrollbar, JScrollPane answerScrollbar) {
        questionScrollbar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        questionScrollbar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        answerScrollbar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        answerScrollbar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    }

    private void initializeTextAreas(Font bigFont) {
        initializeQuestionTextArea(bigFont);
        initializeAnswerTextArea(bigFont);
    }

    private void initializeAnswerTextArea(Font bigFont) {
        answer = new JTextArea(6, 20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(bigFont);
    }

    private void initializeQuestionTextArea(Font bigFont) {
        question = new JTextArea(6, 20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(bigFont);
    }

    class NextCardListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            QuizCard card = new QuizCard(question.getText(), answer.getText());
            cardList.add(card);
            clearCard();
        }
    }

    class SaveMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            QuizCard card = new QuizCard(question.getText(), answer.getText());
            cardList.add(card);
            JFileChooser fileSave = new JFileChooser();
            fileSave.showSaveDialog(frame);
            saveFile(fileSave.getSelectedFile());
        }
    }

    class NewMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            cardList.clear();
            clearCard();
        }
    }

    private void clearCard() {
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }

    private void saveFile(File file) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (QuizCard card:cardList) {
                writer.write(card.getQuestion() + "/");
                writer.write(card.getAnswer() + "\n");;
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println("Unable to write out card list.");
            ex.printStackTrace();
        }
    }

}
