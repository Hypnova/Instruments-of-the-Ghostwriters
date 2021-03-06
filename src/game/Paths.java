package game;

import java.io.File;

/**
 * A class containing all the file paths for the libraries. 
 * Siavash Samiei added comments June 8, 2015.
 * <p>
 * <b> Instance Variables </b> 
 * <p>
 * <b> LIBRARY </b> static final String, library path
 * <p>
 * <b> GRPAHICS </b> static final String, graphics path
 * <p>
 * <b> TEXTURES </b> static final String, textures path
 * <p>
 * <b> PLAYER </b> static final String, player path
 * <p>
 * <b> GUI </b> static final String, gui path
 * <p>
 * <b> LEVELS </b> static final String, levels path
 * <p>
 * <b> HIGHSCORES </b> static final String, highscores path
 * <p>
 * <b> MUSIC </b> static final String, music path
 * <p>
 * <b> TEXT </b> static final String, text path
 * <p>
 * <b> AUTHORS </b> static final String, authors path
 * <p>
 * <b> AUTHOR_TEXT </b> static final String, author text path
 * <p>
 * <b> MISC </b> static final String, miscellaneous path
 * <p>
 * <b> CHM </b> static final String, chm path
 * <p>
 * 
 * @author Justin Pu June 6, 2015.
 * @version 2 06.08.15
 * 
 */
public final class Paths {
  
  private final static String LIBRARY = "lib" + File.separator;
  private final static String GRAPHICS = LIBRARY + "graphics" + File.separator;
  public final static String TEXTURES = GRAPHICS + "textures" + File.separator;
  public final static String PLAYER = GRAPHICS + "player" + File.separator;
  public final static String GUI = GRAPHICS + "gui" + File.separator;
  public final static String LEVELS = LIBRARY + "levels" + File.separator;
  public final static String HIGHSCORES = LIBRARY + "highscores" + File.separator;
  public final static String MUSIC = LIBRARY + "music" + File.separator;
  public final static String TEXT = TEXTURES + "letters" + File.separator;
  public final static String AUTHORS = GRAPHICS + "authors" + File.separator;
  public final static String AUTHOR_TEXT = LIBRARY + "author text" + File.separator;
  public final static String MISC = GRAPHICS + "misc" + File.separator;
  public final static String CHM = LIBRARY + "chm" + File.separator;

  // Private constructor
  private Paths () { }
  
}