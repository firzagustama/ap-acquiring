// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order_header_ub.proto

package corp.bi.go.id.ap.acquiring.grpc;

public final class OrderHeaderUb {
  private OrderHeaderUb() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OrderHeaderUBRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OrderHeaderUBRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OrderHeaderUBResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OrderHeaderUBResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025order_header_ub.proto\"\'\n\024OrderHeaderUB" +
      "Request\022\017\n\007orderNo\030\001 \001(\t\"B\n\025OrderHeaderU" +
      "BResponse\022\n\n\002id\030\001 \001(\t\022\017\n\007orderNo\030\002 \001(\t\022\014" +
      "\n\004name\030\003 \001(\t2M\n\014OrderService\022=\n\ngetOrder" +
      "UB\022\025.OrderHeaderUBRequest\032\026.OrderHeaderU" +
      "BResponse\"\000B#\n\037corp.bi.go.id.ap.acquirin" +
      "g.grpcP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_OrderHeaderUBRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OrderHeaderUBRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OrderHeaderUBRequest_descriptor,
        new java.lang.String[] { "OrderNo", });
    internal_static_OrderHeaderUBResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_OrderHeaderUBResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OrderHeaderUBResponse_descriptor,
        new java.lang.String[] { "Id", "OrderNo", "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}