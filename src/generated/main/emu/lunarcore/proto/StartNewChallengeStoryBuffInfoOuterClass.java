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

public final class StartNewChallengeStoryBuffInfoOuterClass {
  /**
   * Protobuf type {@code StartNewChallengeStoryBuffInfo}
   */
  public static final class StartNewChallengeStoryBuffInfo extends ProtoMessage<StartNewChallengeStoryBuffInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 first_half = 12;</code>
     */
    private int firstHalf;

    /**
     * <code>optional uint32 second_half = 13;</code>
     */
    private int secondHalf;

    private StartNewChallengeStoryBuffInfo() {
    }

    /**
     * @return a new empty instance of {@code StartNewChallengeStoryBuffInfo}
     */
    public static StartNewChallengeStoryBuffInfo newInstance() {
      return new StartNewChallengeStoryBuffInfo();
    }

    /**
     * <code>optional uint32 first_half = 12;</code>
     * @return whether the firstHalf field is set
     */
    public boolean hasFirstHalf() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 first_half = 12;</code>
     * @return this
     */
    public StartNewChallengeStoryBuffInfo clearFirstHalf() {
      bitField0_ &= ~0x00000001;
      firstHalf = 0;
      return this;
    }

    /**
     * <code>optional uint32 first_half = 12;</code>
     * @return the firstHalf
     */
    public int getFirstHalf() {
      return firstHalf;
    }

    /**
     * <code>optional uint32 first_half = 12;</code>
     * @param value the firstHalf to set
     * @return this
     */
    public StartNewChallengeStoryBuffInfo setFirstHalf(final int value) {
      bitField0_ |= 0x00000001;
      firstHalf = value;
      return this;
    }

    /**
     * <code>optional uint32 second_half = 13;</code>
     * @return whether the secondHalf field is set
     */
    public boolean hasSecondHalf() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 second_half = 13;</code>
     * @return this
     */
    public StartNewChallengeStoryBuffInfo clearSecondHalf() {
      bitField0_ &= ~0x00000002;
      secondHalf = 0;
      return this;
    }

    /**
     * <code>optional uint32 second_half = 13;</code>
     * @return the secondHalf
     */
    public int getSecondHalf() {
      return secondHalf;
    }

    /**
     * <code>optional uint32 second_half = 13;</code>
     * @param value the secondHalf to set
     * @return this
     */
    public StartNewChallengeStoryBuffInfo setSecondHalf(final int value) {
      bitField0_ |= 0x00000002;
      secondHalf = value;
      return this;
    }

    @Override
    public StartNewChallengeStoryBuffInfo copyFrom(final StartNewChallengeStoryBuffInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        firstHalf = other.firstHalf;
        secondHalf = other.secondHalf;
      }
      return this;
    }

    @Override
    public StartNewChallengeStoryBuffInfo mergeFrom(final StartNewChallengeStoryBuffInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasFirstHalf()) {
        setFirstHalf(other.firstHalf);
      }
      if (other.hasSecondHalf()) {
        setSecondHalf(other.secondHalf);
      }
      return this;
    }

    @Override
    public StartNewChallengeStoryBuffInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      firstHalf = 0;
      secondHalf = 0;
      return this;
    }

    @Override
    public StartNewChallengeStoryBuffInfo clearQuick() {
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
      if (!(o instanceof StartNewChallengeStoryBuffInfo)) {
        return false;
      }
      StartNewChallengeStoryBuffInfo other = (StartNewChallengeStoryBuffInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasFirstHalf() || firstHalf == other.firstHalf)
        && (!hasSecondHalf() || secondHalf == other.secondHalf);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(firstHalf);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(secondHalf);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(firstHalf);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(secondHalf);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public StartNewChallengeStoryBuffInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 96: {
            // firstHalf
            firstHalf = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // secondHalf
            secondHalf = input.readUInt32();
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
        output.writeUInt32(FieldNames.firstHalf, firstHalf);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.secondHalf, secondHalf);
      }
      output.endObject();
    }

    @Override
    public StartNewChallengeStoryBuffInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 132656899:
          case -161164190: {
            if (input.isAtField(FieldNames.firstHalf)) {
              if (!input.trySkipNullValue()) {
                firstHalf = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 423501511:
          case 265084190: {
            if (input.isAtField(FieldNames.secondHalf)) {
              if (!input.trySkipNullValue()) {
                secondHalf = input.readUInt32();
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
    public StartNewChallengeStoryBuffInfo clone() {
      return new StartNewChallengeStoryBuffInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static StartNewChallengeStoryBuffInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new StartNewChallengeStoryBuffInfo(), data).checkInitialized();
    }

    public static StartNewChallengeStoryBuffInfo parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new StartNewChallengeStoryBuffInfo(), input).checkInitialized();
    }

    public static StartNewChallengeStoryBuffInfo parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new StartNewChallengeStoryBuffInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating StartNewChallengeStoryBuffInfo messages
     */
    public static MessageFactory<StartNewChallengeStoryBuffInfo> getFactory() {
      return StartNewChallengeStoryBuffInfoFactory.INSTANCE;
    }

    private enum StartNewChallengeStoryBuffInfoFactory implements MessageFactory<StartNewChallengeStoryBuffInfo> {
      INSTANCE;

      @Override
      public StartNewChallengeStoryBuffInfo create() {
        return StartNewChallengeStoryBuffInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName firstHalf = FieldName.forField("firstHalf", "first_half");

      static final FieldName secondHalf = FieldName.forField("secondHalf", "second_half");
    }
  }
}
