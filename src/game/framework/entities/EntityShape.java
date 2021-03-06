package game.framework.entities;

import game.framework.utilities.GameEngineConstants;

import java.awt.Color;

public class EntityShape extends Entity2D
{
  public static final int     DEFAULT_WIDTH      = 16;
  public static final int     DEFAULT_HEIGHT     = 16;
  public static final Color   DEFAULT_COLOR      = Color.RED;
  public static final boolean DEFAULT_FILL_STATE = true;

  // Variables that only apply to shapes
  protected Color             color;
  protected boolean           fill;

  /*
   * Default Constructor
   */
  public EntityShape()
  {
    this(GameEngineConstants.EntityTypes.UNDEFINED, Color.RED);
  }

  public EntityShape(GameEngineConstants.EntityTypes type)
  {
    this(type, DEFAULT_COLOR);
  }

  /*
   * Constructor specifying the type and color of the shape entity
   */
  public EntityShape(GameEngineConstants.EntityTypes type, Color color)
  {
    super(type);

    this.color = color;
    this.fill = DEFAULT_FILL_STATE;
  }

  /*
   * Get the color of the entity
   */
  public Color getColor()
  {
    return color;
  }

  public boolean getFill()
  {
    return fill;
  }

  /*
   * Set the color of the entity
   */
  public void setColor(Color c)
  {
    color = c;
  }

  public void setFill(boolean fill)
  {
    this.fill = fill;
  }

  /////////////////////////////////////////////////////////////////////////////
  //   ____       _                   __  __      _   _               _     
  //  |  _ \  ___| |__  _   _  __ _  |  \/  | ___| |_| |__   ___   __| |___ 
  //  | | | |/ _ \ '_ \| | | |/ _` | | |\/| |/ _ \ __| '_ \ / _ \ / _` / __|
  //  | |_| |  __/ |_) | |_| | (_| | | |  | |  __/ |_| | | | (_) | (_| \__ \
  //  |____/ \___|_.__/ \__,_|\__, | |_|  |_|\___|\__|_| |_|\___/ \__,_|___/
  //                          |___/                                         
  //
  /////////////////////////////////////////////////////////////////////////////

  public String toString()
  {
    String entitySnapshot = super.toString();

    entitySnapshot += "Color: " + color + "\n";

    return entitySnapshot;
  }
}
