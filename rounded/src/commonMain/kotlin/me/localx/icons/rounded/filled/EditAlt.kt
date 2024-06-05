package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.EditAlt: ImageVector
    get() {
        if (_editAlt != null) {
            return _editAlt!!
        }
        _editAlt = Builder(name = "EditAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.661f, 287.061f)
                lineTo(499.605f, 92.117f)
                curveToRelative(16.2f, -16.175f, 18.966f, -47.974f, -9.067f, -65.344f)
                curveToRelative(-23.989f, -11.806f, -42.541f, -1.743f, -51.179f, 8.341f)
                lineTo(252.309f, 242.283f)
                curveTo(274.227f, 251.016f, 292.636f, 266.762f, 304.661f, 287.061f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.667f, 405.333f)
                horizontalLineToRelative(106.667f)
                curveToRelative(35.346f, 0.0f, 64.0f, -28.654f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.654f, -64.0f, -64.0f, -64.0f)
                curveTo(128.0f, 277.333f, 106.667f, 405.333f, 106.667f, 405.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(341.333f, 405.333f)
                curveToRelative(0.0f, -35.346f, 28.654f, -64.0f, 64.0f, -64.0f)
                horizontalLineTo(512.0f)
                verticalLineToRelative(-201.28f)
                lineTo(319.147f, 332.907f)
                curveToRelative(0.235f, 2.837f, 0.853f, 5.547f, 0.853f, 8.427f)
                curveTo(319.929f, 400.214f, 272.214f, 447.93f, 213.333f, 448.0f)
                horizontalLineTo(106.667f)
                curveToRelative(-23.564f, 0.003f, -42.669f, -19.097f, -42.672f, -42.661f)
                curveToRelative(0.0f, -2.353f, 0.194f, -4.703f, 0.581f, -7.024f)
                curveToRelative(9.685f, -58.069f, 49.237f, -154.325f, 136.384f, -162.816f)
                lineTo(407.573f, 6.677f)
                curveToRelative(2.03f, -2.045f, 4.166f, -3.982f, 6.4f, -5.803f)
                curveTo(411.072f, 0.64f, 408.299f, 0.0f, 405.333f, 0.0f)
                horizontalLineTo(106.667f)
                curveTo(47.786f, 0.071f, 0.071f, 47.786f, 0.0f, 106.667f)
                verticalLineToRelative(298.667f)
                curveTo(0.071f, 464.214f, 47.786f, 511.93f, 106.667f, 512.0f)
                horizontalLineToRelative(234.667f)
                verticalLineTo(405.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(405.333f, 384.0f)
                curveTo(393.551f, 384.0f, 384.0f, 393.551f, 384.0f, 405.333f)
                verticalLineTo(505.6f)
                curveToRelative(15.051f, -5.162f, 28.744f, -13.65f, 40.064f, -24.832f)
                lineToRelative(56.704f, -56.704f)
                curveToRelative(11.182f, -11.32f, 19.67f, -25.013f, 24.832f, -40.064f)
                horizontalLineTo(405.333f)
                close()
            }
        }
        .build()
        return _editAlt!!
    }

private var _editAlt: ImageVector? = null
