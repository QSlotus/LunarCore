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

public final class GetMultiPathAvatarInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetMultiPathAvatarInfoScRsp}
   */
  public static final class GetMultiPathAvatarInfoScRsp extends ProtoMessage<GetMultiPathAvatarInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 3;</code>
     */
    private int retcode;

    /**
     * <code>repeated uint32 basic_type_id_list = 4;</code>
     */
    private final RepeatedInt basicTypeIdList = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated .MultiPathAvatarInfo multi_path_avatar_info_list = 2;</code>
     */
    private final RepeatedMessage<MultiPathAvatarInfoOuterClass.MultiPathAvatarInfo> multiPathAvatarInfoList = RepeatedMessage.newEmptyInstance(MultiPathAvatarInfoOuterClass.MultiPathAvatarInfo.getFactory());

    /**
     * <code>repeated .GetMultiPathAvatarInfoScRsp.CurAvatarPathEntry cur_avatar_path = 13;</code>
     */
    private final RepeatedMessage<CurAvatarPathEntry> curAvatarPath = RepeatedMessage.newEmptyInstance(CurAvatarPathEntry.getFactory());

    private GetMultiPathAvatarInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetMultiPathAvatarInfoScRsp}
     */
    public static GetMultiPathAvatarInfoScRsp newInstance() {
      return new GetMultiPathAvatarInfoScRsp();
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
    public GetMultiPathAvatarInfoScRsp clearRetcode() {
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
    public GetMultiPathAvatarInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated uint32 basic_type_id_list = 4;</code>
     * @return whether the basicTypeIdList field is set
     */
    public boolean hasBasicTypeIdList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 basic_type_id_list = 4;</code>
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp clearBasicTypeIdList() {
      bitField0_ &= ~0x00000002;
      basicTypeIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 basic_type_id_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBasicTypeIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getBasicTypeIdList() {
      return basicTypeIdList;
    }

    /**
     * <code>repeated uint32 basic_type_id_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableBasicTypeIdList() {
      bitField0_ |= 0x00000002;
      return basicTypeIdList;
    }

    /**
     * <code>repeated uint32 basic_type_id_list = 4;</code>
     * @param value the basicTypeIdList to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addBasicTypeIdList(final int value) {
      bitField0_ |= 0x00000002;
      basicTypeIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 basic_type_id_list = 4;</code>
     * @param values the basicTypeIdList to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addAllBasicTypeIdList(final int... values) {
      bitField0_ |= 0x00000002;
      basicTypeIdList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .MultiPathAvatarInfo multi_path_avatar_info_list = 2;</code>
     * @return whether the multiPathAvatarInfoList field is set
     */
    public boolean hasMultiPathAvatarInfoList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .MultiPathAvatarInfo multi_path_avatar_info_list = 2;</code>
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp clearMultiPathAvatarInfoList() {
      bitField0_ &= ~0x00000004;
      multiPathAvatarInfoList.clear();
      return this;
    }

    /**
     * <code>repeated .MultiPathAvatarInfo multi_path_avatar_info_list = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMultiPathAvatarInfoList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<MultiPathAvatarInfoOuterClass.MultiPathAvatarInfo> getMultiPathAvatarInfoList(
        ) {
      return multiPathAvatarInfoList;
    }

    /**
     * <code>repeated .MultiPathAvatarInfo multi_path_avatar_info_list = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<MultiPathAvatarInfoOuterClass.MultiPathAvatarInfo> getMutableMultiPathAvatarInfoList(
        ) {
      bitField0_ |= 0x00000004;
      return multiPathAvatarInfoList;
    }

    /**
     * <code>repeated .MultiPathAvatarInfo multi_path_avatar_info_list = 2;</code>
     * @param value the multiPathAvatarInfoList to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addMultiPathAvatarInfoList(
        final MultiPathAvatarInfoOuterClass.MultiPathAvatarInfo value) {
      bitField0_ |= 0x00000004;
      multiPathAvatarInfoList.add(value);
      return this;
    }

    /**
     * <code>repeated .MultiPathAvatarInfo multi_path_avatar_info_list = 2;</code>
     * @param values the multiPathAvatarInfoList to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addAllMultiPathAvatarInfoList(
        final MultiPathAvatarInfoOuterClass.MultiPathAvatarInfo... values) {
      bitField0_ |= 0x00000004;
      multiPathAvatarInfoList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .GetMultiPathAvatarInfoScRsp.CurAvatarPathEntry cur_avatar_path = 13;</code>
     * @return whether the curAvatarPath field is set
     */
    public boolean hasCurAvatarPath() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated .GetMultiPathAvatarInfoScRsp.CurAvatarPathEntry cur_avatar_path = 13;</code>
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp clearCurAvatarPath() {
      bitField0_ &= ~0x00000008;
      curAvatarPath.clear();
      return this;
    }

    /**
     * <code>repeated .GetMultiPathAvatarInfoScRsp.CurAvatarPathEntry cur_avatar_path = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableCurAvatarPath()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<CurAvatarPathEntry> getCurAvatarPath() {
      return curAvatarPath;
    }

    /**
     * <code>repeated .GetMultiPathAvatarInfoScRsp.CurAvatarPathEntry cur_avatar_path = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<CurAvatarPathEntry> getMutableCurAvatarPath() {
      bitField0_ |= 0x00000008;
      return curAvatarPath;
    }

    /**
     * <code>repeated .GetMultiPathAvatarInfoScRsp.CurAvatarPathEntry cur_avatar_path = 13;</code>
     * @param value the curAvatarPath to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addCurAvatarPath(final CurAvatarPathEntry value) {
      bitField0_ |= 0x00000008;
      curAvatarPath.add(value);
      return this;
    }

    /**
     * <code>repeated .GetMultiPathAvatarInfoScRsp.CurAvatarPathEntry cur_avatar_path = 13;</code>
     * @param values the curAvatarPath to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addAllCurAvatarPath(final CurAvatarPathEntry... values) {
      bitField0_ |= 0x00000008;
      curAvatarPath.addAll(values);
      return this;
    }

    @Override
    public GetMultiPathAvatarInfoScRsp copyFrom(final GetMultiPathAvatarInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        basicTypeIdList.copyFrom(other.basicTypeIdList);
        multiPathAvatarInfoList.copyFrom(other.multiPathAvatarInfoList);
        curAvatarPath.copyFrom(other.curAvatarPath);
      }
      return this;
    }

    @Override
    public GetMultiPathAvatarInfoScRsp mergeFrom(final GetMultiPathAvatarInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasBasicTypeIdList()) {
        getMutableBasicTypeIdList().addAll(other.basicTypeIdList);
      }
      if (other.hasMultiPathAvatarInfoList()) {
        getMutableMultiPathAvatarInfoList().addAll(other.multiPathAvatarInfoList);
      }
      if (other.hasCurAvatarPath()) {
        getMutableCurAvatarPath().addAll(other.curAvatarPath);
      }
      return this;
    }

    @Override
    public GetMultiPathAvatarInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      basicTypeIdList.clear();
      multiPathAvatarInfoList.clear();
      curAvatarPath.clear();
      return this;
    }

    @Override
    public GetMultiPathAvatarInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      basicTypeIdList.clear();
      multiPathAvatarInfoList.clearQuick();
      curAvatarPath.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetMultiPathAvatarInfoScRsp)) {
        return false;
      }
      GetMultiPathAvatarInfoScRsp other = (GetMultiPathAvatarInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasBasicTypeIdList() || basicTypeIdList.equals(other.basicTypeIdList))
        && (!hasMultiPathAvatarInfoList() || multiPathAvatarInfoList.equals(other.multiPathAvatarInfoList))
        && (!hasCurAvatarPath() || curAvatarPath.equals(other.curAvatarPath));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < basicTypeIdList.length(); i++) {
          output.writeRawByte((byte) 32);
          output.writeUInt32NoTag(basicTypeIdList.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < multiPathAvatarInfoList.length(); i++) {
          output.writeRawByte((byte) 18);
          output.writeMessageNoTag(multiPathAvatarInfoList.get(i));
        }
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < curAvatarPath.length(); i++) {
          output.writeRawByte((byte) 106);
          output.writeMessageNoTag(curAvatarPath.get(i));
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
        size += (1 * basicTypeIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(basicTypeIdList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * multiPathAvatarInfoList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(multiPathAvatarInfoList);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * curAvatarPath.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(curAvatarPath);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetMultiPathAvatarInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // basicTypeIdList [packed=true]
            input.readPackedUInt32(basicTypeIdList, tag);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // multiPathAvatarInfoList
            tag = input.readRepeatedMessage(multiPathAvatarInfoList, tag);
            bitField0_ |= 0x00000004;
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // curAvatarPath
            tag = input.readRepeatedMessage(curAvatarPath, tag);
            bitField0_ |= 0x00000008;
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
          case 32: {
            // basicTypeIdList [packed=false]
            tag = input.readRepeatedUInt32(basicTypeIdList, tag);
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.basicTypeIdList, basicTypeIdList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.multiPathAvatarInfoList, multiPathAvatarInfoList);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.curAvatarPath, curAvatarPath);
      }
      output.endObject();
    }

    @Override
    public GetMultiPathAvatarInfoScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -332160255:
          case 99090862: {
            if (input.isAtField(FieldNames.basicTypeIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(basicTypeIdList);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1198530685:
          case -2042493827: {
            if (input.isAtField(FieldNames.multiPathAvatarInfoList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(multiPathAvatarInfoList);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1836831614:
          case 589876172: {
            if (input.isAtField(FieldNames.curAvatarPath)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(curAvatarPath);
                bitField0_ |= 0x00000008;
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
    public GetMultiPathAvatarInfoScRsp clone() {
      return new GetMultiPathAvatarInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetMultiPathAvatarInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetMultiPathAvatarInfoScRsp(), data).checkInitialized();
    }

    public static GetMultiPathAvatarInfoScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetMultiPathAvatarInfoScRsp(), input).checkInitialized();
    }

    public static GetMultiPathAvatarInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetMultiPathAvatarInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetMultiPathAvatarInfoScRsp messages
     */
    public static MessageFactory<GetMultiPathAvatarInfoScRsp> getFactory() {
      return GetMultiPathAvatarInfoScRspFactory.INSTANCE;
    }

    /**
     * Protobuf type {@code CurAvatarPathEntry}
     */
    public static final class CurAvatarPathEntry extends ProtoMessage<CurAvatarPathEntry> implements Cloneable {
      private static final long serialVersionUID = 0L;

      /**
       * <code>optional uint32 key = 1;</code>
       */
      private int key;

      /**
       * <code>optional .MultiPathAvatarType value = 2;</code>
       */
      private int value_;

      private CurAvatarPathEntry() {
      }

      /**
       * @return a new empty instance of {@code CurAvatarPathEntry}
       */
      public static CurAvatarPathEntry newInstance() {
        return new CurAvatarPathEntry();
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return whether the key field is set
       */
      public boolean hasKey() {
        return (bitField0_ & 0x00000001) != 0;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return this
       */
      public CurAvatarPathEntry clearKey() {
        bitField0_ &= ~0x00000001;
        key = 0;
        return this;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return the key
       */
      public int getKey() {
        return key;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @param value the key to set
       * @return this
       */
      public CurAvatarPathEntry setKey(final int value) {
        bitField0_ |= 0x00000001;
        key = value;
        return this;
      }

      /**
       * <code>optional .MultiPathAvatarType value = 2;</code>
       * @return whether the value_ field is set
       */
      public boolean hasValue() {
        return (bitField0_ & 0x00000002) != 0;
      }

      /**
       * <code>optional .MultiPathAvatarType value = 2;</code>
       * @return this
       */
      public CurAvatarPathEntry clearValue() {
        bitField0_ &= ~0x00000002;
        value_ = 0;
        return this;
      }

      /**
       * <code>optional .MultiPathAvatarType value = 2;</code>
       * @return the value_
       */
      public MultiPathAvatarTypeOuterClass.MultiPathAvatarType getValue() {
        return MultiPathAvatarTypeOuterClass.MultiPathAvatarType.forNumber(value_);
      }

      /**
       * Gets the value of the internal enum store. The result is
       * equivalent to {@link CurAvatarPathEntry#getValue()}.getNumber().
       *
       * @return numeric wire representation
       */
      public int getValueValue() {
        return value_;
      }

      /**
       * Sets the value of the internal enum store. This does not
       * do any validity checks, so be sure to use appropriate value
       * constants from {@link MultiPathAvatarTypeOuterClass.MultiPathAvatarType}. Setting an invalid value
       * can cause {@link CurAvatarPathEntry#getValue()} to return null
       *
       * @param value the numeric wire value to set
       * @return this
       */
      public CurAvatarPathEntry setValueValue(final int value) {
        bitField0_ |= 0x00000002;
        value_ = value;
        return this;
      }

      /**
       * <code>optional .MultiPathAvatarType value = 2;</code>
       * @param value the value_ to set
       * @return this
       */
      public CurAvatarPathEntry setValue(
          final MultiPathAvatarTypeOuterClass.MultiPathAvatarType value) {
        bitField0_ |= 0x00000002;
        value_ = value.getNumber();
        return this;
      }

      @Override
      public CurAvatarPathEntry copyFrom(final CurAvatarPathEntry other) {
        cachedSize = other.cachedSize;
        if ((bitField0_ | other.bitField0_) != 0) {
          bitField0_ = other.bitField0_;
          key = other.key;
          value_ = other.value_;
        }
        return this;
      }

      @Override
      public CurAvatarPathEntry mergeFrom(final CurAvatarPathEntry other) {
        if (other.isEmpty()) {
          return this;
        }
        cachedSize = -1;
        if (other.hasKey()) {
          setKey(other.key);
        }
        if (other.hasValue()) {
          setValueValue(other.value_);
        }
        return this;
      }

      @Override
      public CurAvatarPathEntry clear() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        key = 0;
        value_ = 0;
        return this;
      }

      @Override
      public CurAvatarPathEntry clearQuick() {
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
        if (!(o instanceof CurAvatarPathEntry)) {
          return false;
        }
        CurAvatarPathEntry other = (CurAvatarPathEntry) o;
        return bitField0_ == other.bitField0_
          && (!hasKey() || key == other.key)
          && (!hasValue() || value_ == other.value_);
      }

      @Override
      public void writeTo(final ProtoSink output) throws IOException {
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeRawByte((byte) 8);
          output.writeUInt32NoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeRawByte((byte) 16);
          output.writeEnumNoTag(value_);
        }
      }

      @Override
      protected int computeSerializedSize() {
        int size = 0;
        if ((bitField0_ & 0x00000001) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          size += 1 + ProtoSink.computeEnumSizeNoTag(value_);
        }
        return size;
      }

      @Override
      @SuppressWarnings("fallthrough")
      public CurAvatarPathEntry mergeFrom(final ProtoSource input) throws IOException {
        // Enabled Fall-Through Optimization (QuickBuffers)
        int tag = input.readTag();
        while (true) {
          switch (tag) {
            case 8: {
              // key
              key = input.readUInt32();
              bitField0_ |= 0x00000001;
              tag = input.readTag();
              if (tag != 16) {
                break;
              }
            }
            case 16: {
              // value_
              final int value = input.readInt32();
              if (MultiPathAvatarTypeOuterClass.MultiPathAvatarType.forNumber(value) != null) {
                value_ = value;
                bitField0_ |= 0x00000002;
              }
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
          output.writeUInt32(FieldNames.key, key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeEnum(FieldNames.value_, value_, MultiPathAvatarTypeOuterClass.MultiPathAvatarType.converter());
        }
        output.endObject();
      }

      @Override
      public CurAvatarPathEntry mergeFrom(final JsonSource input) throws IOException {
        if (!input.beginObject()) {
          return this;
        }
        while (!input.isAtEnd()) {
          switch (input.readFieldHash()) {
            case 106079: {
              if (input.isAtField(FieldNames.key)) {
                if (!input.trySkipNullValue()) {
                  key = input.readUInt32();
                  bitField0_ |= 0x00000001;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 111972721: {
              if (input.isAtField(FieldNames.value_)) {
                if (!input.trySkipNullValue()) {
                  final MultiPathAvatarTypeOuterClass.MultiPathAvatarType value = input.readEnum(MultiPathAvatarTypeOuterClass.MultiPathAvatarType.converter());
                  if (value != null) {
                    value_ = value.getNumber();
                    bitField0_ |= 0x00000002;
                  } else {
                    input.skipUnknownEnumValue();
                  }
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
      public CurAvatarPathEntry clone() {
        return new CurAvatarPathEntry().copyFrom(this);
      }

      @Override
      public boolean isEmpty() {
        return ((bitField0_) == 0);
      }

      public static CurAvatarPathEntry parseFrom(final byte[] data) throws
          InvalidProtocolBufferException {
        return ProtoMessage.mergeFrom(new CurAvatarPathEntry(), data).checkInitialized();
      }

      public static CurAvatarPathEntry parseFrom(final ProtoSource input) throws IOException {
        return ProtoMessage.mergeFrom(new CurAvatarPathEntry(), input).checkInitialized();
      }

      public static CurAvatarPathEntry parseFrom(final JsonSource input) throws IOException {
        return ProtoMessage.mergeFrom(new CurAvatarPathEntry(), input).checkInitialized();
      }

      /**
       * @return factory for creating CurAvatarPathEntry messages
       */
      public static MessageFactory<CurAvatarPathEntry> getFactory() {
        return CurAvatarPathEntryFactory.INSTANCE;
      }

      private enum CurAvatarPathEntryFactory implements MessageFactory<CurAvatarPathEntry> {
        INSTANCE;

        @Override
        public CurAvatarPathEntry create() {
          return CurAvatarPathEntry.newInstance();
        }
      }

      /**
       * Contains name constants used for serializing JSON
       */
      static class FieldNames {
        static final FieldName key = FieldName.forField("key");

        static final FieldName value_ = FieldName.forField("value");
      }
    }

    private enum GetMultiPathAvatarInfoScRspFactory implements MessageFactory<GetMultiPathAvatarInfoScRsp> {
      INSTANCE;

      @Override
      public GetMultiPathAvatarInfoScRsp create() {
        return GetMultiPathAvatarInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName basicTypeIdList = FieldName.forField("basicTypeIdList", "basic_type_id_list");

      static final FieldName multiPathAvatarInfoList = FieldName.forField("multiPathAvatarInfoList", "multi_path_avatar_info_list");

      static final FieldName curAvatarPath = FieldName.forField("curAvatarPath", "cur_avatar_path");
    }
  }
}
