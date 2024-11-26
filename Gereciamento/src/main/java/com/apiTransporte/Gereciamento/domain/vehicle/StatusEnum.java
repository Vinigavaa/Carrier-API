package com.apiTransporte.Gereciamento.domain.vehicle;

public enum StatusEnum {
    DISPONIVEL("Disponível"),
    INDISPONIVEL("Indisponível");

    private final String descricao;

    StatusEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    // Método para buscar pelo valor
    public static StatusEnum fromDescricao(String descricao) {
        for (StatusEnum status : StatusEnum.values()) {
            if (status.descricao.equalsIgnoreCase(descricao)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Status não encontrado para a descrição: " + descricao);
    }
}
