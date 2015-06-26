// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v1/bigtable_service_messages.proto

package com.google.bigtable.v1;

/**
 * Protobuf type {@code google.bigtable.v1.MutateRowRequest}
 *
 * <pre>
 * Request message for BigtableService.MutateRow.
 * </pre>
 */
public  final class MutateRowRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v1.MutateRowRequest)
    MutateRowRequestOrBuilder {
  // Use MutateRowRequest.newBuilder() to construct.
  private MutateRowRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private MutateRowRequest() {
    tableName_ = "";
    rowKey_ = com.google.protobuf.ByteString.EMPTY;
    mutations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MutateRowRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();

            tableName_ = bs;
            break;
          }
          case 18: {

            rowKey_ = input.readBytes();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              mutations_ = new java.util.ArrayList<com.google.bigtable.v1.Mutation>();
              mutable_bitField0_ |= 0x00000004;
            }
            mutations_.add(input.readMessage(com.google.bigtable.v1.Mutation.PARSER, extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        mutations_ = java.util.Collections.unmodifiableList(mutations_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.v1.BigtableServiceMessagesProto.internal_static_google_bigtable_v1_MutateRowRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v1.BigtableServiceMessagesProto.internal_static_google_bigtable_v1_MutateRowRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v1.MutateRowRequest.class, com.google.bigtable.v1.MutateRowRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TABLE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object tableName_;
  /**
   * <code>optional string table_name = 1;</code>
   *
   * <pre>
   * The unique name of the table to which the mutation should be applied.
   * </pre>
   */
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        tableName_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string table_name = 1;</code>
   *
   * <pre>
   * The unique name of the table to which the mutation should be applied.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROW_KEY_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString rowKey_;
  /**
   * <code>optional bytes row_key = 2;</code>
   *
   * <pre>
   * The key of the row to which the mutation should be applied.
   * </pre>
   */
  public com.google.protobuf.ByteString getRowKey() {
    return rowKey_;
  }

  public static final int MUTATIONS_FIELD_NUMBER = 3;
  private java.util.List<com.google.bigtable.v1.Mutation> mutations_;
  /**
   * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
   *
   * <pre>
   * Changes to be atomically applied to the specified row. Entries are applied
   * in order, meaning that earlier mutations can be masked by later ones.
   * Must contain at least one entry and at most 100000.
   * </pre>
   */
  public java.util.List<com.google.bigtable.v1.Mutation> getMutationsList() {
    return mutations_;
  }
  /**
   * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
   *
   * <pre>
   * Changes to be atomically applied to the specified row. Entries are applied
   * in order, meaning that earlier mutations can be masked by later ones.
   * Must contain at least one entry and at most 100000.
   * </pre>
   */
  public java.util.List<? extends com.google.bigtable.v1.MutationOrBuilder> 
      getMutationsOrBuilderList() {
    return mutations_;
  }
  /**
   * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
   *
   * <pre>
   * Changes to be atomically applied to the specified row. Entries are applied
   * in order, meaning that earlier mutations can be masked by later ones.
   * Must contain at least one entry and at most 100000.
   * </pre>
   */
  public int getMutationsCount() {
    return mutations_.size();
  }
  /**
   * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
   *
   * <pre>
   * Changes to be atomically applied to the specified row. Entries are applied
   * in order, meaning that earlier mutations can be masked by later ones.
   * Must contain at least one entry and at most 100000.
   * </pre>
   */
  public com.google.bigtable.v1.Mutation getMutations(int index) {
    return mutations_.get(index);
  }
  /**
   * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
   *
   * <pre>
   * Changes to be atomically applied to the specified row. Entries are applied
   * in order, meaning that earlier mutations can be masked by later ones.
   * Must contain at least one entry and at most 100000.
   * </pre>
   */
  public com.google.bigtable.v1.MutationOrBuilder getMutationsOrBuilder(
      int index) {
    return mutations_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTableNameBytes().isEmpty()) {
      output.writeBytes(1, getTableNameBytes());
    }
    if (!rowKey_.isEmpty()) {
      output.writeBytes(2, rowKey_);
    }
    for (int i = 0; i < mutations_.size(); i++) {
      output.writeMessage(3, mutations_.get(i));
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTableNameBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getTableNameBytes());
    }
    if (!rowKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, rowKey_);
    }
    for (int i = 0; i < mutations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, mutations_.get(i));
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.bigtable.v1.MutateRowRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v1.MutateRowRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v1.MutateRowRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v1.MutateRowRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v1.MutateRowRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.v1.MutateRowRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.v1.MutateRowRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.bigtable.v1.MutateRowRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.v1.MutateRowRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.v1.MutateRowRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.bigtable.v1.MutateRowRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.bigtable.v1.MutateRowRequest}
   *
   * <pre>
   * Request message for BigtableService.MutateRow.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v1.MutateRowRequest)
      com.google.bigtable.v1.MutateRowRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.v1.BigtableServiceMessagesProto.internal_static_google_bigtable_v1_MutateRowRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v1.BigtableServiceMessagesProto.internal_static_google_bigtable_v1_MutateRowRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v1.MutateRowRequest.class, com.google.bigtable.v1.MutateRowRequest.Builder.class);
    }

    // Construct using com.google.bigtable.v1.MutateRowRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getMutationsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      tableName_ = "";

      rowKey_ = com.google.protobuf.ByteString.EMPTY;

      if (mutationsBuilder_ == null) {
        mutations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        mutationsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.v1.BigtableServiceMessagesProto.internal_static_google_bigtable_v1_MutateRowRequest_descriptor;
    }

    public com.google.bigtable.v1.MutateRowRequest getDefaultInstanceForType() {
      return com.google.bigtable.v1.MutateRowRequest.getDefaultInstance();
    }

    public com.google.bigtable.v1.MutateRowRequest build() {
      com.google.bigtable.v1.MutateRowRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.v1.MutateRowRequest buildPartial() {
      com.google.bigtable.v1.MutateRowRequest result = new com.google.bigtable.v1.MutateRowRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.tableName_ = tableName_;
      result.rowKey_ = rowKey_;
      if (mutationsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          mutations_ = java.util.Collections.unmodifiableList(mutations_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.mutations_ = mutations_;
      } else {
        result.mutations_ = mutationsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.v1.MutateRowRequest) {
        return mergeFrom((com.google.bigtable.v1.MutateRowRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v1.MutateRowRequest other) {
      if (other == com.google.bigtable.v1.MutateRowRequest.getDefaultInstance()) return this;
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        onChanged();
      }
      if (other.getRowKey() != com.google.protobuf.ByteString.EMPTY) {
        setRowKey(other.getRowKey());
      }
      if (mutationsBuilder_ == null) {
        if (!other.mutations_.isEmpty()) {
          if (mutations_.isEmpty()) {
            mutations_ = other.mutations_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureMutationsIsMutable();
            mutations_.addAll(other.mutations_);
          }
          onChanged();
        }
      } else {
        if (!other.mutations_.isEmpty()) {
          if (mutationsBuilder_.isEmpty()) {
            mutationsBuilder_.dispose();
            mutationsBuilder_ = null;
            mutations_ = other.mutations_;
            bitField0_ = (bitField0_ & ~0x00000004);
            mutationsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getMutationsFieldBuilder() : null;
          } else {
            mutationsBuilder_.addAllMessages(other.mutations_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.v1.MutateRowRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.v1.MutateRowRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object tableName_ = "";
    /**
     * <code>optional string table_name = 1;</code>
     *
     * <pre>
     * The unique name of the table to which the mutation should be applied.
     * </pre>
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tableName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string table_name = 1;</code>
     *
     * <pre>
     * The unique name of the table to which the mutation should be applied.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string table_name = 1;</code>
     *
     * <pre>
     * The unique name of the table to which the mutation should be applied.
     * </pre>
     */
    public Builder setTableName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tableName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string table_name = 1;</code>
     *
     * <pre>
     * The unique name of the table to which the mutation should be applied.
     * </pre>
     */
    public Builder clearTableName() {
      
      tableName_ = getDefaultInstance().getTableName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string table_name = 1;</code>
     *
     * <pre>
     * The unique name of the table to which the mutation should be applied.
     * </pre>
     */
    public Builder setTableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tableName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString rowKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes row_key = 2;</code>
     *
     * <pre>
     * The key of the row to which the mutation should be applied.
     * </pre>
     */
    public com.google.protobuf.ByteString getRowKey() {
      return rowKey_;
    }
    /**
     * <code>optional bytes row_key = 2;</code>
     *
     * <pre>
     * The key of the row to which the mutation should be applied.
     * </pre>
     */
    public Builder setRowKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rowKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes row_key = 2;</code>
     *
     * <pre>
     * The key of the row to which the mutation should be applied.
     * </pre>
     */
    public Builder clearRowKey() {
      
      rowKey_ = getDefaultInstance().getRowKey();
      onChanged();
      return this;
    }

    private java.util.List<com.google.bigtable.v1.Mutation> mutations_ =
      java.util.Collections.emptyList();
    private void ensureMutationsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        mutations_ = new java.util.ArrayList<com.google.bigtable.v1.Mutation>(mutations_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.bigtable.v1.Mutation, com.google.bigtable.v1.Mutation.Builder, com.google.bigtable.v1.MutationOrBuilder> mutationsBuilder_;

    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public java.util.List<com.google.bigtable.v1.Mutation> getMutationsList() {
      if (mutationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mutations_);
      } else {
        return mutationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public int getMutationsCount() {
      if (mutationsBuilder_ == null) {
        return mutations_.size();
      } else {
        return mutationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public com.google.bigtable.v1.Mutation getMutations(int index) {
      if (mutationsBuilder_ == null) {
        return mutations_.get(index);
      } else {
        return mutationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public Builder setMutations(
        int index, com.google.bigtable.v1.Mutation value) {
      if (mutationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutationsIsMutable();
        mutations_.set(index, value);
        onChanged();
      } else {
        mutationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public Builder setMutations(
        int index, com.google.bigtable.v1.Mutation.Builder builderForValue) {
      if (mutationsBuilder_ == null) {
        ensureMutationsIsMutable();
        mutations_.set(index, builderForValue.build());
        onChanged();
      } else {
        mutationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public Builder addMutations(com.google.bigtable.v1.Mutation value) {
      if (mutationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutationsIsMutable();
        mutations_.add(value);
        onChanged();
      } else {
        mutationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public Builder addMutations(
        int index, com.google.bigtable.v1.Mutation value) {
      if (mutationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutationsIsMutable();
        mutations_.add(index, value);
        onChanged();
      } else {
        mutationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public Builder addMutations(
        com.google.bigtable.v1.Mutation.Builder builderForValue) {
      if (mutationsBuilder_ == null) {
        ensureMutationsIsMutable();
        mutations_.add(builderForValue.build());
        onChanged();
      } else {
        mutationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public Builder addMutations(
        int index, com.google.bigtable.v1.Mutation.Builder builderForValue) {
      if (mutationsBuilder_ == null) {
        ensureMutationsIsMutable();
        mutations_.add(index, builderForValue.build());
        onChanged();
      } else {
        mutationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public Builder addAllMutations(
        java.lang.Iterable<? extends com.google.bigtable.v1.Mutation> values) {
      if (mutationsBuilder_ == null) {
        ensureMutationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mutations_);
        onChanged();
      } else {
        mutationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public Builder clearMutations() {
      if (mutationsBuilder_ == null) {
        mutations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        mutationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public Builder removeMutations(int index) {
      if (mutationsBuilder_ == null) {
        ensureMutationsIsMutable();
        mutations_.remove(index);
        onChanged();
      } else {
        mutationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public com.google.bigtable.v1.Mutation.Builder getMutationsBuilder(
        int index) {
      return getMutationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public com.google.bigtable.v1.MutationOrBuilder getMutationsOrBuilder(
        int index) {
      if (mutationsBuilder_ == null) {
        return mutations_.get(index);  } else {
        return mutationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public java.util.List<? extends com.google.bigtable.v1.MutationOrBuilder> 
         getMutationsOrBuilderList() {
      if (mutationsBuilder_ != null) {
        return mutationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mutations_);
      }
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public com.google.bigtable.v1.Mutation.Builder addMutationsBuilder() {
      return getMutationsFieldBuilder().addBuilder(
          com.google.bigtable.v1.Mutation.getDefaultInstance());
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public com.google.bigtable.v1.Mutation.Builder addMutationsBuilder(
        int index) {
      return getMutationsFieldBuilder().addBuilder(
          index, com.google.bigtable.v1.Mutation.getDefaultInstance());
    }
    /**
     * <code>repeated .google.bigtable.v1.Mutation mutations = 3;</code>
     *
     * <pre>
     * Changes to be atomically applied to the specified row. Entries are applied
     * in order, meaning that earlier mutations can be masked by later ones.
     * Must contain at least one entry and at most 100000.
     * </pre>
     */
    public java.util.List<com.google.bigtable.v1.Mutation.Builder> 
         getMutationsBuilderList() {
      return getMutationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.bigtable.v1.Mutation, com.google.bigtable.v1.Mutation.Builder, com.google.bigtable.v1.MutationOrBuilder> 
        getMutationsFieldBuilder() {
      if (mutationsBuilder_ == null) {
        mutationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.bigtable.v1.Mutation, com.google.bigtable.v1.Mutation.Builder, com.google.bigtable.v1.MutationOrBuilder>(
                mutations_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        mutations_ = null;
      }
      return mutationsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.v1.MutateRowRequest)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v1.MutateRowRequest)
  private static final com.google.bigtable.v1.MutateRowRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v1.MutateRowRequest();
  }

  public static com.google.bigtable.v1.MutateRowRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<MutateRowRequest> PARSER =
      new com.google.protobuf.AbstractParser<MutateRowRequest>() {
    public MutateRowRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new MutateRowRequest(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<MutateRowRequest> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.v1.MutateRowRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

