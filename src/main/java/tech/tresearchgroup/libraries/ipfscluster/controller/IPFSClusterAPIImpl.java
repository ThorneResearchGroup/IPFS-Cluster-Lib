package tech.tresearchgroup.libraries.ipfscluster.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import tech.tresearchgroup.schemas.ipfscluster.model.IPFSCluster;

import java.io.File;

public class IPFSClusterAPIImpl implements IPFSClusterAPI {
    Gson gson = new GsonBuilder().setLenient().create();
    Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.1.132:9094/").addConverterFactory(GsonConverterFactory.create(gson)).build();
    IPFSClusterAPI ipfsClusterAPI = retrofit.create(IPFSClusterAPI.class);

    @Override
    public Call<IPFSCluster> getId() {
        return ipfsClusterAPI.getId();
    }

    @Override
    public Call<IPFSCluster> getVersion() {
        return ipfsClusterAPI.getVersion();
    }

    @Override
    public Call<IPFSCluster> getPeers() {
        return ipfsClusterAPI.getPeers();
    }

    @Override
    public Call<IPFSCluster> deletePeer(String peer) {
        return ipfsClusterAPI.deletePeer(peer);
    }

    @Override
    public Call<IPFSCluster> add(File file) {
        return ipfsClusterAPI.add(file);
    }

    @Override
    public Call<IPFSCluster> getAllocations() {
        return ipfsClusterAPI.getAllocations();
    }

    @Override
    public Call<IPFSCluster> getAllocations(String cid) {
        return ipfsClusterAPI.getAllocations(cid);
    }

    @Override
    public Call<IPFSCluster> getPins() {
        return ipfsClusterAPI.getPins();
    }

    @Override
    public Call<IPFSCluster> getPin(String cid) {
        return ipfsClusterAPI.getPin(cid);
    }

    @Override
    public Call<IPFSCluster> getPin(String id, String path) {
        return ipfsClusterAPI.getPin(id, path);
    }

    @Override
    public Call<IPFSCluster> deletePin(String cid) {
        return ipfsClusterAPI.deletePin(cid);
    }

    @Override
    public Call<IPFSCluster> deletePin(String id, String path) {
        return ipfsClusterAPI.deletePin(id, path);
    }

    @Override
    public Call<IPFSCluster> recoverCid(String cid) {
        return ipfsClusterAPI.recoverCid(cid);
    }

    @Override
    public Call<IPFSCluster> recoverCid() {
        return ipfsClusterAPI.recoverCid();
    }

    @Override
    public Call<IPFSCluster> getMetrics() {
        return ipfsClusterAPI.getMetrics();
    }

    @Override
    public Call<IPFSCluster> getMetric(String metric) {
        return ipfsClusterAPI.getMetric(metric);
    }

    @Override
    public Call<IPFSCluster> getHealthAlerts() {
        return ipfsClusterAPI.getHealthAlerts();
    }

    @Override
    public Call<IPFSCluster> getHealthGraph() {
        return ipfsClusterAPI.getHealthGraph();
    }

    @Override
    public Call<IPFSCluster> performGc() {
        return ipfsClusterAPI.performGc();
    }
}
