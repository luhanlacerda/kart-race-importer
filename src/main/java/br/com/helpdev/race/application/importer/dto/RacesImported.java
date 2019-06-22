package br.com.helpdev.race.application.importer.dto;

import br.com.helpdev.race.domain.race.Race;
import br.com.helpdev.race.shared.dto.OutputDTO;

import java.time.LocalDate;
import java.util.List;

public class RacesImported extends OutputDTO {

    //Poderia utilizar codigo e mensagem de sucesso ou falha.

    private LocalDate localDate;
    private List<Race> races;

    public RacesImported(LocalDate localDate, List<Race> races) {
        this.localDate = localDate;
        this.races = races;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public List<Race> getRaces() {
        return races;
    }

    public void setRaces(List<Race> races) {
        this.races = races;
    }
}