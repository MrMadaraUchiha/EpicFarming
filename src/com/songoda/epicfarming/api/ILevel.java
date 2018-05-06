package com.songoda.epicfarming.api;

import java.util.List;

public interface ILevel {

    public List<String> getDescription();

    public int getLevel();

    public int getRadius();

    public boolean isAutoHarvest();

    public boolean isAutoReplant();

    public double getSpeedMultiplier();

    public int getCostExperiance();

    public int getCostEconomy();

}
