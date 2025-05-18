package QueastionOne;

import QueastionOne.entities.*;
import QueastionOne.traits.*;
import QueastionOne.traits.IsLivingThing;
import QueastionOne.types.*;

import java.util.*;

 public class CollinsQuillianModel {

    static Map<String, Entity> entities = new HashMap<>();
    static Map<Integer, TraitQuestion> questions = new LinkedHashMap<>();

    public static void main(String[] args) {
        addEntities();
        addTraitQuestions();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            List<String> names = new ArrayList<>(entities.keySet());
            int entityChoice = -1;

            while (true) {
                System.out.println("\nבחר אחת מהישויות הבאות:");
                for (int i = 0; i < names.size(); i++) {
                    System.out.println((i + 1) + ". " + names.get(i));
                }
                System.out.println("הכנס מספר ישות (1-" + names.size() + "), או 999 כדי לצאת:");

                try {
                    entityChoice = Integer.parseInt(scanner.nextLine()) - 1;

                    if (entityChoice == 998) {
                        exit = true;
                        System.out.println("Exit...");
                        break;
                    } else if (entityChoice < 0 || entityChoice >= names.size()) {
                        System.out.println("המספר שהוזן אינו תקף, נסה שוב.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("אנא הזן מספר תקף.");
                }
            }

            if (exit) break;

            String entityName = names.get(entityChoice);
            Entity entity = entities.get(entityName);
            System.out.println("נבחר: " + entityName);

            boolean questionLoop = true;
            while (questionLoop) {
                System.out.println("\nבחר שאלה לבירור:");
                for (Map.Entry<Integer, TraitQuestion> entry : questions.entrySet()) {
                    System.out.println(entry.getKey() + ". " + entry.getValue().label);
                }
                System.out.println("הכנס מספר שאלה (או 99 לחזור לבחירת ישות):");

                try {
                    int questionChoice = Integer.parseInt(scanner.nextLine());
                    if (questionChoice == 99) {
                        questionLoop = false;
                        System.out.println("Back...");
                    } else if (!questions.containsKey(questionChoice)) {
                        System.out.println("שאלה לא קיימת, נסה שוב.");
                    } else {
                        TraitQuestion question = questions.get(questionChoice);
                        boolean result = entity.hasTrait(question.traitInterface);
                        if (result) {
                            System.out.println("תשובה: כן");
                        } else {
                            System.out.println("תשובה: לא");
                            System.out.println("← עץ היררכיית המחלקות של " + entity.getName() + ":");
                            printClassHierarchy(entity.getClass());
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("אנא הזן מספר תקף.");
                }
            }
        }
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
        int i = 1;

        //1
        questions.put(i++, new TraitQuestion("הוא דבר חי?", IsLivingThing.class));
        questions.put(i++, new TraitQuestion("יכול לצמוח?", CanGrow.class));
        questions.put(i++, new TraitQuestion("האם הוא חי?", IsAlive.class));


        //2
        questions.put(i++, new TraitQuestion("האם הוא בעל חיים?", IsAnimal.class));
        questions.put(i++, new TraitQuestion("הוא יכול לזוז?", CanMove.class));
        questions.put(i++, new TraitQuestion("האם יש לו עור?", HasSkin.class));

        //3
        questions.put(i++, new TraitQuestion("האם הוא ציפור?", IsBird.class));
        questions.put(i++, new TraitQuestion("האם יש לו נוצות?", HasFeathers.class));
        questions.put(i++, new TraitQuestion("האם הוא יכול לעוף?", CanFly.class));
        questions.put(i++, new TraitQuestion("האם יש לו כנפיים?", HasWings.class));

        //4
        questions.put(i++, new TraitQuestion("האם הוא יכול לשיר?", CanSing.class));

        //3
        questions.put(i++, new TraitQuestion("האם הוא דג?", IsFish.class));
        questions.put(i++, new TraitQuestion("האם יש לו קשקשים?", HasScales.class));
        questions.put(i++, new TraitQuestion("האם הוא יכול לשחות?", CanSwim.class));
        questions.put(i++, new TraitQuestion("האם יש לו זימים?", HasGills.class));

        //2
        questions.put(i++, new TraitQuestion("האם הוא צומח?", IsPlant.class));
        questions.put(i++, new TraitQuestion("האם יש לו שורשים?", HasRoots.class));

        //3
        questions.put(i++, new TraitQuestion("האם הוא פרח?", IsFlower.class));
        questions.put(i++, new TraitQuestion("האם יש לו עלי כותרת?", HasPetals.class));
        questions.put(i++, new TraitQuestion("האם הוא יפה?", IsBeautiful.class));

        //4
        questions.put(i++, new TraitQuestion("האם הוא צהוב?", IsYellow.class));
        questions.put(i++, new TraitQuestion("האם הוא אדום?", IsRed.class));

        //3
        questions.put(i++, new TraitQuestion("האם הוא עץ?", IsTree.class));
        questions.put(i++, new TraitQuestion("האם יש לו קליפה?", HasBark.class));
        questions.put(i++, new TraitQuestion("האם הוא גדול?", IsBig.class));
        questions.put(i++, new TraitQuestion("האם יש לו ענפים?", HasBranch.class));

        //4
        questions.put(i++, new TraitQuestion("האם יש לו עלים?", HasLeaves.class));
        questions.put(i++, new TraitQuestion("האם הוא ירוק?", IsGreen.class));
    }


     static void printClassHierarchy(Class<?> clazz) {
         List<Class<?>> hierarchy = new ArrayList<>();
         while (clazz != null && clazz != Object.class) {
             hierarchy.add(clazz);
             clazz = clazz.getSuperclass();
         }
         Collections.reverse(hierarchy);

         for (int i = 0; i < hierarchy.size(); i++) {
             Class<?> cls = hierarchy.get(i);
             String indent = "  ".repeat(i);
             System.out.println(indent + "↳ " + cls.getSimpleName());

             Class<?>[] interfaces = cls.getInterfaces();
             for (Class<?> iface : interfaces) {
                 System.out.println(indent + "    ↪ implements " + iface.getSimpleName());
             }
         }
     }

 }
