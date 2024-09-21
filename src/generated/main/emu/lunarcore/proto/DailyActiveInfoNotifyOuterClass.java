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
import us.hebi.quickbuf.RepeatedInt;
import us.hebi.quickbuf.RepeatedMessage;

public final class DailyActiveInfoNotifyOuterClass {
  /**
   * Protobuf type {@code DailyActiveInfoNotify}
   */
  public static final class DailyActiveInfoNotify extends ProtoMessage<DailyActiveInfoNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 daily_active_point = 13;</code>
     */
    private int dailyActivePoint;

    /**
     * <code>repeated uint32 daily_active_quest_id_list = 6;</code>
     */
    private final RepeatedInt dailyActiveQuestIdList = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated .DailyActivityInfo daily_active_level_list = 10;</code>
     */
    private final RepeatedMessage<DailyActivityInfoOuterClass.DailyActivityInfo> dailyActiveLevelList = RepeatedMessage.newEmptyInstance(DailyActivityInfoOuterClass.DailyActivityInfo.getFactory());

    private DailyActiveInfoNotify() {
    }

    /**
     * @return a new empty instance of {@code DailyActiveInfoNotify}
     */
    public static DailyActiveInfoNotify newInstance() {
      return new DailyActiveInfoNotify();
    }

    /**
     * <code>optional uint32 daily_active_point = 13;</code>
     * @return whether the dailyActivePoint field is set
     */
    public boolean hasDailyActivePoint() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 daily_active_point = 13;</code>
     * @return this
     */
    public DailyActiveInfoNotify clearDailyActivePoint() {
      bitField0_ &= ~0x00000001;
      dailyActivePoint = 0;
      return this;
    }

    /**
     * <code>optional uint32 daily_active_point = 13;</code>
     * @return the dailyActivePoint
     */
    public int getDailyActivePoint() {
      return dailyActivePoint;
    }

    /**
     * <code>optional uint32 daily_active_point = 13;</code>
     * @param value the dailyActivePoint to set
     * @return this
     */
    public DailyActiveInfoNotify setDailyActivePoint(final int value) {
      bitField0_ |= 0x00000001;
      dailyActivePoint = value;
      return this;
    }

    /**
     * <code>repeated uint32 daily_active_quest_id_list = 6;</code>
     * @return whether the dailyActiveQuestIdList field is set
     */
    public boolean hasDailyActiveQuestIdList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 daily_active_quest_id_list = 6;</code>
     * @return this
     */
    public DailyActiveInfoNotify clearDailyActiveQuestIdList() {
      bitField0_ &= ~0x00000002;
      dailyActiveQuestIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 daily_active_quest_id_list = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDailyActiveQuestIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getDailyActiveQuestIdList() {
      return dailyActiveQuestIdList;
    }

    /**
     * <code>repeated uint32 daily_active_quest_id_list = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableDailyActiveQuestIdList() {
      bitField0_ |= 0x00000002;
      return dailyActiveQuestIdList;
    }

    /**
     * <code>repeated uint32 daily_active_quest_id_list = 6;</code>
     * @param value the dailyActiveQuestIdList to add
     * @return this
     */
    public DailyActiveInfoNotify addDailyActiveQuestIdList(final int value) {
      bitField0_ |= 0x00000002;
      dailyActiveQuestIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 daily_active_quest_id_list = 6;</code>
     * @param values the dailyActiveQuestIdList to add
     * @return this
     */
    public DailyActiveInfoNotify addAllDailyActiveQuestIdList(final int... values) {
      bitField0_ |= 0x00000002;
      dailyActiveQuestIdList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .DailyActivityInfo daily_active_level_list = 10;</code>
     * @return whether the dailyActiveLevelList field is set
     */
    public boolean hasDailyActiveLevelList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .DailyActivityInfo daily_active_level_list = 10;</code>
     * @return this
     */
    public DailyActiveInfoNotify clearDailyActiveLevelList() {
      bitField0_ &= ~0x00000004;
      dailyActiveLevelList.clear();
      return this;
    }

    /**
     * <code>repeated .DailyActivityInfo daily_active_level_list = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDailyActiveLevelList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<DailyActivityInfoOuterClass.DailyActivityInfo> getDailyActiveLevelList(
        ) {
      return dailyActiveLevelList;
    }

    /**
     * <code>repeated .DailyActivityInfo daily_active_level_list = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<DailyActivityInfoOuterClass.DailyActivityInfo> getMutableDailyActiveLevelList(
        ) {
      bitField0_ |= 0x00000004;
      return dailyActiveLevelList;
    }

    /**
     * <code>repeated .DailyActivityInfo daily_active_level_list = 10;</code>
     * @param value the dailyActiveLevelList to add
     * @return this
     */
    public DailyActiveInfoNotify addDailyActiveLevelList(
        final DailyActivityInfoOuterClass.DailyActivityInfo value) {
      bitField0_ |= 0x00000004;
      dailyActiveLevelList.add(value);
      return this;
    }

    /**
     * <code>repeated .DailyActivityInfo daily_active_level_list = 10;</code>
     * @param values the dailyActiveLevelList to add
     * @return this
     */
    public DailyActiveInfoNotify addAllDailyActiveLevelList(
        final DailyActivityInfoOuterClass.DailyActivityInfo... values) {
      bitField0_ |= 0x00000004;
      dailyActiveLevelList.addAll(values);
      return this;
    }

    @Override
    public DailyActiveInfoNotify copyFrom(final DailyActiveInfoNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        dailyActivePoint = other.dailyActivePoint;
        dailyActiveQuestIdList.copyFrom(other.dailyActiveQuestIdList);
        dailyActiveLevelList.copyFrom(other.dailyActiveLevelList);
      }
      return this;
    }

    @Override
    public DailyActiveInfoNotify mergeFrom(final DailyActiveInfoNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasDailyActivePoint()) {
        setDailyActivePoint(other.dailyActivePoint);
      }
      if (other.hasDailyActiveQuestIdList()) {
        getMutableDailyActiveQuestIdList().addAll(other.dailyActiveQuestIdList);
      }
      if (other.hasDailyActiveLevelList()) {
        getMutableDailyActiveLevelList().addAll(other.dailyActiveLevelList);
      }
      return this;
    }

    @Override
    public DailyActiveInfoNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      dailyActivePoint = 0;
      dailyActiveQuestIdList.clear();
      dailyActiveLevelList.clear();
      return this;
    }

