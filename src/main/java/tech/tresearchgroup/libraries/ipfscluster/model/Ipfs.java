package tech.tresearchgroup.libraries.ipfscluster.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ipfs{

	@SerializedName("addresses")
	private List<String> addresses;

	@SerializedName("id")
	private String id;

	@SerializedName("error")
	private String error;
}