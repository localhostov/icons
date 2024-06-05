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

public val Icons.Outline.SkullCow: ImageVector
    get() {
        if (_skullCow != null) {
            return _skullCow!!
        }
        _skullCow = Builder(name = "SkullCow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(8.5f, 9.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23.843f, 1.249f)
                curveToRelative(-0.533f, 2.066f, -2.309f, 3.549f, -4.404f, 3.732f)
                lineToRelative(2.328f, 6.174f)
                curveToRelative(0.672f, 1.917f, -0.183f, 4.023f, -1.979f, 4.922f)
                curveToRelative(-0.038f, 0.019f, -1.928f, 0.683f, -1.928f, 0.683f)
                lineToRelative(-0.875f, 4.08f)
                curveToRelative(-0.392f, 1.831f, -2.036f, 3.161f, -3.91f, 3.161f)
                horizontalLineToRelative(-2.15f)
                curveToRelative(-1.874f, 0.0f, -3.519f, -1.33f, -3.912f, -3.161f)
                lineToRelative(-0.874f, -4.081f)
                reflectiveCurveToRelative(-1.89f, -0.663f, -1.928f, -0.682f)
                curveToRelative(-1.796f, -0.898f, -2.65f, -3.005f, -1.986f, -4.899f)
                lineToRelative(2.333f, -6.187f)
                curveTo(2.409f, 4.855f, 0.573f, 3.355f, 0.032f, 1.249f)
                curveTo(-0.106f, 0.714f, 0.216f, 0.169f, 0.751f, 0.031f)
                curveToRelative(0.536f, -0.138f, 1.08f, 0.186f, 1.217f, 0.72f)
                curveToRelative(0.341f, 1.324f, 1.536f, 2.249f, 2.906f, 2.249f)
                horizontalLineToRelative(1.112f)
                curveToRelative(0.011f, 0.0f, 0.023f, 0.0f, 0.034f, 0.0f)
                horizontalLineToRelative(11.96f)
                curveToRelative(0.012f, 0.0f, 0.023f, 0.0f, 0.035f, 0.0f)
                horizontalLineToRelative(0.985f)
                curveToRelative(1.37f, 0.0f, 2.564f, -0.925f, 2.905f, -2.249f)
                curveToRelative(0.138f, -0.535f, 0.689f, -0.856f, 1.218f, -0.72f)
                curveToRelative(0.535f, 0.138f, 0.857f, 0.684f, 0.72f, 1.218f)
                close()
                moveTo(19.887f, 11.837f)
                lineToRelative(-2.578f, -6.837f)
                lineTo(6.691f, 5.0f)
                lineToRelative(-2.587f, 6.859f)
                curveToRelative(-0.317f, 0.907f, 0.087f, 1.938f, 0.951f, 2.401f)
                lineToRelative(1.745f, 0.609f)
                curveToRelative(0.654f, 0.229f, 1.15f, 0.791f, 1.295f, 1.469f)
                lineToRelative(0.875f, 4.081f)
                curveToRelative(0.196f, 0.915f, 1.019f, 1.58f, 1.956f, 1.58f)
                horizontalLineToRelative(2.15f)
                curveToRelative(0.937f, 0.0f, 1.759f, -0.665f, 1.955f, -1.58f)
                lineToRelative(0.875f, -4.081f)
                curveToRelative(0.143f, -0.675f, 0.64f, -1.239f, 1.295f, -1.468f)
                lineToRelative(1.744f, -0.61f)
                curveToRelative(0.863f, -0.463f, 1.269f, -1.494f, 0.942f, -2.424f)
                close()
            }
        }
        .build()
        return _skullCow!!
    }

private var _skullCow: ImageVector? = null