    @Override
    public DailyActiveInfoNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      dailyActiveQuestIdList.clear();
      dailyActiveLevelList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof DailyActiveInfoNotify)) {
        return false;
      }
      DailyActiveInfoNotify other = (DailyActiveInfoNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasDailyActivePoint() || dailyActivePoint == other.dailyActivePoint)
        && (!hasDailyActiveQuestIdList() || dailyActiveQuestIdList.equals(other.dailyActiveQuestIdList))
        && (!hasDailyActiveLevelList() || dailyActiveLevelList.equals(other.dailyActiveLevelList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(dailyActivePoint);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < dailyActiveQuestIdList.length(); i++) {
          output.writeRawByte((byte) 48);
          output.writeUInt32NoTag(dailyActiveQuestIdList.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < dailyActiveLevelList.length(); i++) {
          output.writeRawByte((byte) 82);
          output.writeMessageNoTag(dailyActiveLevelList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(dailyActivePoint);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * dailyActiveQuestIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(dailyActiveQuestIdList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * dailyActiveLevelList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(dailyActiveLevelList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DailyActiveInfoNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 104: {
            // dailyActivePoint
            dailyActivePoint = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // dailyActiveQuestIdList [packed=true]
            input.readPackedUInt32(dailyActiveQuestIdList, tag);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // dailyActiveLevelList
            tag = input.readRepeatedMessage(dailyActiveLevelList, tag);
            bitField0_ |= 0x00000004;
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
          case 48: {
            // dailyActiveQuestIdList [packed=false]
            tag = input.readRepeatedUInt32(dailyActiveQuestIdList, tag);
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.dailyActivePoint, dailyActivePoint);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.dailyActiveQuestIdList, dailyActiveQuestIdList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.dailyActiveLevelList, dailyActiveLevelList);
      }
      output.endObject();
    }

    @Override
    public DailyActiveInfoNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 859671121:
          case 1952864125: {
            if (input.isAtField(FieldNames.dailyActivePoint)) {
              if (!input.trySkipNullValue()) {
                dailyActivePoint = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1903124444:
          case -752691246: {
            if (input.isAtField(FieldNames.dailyActiveQuestIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(dailyActiveQuestIdList);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 705251971:
          case 1821477548: {
            if (input.isAtField(FieldNames.dailyActiveLevelList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(dailyActiveLevelList);
                bitField0_ |= 0x00000004;
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
    public DailyActiveInfoNotify clone() {
      return new DailyActiveInfoNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DailyActiveInfoNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DailyActiveInfoNotify(), data).checkInitialized();
    }

    public static DailyActiveInfoNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DailyActiveInfoNotify(), input).checkInitialized();
    }

    public static DailyActiveInfoNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DailyActiveInfoNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating DailyActiveInfoNotify messages
     */
    public static MessageFactory<DailyActiveInfoNotify> getFactory() {
      return DailyActiveInfoNotifyFactory.INSTANCE;
    }

    private enum DailyActiveInfoNotifyFactory implements MessageFactory<DailyActiveInfoNotify> {
      INSTANCE;

      @Override
      public DailyActiveInfoNotify create() {
        return DailyActiveInfoNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName dailyActivePoint = FieldName.forField("dailyActivePoint", "daily_active_point");

      static final FieldName dailyActiveQuestIdList = FieldName.forField("dailyActiveQuestIdList", "daily_active_quest_id_list");

      static final FieldName dailyActiveLevelList = FieldName.forField("dailyActiveLevelList", "daily_active_level_list");
    }
  }
}
