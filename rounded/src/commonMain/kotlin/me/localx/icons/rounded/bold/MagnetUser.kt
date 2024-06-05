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

public val Icons.Bold.MagnetUser: ImageVector
    get() {
        if (_magnetUser != null) {
            return _magnetUser!!
        }
        _magnetUser = Builder(name = "MagnetUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.524f, 17.523f)
                lineToRelative(-0.808f, 0.808f)
                lineToRelative(-2.829f, -2.83f)
                lineToRelative(0.808f, -0.807f)
                curveToRelative(0.586f, -0.586f, 1.536f, -0.586f, 2.122f, 0.0f)
                lineToRelative(0.708f, 0.708f)
                curveToRelative(0.585f, 0.586f, 0.585f, 1.535f, 0.0f, 2.121f)
                close()
                moveTo(8.599f, 7.478f)
                lineToRelative(0.707f, 0.707f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.536f, 0.0f, 2.122f)
                lineToRelative(-0.807f, 0.807f)
                lineToRelative(-2.829f, -2.828f)
                lineToRelative(0.808f, -0.808f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                close()
                moveTo(23.99f, 5.646f)
                curveToRelative(-0.094f, -1.6f, -0.806f, -3.067f, -2.004f, -4.132f)
                curveTo(20.787f, 0.451f, 19.246f, -0.084f, 17.646f, 0.011f)
                curveToRelative(-1.6f, 0.094f, -3.067f, 0.806f, -4.132f, 2.004f)
                curveToRelative(-1.064f, 1.198f, -1.599f, 2.739f, -1.504f, 4.339f)
                curveToRelative(0.094f, 1.6f, 0.806f, 3.067f, 2.004f, 4.132f)
                curveToRelative(1.198f, 1.064f, 2.739f, 1.599f, 4.339f, 1.504f)
                curveToRelative(1.6f, -0.094f, 3.067f, -0.806f, 4.132f, -2.004f)
                curveToRelative(1.064f, -1.198f, 1.599f, -2.739f, 1.504f, -4.339f)
                close()
                moveTo(20.0f, 4.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.065f, 0.835f, -1.927f, 1.884f, -1.988f)
                curveToRelative(0.134f, -0.004f, 0.265f, 0.007f, 0.396f, 0.017f)
                curveToRelative(0.971f, 0.137f, 1.72f, 0.963f, 1.72f, 1.972f)
                close()
                moveTo(20.989f, 8.656f)
                curveToRelative(-0.68f, 0.766f, -1.652f, 1.273f, -2.753f, 1.338f)
                curveToRelative(-1.282f, 0.076f, -2.449f, -0.476f, -3.236f, -1.375f)
                verticalLineToRelative(-0.119f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(0.14f)
                reflectiveCurveToRelative(-0.007f, 0.011f, -0.011f, 0.015f)
                close()
                moveTo(7.103f, 24.0f)
                curveToRelative(-1.897f, 0.0f, -3.681f, -0.739f, -5.022f, -2.081f)
                curveToRelative(-1.341f, -1.34f, -2.08f, -3.124f, -2.08f, -5.021f)
                reflectiveCurveToRelative(0.739f, -3.682f, 2.081f, -5.022f)
                lineToRelative(2.191f, -2.192f)
                lineToRelative(2.829f, 2.828f)
                lineToRelative(-2.192f, 2.193f)
                curveToRelative(-0.587f, 0.586f, -0.909f, 1.364f, -0.909f, 2.193f)
                reflectiveCurveToRelative(0.322f, 1.607f, 0.908f, 2.192f)
                curveToRelative(1.173f, 1.174f, 3.216f, 1.173f, 4.388f, 0.0f)
                lineToRelative(2.194f, -2.193f)
                lineToRelative(2.828f, 2.83f)
                lineToRelative(-2.193f, 2.192f)
                curveToRelative(-1.341f, 1.341f, -3.125f, 2.08f, -5.022f, 2.08f)
                close()
            }
        }
        .build()
        return _magnetUser!!
    }

private var _magnetUser: ImageVector? = null
