package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.FaceThermometer: ImageVector
    get() {
        if (_faceThermometer != null) {
            return _faceThermometer!!
        }
        _faceThermometer = Builder(name = "FaceThermometer", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.182f, 16.364f)
                curveToRelative(-1.812f, 4.639f, -6.2f, 7.636f, -11.182f, 7.636f)
                curveTo(5.379f, 24.0f, -0.004f, 18.617f, -0.004f, 12.0f)
                reflectiveCurveTo(5.379f, 0.0f, 11.996f, 0.0f)
                curveToRelative(3.597f, 0.0f, 6.97f, 1.59f, 9.261f, 4.363f)
                curveToRelative(0.352f, 0.426f, 0.291f, 1.056f, -0.135f, 1.408f)
                curveToRelative(-0.427f, 0.353f, -1.056f, 0.292f, -1.408f, -0.134f)
                curveToRelative(-1.908f, -2.311f, -4.72f, -3.637f, -7.714f, -3.637f)
                curveTo(6.482f, 2.0f, 1.996f, 6.486f, 1.996f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(4.155f, 0.0f, 7.813f, -2.498f, 9.322f, -6.364f)
                curveToRelative(0.201f, -0.515f, 0.782f, -0.768f, 1.295f, -0.568f)
                curveToRelative(0.515f, 0.201f, 0.77f, 0.781f, 0.568f, 1.295f)
                close()
                moveTo(9.997f, 9.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(15.497f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(14.08f, 14.316f)
                curveToRelative(-0.643f, -0.188f, -1.343f, -0.316f, -2.084f, -0.316f)
                curveToRelative(-3.107f, 0.0f, -5.563f, 2.162f, -5.666f, 2.254f)
                curveToRelative(-0.411f, 0.367f, -0.446f, 0.997f, -0.08f, 1.409f)
                curveToRelative(0.197f, 0.222f, 0.472f, 0.335f, 0.747f, 0.335f)
                curveToRelative(0.236f, 0.0f, 0.473f, -0.083f, 0.663f, -0.251f)
                curveToRelative(0.02f, -0.018f, 2.005f, -1.748f, 4.336f, -1.748f)
                curveToRelative(1.499f, 0.0f, 2.854f, 0.715f, 3.637f, 1.23f)
                curveToRelative(0.428f, 0.282f, 0.991f, 0.247f, 1.367f, -0.102f)
                lineToRelative(1.162f, -1.077f)
                lineToRelative(-0.819f, -0.939f)
                curveToRelative(-0.365f, -0.414f, -0.325f, -1.046f, 0.089f, -1.411f)
                curveToRelative(0.414f, -0.365f, 1.046f, -0.325f, 1.411f, 0.089f)
                lineToRelative(0.819f, 0.939f)
                lineToRelative(1.646f, -1.45f)
                lineToRelative(-0.834f, -0.956f)
                curveToRelative(-0.365f, -0.414f, -0.325f, -1.046f, 0.089f, -1.411f)
                curveToRelative(0.414f, -0.365f, 1.046f, -0.325f, 1.411f, 0.089f)
                lineToRelative(0.834f, 0.956f)
                lineToRelative(0.435f, -0.383f)
                curveToRelative(0.747f, -0.658f, 0.988f, -1.779f, 0.457f, -2.622f)
                curveToRelative(-0.677f, -1.074f, -2.112f, -1.251f, -3.024f, -0.448f)
                lineToRelative(-6.598f, 5.81f)
                close()
            }
        }
        .build()
        return _faceThermometer!!
    }

private var _faceThermometer: ImageVector? = null
