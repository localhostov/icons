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

public val Icons.Filled.Crutches: ImageVector
    get() {
        if (_crutches != null) {
            return _crutches!!
        }
        _crutches = Builder(name = "Crutches", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.696f, 16.293f)
                lineToRelative(6.268f, 6.268f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-6.268f, -6.268f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(21.585f, 9.486f)
                lineToRelative(-5.5f, 5.5f)
                curveToRelative(-1.943f, 1.943f, -4.527f, 3.014f, -7.275f, 3.014f)
                horizontalLineToRelative(-1.396f)
                lineToRelative(-5.975f, 5.975f)
                lineTo(0.025f, 22.561f)
                lineToRelative(5.975f, -5.975f)
                verticalLineToRelative(-1.395f)
                curveToRelative(0.0f, -0.654f, 0.065f, -1.297f, 0.183f, -1.926f)
                lineToRelative(-3.779f, -3.779f)
                lineToRelative(-0.965f, 0.965f)
                lineTo(0.025f, 9.037f)
                lineTo(9.025f, 0.037f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-0.965f, 0.965f)
                lineToRelative(2.52f, 2.519f)
                lineToRelative(2.519f, -2.52f)
                lineToRelative(-0.964f, -0.964f)
                lineTo(14.964f, 0.037f)
                lineToRelative(9.0f, 9.0f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-0.965f, -0.965f)
                close()
                moveTo(6.848f, 11.102f)
                curveToRelative(0.509f, -1.174f, 1.233f, -2.255f, 2.165f, -3.187f)
                lineToRelative(1.567f, -1.567f)
                lineToRelative(-2.52f, -2.519f)
                lineToRelative(-4.243f, 4.243f)
                lineToRelative(3.03f, 3.03f)
                close()
                moveTo(8.809f, 16.0f)
                curveToRelative(1.877f, 0.0f, 3.655f, -0.625f, 5.107f, -1.767f)
                lineToRelative(-4.15f, -4.149f)
                curveToRelative(-1.142f, 1.453f, -1.768f, 3.231f, -1.768f, 5.108f)
                verticalLineToRelative(0.809f)
                horizontalLineToRelative(0.81f)
                close()
                moveTo(20.171f, 8.072f)
                lineToRelative(-4.243f, -4.243f)
                lineToRelative(-4.793f, 4.794f)
                lineToRelative(4.243f, 4.243f)
                lineToRelative(4.793f, -4.793f)
                close()
            }
        }
        .build()
        return _crutches!!
    }

private var _crutches: ImageVector? = null
