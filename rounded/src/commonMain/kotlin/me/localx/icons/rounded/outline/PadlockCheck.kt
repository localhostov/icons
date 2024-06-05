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

public val Icons.Outline.PadlockCheck: ImageVector
    get() {
        if (_padlockCheck != null) {
            return _padlockCheck!!
        }
        _padlockCheck = Builder(name = "PadlockCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.0f)
                curveToRelative(-2.868f, 0.0f, -5.336f, 1.735f, -6.416f, 4.21f)
                curveToRelative(-0.166f, -0.123f, -0.361f, -0.21f, -0.584f, -0.21f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                curveToRelative(0.027f, 0.0f, 0.051f, -0.013f, 0.078f, -0.016f)
                curveToRelative(0.481f, 3.394f, 3.398f, 6.016f, 6.922f, 6.016f)
                curveToRelative(3.86f, 0.0f, 7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(20.221f, 15.788f)
                curveToRelative(0.383f, 0.398f, 0.37f, 1.031f, -0.029f, 1.414f)
                lineToRelative(-2.212f, 2.124f)
                curveToRelative(-0.452f, 0.446f, -1.052f, 0.671f, -1.653f, 0.671f)
                reflectiveCurveToRelative(-1.204f, -0.225f, -1.664f, -0.674f)
                lineToRelative(-1.132f, -1.108f)
                curveToRelative(-0.395f, -0.387f, -0.401f, -1.02f, -0.015f, -1.414f)
                curveToRelative(0.387f, -0.395f, 1.02f, -0.401f, 1.414f, -0.016f)
                lineToRelative(1.132f, 1.108f)
                curveToRelative(0.144f, 0.141f, 0.379f, 0.142f, 0.522f, 0.0f)
                lineToRelative(2.223f, -2.134f)
                curveToRelative(0.398f, -0.381f, 1.031f, -0.37f, 1.414f, 0.029f)
                close()
                moveTo(10.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.045f, 1.237f, -3.802f, 3.0f, -4.576f)
                verticalLineToRelative(-1.424f)
                curveTo(3.0f, 3.14f, 6.14f, 0.0f, 10.0f, 0.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 10.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _padlockCheck!!
    }

private var _padlockCheck: ImageVector? = null
