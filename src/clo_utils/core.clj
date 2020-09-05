(ns clo-utils.core)

(defmacro if-nil
  "Evaluates test. If logical nil, evaluates and returns then expr,
  otherwise else expr, if supplied, else nil."
  ([test then] `(if-nil ~test ~then nil))
  ([test then else]
   `(if (nil? ~test) ~then ~else)))

(defmacro if-not-nil
  "Evaluates test. If logical not nil, evaluates and returns then expr,
  otherwise else expr, if supplied, else nil."
  ([test then] `(if-not-nil ~test ~then nil))
  ([test then else]
   `(if-not (nil? ~test) ~then ~else)))
