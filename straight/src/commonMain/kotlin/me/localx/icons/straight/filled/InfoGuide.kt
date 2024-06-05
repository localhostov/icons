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

public val Icons.Filled.InfoGuide: ImageVector
    get() {
        if (_infoGuide != null) {
            return _infoGuide!!
        }
        _infoGuide = Builder(name = "InfoGuide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                horizontalLineToRelative(1.071f)
                lineToRelative(1.939f, 1.939f)
                curveToRelative(0.586f, 0.586f, 1.536f, 0.586f, 2.121f, 0.0f)
                lineToRelative(1.939f, -1.939f)
                horizontalLineToRelative(0.929f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                lineTo(17.999f, 2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(24.0f, 4.049f)
                verticalLineToRelative(16.834f)
                lineToRelative(-12.0f, 2.182f)
                lineTo(0.0f, 20.883f)
                lineTo(0.0f, 4.049f)
                curveToRelative(0.0f, -0.892f, 0.393f, -1.731f, 1.078f, -2.303f)
                curveToRelative(0.684f, -0.571f, 1.577f, -0.81f, 2.458f, -0.648f)
                lineToRelative(0.542f, 0.131f)
                curveToRelative(-0.049f, 0.25f, -0.078f, 0.507f, -0.078f, 0.772f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(0.243f)
                lineToRelative(1.354f, 1.354f)
                curveToRelative(0.406f, 0.405f, 0.891f, 0.675f, 1.403f, 0.839f)
                verticalLineToRelative(4.656f)
                lineToRelative(1.0f, 0.182f)
                lineToRelative(1.0f, -0.182f)
                verticalLineToRelative(-4.614f)
                curveToRelative(0.565f, -0.155f, 1.103f, -0.439f, 1.546f, -0.882f)
                lineToRelative(1.354f, -1.354f)
                horizontalLineToRelative(0.101f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(20.001f, 2.0f)
                curveToRelative(0.0f, -0.265f, -0.029f, -0.523f, -0.078f, -0.773f)
                lineToRelative(0.484f, -0.118f)
                curveToRelative(0.937f, -0.171f, 1.83f, 0.064f, 2.516f, 0.636f)
                curveToRelative(0.686f, 0.572f, 1.078f, 1.411f, 1.078f, 2.303f)
                close()
            }
        }
        .build()
        return _infoGuide!!
    }

private var _infoGuide: ImageVector? = null
