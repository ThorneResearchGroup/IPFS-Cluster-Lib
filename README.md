A library that connects directly to the IPFS Cluster service (written by ProtocolLabs)

Supported endpoints:

| METHOD | ENDPOINT                        | COMMENT                                                         |
|--------|---------------------------------|-----------------------------------------------------------------|
| GET    | /id                             | Cluster peer information                                        |
 | GET    | /version                        | Cluster version                                                 |
| GET    | /peers                          | Cluster peers. Streaming endpoint                               |
| DELETE | /peers/{peerID}                 | Remove a peer                                                   |
| POST   | /add                            | Add content to the cluster. Streaming endpoint. See notes above |
| GET    | /allocations                    | List of pins and their allocations (pinset). Streaming endpoint |
| GET    | /allocations/{cid}              | Show a single pin and its allocations (from the pinset)         |
| GET    | /pins                           | Local status of all tracked CIDs. Streaming endpoint            |
| GET    | /pins/{cid}                     | Local status of single CID                                      |
| POST   | /pins/{cid}                     | Pin a CID                                                       |
| POST   | /pins/{ipfs, ipns, ipld}/<path> | Pin using an IPFS path                                          |
| DELETE | /pins/{cid}                     | Unpin a CID                                                     |
| DELETE | /pins/{ipfs, ipns, ipld}/<path> | Unpin using an IPFS path                                        |
| POST   | /pins/{cid}/recover             | Recover a CID                                                   |
| POST   | /pins/recover                   | Recover all pins in the receiving Cluster peer                  |
| GET    | /monitor/metrics                | Get a list of metric types known to the peer                    |
| GET    | /monitor/metrics/{metric}       | Get a list of current metrics seen by this peer                 |
| GET    | /health/alerts                  | Display a list of alerts (metric expiration events)             |
| GET    | /health/graph                   | Get connection graph                                            |
| GET    | /health/alerts                  | Get connection graph                                            |
| POST   | /ipfs/gc                        | Perform GC in the IPFS nodes                                    |