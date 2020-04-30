package com.example.recycler_view;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokeAPI {
    @GET("/api/v2/pokemon/")
    Call<RestPokemonResponse> getPokemonResponse();
}
