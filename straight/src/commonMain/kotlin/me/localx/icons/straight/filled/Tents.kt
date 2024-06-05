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

public val Icons.Filled.Tents: ImageVector
    get() {
        if (_tents != null) {
            return _tents!!
        }
        _tents = Builder(name = "Tents", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.679f, 16.697f)
                curveToRelative(-0.451f, 0.804f, -1.312f, 1.303f, -2.247f, 1.303f)
                horizontalLineToRelative(-0.846f)
                lineTo(11.326f, 3.981f)
                lineTo(14.0f, 0.059f)
                lineToRelative(9.606f, 14.087f)
                curveToRelative(0.501f, 0.821f, 0.519f, 1.759f, 0.073f, 2.552f)
                close()
                moveTo(7.235f, 24.0f)
                horizontalLineToRelative(5.53f)
                lineToRelative(-2.765f, -4.186f)
                lineToRelative(-2.765f, 4.186f)
                close()
                moveTo(19.614f, 20.158f)
                lineTo(10.0f, 5.603f)
                lineTo(0.366f, 20.188f)
                curveToRelative(-0.474f, 0.778f, -0.491f, 1.716f, -0.045f, 2.509f)
                curveToRelative(0.451f, 0.804f, 1.312f, 1.303f, 2.247f, 1.303f)
                horizontalLineToRelative(2.27f)
                lineToRelative(5.162f, -7.814f)
                lineToRelative(5.162f, 7.814f)
                horizontalLineToRelative(2.27f)
                curveToRelative(0.935f, 0.0f, 1.795f, -0.499f, 2.247f, -1.303f)
                curveToRelative(0.446f, -0.793f, 0.429f, -1.73f, -0.064f, -2.539f)
                close()
            }
        }
        .build()
        return _tents!!
    }

private var _tents: ImageVector? = null
