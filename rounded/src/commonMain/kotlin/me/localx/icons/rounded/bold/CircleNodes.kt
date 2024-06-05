package me.localx.icons.rounded.bold

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

public val Icons.Bold.CircleNodes: ImageVector
    get() {
        if (_circleNodes != null) {
            return _circleNodes!!
        }
        _circleNodes = Builder(name = "CircleNodes", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.791f, -4.0f, -4.0f)
                reflectiveCurveTo(17.791f, 0.0f, 20.0f, 0.0f)
                reflectiveCurveToRelative(4.0f, 1.791f, 4.0f, 4.0f)
                close()
                moveTo(16.0f, 16.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, 1.791f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.791f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.791f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.791f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(4.0f, 5.0f)
                curveTo(1.791f, 5.0f, 0.0f, 6.791f, 0.0f, 9.0f)
                reflectiveCurveToRelative(1.791f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.791f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.791f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(11.764f, 14.082f)
                lineToRelative(-1.5f, -1.375f)
                curveToRelative(-0.61f, -0.559f, -1.56f, -0.52f, -2.119f, 0.092f)
                curveToRelative(-0.56f, 0.61f, -0.519f, 1.56f, 0.092f, 2.119f)
                lineToRelative(1.5f, 1.375f)
                curveToRelative(0.288f, 0.265f, 0.651f, 0.395f, 1.014f, 0.395f)
                curveToRelative(0.405f, 0.0f, 0.81f, -0.164f, 1.105f, -0.486f)
                curveToRelative(0.56f, -0.61f, 0.519f, -1.56f, -0.092f, -2.119f)
                close()
                moveTo(17.751f, 14.5f)
                curveToRelative(0.672f, 0.0f, 1.284f, -0.455f, 1.454f, -1.136f)
                lineToRelative(0.5f, -2.0f)
                curveToRelative(0.201f, -0.804f, -0.287f, -1.618f, -1.091f, -1.819f)
                curveToRelative(-0.812f, -0.202f, -1.619f, 0.288f, -1.819f, 1.091f)
                lineToRelative(-0.5f, 2.0f)
                curveToRelative(-0.201f, 0.803f, 0.287f, 1.618f, 1.091f, 1.819f)
                curveToRelative(0.123f, 0.03f, 0.245f, 0.045f, 0.365f, 0.045f)
                close()
                moveTo(10.9f, 8.344f)
                curveToRelative(0.147f, 0.0f, 0.299f, -0.022f, 0.447f, -0.069f)
                lineToRelative(2.199f, -0.688f)
                curveToRelative(0.791f, -0.247f, 1.231f, -1.088f, 0.984f, -1.879f)
                curveToRelative(-0.246f, -0.789f, -1.087f, -1.229f, -1.879f, -0.984f)
                lineToRelative(-2.199f, 0.688f)
                curveToRelative(-0.791f, 0.247f, -1.231f, 1.088f, -0.984f, 1.879f)
                curveToRelative(0.2f, 0.642f, 0.793f, 1.053f, 1.432f, 1.053f)
                close()
            }
        }
        .build()
        return _circleNodes!!
    }

private var _circleNodes: ImageVector? = null
