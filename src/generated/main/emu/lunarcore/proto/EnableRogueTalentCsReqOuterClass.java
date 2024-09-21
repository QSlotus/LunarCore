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

public final class EnableRogueTalentCsReqOuterClass {
  /**
   * Protobuf type {@code EnableRogueTalentCsReq}
   */
  public static final class EnableRogueTalentCsReq extends ProtoMessage<EnableRogueTalentCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 talent_id = 2;</code>
     */
    private int talentId;

    private EnableRogueTalentCsReq() {
    }

    /**
     * @return a new empty instance of {@code EnableRogueTalentCsReq}
     */
    public static EnableRogueTalentCsReq newInstance() {
      return new EnableRogueTalentCsReq();
    }

    /**
     * <code>optional uint32 talent_id = 2;</code>
     * @return whether the talentId field is set
     */
    public boolean hasTalentId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 talent_id = 2;</code>
     * @return this
     */
    public EnableRogueTalentCsReq clearTalentId() {
      bitField0_ &= ~0x00000001;
      talentId = 0;
      return this;
    }

    /**
     * <code>optional uint32 talent_id = 2;</code>
     * @return the talentId
     */
    public int getTalentId() {
      return talentId;
    }

    /**
     * <code>optional uint32 talent_id = 2;</code>
     * @param value the talentId to set
     * @return this
     */
    public EnableRogueTalentCsReq setTalentId(final int value) {
      bitField0_ |= 0x00000001;
      talentId = value;
      return this;
    }

    @Override
    public EnableRogueTalentCsReq copyFrom(final EnableRogueTalentCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        talentId = other.talentId;
      }
      return this;
    }

    @Override
    public EnableRogueTalentCsReq mergeFrom(final EnableRogueTalentCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasTalentId()) {
        setTalentId(other.talentId);
      }
      return this;
    }

    @Override
    public EnableRogueTalentCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      talentId = 0;
      return this;
    }

    @Override
    public EnableRogueTalentCsReq clearQuick() {
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
      if (!(o instanceof EnableRogueTalentCsReq)) {
        return false;
      }
      EnableRogueTalentCsReq other = (EnableRogueTalentCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasTalentId() || talentId == other.talentId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(talentId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(talentId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public EnableRogueTalentCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // talentId
            talentId = input.readUInt32();
            bitField0_ |= 0x00000001;
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
        output.writeUInt32(FieldNames.talentId, talentId);
      }
      output.endObject();
    }

    @Override
    public EnableRogueTalentCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -615305433:
          case -1894577842: {
            if (input.isAtField(FieldNames.talentId)) {
              if (!input.trySkipNullValue()) {
                talentId = input.readUInt32();
                bitField0_ |= 0x00000001;
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
    public EnableRogueTalentCsReq clone() {
      return new EnableRogueTalentCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static EnableRogueTalentCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new EnableRogueTalentCsReq(), data).checkInitialized();
    }

    public static EnableRogueTalentCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EnableRogueTalentCsReq(), input).checkInitialized();
    }

    public static EnableRogueTalentCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EnableRogueTalentCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating EnableRogueTalentCsReq messages
     */
    public static MessageFactory<EnableRogueTalentCsReq> getFactory() {
      return EnableRogueTalentCsReqFactory.INSTANCE;
    }

    private enum EnableRogueTalentCsReqFactory implements MessageFactory<EnableRogueTalentCsReq> {
      INSTANCE;

      @Override
      public EnableRogueTalentCsReq create() {
        return EnableRogueTalentCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName talentId = FieldName.forField("talentId", "talent_id");
    }
  }
}
