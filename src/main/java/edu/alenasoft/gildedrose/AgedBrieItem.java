package edu.alenasoft.gildedrose;

public class AgedBrieItem extends NormalItem {

  public AgedBrieItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void updateQuality() {
    if (super.getQuality() < Item.MAX_QUALITY) {
      super.setQuality(super.getQuality() + 1);
    }
  }

}
