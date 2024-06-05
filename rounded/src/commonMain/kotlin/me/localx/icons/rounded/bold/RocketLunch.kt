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

public val Icons.Bold.RocketLunch: ImageVector
    get() {
        if (_rocketLunch != null) {
            return _rocketLunch!!
        }
        _rocketLunch = Builder(name = "RocketLunch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3f, 18.7f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 0.0f, 3.394f)
                arcToRelative(12.8f, 12.8f, 0.0f, false, true, -4.212f, 1.88f)
                arcTo(0.887f, 0.887f, 0.0f, false, true, 0.023f, 22.915f)
                arcTo(12.8f, 12.8f, 0.0f, false, true, 1.9f, 18.7f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 5.3f, 18.7f)
                close()
                moveTo(16.045f, 17.613f)
                close()
                moveTo(6.257f, 8.139f)
                horizontalLineToRelative(0.0f)
                curveTo(6.29f, 8.093f, 6.273f, 8.116f, 6.257f, 8.139f)
                close()
                moveTo(18.0f, 8.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -5.0f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 8.5f)
                close()
                moveTo(16.024f, 17.629f)
                lineTo(16.032f, 17.623f)
                arcToRelative(12.106f, 12.106f, 0.0f, false, true, -0.823f, 2.111f)
                arcToRelative(8.713f, 8.713f, 0.0f, false, true, -3.848f, 4.07f)
                arcTo(2.427f, 2.427f, 0.0f, false, true, 8.0f, 21.554f)
                lineTo(8.0f, 19.0f)
                arcToRelative(3.015f, 3.015f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(2.392f, 16.0f)
                arcToRelative(2.373f, 2.373f, 0.0f, false, true, -2.2f, -3.287f)
                arcTo(8.518f, 8.518f, 0.0f, false, true, 4.172f, 8.95f)
                arcToRelative(11.881f, 11.881f, 0.0f, false, true, 2.085f, -0.811f)
                curveToRelative(-0.016f, 0.022f, -0.031f, 0.044f, 0.0f, 0.0f)
                curveTo(10.088f, 2.8f, 14.469f, 0.171f, 20.458f, 0.0f)
                arcTo(3.513f, 3.513f, 0.0f, false, true, 24.0f, 3.5f)
                curveToRelative(-0.171f, 6.031f, -2.625f, 10.293f, -7.967f, 14.123f)
                close()
                moveTo(21.0f, 3.458f)
                arcTo(0.493f, 0.493f, 0.0f, false, false, 20.5f, 3.0f)
                curveToRelative(-5.036f, 0.144f, -8.3f, 2.0f, -11.612f, 6.614f)
                arcToRelative(28.038f, 28.038f, 0.0f, false, false, -2.153f, 3.64f)
                arcToRelative(6.018f, 6.018f, 0.0f, false, true, 3.984f, 3.922f)
                lineTo(12.882f, 16.1f)
                curveToRelative(0.506f, -0.3f, 1.018f, -0.634f, 1.505f, -0.983f)
                curveTo(19.0f, 11.8f, 20.856f, 8.536f, 21.0f, 3.458f)
                close()
                moveTo(16.032f, 17.623f)
                lineToRelative(0.01f, -0.007f)
                lineToRelative(-0.009f, 0.007f)
                close()
            }
        }
        .build()
        return _rocketLunch!!
    }

private var _rocketLunch: ImageVector? = null
