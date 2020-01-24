package edu.alenasoft.gildedrose;

public class BackstageItem extends NormalItem {

  public BackstageItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void updateQuality() {
    this.addQuality(1);
    if (super.getSellIn() < 6 && super.getQuality() < Item.MAX_QUALITY) {
      this.addQuality(1);
    }
    if (super.getSellIn() < 11 && super.getQuality() < Item.MAX_QUALITY) {
      this.addQuality(1);
    }
    if (super.getSellIn() == 0) {
      super.setQuality(0);
    }
  }

  private void addQuality(int valueAdded) {
    super.setQuality(super.getQuality() + valueAdded);
  }
}
