package tech.tresearchgroup.libraries.ipfscluster.model;

import com.jsoniter.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IPFSCluster{

	@JsonProperty("version")
	private String version;

	@JsonProperty("IPFSCluster")
	private List<IPFSClusterItem> iPFSCluster;

	@JsonProperty("peername")
	private String peername;

	@JsonProperty("addresses")
	private List<String> addresses;

	@JsonProperty("ipfs")
	private Ipfs ipfs;

	@JsonProperty("cluster_peers_addresses")
	private List<String> clusterPeersAddresses;

	@JsonProperty("commit")
	private String commit;

	@JsonProperty("rpc_protocol_version")
	private String rpcProtocolVersion;

	@JsonProperty("cluster_peers")
	private List<String> clusterPeers;

	@JsonProperty("id")
	private String id;

	@JsonProperty("error")
	private String error;
}