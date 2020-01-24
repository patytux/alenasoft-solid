package edu.alenasoft.gildedrose;

public class ConjuredItem extends NormalItem {

  public ConjuredItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void updateQuality() {
    super.setQuality(super.getQuality() - (super.getSellIn() == 0 ? 4 : 2));
    if (super.getQuality() < Item.MIN_QUALITY) {
      super.setQuality(Item.MIN_QUALITY);
    }
  }
}
