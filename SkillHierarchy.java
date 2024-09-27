
 // Abstract class representing a general skill.
 
abstract class Skill {
    private String name;
    private String type;
    private int skillLevel;

    /**
     *Constructor for the Skill class.
     * @param name The name of the skill.
     * @param type The type of the skill (Hard, Soft, Talent, Gift).
     * @param skillLevel The proficiency level of the skill (1-10).
     */
    public Skill(String name, String type, int skillLevel) {
        this.name = name;
        this.type = type;
        this.skillLevel = skillLevel;
    }

    // Getter methods
    public String getName() { return name; }
    public String getType() { return type; }
    public int getSkillLevel() { return skillLevel; }

    /**
     * Abstract method to identify the skill.
     * This method will be implemented by subclasses.
     */
    public abstract void identifySkill();
}


 //Represents a hard skill, such as programming.
 
class HardSkill extends Skill {
    public HardSkill(String name, int skillLevel) {
        super(name, "Hard", skillLevel);
    }

    @Override
    public void identifySkill() {
        System.out.println("Hard Skill of " + getName() + " has a level of " + getSkillLevel());
    }
}


 //Represents a soft skill, such as communication.
 
class SoftSkill extends Skill {
    public SoftSkill(String name, int skillLevel) {
        super(name, "Soft", skillLevel);
    }

    @Override
    public void identifySkill() {
        System.out.println("Soft Skill of " + getName() + " has a level of " + getSkillLevel());
    }
}


 //Represents a skill that is considered a natural gift, such as mercy.
 
class GiftSkill extends Skill {
    public GiftSkill(String name, int skillLevel) {
        super(name, "Gift", skillLevel);
    }

    @Override
    public void identifySkill() {
        System.out.println("Gift Skill of " + getName() + " has a level of " + getSkillLevel());
    }
}


 //Represents a skill that is considered a talent, such as organization.
 
class TalentSkill extends Skill {
    public TalentSkill(String name, int skillLevel) {
        super(name, "Talent", skillLevel);
    }

    @Override
    public void identifySkill() {
        System.out.println("Talent Skill of " + getName() + " has a level of " + getSkillLevel());
    }
}


 // Main class to demonstrate the Skill hierarchy.

public class SkillHierarchy {
    public static void main(String[] args) {
        // Create instances of each concrete class
        HardSkill programming = new HardSkill("Programming", 8);
        SoftSkill communication = new SoftSkill("Communication", 8);
        GiftSkill mercy = new GiftSkill("Mercy", 9);
        TalentSkill organization = new TalentSkill("Organization", 6);

        // Call identifySkill() method on each instance
        programming.identifySkill();
        communication.identifySkill();
        mercy.identifySkill();
        organization.identifySkill();
    }
}
