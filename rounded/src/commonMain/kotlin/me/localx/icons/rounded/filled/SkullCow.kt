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

public val Icons.Filled.SkullCow: ImageVector
    get() {
        if (_skullCow != null) {
            return _skullCow!!
        }
        _skullCow = Builder(name = "SkullCow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.123f, 0.031f)
                curveToRelative(-0.528f, -0.137f, -1.08f, 0.185f, -1.218f, 0.72f)
                curveToRelative(-0.341f, 1.324f, -1.535f, 2.249f, -2.905f, 2.249f)
                lineTo(4.874f, 3.0f)
                curveToRelative(-1.37f, 0.0f, -2.565f, -0.925f, -2.906f, -2.249f)
                curveTo(1.831f, 0.217f, 1.287f, -0.106f, 0.751f, 0.031f)
                curveTo(0.216f, 0.169f, -0.106f, 0.714f, 0.032f, 1.249f)
                curveToRelative(0.542f, 2.106f, 2.377f, 3.606f, 4.526f, 3.741f)
                lineToRelative(-2.333f, 6.187f)
                curveToRelative(-0.664f, 1.895f, 0.19f, 4.001f, 1.986f, 4.899f)
                curveToRelative(0.038f, 0.019f, 1.928f, 0.682f, 1.928f, 0.682f)
                lineToRelative(0.874f, 4.081f)
                curveToRelative(0.393f, 1.831f, 2.038f, 3.161f, 3.912f, 3.161f)
                horizontalLineToRelative(2.15f)
                curveToRelative(1.874f, 0.0f, 3.519f, -1.33f, 3.91f, -3.161f)
                lineToRelative(0.875f, -4.08f)
                reflectiveCurveToRelative(1.89f, -0.664f, 1.928f, -0.683f)
                curveToRelative(1.796f, -0.898f, 2.65f, -3.005f, 1.979f, -4.922f)
                lineToRelative(-2.328f, -6.174f)
                curveToRelative(2.095f, -0.183f, 3.872f, -1.665f, 4.404f, -3.732f)
                curveToRelative(0.138f, -0.534f, -0.185f, -1.08f, -0.72f, -1.218f)
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
        return _skullCow!!
    }

private var _skullCow: ImageVector? = null
