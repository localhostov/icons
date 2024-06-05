package me.localx.icons.rounded.filled

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

public val Icons.Filled.Racquet: ImageVector
    get() {
        if (_racquet != null) {
            return _racquet!!
        }
        _racquet = Builder(name = "Racquet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.933f, 2.067f)
                curveTo(18.767f, -1.1f, 13.086f, -0.569f, 9.267f, 3.248f)
                arcTo(10.6f, 10.6f, 0.0f, false, false, 6.029f, 10.9f)
                arcToRelative(13.291f, 13.291f, 0.0f, false, false, 0.157f, 1.433f)
                curveToRelative(0.149f, 1.571f, 0.129f, 3.938f, -0.884f, 4.951f)
                lineToRelative(-5.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 1.716f, 23.7f)
                lineToRelative(5.0f, -5.0f)
                curveToRelative(1.025f, -1.023f, 3.433f, -1.033f, 5.0f, -0.879f)
                arcToRelative(13.448f, 13.448f, 0.0f, false, false, 1.62f, 0.163f)
                arcToRelative(10.667f, 10.667f, 0.0f, false, false, 7.412f, -3.249f)
                curveTo(24.569f, 10.915f, 25.1f, 5.234f, 21.933f, 2.067f)
                close()
                moveTo(21.416f, 10.221f)
                lineTo(19.933f, 8.739f)
                lineTo(21.976f, 6.7f)
                arcTo(7.455f, 7.455f, 0.0f, false, true, 21.416f, 10.221f)
                close()
                moveTo(21.316f, 4.532f)
                lineTo(18.519f, 7.325f)
                lineTo(16.593f, 5.4f)
                lineToRelative(2.753f, -2.753f)
                arcToRelative(4.525f, 4.525f, 0.0f, false, true, 1.966f, 1.886f)
                close()
                moveTo(13.046f, 15.98f)
                lineToRelative(-0.3f, -0.051f)
                lineToRelative(2.241f, -2.241f)
                lineToRelative(1.568f, 1.568f)
                arcTo(7.682f, 7.682f, 0.0f, false, true, 13.046f, 15.98f)
                close()
                moveTo(8.02f, 10.951f)
                arcToRelative(7.685f, 7.685f, 0.0f, false, true, 0.723f, -3.5f)
                lineTo(10.23f, 8.934f)
                lineTo(8.048f, 11.117f)
                curveTo(8.038f, 11.058f, 8.028f, 11.0f, 8.02f, 10.951f)
                close()
                moveTo(10.551f, 15.293f)
                arcToRelative(4.718f, 4.718f, 0.0f, false, true, -1.9f, -1.952f)
                lineToRelative(2.992f, -2.993f)
                lineToRelative(1.926f, 1.926f)
                close()
                moveTo(13.058f, 8.934f)
                lineTo(15.179f, 6.813f)
                lineTo(17.105f, 8.739f)
                lineTo(14.984f, 10.86f)
                close()
                moveTo(17.137f, 2.027f)
                lineTo(15.179f, 3.985f)
                lineToRelative(-1.4f, -1.4f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, 2.891f, -0.6f)
                curveTo(16.832f, 1.988f, 16.982f, 2.016f, 17.137f, 2.027f)
                close()
                moveTo(11.958f, 3.592f)
                lineTo(13.765f, 5.4f)
                lineTo(11.644f, 7.52f)
                lineTo(9.8f, 5.679f)
                arcToRelative(10.045f, 10.045f, 0.0f, false, true, 0.879f, -1.017f)
                arcTo(9.868f, 9.868f, 0.0f, false, true, 11.958f, 3.592f)
                close()
                moveTo(8.058f, 15.938f)
                curveToRelative(0.0f, -0.014f, 0.0f, -0.029f, 0.007f, -0.043f)
                lineToRelative(0.017f, 0.019f)
                lineToRelative(0.019f, 0.017f)
                close()
                moveTo(18.321f, 14.2f)
                lineTo(16.4f, 12.274f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.891f, 1.891f)
                arcToRelative(9.879f, 9.879f, 0.0f, false, true, -1.073f, 1.275f)
                arcTo(9.927f, 9.927f, 0.0f, false, true, 18.321f, 14.2f)
                close()
            }
        }
        .build()
        return _racquet!!
    }

private var _racquet: ImageVector? = null
