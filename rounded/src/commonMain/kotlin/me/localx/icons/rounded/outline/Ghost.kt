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

public val Icons.Outline.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(15.5f, 9.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22.0f, 10.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.487f, -0.351f, 0.903f, -0.831f, 0.986f)
                curveToRelative(-0.057f, 0.01f, -0.113f, 0.014f, -0.169f, 0.014f)
                curveToRelative(-0.417f, 0.0f, -0.799f, -0.262f, -0.942f, -0.667f)
                curveToRelative(-0.264f, -0.748f, -1.167f, -1.333f, -2.057f, -1.333f)
                reflectiveCurveToRelative(-1.793f, 0.585f, -2.057f, 1.333f)
                curveToRelative(-0.141f, 0.4f, -0.519f, 0.667f, -0.943f, 0.667f)
                reflectiveCurveToRelative(-0.802f, -0.267f, -0.943f, -0.667f)
                curveToRelative(-0.264f, -0.748f, -1.167f, -1.333f, -2.057f, -1.333f)
                reflectiveCurveToRelative(-1.793f, 0.585f, -2.057f, 1.333f)
                curveToRelative(-0.141f, 0.4f, -0.519f, 0.667f, -0.943f, 0.667f)
                reflectiveCurveToRelative(-0.802f, -0.267f, -0.943f, -0.667f)
                curveToRelative(-0.264f, -0.748f, -1.167f, -1.333f, -2.057f, -1.333f)
                reflectiveCurveToRelative(-1.793f, 0.585f, -2.057f, 1.333f)
                curveToRelative(-0.163f, 0.459f, -0.633f, 0.733f, -1.112f, 0.653f)
                curveToRelative(-0.48f, -0.083f, -0.831f, -0.499f, -0.831f, -0.986f)
                verticalLineToRelative(-13.0f)
                curveTo(2.0f, 4.486f, 6.486f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                close()
                moveTo(20.0f, 10.0f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveTo(4.0f, 5.589f, 4.0f, 10.0f)
                verticalLineToRelative(10.503f)
                curveToRelative(0.608f, -0.32f, 1.297f, -0.503f, 2.0f, -0.503f)
                curveToRelative(1.127f, 0.0f, 2.222f, 0.472f, 3.0f, 1.225f)
                curveToRelative(0.778f, -0.753f, 1.873f, -1.225f, 3.0f, -1.225f)
                reflectiveCurveToRelative(2.222f, 0.472f, 3.0f, 1.225f)
                curveToRelative(0.778f, -0.753f, 1.873f, -1.225f, 3.0f, -1.225f)
                curveToRelative(0.703f, 0.0f, 1.392f, 0.183f, 2.0f, 0.503f)
                verticalLineToRelative(-10.503f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
