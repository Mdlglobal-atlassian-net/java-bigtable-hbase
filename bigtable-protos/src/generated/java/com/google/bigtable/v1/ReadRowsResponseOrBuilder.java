// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v1/bigtable_service_messages.proto

package com.google.bigtable.v1;

public interface ReadRowsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v1.ReadRowsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bytes row_key = 1;</code>
   *
   * <pre>
   * The key of the row for which we're receiving data.
   * Results will be received in increasing row key order, unless
   * "allow_row_interleaving" was specified in the request.
   * </pre>
   */
  com.google.protobuf.ByteString getRowKey();

  /**
   * <code>repeated .google.bigtable.v1.ReadRowsResponse.Chunk chunks = 2;</code>
   *
   * <pre>
   * One or more chunks of the row specified by "row_key".
   * </pre>
   */
  java.util.List<com.google.bigtable.v1.ReadRowsResponse.Chunk> 
      getChunksList();
  /**
   * <code>repeated .google.bigtable.v1.ReadRowsResponse.Chunk chunks = 2;</code>
   *
   * <pre>
   * One or more chunks of the row specified by "row_key".
   * </pre>
   */
  com.google.bigtable.v1.ReadRowsResponse.Chunk getChunks(int index);
  /**
   * <code>repeated .google.bigtable.v1.ReadRowsResponse.Chunk chunks = 2;</code>
   *
   * <pre>
   * One or more chunks of the row specified by "row_key".
   * </pre>
   */
  int getChunksCount();
  /**
   * <code>repeated .google.bigtable.v1.ReadRowsResponse.Chunk chunks = 2;</code>
   *
   * <pre>
   * One or more chunks of the row specified by "row_key".
   * </pre>
   */
  java.util.List<? extends com.google.bigtable.v1.ReadRowsResponse.ChunkOrBuilder> 
      getChunksOrBuilderList();
  /**
   * <code>repeated .google.bigtable.v1.ReadRowsResponse.Chunk chunks = 2;</code>
   *
   * <pre>
   * One or more chunks of the row specified by "row_key".
   * </pre>
   */
  com.google.bigtable.v1.ReadRowsResponse.ChunkOrBuilder getChunksOrBuilder(
      int index);
}
