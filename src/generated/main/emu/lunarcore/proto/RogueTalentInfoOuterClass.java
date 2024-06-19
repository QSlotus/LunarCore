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
import us.hebi.quickbuf.RepeatedMessage;

public final class RogueTalentInfoOuterClass {
  /**
   * Protobuf type {@code RogueTalentInfo}
   */
  public static final class RogueTalentInfo extends ProtoMessage<RogueTalentInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated .RogueTalent rogue_talent = 9;</code>
     */
    private final RepeatedMessage<RogueTalentOuterClass.RogueTalent> rogueTalent = RepeatedMessage.newEmptyInstance(RogueTalentOuterClass.RogueTalent.getFactory());

    private RogueTalentInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueTalentInfo}
     */
    public static RogueTalentInfo newInstance() {
      return new RogueTalentInfo();
    }

    /**
     * <code>repeated .RogueTalent rogue_talent = 9;</code>
     * @return whether the rogueTalent field is set
     */
    public boolean hasRogueTalent() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated .RogueTalent rogue_talent = 9;</code>
     * @return this
     */
    public RogueTalentInfo clearRogueTalent() {
      bitField0_ &= ~0x00000001;
      rogueTalent.clear();
      return this;
    }

    /**
     * <code>repeated .RogueTalent rogue_talent = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueTalent()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<RogueTalentOuterClass.RogueTalent> getRogueTalent() {
      return rogueTalent;
    }

    /**
     * <code>repeated .RogueTalent rogue_talent = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<RogueTalentOuterClass.RogueTalent> getMutableRogueTalent() {
      bitField0_ |= 0x00000001;
      return rogueTalent;
    }

    /**
     * <code>repeated .RogueTalent rogue_talent = 9;</code>
     * @param value the rogueTalent to add
     * @return this
     */
    public RogueTalentInfo addRogueTalent(final RogueTalentOuterClass.RogueTalent value) {
      bitField0_ |= 0x00000001;
      rogueTalent.add(value);
      return this;
    }

    /**
     * <code>repeated .RogueTalent rogue_talent = 9;</code>
     * @param values the rogueTalent to add
     * @return this
     */
    public RogueTalentInfo addAllRogueTalent(final RogueTalentOuterClass.RogueTalent... values) {
      bitField0_ |= 0x00000001;
      rogueTalent.addAll(values);
      return this;
    }

    @Override
    public RogueTalentInfo copyFrom(final RogueTalentInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rogueTalent.copyFrom(other.rogueTalent);
      }
      return this;
    }

    @Override
    public RogueTalentInfo mergeFrom(final RogueTalentInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRogueTalent()) {
        getMutableRogueTalent().addAll(other.rogueTalent);
      }
      return this;
    }

    @Override
    public RogueTalentInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueTalent.clear();
      return this;
    }

    @Override
    public RogueTalentInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueTalent.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueTalentInfo)) {
        return false;
      }
      RogueTalentInfo other = (RogueTalentInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasRogueTalent() || rogueTalent.equals(other.rogueTalent));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < rogueTalent.length(); i++) {
          output.writeRawByte((byte) 74);
          output.writeMessageNoTag(rogueTalent.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * rogueTalent.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(rogueTalent);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueTalentInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 74: {
            // rogueTalent
            tag = input.readRepeatedMessage(rogueTalent, tag);
            bitField0_ |= 0x00000001;
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
        output.writeRepeatedMessage(FieldNames.rogueTalent, rogueTalent);
      }
      output.endObject();
    }

    @Override
    public RogueTalentInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -824717466:
          case 1910163185: {
            if (input.isAtField(FieldNames.rogueTalent)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(rogueTalent);
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
    public RogueTalentInfo clone() {
      return new RogueTalentInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueTalentInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueTalentInfo(), data).checkInitialized();
    }

    public static RogueTalentInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueTalentInfo(), input).checkInitialized();
    }

    public static RogueTalentInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueTalentInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueTalentInfo messages
     */
    public static MessageFactory<RogueTalentInfo> getFactory() {
      return RogueTalentInfoFactory.INSTANCE;
    }

    private enum RogueTalentInfoFactory implements MessageFactory<RogueTalentInfo> {
      INSTANCE;

      @Override
      public RogueTalentInfo create() {
        return RogueTalentInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rogueTalent = FieldName.forField("rogueTalent", "rogue_talent");
    }
  }
}
