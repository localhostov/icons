package me.localx.icons.straight.outline

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

public val Icons.Outline.Challenge: ImageVector
    get() {
        if (_challenge != null) {
            return _challenge!!
        }
        _challenge = Builder(name = "Challenge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.414f, 15.0f)
                lineToRelative(-2.482f, 2.482f)
                curveToRelative(0.044f, 0.165f, 0.068f, 0.339f, 0.068f, 0.518f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.179f, 0.0f, 0.353f, 0.024f, 0.518f, 0.068f)
                lineToRelative(2.482f, -2.482f)
                verticalLineToRelative(-2.586f)
                lineToRelative(3.0f, -3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(-2.586f)
                close()
                moveTo(5.079f, 22.0f)
                horizontalLineToRelative(-3.079f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(11.172f)
                lineToRelative(2.0f, -2.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                lineToRelative(0.012f, 3.0f)
                horizontalLineToRelative(-2.012f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.02f)
                lineToRelative(-0.02f, -5.004f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.002f, -1.653f, -1.347f, -2.996f, -3.0f, -2.996f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(6.721f)
                curveToRelative(-0.65f, -0.572f, -1.205f, -1.246f, -1.642f, -2.0f)
                close()
                moveTo(17.79f, 16.452f)
                lineToRelative(-1.818f, 1.817f)
                curveToRelative(-0.142f, 2.078f, -1.859f, 3.73f, -3.973f, 3.73f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -2.114f, 1.652f, -3.831f, 3.73f, -3.973f)
                lineToRelative(1.818f, -1.818f)
                curveToRelative(-0.495f, -0.132f, -1.012f, -0.21f, -1.548f, -0.21f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                curveToRelative(0.0f, -0.536f, -0.077f, -1.053f, -0.21f, -1.548f)
                close()
                moveTo(24.077f, 23.996f)
                lineToRelative(-0.045f, -11.199f)
                lineToRelative(-1.992f, 1.992f)
                lineToRelative(0.029f, 7.211f)
                horizontalLineToRelative(-3.148f)
                curveToRelative(-0.437f, 0.754f, -0.992f, 1.428f, -1.642f, 2.0f)
                horizontalLineToRelative(4.798f)
                verticalLineToRelative(0.004f)
                lineToRelative(2.0f, -0.008f)
                close()
            }
        }
        .build()
        return _challenge!!
    }

private var _challenge: ImageVector? = null
