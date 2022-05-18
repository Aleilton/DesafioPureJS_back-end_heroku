package com.aleilton.controller;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.aleilton.controller.model.Pessoa;
import com.aleilton.controller.model.PessoaDAO;
import com.google.gson.Gson;

@Path("api")
public class PessoaController {
  private PessoaDAO dao = new PessoaDAO();

  @GET
  @Produces("application/json")
  public Response getPessoas() {
    ArrayList<Pessoa> pessoas = dao.findAll();
    return Response.ok(new Gson().toJson(pessoas)).build();
  }

  @POST
  @Consumes("application/json")
  @Produces("application/json")
  public Response postPessoas(Pessoa pessoa) {
    String result = dao.insert(pessoa);
    return Response.ok(result).status(201).build();
  }
  
  @Path("/{id}")
  @DELETE
  @Consumes("application/json")
  public Response deletePessoa(@PathParam("id") String id) {
    dao.delete(id);
    return Response.ok().status(204).build();
  }

}
