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

public val Icons.Bold.Inhaler: ImageVector
    get() {
        if (_inhaler != null) {
            return _inhaler!!
        }
        _inhaler = Builder(name = "Inhaler", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 12.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(1.5f, 16.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.5f, 13.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.5f, 18.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23.929f, 4.197f)
                lineToRelative(-3.147f, 14.984f)
                curveToRelative(-0.307f, 1.621f, -1.753f, 2.818f, -3.433f, 2.818f)
                horizontalLineToRelative(-8.349f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(3.062f)
                lineToRelative(2.119f, -10.228f)
                curveToRelative(0.349f, -1.612f, 1.788f, -2.772f, 3.423f, -2.772f)
                horizontalLineToRelative(2.895f)
                curveToRelative(1.055f, 0.0f, 2.042f, 0.468f, 2.71f, 1.285f)
                reflectiveCurveToRelative(0.93f, 1.878f, 0.719f, 2.912f)
                close()
                moveTo(17.116f, 3.394f)
                lineToRelative(-0.747f, 3.606f)
                horizontalLineToRelative(3.906f)
                lineToRelative(0.716f, -3.41f)
                curveToRelative(0.039f, -0.192f, -0.049f, -0.338f, -0.105f, -0.406f)
                curveToRelative(-0.056f, -0.069f, -0.181f, -0.184f, -0.387f, -0.184f)
                horizontalLineToRelative(-2.895f)
                curveToRelative(-0.234f, 0.0f, -0.439f, 0.166f, -0.489f, 0.394f)
                close()
                moveTo(17.84f, 18.593f)
                lineToRelative(1.805f, -8.593f)
                horizontalLineToRelative(-3.897f)
                lineToRelative(-1.243f, 6.0f)
                horizontalLineToRelative(-2.504f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.349f)
                curveToRelative(0.24f, 0.0f, 0.446f, -0.171f, 0.491f, -0.407f)
                close()
            }
        }
        .build()
        return _inhaler!!
    }

private var _inhaler: ImageVector? = null
