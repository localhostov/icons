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

public val Icons.Outline.FaceLying: ImageVector
    get() {
        if (_faceLying != null) {
            return _faceLying!!
        }
        _faceLying = Builder(name = "FaceLying", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.123f, 18.229f)
                curveToRelative(0.426f, 0.352f, 0.486f, 0.982f, 0.134f, 1.408f)
                curveToRelative(-2.29f, 2.772f, -5.664f, 4.363f, -9.257f, 4.363f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(4.531f, 0.0f, 8.627f, 2.508f, 10.691f, 6.545f)
                curveToRelative(0.251f, 0.491f, 0.056f, 1.094f, -0.436f, 1.346f)
                curveToRelative(-0.492f, 0.25f, -1.094f, 0.056f, -1.346f, -0.436f)
                curveToRelative(-1.72f, -3.365f, -5.134f, -5.455f, -8.91f, -5.455f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.995f, 0.0f, 5.806f, -1.325f, 7.715f, -3.637f)
                curveToRelative(0.352f, -0.425f, 0.982f, -0.484f, 1.408f, -0.135f)
                close()
                moveTo(21.0f, 10.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(6.259f, 17.67f)
                curveToRelative(0.197f, 0.218f, 0.469f, 0.329f, 0.742f, 0.329f)
                curveToRelative(0.239f, 0.0f, 0.479f, -0.085f, 0.67f, -0.258f)
                curveToRelative(0.016f, -0.014f, 1.587f, -1.413f, 3.506f, -1.757f)
                curveToRelative(0.543f, -0.098f, 0.905f, -0.617f, 0.808f, -1.161f)
                curveToRelative(-0.098f, -0.543f, -0.617f, -0.905f, -1.161f, -0.808f)
                curveToRelative(-2.497f, 0.448f, -4.416f, 2.171f, -4.496f, 2.244f)
                curveToRelative(-0.408f, 0.371f, -0.438f, 1.001f, -0.068f, 1.41f)
                close()
                moveTo(14.0f, 7.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(10.0f, 7.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _faceLying!!
    }

private var _faceLying: ImageVector? = null
