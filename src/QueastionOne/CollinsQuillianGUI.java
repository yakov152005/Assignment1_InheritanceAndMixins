package QueastionOne;

import QueastionOne.entities.Entity;
import QueastionOne.traits.*;
import QueastionOne.types.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;
import java.util.List;

public class CollinsQuillianGUI {


    static Map<String, Entity> entities = new LinkedHashMap<>();
    static List<TraitQuestion> questions = new ArrayList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CollinsQuillianGUI::createAndShowGUI);
    }

    static void createAndShowGUI() {
        JFrame frame = new JFrame("מודל קולינס וקוויליאן");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 250);
        frame.setLayout(new GridLayout(5, 1, 10, 10));

        addEntities();
        addTraitQuestions();

        JComboBox<String> entityBox = new JComboBox<>(entities.keySet().toArray(new String[0]));
        JComboBox<TraitQuestion> questionBox = new JComboBox<>(questions.toArray(new TraitQuestion[0]));

        JButton askButton = new JButton("שאל");
        JLabel resultLabel = new JLabel(" ", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 18));

        askButton.addActionListener((ActionEvent e) -> {
            String selectedName = (String) entityBox.getSelectedItem();
            TraitQuestion selectedQuestion = (TraitQuestion) questionBox.getSelectedItem();
            if (selectedName != null && selectedQuestion != null) {
                Entity entity = entities.get(selectedName);
                boolean result = entity.hasTrait(selectedQuestion.traitInterface);
                resultLabel.setText("תשובה: " + (result ? "כן" : "לא"));
            }
        });

        frame.add(new JLabel("בחר ישות:", SwingConstants.CENTER));
        frame.add(entityBox);
        frame.add(new JLabel("בחר שאלה:", SwingConstants.CENTER));
        frame.add(questionBox);
        frame.add(askButton);
        frame.add(resultLabel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    static void addEntities() {
        entities.put("סלמון", new Salmon());
        entities.put("דג שמש", new Sunfish());
        entities.put("קנרית", new Canary());
        entities.put("אדום החזה", new Robin());
        entities.put("ורד", new Rose());
        entities.put("מרגנית", new Daisy());
        entities.put("אלון", new Oak());
        entities.put("אורן", new Pine());
    }

    static void addTraitQuestions() {
        questions.add(new TraitQuestion("הוא דבר חי?", IsLivingThing.class));
        questions.add(new TraitQuestion("יכול לצמוח?", CanGrow.class));
        questions.add(new TraitQuestion("האם הוא חי?", IsAlive.class));
        questions.add(new TraitQuestion("האם הוא בעל חיים?", IsAnimal.class));
        questions.add(new TraitQuestion("יכול לזוז?", CanMove.class));
        questions.add(new TraitQuestion("יש לו עור?", HasSkin.class));
        questions.add(new TraitQuestion("האם הוא ציפור?", IsBird.class));
        questions.add(new TraitQuestion("יש לו נוצות?", HasFeathers.class));
        questions.add(new TraitQuestion("יכול לעוף?", CanFly.class));
        questions.add(new TraitQuestion("יש לו כנפיים?", HasWings.class));
        questions.add(new TraitQuestion("יכול לשיר?", CanSing.class));
        questions.add(new TraitQuestion("האם הוא דג?", IsFish.class));
        questions.add(new TraitQuestion("יש לו קשקשים?", HasScales.class));
        questions.add(new TraitQuestion("יכול לשחות?", CanSwim.class));
        questions.add(new TraitQuestion("יש לו זימים?", HasGills.class));
        questions.add(new TraitQuestion("האם הוא צומח?", IsPlant.class));
        questions.add(new TraitQuestion("יש לו שורשים?", HasRoots.class));
        questions.add(new TraitQuestion("האם הוא פרח?", IsFlower.class));
        questions.add(new TraitQuestion("יש לו עלי כותרת?", HasPetals.class));
        questions.add(new TraitQuestion("האם הוא יפה?", IsBeautiful.class));
        questions.add(new TraitQuestion("האם הוא עץ?", IsTree.class));
        questions.add(new TraitQuestion("יש לו קליפה?", HasBark.class));
        questions.add(new TraitQuestion("האם הוא גדול?", IsBig.class));
        questions.add(new TraitQuestion("יש לו ענפים?", HasBranch.class));
        questions.add(new TraitQuestion("האם יש לו עלים?", HasLeaves.class));
        questions.add(new TraitQuestion("האם הוא ירוק?", IsGreen.class));
        questions.add(new TraitQuestion("האם הוא אדום?", IsRed.class));
        questions.add(new TraitQuestion("האם הוא צהוב?", IsYellow.class));
    }
}