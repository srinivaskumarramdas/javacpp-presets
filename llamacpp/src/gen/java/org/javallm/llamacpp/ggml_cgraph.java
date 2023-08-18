// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.javallm.llamacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.javallm.llamacpp.global.llama.*;


    // computation graph
    @Properties(inherit = org.javallm.llamacpp.presets.llama.class)
public class ggml_cgraph extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public ggml_cgraph() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public ggml_cgraph(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ggml_cgraph(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public ggml_cgraph position(long position) {
            return (ggml_cgraph)super.position(position);
        }
        @Override public ggml_cgraph getPointer(long i) {
            return new ggml_cgraph((Pointer)this).offsetAddress(i);
        }
    
        public native int n_nodes(); public native ggml_cgraph n_nodes(int setter);
        public native int n_leafs(); public native ggml_cgraph n_leafs(int setter);

        public native ggml_tensor nodes(int i); public native ggml_cgraph nodes(int i, ggml_tensor setter);
        @MemberGetter public native @Cast("ggml_tensor**") PointerPointer nodes();
        public native ggml_tensor grads(int i); public native ggml_cgraph grads(int i, ggml_tensor setter);
        @MemberGetter public native @Cast("ggml_tensor**") PointerPointer grads();
        public native ggml_tensor leafs(int i); public native ggml_cgraph leafs(int i, ggml_tensor setter);
        @MemberGetter public native @Cast("ggml_tensor**") PointerPointer leafs();

        public native Pointer visited_hash_table(int i); public native ggml_cgraph visited_hash_table(int i, Pointer setter);
        @MemberGetter public native @Cast("void**") PointerPointer visited_hash_table();

        // performance
        public native int perf_runs(); public native ggml_cgraph perf_runs(int setter);
        public native @Cast("int64_t") long perf_cycles(); public native ggml_cgraph perf_cycles(long setter);
        public native @Cast("int64_t") long perf_time_us(); public native ggml_cgraph perf_time_us(long setter);
    }