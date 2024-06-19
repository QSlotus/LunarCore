// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class ChallengeRewardOuterClass {
  /**
   * Protobuf type {@code ChallengeReward}
   */
  public static final class ChallengeReward extends ProtoMessage<ChallengeReward> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint64 taken_challenge_reward = 8;</code>
     */
    private long takenChallengeReward;

    /**
     * <code>optional uint32 group_id = 13;</code>
     */
    private int groupId;

    private ChallengeReward() {
    }

    /**
     * @return a new empty instance of {@code ChallengeReward}
     */
    public static ChallengeReward newInstance() {
      return new ChallengeReward();
    }

    /**
     * <code>optional uint64 taken_challenge_reward = 8;</code>
     * @return whether the takenChallengeReward field is set
     */
    public boolean hasTakenChallengeReward() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint64 taken_challenge_reward = 8;</code>
     * @return this
     */
    public ChallengeReward clearTakenChallengeReward() {
      bitField0_ &= ~0x00000001;
      takenChallengeReward = 0L;
      return this;
    }

    /**
     * <code>optional uint64 taken_challenge_reward = 8;</code>
     * @return the takenChallengeReward
     */
    public long getTakenChallengeReward() {
      return takenChallengeReward;
    }

    /**
     * <code>optional uint64 taken_challenge_reward = 8;</code>
     * @param value the takenChallengeReward to set
     * @return this
     */
    public ChallengeReward setTakenChallengeReward(final long value) {
      bitField0_ |= 0x00000001;
      takenChallengeReward = value;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 13;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 group_id = 13;</code>
     * @return this
     */
    public ChallengeReward clearGroupId() {
      bitField0_ &= ~0x00000002;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 13;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 13;</code>
     * @param value the groupId to set
     * @return this
     */
    public ChallengeReward setGroupId(final int value) {
      bitField0_ |= 0x00000002;
      groupId = value;
      return this;
    }

    @Override
    public ChallengeReward copyFrom(final ChallengeReward other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        takenChallengeReward = other.takenChallengeReward;
        groupId = other.groupId;
      }
      return this;
    }

    @Override
    public ChallengeReward mergeFrom(final ChallengeReward other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasTakenChallengeReward()) {
        setTakenChallengeReward(other.takenChallengeReward);
      }
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      return this;
    }

    @Override
    public ChallengeReward clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      takenChallengeReward = 0L;
      groupId = 0;
      return this;
    }

    @Override
    public ChallengeReward clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChallengeReward)) {
        return false;
      }
      ChallengeReward other = (ChallengeReward) o;
      return bitField0_ == other.bitField0_
        && (!hasTakenChallengeReward() || takenChallengeReward == other.takenChallengeReward)
        && (!hasGroupId() || groupId == other.groupId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt64NoTag(takenChallengeReward);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(groupId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(takenChallengeReward);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChallengeReward mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // takenChallengeReward
            takenChallengeReward = input.readUInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt64(FieldNames.takenChallengeReward, takenChallengeReward);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      output.endObject();
    }

    @Override
    public ChallengeReward mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -743639637:
          case 131659523: {
            if (input.isAtField(FieldNames.takenChallengeReward)) {
              if (!input.trySkipNullValue()) {
                takenChallengeReward = input.readUInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public ChallengeReward clone() {
      return new ChallengeReward().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChallengeReward parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChallengeReward(), data).checkInitialized();
    }

    public static ChallengeReward parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeReward(), input).checkInitialized();
    }

    public static ChallengeReward parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeReward(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChallengeReward messages
     */
    public static MessageFactory<ChallengeReward> getFactory() {
      return ChallengeRewardFactory.INSTANCE;
    }

    private enum ChallengeRewardFactory implements MessageFactory<ChallengeReward> {
      INSTANCE;

      @Override
      public ChallengeReward create() {
        return ChallengeReward.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName takenChallengeReward = FieldName.forField("takenChallengeReward", "taken_challenge_reward");

      static final FieldName groupId = FieldName.forField("groupId", "group_id");
    }
  }
}
