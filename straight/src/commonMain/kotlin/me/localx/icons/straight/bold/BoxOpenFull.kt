package me.localx.icons.straight.bold

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

public val Icons.Bold.BoxOpenFull: ImageVector
    get() {
        if (_boxOpenFull != null) {
            return _boxOpenFull!!
        }
        _boxOpenFull = Builder(name = "BoxOpenFull", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.868f, 6.516f)
                lineToRelative(-2.827f, -0.997f)
                lineTo(10.525f, 0.036f)
                lineToRelative(1.912f, 1.912f)
                lineTo(7.868f, 6.516f)
                close()
                moveTo(11.802f, 7.84f)
                lineToRelative(6.742f, -2.183f)
                lineToRelative(-3.49f, -3.49f)
                lineToRelative(-5.067f, 5.021f)
                lineToRelative(1.815f, 0.651f)
                close()
                moveTo(18.989f, 18.505f)
                lineToRelative(-5.496f, 1.832f)
                lineToRelative(0.003f, -3.307f)
                curveToRelative(-0.541f, -0.225f, -1.036f, -0.562f, -1.439f, -1.013f)
                lineToRelative(-0.058f, -0.06f)
                lineToRelative(-0.058f, 0.06f)
                curveToRelative(-0.403f, 0.451f, -0.898f, 0.788f, -1.439f, 1.013f)
                lineToRelative(0.003f, 3.307f)
                lineToRelative(-5.496f, -1.832f)
                lineToRelative(-0.004f, -2.576f)
                lineToRelative(-3.001f, -1.34f)
                lineToRelative(0.007f, 6.08f)
                lineToRelative(9.988f, 3.329f)
                lineToRelative(9.988f, -3.329f)
                lineToRelative(0.007f, -6.08f)
                lineToRelative(-3.001f, 1.34f)
                lineToRelative(-0.004f, 2.576f)
                close()
                moveTo(23.714f, 9.192f)
                lineToRelative(-1.713f, -2.843f)
                lineToRelative(-9.996f, 3.677f)
                lineTo(1.998f, 6.349f)
                lineTo(0.285f, 9.192f)
                curveToRelative(-0.657f, 1.095f, -0.131f, 2.517f, 1.08f, 2.92f)
                lineToRelative(6.971f, 3.124f)
                curveToRelative(0.889f, 0.296f, 1.865f, -0.065f, 2.347f, -0.868f)
                lineToRelative(1.307f, -2.451f)
                lineToRelative(1.325f, 2.451f)
                curveToRelative(0.482f, 0.804f, 1.458f, 1.165f, 2.347f, 0.868f)
                lineToRelative(6.971f, -3.124f)
                curveToRelative(1.211f, -0.404f, 1.737f, -1.825f, 1.08f, -2.92f)
                close()
            }
        }
        .build()
        return _boxOpenFull!!
    }

private var _boxOpenFull: ImageVector? = null
