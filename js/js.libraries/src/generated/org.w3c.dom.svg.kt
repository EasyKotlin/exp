/*
 * Generated file
 * DO NOT EDIT
 * 
 * See libraries/tools/idl2k for details
 */

package org.w3c.dom.svg

import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.css.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

native public open class SVGDocument : Document() {
    var rootElement: SVGSVGElement
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGSVGElement : SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGLocatable, SVGFitToViewBox, SVGZoomAndPan {
    var x: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var y: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var width: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var height: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var contentScriptType: dynamic
        get() = noImpl
        set(value) = noImpl
    var contentStyleType: dynamic
        get() = noImpl
        set(value) = noImpl
    var viewport: SVGRect
        get() = noImpl
        set(value) = noImpl
    var pixelUnitToMillimeterX: Float
        get() = noImpl
        set(value) = noImpl
    var pixelUnitToMillimeterY: Float
        get() = noImpl
        set(value) = noImpl
    var screenPixelToMillimeterX: Float
        get() = noImpl
        set(value) = noImpl
    var screenPixelToMillimeterY: Float
        get() = noImpl
        set(value) = noImpl
    var useCurrentView: Boolean
        get() = noImpl
        set(value) = noImpl
    var currentView: SVGViewSpec
        get() = noImpl
        set(value) = noImpl
    var currentScale: Float
        get() = noImpl
        set(value) = noImpl
    var currentTranslate: SVGPoint
        get() = noImpl
        set(value) = noImpl
    fun suspendRedraw(maxWaitMilliseconds: Int): Int = noImpl
    fun unsuspendRedraw(suspendHandleID: Int): Unit = noImpl
    fun unsuspendRedrawAll(): Unit = noImpl
    fun forceRedraw(): Unit = noImpl
    fun pauseAnimations(): Unit = noImpl
    fun unpauseAnimations(): Unit = noImpl
    fun animationsPaused(): Boolean = noImpl
    fun getCurrentTime(): Float = noImpl
    fun setCurrentTime(seconds: Float): Unit = noImpl
    fun getIntersectionList(rect: SVGRect, referenceElement: SVGElement): NodeList = noImpl
    fun getEnclosureList(rect: SVGRect, referenceElement: SVGElement): NodeList = noImpl
    fun checkIntersection(element: SVGElement, rect: SVGRect): Boolean = noImpl
    fun checkEnclosure(element: SVGElement, rect: SVGRect): Boolean = noImpl
    fun deselectAll(): Unit = noImpl
    fun createSVGNumber(): SVGNumber = noImpl
    fun createSVGLength(): SVGLength = noImpl
    fun createSVGAngle(): SVGAngle = noImpl
    fun createSVGPoint(): SVGPoint = noImpl
    fun createSVGMatrix(): SVGMatrix = noImpl
    fun createSVGRect(): SVGRect = noImpl
    fun createSVGTransform(): SVGTransform = noImpl
    fun createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = noImpl
    fun getElementById(elementId: String): Element = noImpl
}

native public interface SVGGElement : SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable {
}

native public interface SVGDefsElement : SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable {
}

native public interface SVGDescElement : SVGElement, SVGLangSpace, SVGStylable {
}

native public interface SVGTitleElement : SVGElement, SVGLangSpace, SVGStylable {
}

native public interface SVGSymbolElement : SVGElement, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGFitToViewBox {
}

native public interface SVGUseElement : SVGElement, SVGURIReference, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable {
    var x: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var y: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var width: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var height: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var instanceRoot: SVGElementInstance
        get() = noImpl
        set(value) = noImpl
    var animatedInstanceRoot: SVGElementInstance
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGElementInstance : EventTarget {
    var correspondingElement: SVGElement
        get() = noImpl
        set(value) = noImpl
    var correspondingUseElement: SVGUseElement
        get() = noImpl
        set(value) = noImpl
    var parentNode: SVGElementInstance
        get() = noImpl
        set(value) = noImpl
    var childNodes: SVGElementInstanceList
        get() = noImpl
        set(value) = noImpl
    var firstChild: SVGElementInstance
        get() = noImpl
        set(value) = noImpl
    var lastChild: SVGElementInstance
        get() = noImpl
        set(value) = noImpl
    var previousSibling: SVGElementInstance
        get() = noImpl
        set(value) = noImpl
    var nextSibling: SVGElementInstance
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGElementInstanceList {
    var length: Int
        get() = noImpl
        set(value) = noImpl
    fun item(index: Int): SVGElementInstance = noImpl
}

native public interface SVGImageElement : SVGElement, SVGURIReference, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable {
    var x: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var y: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var width: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var height: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var preserveAspectRatio: SVGAnimatedPreserveAspectRatio
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGSwitchElement : SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable {
}

native public interface GetSVGDocument {
    fun getSVGDocument(): SVGDocument = noImpl
}

native public interface SVGElement : Element {
//    var id: dynamic
//        get() = noImpl
//        set(value) = noImpl
    var xmlbase: dynamic
        get() = noImpl
        set(value) = noImpl
    var ownerSVGElement: SVGSVGElement
        get() = noImpl
        set(value) = noImpl
    var viewportElement: SVGElement
        get() = noImpl
        set(value) = noImpl
    var style: CSSStyleDeclaration
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGAnimatedBoolean {
    var baseVal: dynamic
        get() = noImpl
        set(value) = noImpl
    var animVal: Boolean
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGAnimatedString {
    var baseVal: dynamic
        get() = noImpl
        set(value) = noImpl
    var animVal: String
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGStringList {
    var numberOfItems: Int
        get() = noImpl
        set(value) = noImpl
    fun clear(): Unit = noImpl
    fun initialize(newItem: String): String = noImpl
    fun getItem(index: Int): String = noImpl
    fun insertItemBefore(newItem: String, index: Int): String = noImpl
    fun replaceItem(newItem: String, index: Int): String = noImpl
    fun removeItem(index: Int): String = noImpl
    fun appendItem(newItem: String): String = noImpl
}

native public interface SVGAnimatedEnumeration {
    var baseVal: dynamic
        get() = noImpl
        set(value) = noImpl
    var animVal: Short
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGAnimatedInteger {
    var baseVal: dynamic
        get() = noImpl
        set(value) = noImpl
    var animVal: Int
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGNumber {
    var value: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGAnimatedNumber {
    var baseVal: dynamic
        get() = noImpl
        set(value) = noImpl
    var animVal: Float
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGNumberList {
    var numberOfItems: Int
        get() = noImpl
        set(value) = noImpl
    fun clear(): Unit = noImpl
    fun initialize(newItem: SVGNumber): SVGNumber = noImpl
    fun getItem(index: Int): SVGNumber = noImpl
    fun insertItemBefore(newItem: SVGNumber, index: Int): SVGNumber = noImpl
    fun replaceItem(newItem: SVGNumber, index: Int): SVGNumber = noImpl
    fun removeItem(index: Int): SVGNumber = noImpl
    fun appendItem(newItem: SVGNumber): SVGNumber = noImpl
}

native public interface SVGAnimatedNumberList {
    var baseVal: SVGNumberList
        get() = noImpl
        set(value) = noImpl
    var animVal: SVGNumberList
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGLength {
    var unitType: Short
        get() = noImpl
        set(value) = noImpl
    var value: dynamic
        get() = noImpl
        set(value) = noImpl
    var valueInSpecifiedUnits: dynamic
        get() = noImpl
        set(value) = noImpl
    var valueAsString: dynamic
        get() = noImpl
        set(value) = noImpl
    fun newValueSpecifiedUnits(unitType: Short, valueInSpecifiedUnits: Float): Unit = noImpl
    fun convertToSpecifiedUnits(unitType: Short): Unit = noImpl

    companion object {
        val SVG_LENGTHTYPE_UNKNOWN: Short = 0
        val SVG_LENGTHTYPE_NUMBER: Short = 1
        val SVG_LENGTHTYPE_PERCENTAGE: Short = 2
        val SVG_LENGTHTYPE_EMS: Short = 3
        val SVG_LENGTHTYPE_EXS: Short = 4
        val SVG_LENGTHTYPE_PX: Short = 5
        val SVG_LENGTHTYPE_CM: Short = 6
        val SVG_LENGTHTYPE_MM: Short = 7
        val SVG_LENGTHTYPE_IN: Short = 8
        val SVG_LENGTHTYPE_PT: Short = 9
        val SVG_LENGTHTYPE_PC: Short = 10
    }
}

native public interface SVGAnimatedLength {
    var baseVal: SVGLength
        get() = noImpl
        set(value) = noImpl
    var animVal: SVGLength
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGLengthList {
    var numberOfItems: Int
        get() = noImpl
        set(value) = noImpl
    fun clear(): Unit = noImpl
    fun initialize(newItem: SVGLength): SVGLength = noImpl
    fun getItem(index: Int): SVGLength = noImpl
    fun insertItemBefore(newItem: SVGLength, index: Int): SVGLength = noImpl
    fun replaceItem(newItem: SVGLength, index: Int): SVGLength = noImpl
    fun removeItem(index: Int): SVGLength = noImpl
    fun appendItem(newItem: SVGLength): SVGLength = noImpl
}

native public interface SVGAnimatedLengthList {
    var baseVal: SVGLengthList
        get() = noImpl
        set(value) = noImpl
    var animVal: SVGLengthList
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGAngle {
    var unitType: Short
        get() = noImpl
        set(value) = noImpl
    var value: dynamic
        get() = noImpl
        set(value) = noImpl
    var valueInSpecifiedUnits: dynamic
        get() = noImpl
        set(value) = noImpl
    var valueAsString: dynamic
        get() = noImpl
        set(value) = noImpl
    fun newValueSpecifiedUnits(unitType: Short, valueInSpecifiedUnits: Float): Unit = noImpl
    fun convertToSpecifiedUnits(unitType: Short): Unit = noImpl

    companion object {
        val SVG_ANGLETYPE_UNKNOWN: Short = 0
        val SVG_ANGLETYPE_UNSPECIFIED: Short = 1
        val SVG_ANGLETYPE_DEG: Short = 2
        val SVG_ANGLETYPE_RAD: Short = 3
        val SVG_ANGLETYPE_GRAD: Short = 4
    }
}

native public interface SVGAnimatedAngle {
    var baseVal: SVGAngle
        get() = noImpl
        set(value) = noImpl
    var animVal: SVGAngle
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGColor {
    var colorType: Short
        get() = noImpl
        set(value) = noImpl
    var rgbColor: dynamic
        get() = noImpl
        set(value) = noImpl
    var iccColor: SVGICCColor
        get() = noImpl
        set(value) = noImpl
    fun setRGBColor(rgbColor: String): Unit = noImpl
    fun setRGBColorICCColor(rgbColor: String, iccColor: String): Unit = noImpl
    fun setColor(colorType: Short, rgbColor: String, iccColor: String): Unit = noImpl

    companion object {
        val SVG_COLORTYPE_UNKNOWN: Short = 0
        val SVG_COLORTYPE_RGBCOLOR: Short = 1
        val SVG_COLORTYPE_RGBCOLOR_ICCCOLOR: Short = 2
        val SVG_COLORTYPE_CURRENTCOLOR: Short = 3
    }
}

native public interface SVGICCColor {
    var colorProfile: dynamic
        get() = noImpl
        set(value) = noImpl
    var colors: SVGNumberList
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGRect {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
    var width: dynamic
        get() = noImpl
        set(value) = noImpl
    var height: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGAnimatedRect {
    var baseVal: SVGRect
        get() = noImpl
        set(value) = noImpl
    var animVal: SVGRect
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGUnitTypes {

    companion object {
        val SVG_UNIT_TYPE_UNKNOWN: Short = 0
        val SVG_UNIT_TYPE_USERSPACEONUSE: Short = 1
        val SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: Short = 2
    }
}

native public interface SVGStylable {
    fun getPresentationAttribute(name: String): dynamic = noImpl
}

native public interface SVGLocatable {
    var nearestViewportElement: SVGElement
        get() = noImpl
        set(value) = noImpl
    var farthestViewportElement: SVGElement
        get() = noImpl
        set(value) = noImpl
    fun getBBox(): SVGRect = noImpl
    fun getCTM(): SVGMatrix = noImpl
    fun getScreenCTM(): SVGMatrix = noImpl
    fun getTransformToElement(element: SVGElement): SVGMatrix = noImpl
}

native public interface SVGTransformable : SVGLocatable {
    var transform: SVGAnimatedTransformList
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGTests {
    var requiredFeatures: SVGStringList
        get() = noImpl
        set(value) = noImpl
    var requiredExtensions: SVGStringList
        get() = noImpl
        set(value) = noImpl
    var systemLanguage: SVGStringList
        get() = noImpl
        set(value) = noImpl
    fun hasExtension(extension: String): Boolean = noImpl
}

native public interface SVGLangSpace {
    var xmllang: dynamic
        get() = noImpl
        set(value) = noImpl
    var xmlspace: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGExternalResourcesRequired {
    var externalResourcesRequired: SVGAnimatedBoolean
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGFitToViewBox {
    var viewBox: SVGAnimatedRect
        get() = noImpl
        set(value) = noImpl
    var preserveAspectRatio: SVGAnimatedPreserveAspectRatio
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGZoomAndPan {
    var zoomAndPan: dynamic
        get() = noImpl
        set(value) = noImpl

    companion object {
        val SVG_ZOOMANDPAN_UNKNOWN: Short = 0
        val SVG_ZOOMANDPAN_DISABLE: Short = 1
        val SVG_ZOOMANDPAN_MAGNIFY: Short = 2
    }
}

native public interface SVGViewSpec : SVGZoomAndPan, SVGFitToViewBox {
    var transform: SVGTransformList
        get() = noImpl
        set(value) = noImpl
    var viewTarget: SVGElement
        get() = noImpl
        set(value) = noImpl
    var viewBoxString: String
        get() = noImpl
        set(value) = noImpl
    var preserveAspectRatioString: String
        get() = noImpl
        set(value) = noImpl
    var transformString: String
        get() = noImpl
        set(value) = noImpl
    var viewTargetString: String
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGURIReference {
    var href: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGCSSRule : CSSRule {

    companion object {
        val COLOR_PROFILE_RULE: Short = 7
    }
}

native public interface SVGRenderingIntent {

    companion object {
        val RENDERING_INTENT_UNKNOWN: Short = 0
        val RENDERING_INTENT_AUTO: Short = 1
        val RENDERING_INTENT_PERCEPTUAL: Short = 2
        val RENDERING_INTENT_RELATIVE_COLORIMETRIC: Short = 3
        val RENDERING_INTENT_SATURATION: Short = 4
        val RENDERING_INTENT_ABSOLUTE_COLORIMETRIC: Short = 5
    }
}

native public interface SVGStyleElement : SVGElement, SVGLangSpace {
    var type: dynamic
        get() = noImpl
        set(value) = noImpl
    var media: dynamic
        get() = noImpl
        set(value) = noImpl
    var title: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPoint {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
    fun matrixTransform(matrix: SVGMatrix): SVGPoint = noImpl
}

native public interface SVGPointList {
    var numberOfItems: Int
        get() = noImpl
        set(value) = noImpl
    fun clear(): Unit = noImpl
    fun initialize(newItem: SVGPoint): SVGPoint = noImpl
    fun getItem(index: Int): SVGPoint = noImpl
    fun insertItemBefore(newItem: SVGPoint, index: Int): SVGPoint = noImpl
    fun replaceItem(newItem: SVGPoint, index: Int): SVGPoint = noImpl
    fun removeItem(index: Int): SVGPoint = noImpl
    fun appendItem(newItem: SVGPoint): SVGPoint = noImpl
}

native public interface SVGMatrix {
    var a: dynamic
        get() = noImpl
        set(value) = noImpl
    var b: dynamic
        get() = noImpl
        set(value) = noImpl
    var c: dynamic
        get() = noImpl
        set(value) = noImpl
    var d: dynamic
        get() = noImpl
        set(value) = noImpl
    var e: dynamic
        get() = noImpl
        set(value) = noImpl
    var f: dynamic
        get() = noImpl
        set(value) = noImpl
    fun multiply(secondMatrix: SVGMatrix): SVGMatrix = noImpl
    fun inverse(): SVGMatrix = noImpl
    fun translate(x: Float, y: Float): SVGMatrix = noImpl
    fun scale(scaleFactor: Float): SVGMatrix = noImpl
    fun scaleNonUniform(scaleFactorX: Float, scaleFactorY: Float): SVGMatrix = noImpl
    fun rotate(angle: Float): SVGMatrix = noImpl
    fun rotateFromVector(x: Float, y: Float): SVGMatrix = noImpl
    fun flipX(): SVGMatrix = noImpl
    fun flipY(): SVGMatrix = noImpl
    fun skewX(angle: Float): SVGMatrix = noImpl
    fun skewY(angle: Float): SVGMatrix = noImpl
}

native public interface SVGTransform {
    var type: Short
        get() = noImpl
        set(value) = noImpl
    var matrix: SVGMatrix
        get() = noImpl
        set(value) = noImpl
    var angle: Float
        get() = noImpl
        set(value) = noImpl
    fun setMatrix(matrix: SVGMatrix): Unit = noImpl
    fun setTranslate(tx: Float, ty: Float): Unit = noImpl
    fun setScale(sx: Float, sy: Float): Unit = noImpl
    fun setRotate(angle: Float, cx: Float, cy: Float): Unit = noImpl
    fun setSkewX(angle: Float): Unit = noImpl
    fun setSkewY(angle: Float): Unit = noImpl

    companion object {
        val SVG_TRANSFORM_UNKNOWN: Short = 0
        val SVG_TRANSFORM_MATRIX: Short = 1
        val SVG_TRANSFORM_TRANSLATE: Short = 2
        val SVG_TRANSFORM_SCALE: Short = 3
        val SVG_TRANSFORM_ROTATE: Short = 4
        val SVG_TRANSFORM_SKEWX: Short = 5
        val SVG_TRANSFORM_SKEWY: Short = 6
    }
}

native public interface SVGTransformList {
    var numberOfItems: Int
        get() = noImpl
        set(value) = noImpl
    fun clear(): Unit = noImpl
    fun initialize(newItem: SVGTransform): SVGTransform = noImpl
    fun getItem(index: Int): SVGTransform = noImpl
    fun insertItemBefore(newItem: SVGTransform, index: Int): SVGTransform = noImpl
    fun replaceItem(newItem: SVGTransform, index: Int): SVGTransform = noImpl
    fun removeItem(index: Int): SVGTransform = noImpl
    fun appendItem(newItem: SVGTransform): SVGTransform = noImpl
    fun createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = noImpl
    fun consolidate(): SVGTransform = noImpl
}

native public interface SVGAnimatedTransformList {
    var baseVal: SVGTransformList
        get() = noImpl
        set(value) = noImpl
    var animVal: SVGTransformList
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPreserveAspectRatio {
    var align: dynamic
        get() = noImpl
        set(value) = noImpl
    var meetOrSlice: dynamic
        get() = noImpl
        set(value) = noImpl

    companion object {
        val SVG_PRESERVEASPECTRATIO_UNKNOWN: Short = 0
        val SVG_PRESERVEASPECTRATIO_NONE: Short = 1
        val SVG_PRESERVEASPECTRATIO_XMINYMIN: Short = 2
        val SVG_PRESERVEASPECTRATIO_XMIDYMIN: Short = 3
        val SVG_PRESERVEASPECTRATIO_XMAXYMIN: Short = 4
        val SVG_PRESERVEASPECTRATIO_XMINYMID: Short = 5
        val SVG_PRESERVEASPECTRATIO_XMIDYMID: Short = 6
        val SVG_PRESERVEASPECTRATIO_XMAXYMID: Short = 7
        val SVG_PRESERVEASPECTRATIO_XMINYMAX: Short = 8
        val SVG_PRESERVEASPECTRATIO_XMIDYMAX: Short = 9
        val SVG_PRESERVEASPECTRATIO_XMAXYMAX: Short = 10
        val SVG_MEETORSLICE_UNKNOWN: Short = 0
        val SVG_MEETORSLICE_MEET: Short = 1
        val SVG_MEETORSLICE_SLICE: Short = 2
    }
}

native public interface SVGAnimatedPreserveAspectRatio {
    var baseVal: SVGPreserveAspectRatio
        get() = noImpl
        set(value) = noImpl
    var animVal: SVGPreserveAspectRatio
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSeg {
    var pathSegType: Short
        get() = noImpl
        set(value) = noImpl
    var pathSegTypeAsLetter: String
        get() = noImpl
        set(value) = noImpl

    companion object {
        val PATHSEG_UNKNOWN: Short = 0
        val PATHSEG_CLOSEPATH: Short = 1
        val PATHSEG_MOVETO_ABS: Short = 2
        val PATHSEG_MOVETO_REL: Short = 3
        val PATHSEG_LINETO_ABS: Short = 4
        val PATHSEG_LINETO_REL: Short = 5
        val PATHSEG_CURVETO_CUBIC_ABS: Short = 6
        val PATHSEG_CURVETO_CUBIC_REL: Short = 7
        val PATHSEG_CURVETO_QUADRATIC_ABS: Short = 8
        val PATHSEG_CURVETO_QUADRATIC_REL: Short = 9
        val PATHSEG_ARC_ABS: Short = 10
        val PATHSEG_ARC_REL: Short = 11
        val PATHSEG_LINETO_HORIZONTAL_ABS: Short = 12
        val PATHSEG_LINETO_HORIZONTAL_REL: Short = 13
        val PATHSEG_LINETO_VERTICAL_ABS: Short = 14
        val PATHSEG_LINETO_VERTICAL_REL: Short = 15
        val PATHSEG_CURVETO_CUBIC_SMOOTH_ABS: Short = 16
        val PATHSEG_CURVETO_CUBIC_SMOOTH_REL: Short = 17
        val PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS: Short = 18
        val PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL: Short = 19
    }
}

native public interface SVGPathSegClosePath : SVGPathSeg {
}

native public interface SVGPathSegMovetoAbs : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegMovetoRel : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegLinetoAbs : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegLinetoRel : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegCurvetoCubicAbs : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
    var x1: dynamic
        get() = noImpl
        set(value) = noImpl
    var y1: dynamic
        get() = noImpl
        set(value) = noImpl
    var x2: dynamic
        get() = noImpl
        set(value) = noImpl
    var y2: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegCurvetoCubicRel : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
    var x1: dynamic
        get() = noImpl
        set(value) = noImpl
    var y1: dynamic
        get() = noImpl
        set(value) = noImpl
    var x2: dynamic
        get() = noImpl
        set(value) = noImpl
    var y2: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegCurvetoQuadraticAbs : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
    var x1: dynamic
        get() = noImpl
        set(value) = noImpl
    var y1: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegCurvetoQuadraticRel : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
    var x1: dynamic
        get() = noImpl
        set(value) = noImpl
    var y1: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegArcAbs : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
    var r1: dynamic
        get() = noImpl
        set(value) = noImpl
    var r2: dynamic
        get() = noImpl
        set(value) = noImpl
    var angle: dynamic
        get() = noImpl
        set(value) = noImpl
    var largeArcFlag: dynamic
        get() = noImpl
        set(value) = noImpl
    var sweepFlag: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegArcRel : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
    var r1: dynamic
        get() = noImpl
        set(value) = noImpl
    var r2: dynamic
        get() = noImpl
        set(value) = noImpl
    var angle: dynamic
        get() = noImpl
        set(value) = noImpl
    var largeArcFlag: dynamic
        get() = noImpl
        set(value) = noImpl
    var sweepFlag: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegLinetoHorizontalAbs : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegLinetoHorizontalRel : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegLinetoVerticalAbs : SVGPathSeg {
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegLinetoVerticalRel : SVGPathSeg {
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegCurvetoCubicSmoothAbs : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
    var x2: dynamic
        get() = noImpl
        set(value) = noImpl
    var y2: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegCurvetoCubicSmoothRel : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
    var x2: dynamic
        get() = noImpl
        set(value) = noImpl
    var y2: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegCurvetoQuadraticSmoothAbs : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegCurvetoQuadraticSmoothRel : SVGPathSeg {
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathSegList {
    var numberOfItems: Int
        get() = noImpl
        set(value) = noImpl
    fun clear(): Unit = noImpl
    fun initialize(newItem: SVGPathSeg): SVGPathSeg = noImpl
    fun getItem(index: Int): SVGPathSeg = noImpl
    fun insertItemBefore(newItem: SVGPathSeg, index: Int): SVGPathSeg = noImpl
    fun replaceItem(newItem: SVGPathSeg, index: Int): SVGPathSeg = noImpl
    fun removeItem(index: Int): SVGPathSeg = noImpl
    fun appendItem(newItem: SVGPathSeg): SVGPathSeg = noImpl
}

native public interface SVGAnimatedPathData {
    var pathSegList: SVGPathSegList
        get() = noImpl
        set(value) = noImpl
    var normalizedPathSegList: SVGPathSegList
        get() = noImpl
        set(value) = noImpl
    var animatedPathSegList: SVGPathSegList
        get() = noImpl
        set(value) = noImpl
    var animatedNormalizedPathSegList: SVGPathSegList
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPathElement : SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable, SVGAnimatedPathData {
    var pathLength: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    fun getTotalLength(): Float = noImpl
    fun getPointAtLength(distance: Float): SVGPoint = noImpl
    fun getPathSegAtLength(distance: Float): Int = noImpl
    fun createSVGPathSegClosePath(): SVGPathSegClosePath = noImpl
    fun createSVGPathSegMovetoAbs(x: Float, y: Float): SVGPathSegMovetoAbs = noImpl
    fun createSVGPathSegMovetoRel(x: Float, y: Float): SVGPathSegMovetoRel = noImpl
    fun createSVGPathSegLinetoAbs(x: Float, y: Float): SVGPathSegLinetoAbs = noImpl
    fun createSVGPathSegLinetoRel(x: Float, y: Float): SVGPathSegLinetoRel = noImpl
    fun createSVGPathSegCurvetoCubicAbs(x: Float, y: Float, x1: Float, y1: Float, x2: Float, y2: Float): SVGPathSegCurvetoCubicAbs = noImpl
    fun createSVGPathSegCurvetoCubicRel(x: Float, y: Float, x1: Float, y1: Float, x2: Float, y2: Float): SVGPathSegCurvetoCubicRel = noImpl
    fun createSVGPathSegCurvetoQuadraticAbs(x: Float, y: Float, x1: Float, y1: Float): SVGPathSegCurvetoQuadraticAbs = noImpl
    fun createSVGPathSegCurvetoQuadraticRel(x: Float, y: Float, x1: Float, y1: Float): SVGPathSegCurvetoQuadraticRel = noImpl
    fun createSVGPathSegArcAbs(x: Float, y: Float, r1: Float, r2: Float, angle: Float, largeArcFlag: Boolean, sweepFlag: Boolean): SVGPathSegArcAbs = noImpl
    fun createSVGPathSegArcRel(x: Float, y: Float, r1: Float, r2: Float, angle: Float, largeArcFlag: Boolean, sweepFlag: Boolean): SVGPathSegArcRel = noImpl
    fun createSVGPathSegLinetoHorizontalAbs(x: Float): SVGPathSegLinetoHorizontalAbs = noImpl
    fun createSVGPathSegLinetoHorizontalRel(x: Float): SVGPathSegLinetoHorizontalRel = noImpl
    fun createSVGPathSegLinetoVerticalAbs(y: Float): SVGPathSegLinetoVerticalAbs = noImpl
    fun createSVGPathSegLinetoVerticalRel(y: Float): SVGPathSegLinetoVerticalRel = noImpl
    fun createSVGPathSegCurvetoCubicSmoothAbs(x: Float, y: Float, x2: Float, y2: Float): SVGPathSegCurvetoCubicSmoothAbs = noImpl
    fun createSVGPathSegCurvetoCubicSmoothRel(x: Float, y: Float, x2: Float, y2: Float): SVGPathSegCurvetoCubicSmoothRel = noImpl
    fun createSVGPathSegCurvetoQuadraticSmoothAbs(x: Float, y: Float): SVGPathSegCurvetoQuadraticSmoothAbs = noImpl
    fun createSVGPathSegCurvetoQuadraticSmoothRel(x: Float, y: Float): SVGPathSegCurvetoQuadraticSmoothRel = noImpl
}

native public interface SVGRectElement : SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable {
    var x: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var y: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var width: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var height: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var rx: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var ry: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGCircleElement : SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable {
    var cx: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var cy: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var r: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGEllipseElement : SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable {
    var cx: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var cy: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var rx: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var ry: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGLineElement : SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable {
    var x1: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var y1: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var x2: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var y2: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGAnimatedPoints {
    var points: SVGPointList
        get() = noImpl
        set(value) = noImpl
    var animatedPoints: SVGPointList
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPolylineElement : SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable, SVGAnimatedPoints {
}

native public interface SVGPolygonElement : SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable, SVGAnimatedPoints {
}

native public interface SVGTextContentElement : SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable {
    var textLength: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var lengthAdjust: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    fun getNumberOfChars(): Int = noImpl
    fun getComputedTextLength(): Float = noImpl
    fun getSubStringLength(charnum: Int, nchars: Int): Float = noImpl
    fun getStartPositionOfChar(charnum: Int): SVGPoint = noImpl
    fun getEndPositionOfChar(charnum: Int): SVGPoint = noImpl
    fun getExtentOfChar(charnum: Int): SVGRect = noImpl
    fun getRotationOfChar(charnum: Int): Float = noImpl
    fun getCharNumAtPosition(point: SVGPoint): Int = noImpl
    fun selectSubString(charnum: Int, nchars: Int): Unit = noImpl

    companion object {
        val LENGTHADJUST_UNKNOWN: Short = 0
        val LENGTHADJUST_SPACING: Short = 1
        val LENGTHADJUST_SPACINGANDGLYPHS: Short = 2
    }
}

native public interface SVGTextPositioningElement : SVGTextContentElement {
    var x: SVGAnimatedLengthList
        get() = noImpl
        set(value) = noImpl
    var y: SVGAnimatedLengthList
        get() = noImpl
        set(value) = noImpl
    var dx: SVGAnimatedLengthList
        get() = noImpl
        set(value) = noImpl
    var dy: SVGAnimatedLengthList
        get() = noImpl
        set(value) = noImpl
    var rotate: SVGAnimatedNumberList
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGTextElement : SVGTextPositioningElement, SVGTransformable {
}

native public interface SVGTSpanElement : SVGTextPositioningElement {
}

native public interface SVGTRefElement : SVGTextPositioningElement, SVGURIReference {
}

native public interface SVGTextPathElement : SVGTextContentElement, SVGURIReference {
    var startOffset: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var method: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var spacing: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl

    companion object {
        val TEXTPATH_METHODTYPE_UNKNOWN: Short = 0
        val TEXTPATH_METHODTYPE_ALIGN: Short = 1
        val TEXTPATH_METHODTYPE_STRETCH: Short = 2
        val TEXTPATH_SPACINGTYPE_UNKNOWN: Short = 0
        val TEXTPATH_SPACINGTYPE_AUTO: Short = 1
        val TEXTPATH_SPACINGTYPE_EXACT: Short = 2
    }
}

native public interface SVGAltGlyphElement : SVGTextPositioningElement, SVGURIReference {
    var glyphRef: dynamic
        get() = noImpl
        set(value) = noImpl
    var format: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGAltGlyphDefElement : SVGElement {
}

native public interface SVGAltGlyphItemElement : SVGElement {
}

native public interface SVGGlyphRefElement : SVGElement, SVGURIReference, SVGStylable {
    var glyphRef: dynamic
        get() = noImpl
        set(value) = noImpl
    var format: dynamic
        get() = noImpl
        set(value) = noImpl
    var x: dynamic
        get() = noImpl
        set(value) = noImpl
    var y: dynamic
        get() = noImpl
        set(value) = noImpl
    var dx: dynamic
        get() = noImpl
        set(value) = noImpl
    var dy: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPaint : SVGColor {
    var paintType: Short
        get() = noImpl
        set(value) = noImpl
    var uri: String
        get() = noImpl
        set(value) = noImpl
    fun setUri(uri: String): Unit = noImpl
    fun setPaint(paintType: Short, uri: String, rgbColor: String, iccColor: String): Unit = noImpl

    companion object {
        val SVG_PAINTTYPE_UNKNOWN: Short = 0
        val SVG_PAINTTYPE_RGBCOLOR: Short = 1
        val SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR: Short = 2
        val SVG_PAINTTYPE_NONE: Short = 101
        val SVG_PAINTTYPE_CURRENTCOLOR: Short = 102
        val SVG_PAINTTYPE_URI_NONE: Short = 103
        val SVG_PAINTTYPE_URI_CURRENTCOLOR: Short = 104
        val SVG_PAINTTYPE_URI_RGBCOLOR: Short = 105
        val SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR: Short = 106
        val SVG_PAINTTYPE_URI: Short = 107
    }
}

native public interface SVGMarkerElement : SVGElement, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGFitToViewBox {
    var refX: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var refY: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var markerUnits: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var markerWidth: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var markerHeight: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var orientType: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var orientAngle: SVGAnimatedAngle
        get() = noImpl
        set(value) = noImpl
    fun setOrientToAuto(): Unit = noImpl
    fun setOrientToAngle(angle: SVGAngle): Unit = noImpl

    companion object {
        val SVG_MARKERUNITS_UNKNOWN: Short = 0
        val SVG_MARKERUNITS_USERSPACEONUSE: Short = 1
        val SVG_MARKERUNITS_STROKEWIDTH: Short = 2
        val SVG_MARKER_ORIENT_UNKNOWN: Short = 0
        val SVG_MARKER_ORIENT_AUTO: Short = 1
        val SVG_MARKER_ORIENT_ANGLE: Short = 2
    }
}

native public interface SVGColorProfileElement : SVGElement, SVGURIReference, SVGRenderingIntent {
    var local: String
        get() = noImpl
        set(value) = noImpl
    var name: String
        get() = noImpl
        set(value) = noImpl
    var renderingIntent: Short
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGColorProfileRule : SVGCSSRule, SVGRenderingIntent {
    var src: dynamic
        get() = noImpl
        set(value) = noImpl
    var name: dynamic
        get() = noImpl
        set(value) = noImpl
    var renderingIntent: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGGradientElement : SVGElement, SVGURIReference, SVGExternalResourcesRequired, SVGStylable, SVGUnitTypes {
    var gradientUnits: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var gradientTransform: SVGAnimatedTransformList
        get() = noImpl
        set(value) = noImpl
    var spreadMethod: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl

    companion object {
        val SVG_SPREADMETHOD_UNKNOWN: Short = 0
        val SVG_SPREADMETHOD_PAD: Short = 1
        val SVG_SPREADMETHOD_REFLECT: Short = 2
        val SVG_SPREADMETHOD_REPEAT: Short = 3
    }
}

native public interface SVGLinearGradientElement : SVGGradientElement {
    var x1: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var y1: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var x2: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var y2: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGRadialGradientElement : SVGGradientElement {
    var cx: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var cy: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var r: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var fx: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var fy: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGStopElement : SVGElement, SVGStylable {
    var offset: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGPatternElement : SVGElement, SVGURIReference, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGFitToViewBox, SVGUnitTypes {
    var patternUnits: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var patternContentUnits: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var patternTransform: SVGAnimatedTransformList
        get() = noImpl
        set(value) = noImpl
    var x: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var y: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var width: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var height: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGClipPathElement : SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable, SVGUnitTypes {
    var clipPathUnits: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGMaskElement : SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGUnitTypes {
    var maskUnits: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var maskContentUnits: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var x: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var y: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var width: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var height: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGFilterElement : SVGElement, SVGURIReference, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGUnitTypes {
    var filterUnits: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var primitiveUnits: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var x: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var y: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var width: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var height: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var filterResX: SVGAnimatedInteger
        get() = noImpl
        set(value) = noImpl
    var filterResY: SVGAnimatedInteger
        get() = noImpl
        set(value) = noImpl
    fun setFilterRes(filterResX: Int, filterResY: Int): Unit = noImpl
}

native public interface SVGFilterPrimitiveStandardAttributes : SVGStylable {
    var x: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var y: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var width: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var height: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var result: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGFEBlendElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
    var in1: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
    var in2: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
    var mode: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl

    companion object {
        val SVG_FEBLEND_MODE_UNKNOWN: Short = 0
        val SVG_FEBLEND_MODE_NORMAL: Short = 1
        val SVG_FEBLEND_MODE_MULTIPLY: Short = 2
        val SVG_FEBLEND_MODE_SCREEN: Short = 3
        val SVG_FEBLEND_MODE_DARKEN: Short = 4
        val SVG_FEBLEND_MODE_LIGHTEN: Short = 5
    }
}

native public interface SVGFEColorMatrixElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
    var in1: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
    var type: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var values: SVGAnimatedNumberList
        get() = noImpl
        set(value) = noImpl

    companion object {
        val SVG_FECOLORMATRIX_TYPE_UNKNOWN: Short = 0
        val SVG_FECOLORMATRIX_TYPE_MATRIX: Short = 1
        val SVG_FECOLORMATRIX_TYPE_SATURATE: Short = 2
        val SVG_FECOLORMATRIX_TYPE_HUEROTATE: Short = 3
        val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: Short = 4
    }
}

native public interface SVGFEComponentTransferElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
    var in1: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGComponentTransferFunctionElement : SVGElement {
    var type: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var tableValues: SVGAnimatedNumberList
        get() = noImpl
        set(value) = noImpl
    var slope: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var intercept: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var amplitude: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var exponent: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var offset: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl

    companion object {
        val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Short = 0
        val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Short = 1
        val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Short = 2
        val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Short = 3
        val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Short = 4
        val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Short = 5
    }
}

native public interface SVGFEFuncRElement : SVGComponentTransferFunctionElement {
}

native public interface SVGFEFuncGElement : SVGComponentTransferFunctionElement {
}

native public interface SVGFEFuncBElement : SVGComponentTransferFunctionElement {
}

native public interface SVGFEFuncAElement : SVGComponentTransferFunctionElement {
}

native public interface SVGFECompositeElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
    var in1: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
    var in2: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
    var operator: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var k1: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var k2: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var k3: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var k4: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl

    companion object {
        val SVG_FECOMPOSITE_OPERATOR_UNKNOWN: Short = 0
        val SVG_FECOMPOSITE_OPERATOR_OVER: Short = 1
        val SVG_FECOMPOSITE_OPERATOR_IN: Short = 2
        val SVG_FECOMPOSITE_OPERATOR_OUT: Short = 3
        val SVG_FECOMPOSITE_OPERATOR_ATOP: Short = 4
        val SVG_FECOMPOSITE_OPERATOR_XOR: Short = 5
        val SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: Short = 6
    }
}

native public interface SVGFEConvolveMatrixElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
    var in1: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
    var orderX: SVGAnimatedInteger
        get() = noImpl
        set(value) = noImpl
    var orderY: SVGAnimatedInteger
        get() = noImpl
        set(value) = noImpl
    var kernelMatrix: SVGAnimatedNumberList
        get() = noImpl
        set(value) = noImpl
    var divisor: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var bias: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var targetX: SVGAnimatedInteger
        get() = noImpl
        set(value) = noImpl
    var targetY: SVGAnimatedInteger
        get() = noImpl
        set(value) = noImpl
    var edgeMode: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var kernelUnitLengthX: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var kernelUnitLengthY: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var preserveAlpha: SVGAnimatedBoolean
        get() = noImpl
        set(value) = noImpl

    companion object {
        val SVG_EDGEMODE_UNKNOWN: Short = 0
        val SVG_EDGEMODE_DUPLICATE: Short = 1
        val SVG_EDGEMODE_WRAP: Short = 2
        val SVG_EDGEMODE_NONE: Short = 3
    }
}

native public interface SVGFEDiffuseLightingElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
    var in1: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
    var surfaceScale: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var diffuseConstant: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var kernelUnitLengthX: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var kernelUnitLengthY: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGFEDistantLightElement : SVGElement {
    var azimuth: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var elevation: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGFEPointLightElement : SVGElement {
    var x: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var y: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var z: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGFESpotLightElement : SVGElement {
    var x: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var y: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var z: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var pointsAtX: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var pointsAtY: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var pointsAtZ: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var specularExponent: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var limitingConeAngle: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGFEDisplacementMapElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
    var in1: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
    var in2: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
    var scale: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var xChannelSelector: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var yChannelSelector: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl

    companion object {
        val SVG_CHANNEL_UNKNOWN: Short = 0
        val SVG_CHANNEL_R: Short = 1
        val SVG_CHANNEL_G: Short = 2
        val SVG_CHANNEL_B: Short = 3
        val SVG_CHANNEL_A: Short = 4
    }
}

native public interface SVGFEFloodElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
}

native public interface SVGFEGaussianBlurElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
    var in1: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
    var stdDeviationX: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var stdDeviationY: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    fun setStdDeviation(stdDeviationX: Float, stdDeviationY: Float): Unit = noImpl
}

native public interface SVGFEImageElement : SVGElement, SVGURIReference, SVGLangSpace, SVGExternalResourcesRequired, SVGFilterPrimitiveStandardAttributes {
    var preserveAspectRatio: SVGAnimatedPreserveAspectRatio
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGFEMergeElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
}

native public interface SVGFEMergeNodeElement : SVGElement {
    var in1: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGFEMorphologyElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
    var in1: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
    var operator: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var radiusX: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var radiusY: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl

    companion object {
        val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: Short = 0
        val SVG_MORPHOLOGY_OPERATOR_ERODE: Short = 1
        val SVG_MORPHOLOGY_OPERATOR_DILATE: Short = 2
    }
}

native public interface SVGFEOffsetElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
    var in1: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
    var dx: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var dy: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGFESpecularLightingElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
    var in1: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
    var surfaceScale: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var specularConstant: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var specularExponent: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var kernelUnitLengthX: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var kernelUnitLengthY: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGFETileElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
    var in1: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGFETurbulenceElement : SVGElement, SVGFilterPrimitiveStandardAttributes {
    var baseFrequencyX: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var baseFrequencyY: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var numOctaves: SVGAnimatedInteger
        get() = noImpl
        set(value) = noImpl
    var seed: SVGAnimatedNumber
        get() = noImpl
        set(value) = noImpl
    var stitchTiles: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl
    var type: SVGAnimatedEnumeration
        get() = noImpl
        set(value) = noImpl

    companion object {
        val SVG_TURBULENCE_TYPE_UNKNOWN: Short = 0
        val SVG_TURBULENCE_TYPE_FRACTALNOISE: Short = 1
        val SVG_TURBULENCE_TYPE_TURBULENCE: Short = 2
        val SVG_STITCHTYPE_UNKNOWN: Short = 0
        val SVG_STITCHTYPE_STITCH: Short = 1
        val SVG_STITCHTYPE_NOSTITCH: Short = 2
    }
}

native public interface SVGCursorElement : SVGElement, SVGURIReference, SVGTests, SVGExternalResourcesRequired {
    var x: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var y: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGAElement : SVGElement, SVGURIReference, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable {
    var target: SVGAnimatedString
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGViewElement : SVGElement, SVGExternalResourcesRequired, SVGFitToViewBox, SVGZoomAndPan {
    var viewTarget: SVGStringList
        get() = noImpl
        set(value) = noImpl
}

native public interface SVGScriptElement : SVGElement, SVGURIReference, SVGExternalResourcesRequired {
    var type: dynamic
        get() = noImpl
        set(value) = noImpl
}

native public open class SVGZoomEvent : UIEvent(noImpl, noImpl) {
    var zoomRectScreen: SVGRect
        get() = noImpl
        set(value) = noImpl
    var previousScale: Float
        get() = noImpl
        set(value) = noImpl
    var previousTranslate: SVGPoint
        get() = noImpl
        set(value) = noImpl
    var newScale: Float
        get() = noImpl
        set(value) = noImpl
    var newTranslate: SVGPoint
        get() = noImpl
        set(value) = noImpl
}

native public interface ElementTimeControl {
    fun beginElement(): Unit = noImpl
    fun beginElementAt(offset: Float): Unit = noImpl
    fun endElement(): Unit = noImpl
    fun endElementAt(offset: Float): Unit = noImpl
}

native public open class TimeEvent : Event(noImpl, noImpl) {
    var view: dynamic
        get() = noImpl
        set(value) = noImpl
    var detail: Int
        get() = noImpl
        set(value) = noImpl
    fun initTimeEvent(typeArg: String, viewArg: dynamic, detailArg: Int): Unit = noImpl
}

native public interface SVGAnimationElement : SVGElement, SVGTests, SVGExternalResourcesRequired, ElementTimeControl {
    var targetElement: SVGElement
        get() = noImpl
        set(value) = noImpl
    fun getStartTime(): Float = noImpl
    fun getCurrentTime(): Float = noImpl
    fun getSimpleDuration(): Float = noImpl
}

native public interface SVGAnimateElement : SVGAnimationElement, SVGStylable {
}

native public interface SVGSetElement : SVGAnimationElement {
}

native public interface SVGAnimateMotionElement : SVGAnimationElement {
}

native public interface SVGMPathElement : SVGElement, SVGURIReference, SVGExternalResourcesRequired {
}

native public interface SVGAnimateColorElement : SVGAnimationElement, SVGStylable {
}

native public interface SVGAnimateTransformElement : SVGAnimationElement {
}

native public interface SVGFontElement : SVGElement, SVGExternalResourcesRequired, SVGStylable {
}

native public interface SVGGlyphElement : SVGElement, SVGStylable {
}

native public interface SVGMissingGlyphElement : SVGElement, SVGStylable {
}

native public interface SVGHKernElement : SVGElement {
}

native public interface SVGVKernElement : SVGElement {
}

native public interface SVGFontFaceElement : SVGElement {
}

native public interface SVGFontFaceSrcElement : SVGElement {
}

native public interface SVGFontFaceUriElement : SVGElement {
}

native public interface SVGFontFaceFormatElement : SVGElement {
}

native public interface SVGFontFaceNameElement : SVGElement {
}

native public interface SVGMetadataElement : SVGElement {
}

native public interface SVGForeignObjectElement : SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable {
    var x: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var y: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var width: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
    var height: SVGAnimatedLength
        get() = noImpl
        set(value) = noImpl
}

