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

public val Icons.Filled.Challenge: ImageVector
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
                moveTo(15.973f, 18.27f)
                curveToRelative(-0.142f, 2.078f, -1.859f, 3.73f, -3.973f, 3.73f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -2.114f, 1.652f, -3.831f, 3.73f, -3.973f)
                lineToRelative(1.818f, -1.818f)
                curveToRelative(-0.495f, -0.132f, -1.012f, -0.21f, -1.548f, -0.21f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                curveToRelative(0.0f, -0.536f, -0.077f, -1.053f, -0.21f, -1.548f)
                lineToRelative(-1.818f, 1.817f)
                close()
                moveTo(24.037f, 8.0f)
                lineToRelative(-0.037f, -3.004f)
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
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(15.172f)
                lineToRelative(2.0f, -2.0f)
                horizontalLineToRelative(2.828f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.037f)
                close()
                moveTo(4.0f, 18.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(6.715f)
                curveToRelative(-1.664f, -1.467f, -2.715f, -3.613f, -2.715f, -6.0f)
                close()
                moveTo(24.077f, 23.996f)
                lineToRelative(-0.028f, -11.216f)
                lineToRelative(-4.124f, 4.124f)
                curveToRelative(0.049f, 0.358f, 0.075f, 0.724f, 0.075f, 1.096f)
                curveToRelative(0.0f, 2.387f, -1.051f, 4.533f, -2.715f, 6.0f)
                lineToRelative(6.792f, -0.004f)
                close()
            }
        }
        .build()
        return _challenge!!
    }

private var _challenge: ImageVector? = null
