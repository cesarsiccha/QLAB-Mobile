package com.nttdata.steps;

import com.nttdata.screens.YoutubeScreen;
import net.thucydides.core.annotations.Step;

public class YoutubeStep {
    YoutubeScreen youtubeScreen;

    @Step("Búsqueda por texto {0}")
    public void searchByText(String place){

        youtubeScreen.clickSearchInput(place);

    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return youtubeScreen.getResultText();
    }
}
