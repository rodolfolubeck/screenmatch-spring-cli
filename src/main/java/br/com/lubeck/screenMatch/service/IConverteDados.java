package br.com.lubeck.screenMatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
