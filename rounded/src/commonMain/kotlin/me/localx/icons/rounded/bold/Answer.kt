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

public val Icons.Bold.Answer: ImageVector
    get() {
        if (_answer != null) {
            return _answer!!
        }
        _answer = Builder(name = "Answer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.085f, 6.664f)
                curveToRelative(-0.226f, -0.995f, -1.063f, -1.664f, -2.085f, -1.664f)
                reflectiveCurveToRelative(-1.859f, 0.669f, -2.085f, 1.664f)
                lineToRelative(-1.62f, 7.122f)
                curveToRelative(-0.123f, 0.538f, 0.214f, 1.074f, 0.753f, 1.196f)
                curveToRelative(0.534f, 0.126f, 1.073f, -0.215f, 1.196f, -0.753f)
                lineToRelative(0.278f, -1.222f)
                horizontalLineToRelative(2.956f)
                lineToRelative(0.278f, 1.222f)
                curveToRelative(0.105f, 0.464f, 0.518f, 0.778f, 0.974f, 0.778f)
                curveToRelative(0.073f, 0.0f, 0.148f, -0.008f, 0.223f, -0.025f)
                curveToRelative(0.539f, -0.122f, 0.876f, -0.658f, 0.753f, -1.196f)
                lineToRelative(-1.62f, -7.122f)
                close()
                moveTo(10.977f, 11.008f)
                lineToRelative(0.887f, -3.9f)
                curveToRelative(0.011f, -0.045f, 0.024f, -0.107f, 0.136f, -0.107f)
                reflectiveCurveToRelative(0.125f, 0.062f, 0.136f, 0.107f)
                lineToRelative(0.887f, 3.9f)
                horizontalLineToRelative(-2.046f)
                close()
                moveTo(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1.24f)
                lineToRelative(3.599f, 3.03f)
                curveToRelative(0.479f, 0.426f, 1.08f, 0.636f, 1.675f, 0.636f)
                curveToRelative(0.582f, 0.0f, 1.158f, -0.202f, 1.606f, -0.601f)
                lineToRelative(3.708f, -3.065f)
                horizontalLineToRelative(1.172f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 14.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-1.712f)
                curveToRelative(-0.349f, 0.0f, -0.687f, 0.122f, -0.956f, 0.344f)
                lineToRelative(-3.828f, 3.167f)
                lineToRelative(-3.75f, -3.158f)
                curveToRelative(-0.27f, -0.228f, -0.612f, -0.353f, -0.966f, -0.353f)
                horizontalLineToRelative(-1.788f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _answer!!
    }

private var _answer: ImageVector? = null
