package tech.tresearchgroup.libraries.ipfscluster.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IPFSCluster{

	@SerializedName("version")
	private String version;

	@SerializedName("IPFSCluster")
	private List<IPFSClusterItem> iPFSCluster;

	@SerializedName("peername")
	private String peername;

	@SerializedName("addresses")
	private List<String> addresses;

	@SerializedName("ipfs")
	private Ipfs ipfs;

	@SerializedName("cluster_peers_addresses")
	private List<String> clusterPeersAddresses;

	@SerializedName("commit")
	private String commit;

	@SerializedName("rpc_protocol_version")
	private String rpcProtocolVersion;

	@SerializedName("cluster_peers")
	private List<String> clusterPeers;

	@SerializedName("id")
	private String id;

	@SerializedName("error")
	private String error;
}