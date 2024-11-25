package com.yuriviagens.api_agencia_viagem.model;

public class Destino {
    private Long id;
    private String nome;
    private String localizacao;
    private String descricao;
    private Double precoPacote;
    private Double mediaAvaliacao = 0.0;
    private Integer totalAvaliacoes = 0;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Double getPrecoPacote() { return precoPacote; }
    public void setPrecoPacote(Double precoPacote) { this.precoPacote = precoPacote; }

    public Double getMediaAvaliacao() { return mediaAvaliacao; }
    public void setMediaAvaliacao(Double mediaAvaliacao) { this.mediaAvaliacao = mediaAvaliacao; }

    public Integer getTotalAvaliacoes() { return totalAvaliacoes; }
    public void setTotalAvaliacoes(Integer totalAvaliacoes) { this.totalAvaliacoes = totalAvaliacoes; }
}
