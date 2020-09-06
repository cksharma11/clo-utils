(ns clo-utils.core)

(defmacro if-nil
  "Evaluates test. If nil, evaluates and returns then expr,
  otherwise else expr, if supplied, else nil."
  ([test then] `(if-nil ~test ~then nil))
  ([test then else]
   `(if (nil? ~test) ~then ~else)))

(defmacro if-empty
  "Evaluates test. If test value empty, evaluates and returns then expr,
  otherwise else expr, if supplied, else nil."
  ([test then] `(if-empty ~test ~then nil))
  ([test then else]
   `(if (empty? ~test) ~then ~else)))

(defmacro if=
  "Evaluates test. If first equal second, evaluates and returns then expr,
  otherwise else expr, if supplied, else nil."
  ([first second then] `(if= ~first ~second ~then nil))
  ([first second then else]
   `(if (= ~first ~second) ~then ~else)))

(defmacro when-nil
  "Evaluates test. If nil, evaluates body in an implicit do."
  [test & body]
  (list 'if-nil test (cons 'do body)))

(defmacro when-not-nil
  "Evaluates test. If not nil, evaluates body in an implicit do."
  [test & body]
  (list 'if-nil test nil (cons 'do body)))

(defmacro when-empty
  "Evaluates test. If test value empty, evaluates body in an implicit do."
  [test & body]
  (list 'if-empty test (cons 'do body)))

(defmacro when-not-empty
  "Evaluates test. If test not empty, evaluates body in an implicit do."
  [test & body]
  (list 'if-empty test nil (cons 'do body)))
