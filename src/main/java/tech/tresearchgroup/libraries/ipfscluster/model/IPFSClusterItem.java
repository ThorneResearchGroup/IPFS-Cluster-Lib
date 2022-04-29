package tech.tresearchgroup.libraries.ipfscluster.model;

import com.jsoniter.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IPFSClusterItem{

	@JsonProperty("valid")
	private boolean valid;

	@JsonProperty("peer")
	private String peer;

	@JsonProperty("received_at")
	private long receivedAt;

	@JsonProperty("expire")
	private long expire;

	@JsonProperty("name")
	private String name;

	@JsonProperty("triggered_at")
	private String triggeredAt;

	@JsonProperty("weight")
	private int weight;

	@JsonProperty("partitionable")
	private boolean partitionable;

	@JsonProperty("value")
	private String value;
}