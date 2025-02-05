// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.javallm.llamacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.javallm.llamacpp.global.llama.*;


    @Properties(inherit = org.javallm.llamacpp.presets.llama.class)
public class ggml_opt_context extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public ggml_opt_context() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public ggml_opt_context(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ggml_opt_context(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public ggml_opt_context position(long position) {
            return (ggml_opt_context)super.position(position);
        }
        @Override public ggml_opt_context getPointer(long i) {
            return new ggml_opt_context((Pointer)this).offsetAddress(i);
        }
    
        public native ggml_context ctx(); public native ggml_opt_context ctx(ggml_context setter);
        public native @ByRef ggml_opt_params params(); public native ggml_opt_context params(ggml_opt_params setter);

        public native int iter(); public native ggml_opt_context iter(int setter);
        public native @Cast("int64_t") long nx(); public native ggml_opt_context nx(long setter); // number of parameter elements

        public native @Cast("bool") boolean just_initialized(); public native ggml_opt_context just_initialized(boolean setter);

            @Name("adam.x") public native ggml_tensor adam_x(); public native ggml_opt_context adam_x(ggml_tensor setter);  // view of the parameters
            @Name("adam.g1") public native ggml_tensor adam_g1(); public native ggml_opt_context adam_g1(ggml_tensor setter); // gradient
            @Name("adam.g2") public native ggml_tensor adam_g2(); public native ggml_opt_context adam_g2(ggml_tensor setter); // gradient squared
            @Name("adam.m") public native ggml_tensor adam_m(); public native ggml_opt_context adam_m(ggml_tensor setter);  // first moment
            @Name("adam.v") public native ggml_tensor adam_v(); public native ggml_opt_context adam_v(ggml_tensor setter);  // second moment
            @Name("adam.mh") public native ggml_tensor adam_mh(); public native ggml_opt_context adam_mh(ggml_tensor setter); // first moment hat
            @Name("adam.vh") public native ggml_tensor adam_vh(); public native ggml_opt_context adam_vh(ggml_tensor setter); // second moment hat
            @Name("adam.pf") public native ggml_tensor adam_pf(); public native ggml_opt_context adam_pf(ggml_tensor setter); // past function values
            @Name("adam.fx_best") public native float adam_fx_best(); public native ggml_opt_context adam_fx_best(float setter);
            @Name("adam.fx_prev") public native float adam_fx_prev(); public native ggml_opt_context adam_fx_prev(float setter);
            @Name("adam.n_no_improvement") public native int adam_n_no_improvement(); public native ggml_opt_context adam_n_no_improvement(int setter);

            @Name("lbfgs.x") public native ggml_tensor lbfgs_x(); public native ggml_opt_context lbfgs_x(ggml_tensor setter);    // current parameters
            @Name("lbfgs.xp") public native ggml_tensor lbfgs_xp(); public native ggml_opt_context lbfgs_xp(ggml_tensor setter);   // previous parameters
            @Name("lbfgs.g") public native ggml_tensor lbfgs_g(); public native ggml_opt_context lbfgs_g(ggml_tensor setter);    // current gradient
            @Name("lbfgs.gp") public native ggml_tensor lbfgs_gp(); public native ggml_opt_context lbfgs_gp(ggml_tensor setter);   // previous gradient
            @Name("lbfgs.d") public native ggml_tensor lbfgs_d(); public native ggml_opt_context lbfgs_d(ggml_tensor setter);    // search direction
            @Name("lbfgs.pf") public native ggml_tensor lbfgs_pf(); public native ggml_opt_context lbfgs_pf(ggml_tensor setter);   // past function values
            @Name("lbfgs.lmal") public native ggml_tensor lbfgs_lmal(); public native ggml_opt_context lbfgs_lmal(ggml_tensor setter); // the L-BFGS memory alpha
            @Name("lbfgs.lmys") public native ggml_tensor lbfgs_lmys(); public native ggml_opt_context lbfgs_lmys(ggml_tensor setter); // the L-BFGS memory ys
            @Name("lbfgs.lms") public native ggml_tensor lbfgs_lms(); public native ggml_opt_context lbfgs_lms(ggml_tensor setter);  // the L-BFGS memory s
            @Name("lbfgs.lmy") public native ggml_tensor lbfgs_lmy(); public native ggml_opt_context lbfgs_lmy(ggml_tensor setter);  // the L-BFGS memory y
            @Name("lbfgs.fx_best") public native float lbfgs_fx_best(); public native ggml_opt_context lbfgs_fx_best(float setter);
            @Name("lbfgs.step") public native float lbfgs_step(); public native ggml_opt_context lbfgs_step(float setter);
            @Name("lbfgs.j") public native int lbfgs_j(); public native ggml_opt_context lbfgs_j(int setter);
            @Name("lbfgs.k") public native int lbfgs_k(); public native ggml_opt_context lbfgs_k(int setter);
            @Name("lbfgs.end") public native int lbfgs_end(); public native ggml_opt_context lbfgs_end(int setter);
            @Name("lbfgs.n_no_improvement") public native int lbfgs_n_no_improvement(); public native ggml_opt_context lbfgs_n_no_improvement(int setter);
    }
