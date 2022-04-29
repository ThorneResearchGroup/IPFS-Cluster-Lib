package tech.tresearchgroup.libraries.ipfscluster.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IPFSClusterItem{

	@SerializedName("valid")
	private boolean valid;

	@SerializedName("peer")
	private String peer;

	@SerializedName("received_at")
	private long receivedAt;

	@SerializedName("expire")
	private long expire;

	@SerializedName("name")
	private String name;

	@SerializedName("triggered_at")
	private String triggeredAt;

	@SerializedName("weight")
	private int weight;

	@SerializedName("partitionable")
	private boolean partitionable;

	@SerializedName("value")
	private String value;
}