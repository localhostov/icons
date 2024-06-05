package me.localx.icons.rounded.filled

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

public val Icons.Filled.FaceLying: ImageVector
    get() {
        if (_faceLying != null) {
            return _faceLying!!
        }
        _faceLying = Builder(name = "FaceLying", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.54f, 0.0f, 2.798f, 1.171f, 2.966f, 2.667f)
                curveToRelative(0.012f, -0.222f, 0.034f, -0.442f, 0.034f, -0.667f)
                curveTo(24.0f, 5.373f, 18.627f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(5.954f, 0.0f, 10.881f, -4.341f, 11.824f, -10.027f)
                curveToRelative(-0.406f, 1.175f, -1.512f, 2.027f, -2.824f, 2.027f)
                close()
                moveTo(15.5f, 6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(8.5f, 6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(11.177f, 15.984f)
                curveToRelative(-1.918f, 0.344f, -3.49f, 1.743f, -3.506f, 1.757f)
                curveToRelative(-0.191f, 0.173f, -0.431f, 0.258f, -0.67f, 0.258f)
                curveToRelative(-0.273f, 0.0f, -0.544f, -0.111f, -0.742f, -0.329f)
                curveToRelative(-0.37f, -0.409f, -0.34f, -1.039f, 0.068f, -1.41f)
                curveToRelative(0.08f, -0.073f, 1.999f, -1.796f, 4.496f, -2.244f)
                curveToRelative(0.544f, -0.098f, 1.063f, 0.265f, 1.161f, 0.808f)
                curveToRelative(0.098f, 0.544f, -0.264f, 1.063f, -0.808f, 1.161f)
                close()
            }
        }
        .build()
        return _faceLying!!
    }

private var _faceLying: ImageVector? = null
