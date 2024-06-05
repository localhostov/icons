package me.localx.icons.straight.bold

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

public val Icons.Bold.FaceSunglasses: ImageVector
    get() {
        if (_faceSunglasses != null) {
            return _faceSunglasses!!
        }
        _faceSunglasses = Builder(name = "FaceSunglasses", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.005f, 14.377f)
                lineToRelative(1.994f, 2.241f)
                curveToRelative(-0.108f, 0.097f, -2.703f, 2.381f, -5.999f, 2.381f)
                reflectiveCurveToRelative(-5.891f, -2.284f, -5.999f, -2.381f)
                lineToRelative(1.994f, -2.241f)
                curveToRelative(0.019f, 0.016f, 1.871f, 1.623f, 4.005f, 1.623f)
                reflectiveCurveToRelative(3.986f, -1.606f, 4.005f, -1.623f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(4.52f, 7.0f)
                horizontalLineToRelative(5.633f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineToRelative(1.64f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineToRelative(5.686f)
                curveToRelative(-1.616f, -2.41f, -4.366f, -4.0f, -7.48f, -4.0f)
                reflectiveCurveToRelative(-5.863f, 1.59f, -7.48f, 4.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -0.177f, -0.006f, -0.352f, -0.016f, -0.526f)
                curveToRelative(-0.377f, 0.907f, -1.273f, 1.526f, -2.283f, 1.526f)
                horizontalLineToRelative(-3.155f)
                curveToRelative(-1.14f, 0.0f, -2.129f, -0.772f, -2.406f, -1.878f)
                lineToRelative(-0.031f, -0.122f)
                horizontalLineToRelative(-2.272f)
                lineToRelative(-0.03f, 0.122f)
                curveToRelative(-0.277f, 1.106f, -1.267f, 1.878f, -2.406f, 1.878f)
                horizontalLineToRelative(-3.155f)
                curveToRelative(-0.97f, 0.0f, -1.834f, -0.571f, -2.235f, -1.418f)
                curveToRelative(-0.006f, 0.139f, -0.01f, 0.278f, -0.01f, 0.418f)
                curveToRelative(0.0f, 4.962f, 4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _faceSunglasses!!
    }

private var _faceSunglasses: ImageVector? = null
