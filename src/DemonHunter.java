/**
 * This interface represents a Demon Hunter character with basic actions.
 *
 * Implementing classes should provide concrete behavior for eating, sleeping,
 * fighting and basic getters/setters for tracking energy and popularity.
 */
interface DemonHunter {
    /**
     * Character eats to regain energy.
     */
    public void eat();

    /**
     * Character sleeps to regain more energy.
     */
    public void sleep();

    /**
     * Character fights which reduces energy and may change popularity.
     */
    public void fight();

    /**
     * Get the display name of this character.
     * @return the character name
     */
    public String getName();

    /**
     * Get the current energy level (0-100).
     * @return energy level
     */
    public int getEnergy();

    /**
     * Get the current popularity level (0-100).
     * @return popularity level
     */
    public int getPopularity();

    /**
     * Set the energy level for this character.
     * @param energy new energy value (typically 0-100)
     */
    public void setEnergy(int energy);

}