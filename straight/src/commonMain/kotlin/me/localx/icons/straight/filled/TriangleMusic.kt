package me.localx.icons.straight.filled

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

public val Icons.Filled.TriangleMusic: ImageVector
    get() {
        if (_triangleMusic != null) {
            return _triangleMusic!!
        }
        _triangleMusic = Builder(name = "TriangleMusic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.494f, 21.955f)
                curveToRelative(-0.712f, 1.281f, -2.014f, 2.047f, -3.48f, 2.047f)
                lineTo(3.986f, 24.002f)
                curveToRelative(-1.466f, 0.0f, -2.768f, -0.766f, -3.48f, -2.047f)
                curveToRelative(-0.712f, -1.282f, -0.676f, -2.79f, 0.098f, -4.036f)
                lineTo(8.704f, 4.883f)
                curveToRelative(0.551f, -0.887f, 1.36f, -1.494f, 2.296f, -1.748f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.136f)
                curveToRelative(0.939f, 0.255f, 1.746f, 0.861f, 2.296f, 1.745f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(0.539f, 0.868f)
                lineToRelative(-1.177f, 1.895f)
                lineToRelative(-1.061f, -1.707f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.374f, -0.602f, -0.943f, -0.935f, -1.604f, -0.938f)
                curveToRelative(-0.648f, 0.004f, -1.218f, 0.337f, -1.592f, 0.938f)
                lineTo(2.303f, 18.975f)
                curveToRelative(-0.385f, 0.62f, -0.403f, 1.371f, -0.049f, 2.009f)
                reflectiveCurveToRelative(1.002f, 1.019f, 1.732f, 1.019f)
                horizontalLineToRelative(16.027f)
                curveToRelative(0.73f, 0.0f, 1.377f, -0.381f, 1.732f, -1.019f)
                reflectiveCurveToRelative(0.336f, -1.389f, -0.048f, -2.008f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(-3.506f, -5.644f)
                lineToRelative(1.177f, -1.895f)
                lineToRelative(4.028f, 6.483f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.774f, 1.246f, 0.811f, 2.754f, 0.098f, 4.036f)
                close()
                moveTo(13.572f, 13.185f)
                lineToRelative(6.25f, -10.06f)
                lineToRelative(1.699f, 1.055f)
                lineToRelative(-6.302f, 10.144f)
                curveToRelative(0.481f, 0.6f, 0.781f, 1.35f, 0.781f, 2.176f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(0.376f, 0.0f, 0.732f, 0.075f, 1.072f, 0.185f)
                close()
            }
        }
        .build()
        return _triangleMusic!!
    }

private var _triangleMusic: ImageVector? = null
