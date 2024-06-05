package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Citrus: ImageVector
    get() {
        if (_citrus != null) {
            return _citrus!!
        }
        _citrus = Builder(name = "Citrus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 16.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(13.5f, 11.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(20.0f, 12.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(11.0f, 7.0f)
                curveToRelative(0.0f, -2.816f, -1.095f, -5.127f, -1.565f, -5.99f)
                lineTo(11.19f, 0.052f)
                curveToRelative(0.303f, 0.556f, 0.695f, 1.386f, 1.039f, 2.406f)
                curveToRelative(0.169f, -0.244f, 0.358f, -0.48f, 0.577f, -0.699f)
                curveTo(14.775f, -0.21f, 17.932f, 0.0f, 18.066f, 0.011f)
                lineToRelative(0.859f, 0.063f)
                lineToRelative(0.063f, 0.859f)
                curveToRelative(0.01f, 0.133f, 0.221f, 3.291f, -1.749f, 5.259f)
                curveToRelative(-1.667f, 1.667f, -4.224f, 1.807f, -5.038f, 1.807f)
                curveToRelative(-0.144f, 0.0f, -1.147f, -0.055f, -1.147f, -0.055f)
                lineToRelative(-0.055f, -0.945f)
                close()
                moveTo(13.055f, 5.945f)
                curveToRelative(0.827f, -0.102f, 1.991f, -0.386f, 2.771f, -1.166f)
                curveToRelative(0.78f, -0.78f, 1.046f, -1.929f, 1.133f, -2.739f)
                curveToRelative(-0.811f, 0.087f, -1.959f, 0.354f, -2.739f, 1.133f)
                curveToRelative(-0.78f, 0.781f, -1.064f, 1.944f, -1.166f, 2.771f)
                close()
                moveTo(20.716f, 3.76f)
                curveToRelative(-0.162f, 0.683f, -0.414f, 1.419f, -0.799f, 2.137f)
                curveToRelative(1.305f, 1.69f, 2.083f, 3.807f, 2.083f, 6.102f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.514f, 2.0f, 12.0f)
                curveToRelative(0.0f, -4.125f, 2.51f, -7.674f, 6.083f, -9.201f)
                curveToRelative(-0.154f, -0.354f, -0.298f, -0.636f, -0.404f, -0.831f)
                lineToRelative(-0.517f, -0.948f)
                curveTo(2.948f, 2.884f, 0.0f, 7.104f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                curveToRelative(0.0f, -3.187f, -1.25f, -6.088f, -3.284f, -8.239f)
                close()
            }
        }
        .build()
        return _citrus!!
    }

private var _citrus: ImageVector? = null
