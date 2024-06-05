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

public val Icons.Bold.CandyBar: ImageVector
    get() {
        if (_candyBar != null) {
            return _candyBar!!
        }
        _candyBar = Builder(name = "CandyBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.817f, 12.593f)
                curveToRelative(-0.565f, -0.573f, -0.817f, -0.993f, -0.817f, -1.362f)
                curveToRelative(0.0f, -0.463f, 0.214f, -0.797f, 0.393f, -0.996f)
                curveToRelative(0.514f, -0.57f, 0.515f, -1.437f, 0.0f, -2.007f)
                curveToRelative(-0.18f, -0.199f, -0.394f, -0.534f, -0.394f, -0.997f)
                curveToRelative(0.0f, -0.358f, 0.224f, -0.743f, 0.748f, -1.288f)
                curveToRelative(0.567f, -0.589f, 0.559f, -1.523f, -0.02f, -2.101f)
                lineToRelative(-2.286f, -2.286f)
                curveToRelative(-1.003f, -1.004f, -2.338f, -1.557f, -3.758f, -1.557f)
                reflectiveCurveToRelative(-2.754f, 0.553f, -3.758f, 1.557f)
                lineTo(2.557f, 10.927f)
                curveToRelative(-2.072f, 2.072f, -2.072f, 5.444f, 0.0f, 7.516f)
                lineToRelative(4.001f, 4.001f)
                curveToRelative(1.036f, 1.036f, 2.397f, 1.554f, 3.758f, 1.554f)
                reflectiveCurveToRelative(2.722f, -0.518f, 3.758f, -1.554f)
                lineToRelative(7.736f, -7.736f)
                curveToRelative(0.583f, -0.583f, 0.586f, -1.527f, 0.008f, -2.114f)
                close()
                moveTo(16.016f, 16.257f)
                lineToRelative(-2.607f, -2.607f)
                lineToRelative(2.016f, -2.016f)
                lineToRelative(2.607f, 2.607f)
                lineToRelative(-2.016f, 2.016f)
                close()
                moveTo(10.757f, 6.967f)
                lineToRelative(2.546f, 2.546f)
                lineToRelative(-2.016f, 2.016f)
                lineToRelative(-2.546f, -2.546f)
                lineToRelative(2.016f, -2.016f)
                close()
                moveTo(15.683f, 3.0f)
                curveToRelative(0.618f, 0.0f, 1.199f, 0.241f, 1.637f, 0.678f)
                lineToRelative(0.91f, 0.909f)
                lineToRelative(-2.805f, 2.805f)
                lineToRelative(-2.546f, -2.546f)
                lineToRelative(1.168f, -1.168f)
                curveToRelative(0.438f, -0.437f, 1.019f, -0.678f, 1.637f, -0.678f)
                close()
                moveTo(8.677f, 20.322f)
                lineToRelative(-4.001f, -4.001f)
                curveToRelative(-0.902f, -0.902f, -0.902f, -2.371f, 0.0f, -3.273f)
                lineToRelative(1.944f, -1.944f)
                lineToRelative(7.274f, 7.275f)
                lineToRelative(-1.944f, 1.944f)
                curveToRelative(-0.902f, 0.902f, -2.371f, 0.902f, -3.273f, 0.0f)
                close()
            }
        }
        .build()
        return _candyBar!!
    }

private var _candyBar: ImageVector? = null
