package tech.tresearchgroup.libraries.ipfscluster.controller;

import retrofit2.Call;
import retrofit2.http.*;
import tech.tresearchgroup.libraries.ipfscluster.model.IPFSCluster;

import java.io.File;

public interface IPFSClusterAPI {
    @GET("id")
    Call<IPFSCluster> getId();

    @GET("version")
    Call<IPFSCluster> getVersion();

    @GET("peers")
    Call<IPFSCluster> getPeers();

    @DELETE("peers/{peer}")
    Call<IPFSCluster> deletePeer(@Path("peer") String peer);

    @POST("add")
    Call<IPFSCluster> add(@Body File file);

    @GET("allocations")
    Call<IPFSCluster> getAllocations();

    @GET("allocations/{cid}")
    Call<IPFSCluster> getAllocations(@Path("cid") String cid);

    @GET("pins")
    Call<IPFSCluster> getPins();

    @GET("pins/{cid}")
    Call<IPFSCluster> getPin(@Path("cid") String cid);

    @GET("pins/{id}/{path}")
    Call<IPFSCluster> getPin(@Path("id") String id, @Path("path") String path);

    @DELETE("pins/{cid}")
    Call<IPFSCluster> deletePin(@Path("cid") String cid);

    @DELETE("pins/{id}/{path}")
    Call<IPFSCluster> deletePin(@Path("id") String id, @Path("path") String path);

    @POST("pins/{cid}/recover")
    Call<IPFSCluster> recoverCid(@Path("cid") String cid);

    @POST("pins/recover")
    Call<IPFSCluster> recoverCid();

    @GET("monitor/metrics")
    Call<IPFSCluster> getMetrics();

    @GET("monitor/metrics/{metric}")
    Call<IPFSCluster> getMetric(@Path("metric") String metric);

    @GET("health/alerts")
    Call<IPFSCluster> getHealthAlerts();

    @GET("health/graph")
    Call<IPFSCluster> getHealthGraph();

    @GET("ipfs/gc")
    Call<IPFSCluster> performGc();
}
