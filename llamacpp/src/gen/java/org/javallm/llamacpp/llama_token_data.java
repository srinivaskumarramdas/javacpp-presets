// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.javallm.llamacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.javallm.llamacpp.global.llama.*;


    @Properties(inherit = org.javallm.llamacpp.presets.llama.class)
public class llama_token_data extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public llama_token_data() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public llama_token_data(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public llama_token_data(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public llama_token_data position(long position) {
            return (llama_token_data)super.position(position);
        }
        @Override public llama_token_data getPointer(long i) {
            return new llama_token_data((Pointer)this).offsetAddress(i);
        }
    
        public native @Cast("llama_token") int id(); public native llama_token_data id(int setter); // token id
        public native float logit(); public native llama_token_data logit(float setter);    // log-odds of the token
        public native float p(); public native llama_token_data p(float setter);        // probability of the token
    }