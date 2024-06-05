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

public val Icons.Filled.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(6.486f, 0.0f, 2.0f, 4.486f, 2.0f, 10.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.487f, 0.351f, 0.903f, 0.831f, 0.986f)
                curveToRelative(0.479f, 0.08f, 0.949f, -0.194f, 1.112f, -0.653f)
                curveToRelative(0.264f, -0.748f, 1.167f, -1.333f, 2.057f, -1.333f)
                reflectiveCurveToRelative(1.793f, 0.585f, 2.057f, 1.333f)
                curveToRelative(0.141f, 0.4f, 0.519f, 0.667f, 0.943f, 0.667f)
                reflectiveCurveToRelative(0.802f, -0.267f, 0.943f, -0.667f)
                curveToRelative(0.264f, -0.748f, 1.167f, -1.333f, 2.057f, -1.333f)
                reflectiveCurveToRelative(1.793f, 0.585f, 2.057f, 1.333f)
                curveToRelative(0.141f, 0.4f, 0.519f, 0.667f, 0.943f, 0.667f)
                reflectiveCurveToRelative(0.802f, -0.267f, 0.943f, -0.667f)
                curveToRelative(0.264f, -0.748f, 1.167f, -1.333f, 2.057f, -1.333f)
                reflectiveCurveToRelative(1.793f, 0.585f, 2.057f, 1.333f)
                curveToRelative(0.143f, 0.405f, 0.525f, 0.667f, 0.942f, 0.667f)
                curveToRelative(0.056f, 0.0f, 0.113f, -0.004f, 0.169f, -0.014f)
                curveToRelative(0.48f, -0.083f, 0.831f, -0.499f, 0.831f, -0.986f)
                verticalLineToRelative(-13.0f)
                curveTo(22.0f, 4.486f, 17.514f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(8.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
