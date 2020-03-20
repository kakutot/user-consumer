package com.larecette.mapper;

public interface ElasticMapper<From, To> {

    To map(From from);

    From mapBack(To to);
}
