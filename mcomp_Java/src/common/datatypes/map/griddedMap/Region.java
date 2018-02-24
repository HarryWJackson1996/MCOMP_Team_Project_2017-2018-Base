/**
 * 
 */
package common.datatypes.map.griddedMap;

import common.datatypes.Waypoint;

/**
 * @author David Avery
 *
 */
public class Region {

  private Chunk[][] chunks = new Chunk[GriddedMap.gridSize][GriddedMap.gridSize];

  /**
   * 
   */
  public Region(Waypoint w) {
    // TODO Auto-generated constructor stub
    // TODO this is going to need some serious optimisation if accessed on a single point bases
    this.add(w);
  }


  public boolean add(Waypoint w) {
    // TODO
    int ChunkX = (int) ((w.getX() / (GriddedMap.gridSize ^ 1)) % GriddedMap.gridSize);
    int ChunkY = (int) ((w.getY() / (GriddedMap.gridSize ^ 1)) % GriddedMap.gridSize);
    if (chunks[ChunkX][ChunkY] == null) {
      chunks[ChunkX][ChunkY] = new Chunk(w);
    } else {
      chunks[ChunkX][ChunkY].add(w);
    }
    // calc which chunk
    // call add on calced chunk
    // rest of call in chunk
    return true;

  }

  Chunk[][] getGrid() {// FIXME what do we want from this DS?
    return chunks;
  }
  
}
