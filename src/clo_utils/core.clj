(ns clo-utils.core)

(defmacro if-nil
  "Evaluates test. If logical nil, evaluates and returns then expr,
  otherwise else expr, if supplied, else nil."
  ([test then] `(if-nil ~test ~then nil))
  ([test then else]
   `(if (nil? ~test) ~then ~else)))

(defmacro when-nil
  "Evaluates test. If nil, evaluates body in an implicit do."
  [test & body]
  (list 'if-nil test (cons 'do body)))
