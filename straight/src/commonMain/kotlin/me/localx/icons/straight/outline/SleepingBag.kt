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

public val Icons.Outline.SleepingBag: ImageVector
    get() {
        if (_sleepingBag != null) {
            return _sleepingBag!!
        }
        _sleepingBag = Builder(name = "SleepingBag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.148f, 2.285f)
                curveToRelative(-0.324f, -1.345f, -1.521f, -2.285f, -2.914f, -2.285f)
                lineTo(7.766f, 0.0f)
                curveToRelative(-1.393f, 0.0f, -2.59f, 0.939f, -2.913f, 2.284f)
                curveToRelative(-0.389f, 1.61f, -0.853f, 4.083f, -0.853f, 6.716f)
                curveToRelative(0.0f, 5.29f, 1.942f, 13.86f, 2.025f, 14.223f)
                lineToRelative(0.177f, 0.777f)
                horizontalLineToRelative(11.596f)
                lineToRelative(0.177f, -0.777f)
                curveToRelative(0.083f, -0.362f, 2.025f, -8.933f, 2.025f, -14.223f)
                curveToRelative(0.0f, -2.632f, -0.464f, -5.105f, -0.852f, -6.715f)
                close()
                moveTo(6.796f, 2.753f)
                curveToRelative(0.106f, -0.443f, 0.505f, -0.752f, 0.969f, -0.752f)
                horizontalLineToRelative(8.469f)
                curveToRelative(0.464f, 0.0f, 0.862f, 0.31f, 0.97f, 0.753f)
                curveToRelative(0.318f, 1.319f, 0.689f, 3.251f, 0.777f, 5.348f)
                curveToRelative(-2.173f, 0.28f, -7.577f, 1.303f, -11.717f, 4.803f)
                curveToRelative(-0.159f, -1.391f, -0.264f, -2.742f, -0.264f, -3.904f)
                curveToRelative(0.0f, -2.436f, 0.433f, -4.742f, 0.797f, -6.248f)
                close()
                moveTo(16.303f, 10.43f)
                lineToRelative(-3.692f, 5.37f)
                lineToRelative(-4.673f, -1.669f)
                curveToRelative(2.735f, -2.151f, 6.063f, -3.205f, 8.365f, -3.702f)
                close()
                moveTo(16.195f, 22.001f)
                lineTo(7.805f, 22.001f)
                curveToRelative(-0.253f, -1.186f, -0.742f, -3.589f, -1.148f, -6.204f)
                lineToRelative(6.732f, 2.404f)
                lineToRelative(4.472f, -6.505f)
                curveToRelative(-0.352f, 3.903f, -1.281f, 8.504f, -1.666f, 10.305f)
                close()
                moveTo(9.5f, 6.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _sleepingBag!!
    }

private var _sleepingBag: ImageVector? = null
