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

public final class SetDisplayAvatarScRspOuterClass {
  /**
   * Protobuf type {@code SetDisplayAvatarScRsp}
   */
  public static final class SetDisplayAvatarScRsp extends ProtoMessage<SetDisplayAvatarScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 3;</code>
     */
    private int retcode;

    /**
     * <code>repeated .DisplayAvatar display_avatar_list = 2;</code>
     */
    private final RepeatedMessage<DisplayAvatarOuterClass.DisplayAvatar> displayAvatarList = RepeatedMessage.newEmptyInstance(DisplayAvatarOuterClass.DisplayAvatar.getFactory());

    private SetDisplayAvatarScRsp() {
    }

    /**
     * @return a new empty instance of {@code SetDisplayAvatarScRsp}
     */
    public static SetDisplayAvatarScRsp newInstance() {
      return new SetDisplayAvatarScRsp();
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return this
     */
    public SetDisplayAvatarScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @param value the retcode to set
     * @return this
     */
    public SetDisplayAvatarScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .DisplayAvatar display_avatar_list = 2;</code>
     * @return whether the displayAvatarList field is set
     */
    public boolean hasDisplayAvatarList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .DisplayAvatar display_avatar_list = 2;</code>
     * @return this
     */
    public SetDisplayAvatarScRsp clearDisplayAvatarList() {
      bitField0_ &= ~0x00000002;
      displayAvatarList.clear();
      return this;
    }

    /**
     * <code>repeated .DisplayAvatar display_avatar_list = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDisplayAvatarList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<DisplayAvatarOuterClass.DisplayAvatar> getDisplayAvatarList() {
      return displayAvatarList;
    }

    /**
     * <code>repeated .DisplayAvatar display_avatar_list = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<DisplayAvatarOuterClass.DisplayAvatar> getMutableDisplayAvatarList() {
      bitField0_ |= 0x00000002;
      return displayAvatarList;
    }

    /**
     * <code>repeated .DisplayAvatar display_avatar_list = 2;</code>
     * @param value the displayAvatarList to add
     * @return this
     */
    public SetDisplayAvatarScRsp addDisplayAvatarList(
        final DisplayAvatarOuterClass.DisplayAvatar value) {
      bitField0_ |= 0x00000002;
      displayAvatarList.add(value);
      return this;
    }

    /**
     * <code>repeated .DisplayAvatar display_avatar_list = 2;</code>
     * @param values the displayAvatarList to add
     * @return this
     */
    public SetDisplayAvatarScRsp addAllDisplayAvatarList(
        final DisplayAvatarOuterClass.DisplayAvatar... values) {
      bitField0_ |= 0x00000002;
      displayAvatarList.addAll(values);
      return this;
    }

    @Override
    public SetDisplayAvatarScRsp copyFrom(final SetDisplayAvatarScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        displayAvatarList.copyFrom(other.displayAvatarList);
      }
      return this;
    }

    @Override
    public SetDisplayAvatarScRsp mergeFrom(final SetDisplayAvatarScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasDisplayAvatarList()) {
        getMutableDisplayAvatarList().addAll(other.displayAvatarList);
      }
      return this;
    }

    @Override
    public SetDisplayAvatarScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      displayAvatarList.clear();
      return this;
    }

    @Override
    public SetDisplayAvatarScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      displayAvatarList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SetDisplayAvatarScRsp)) {
        return false;
      }
      SetDisplayAvatarScRsp other = (SetDisplayAvatarScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasDisplayAvatarList() || displayAvatarList.equals(other.displayAvatarList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < displayAvatarList.length(); i++) {
          output.writeRawByte((byte) 18);
          output.writeMessageNoTag(displayAvatarList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * displayAvatarList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(displayAvatarList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetDisplayAvatarScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // displayAvatarList
            tag = input.readRepeatedMessage(displayAvatarList, tag);
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.displayAvatarList, displayAvatarList);
      }
      output.endObject();
    }

    @Override
    public SetDisplayAvatarScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2117925881:
          case 245562311: {
            if (input.isAtField(FieldNames.displayAvatarList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(displayAvatarList);
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
    public SetDisplayAvatarScRsp clone() {
      return new SetDisplayAvatarScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetDisplayAvatarScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetDisplayAvatarScRsp(), data).checkInitialized();
    }

    public static SetDisplayAvatarScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetDisplayAvatarScRsp(), input).checkInitialized();
    }

    public static SetDisplayAvatarScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetDisplayAvatarScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetDisplayAvatarScRsp messages
     */
    public static MessageFactory<SetDisplayAvatarScRsp> getFactory() {
      return SetDisplayAvatarScRspFactory.INSTANCE;
    }

    private enum SetDisplayAvatarScRspFactory implements MessageFactory<SetDisplayAvatarScRsp> {
      INSTANCE;

      @Override
      public SetDisplayAvatarScRsp create() {
        return SetDisplayAvatarScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName displayAvatarList = FieldName.forField("displayAvatarList", "display_avatar_list");
    }
  }
}
