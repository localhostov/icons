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

public val Icons.Bold.BoxOpen: ImageVector
    get() {
        if (_boxOpen != null) {
            return _boxOpen!!
        }
        _boxOpen = Builder(name = "BoxOpen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.715f, 6.861f)
                lineToRelative(-1.72f, -2.855f)
                lineTo(12.009f, 0.0f)
                lineToRelative(-0.009f, 0.004f)
                lineToRelative(-0.009f, -0.004f)
                lineTo(2.005f, 4.006f)
                lineTo(0.285f, 6.861f)
                curveToRelative(-0.657f, 1.095f, -0.131f, 2.517f, 1.08f, 2.92f)
                lineToRelative(6.971f, 3.124f)
                curveToRelative(0.889f, 0.296f, 1.865f, -0.065f, 2.347f, -0.868f)
                lineToRelative(1.306f, -2.448f)
                lineToRelative(1.326f, 2.448f)
                curveToRelative(0.482f, 0.804f, 1.458f, 1.165f, 2.347f, 0.868f)
                lineToRelative(6.971f, -3.124f)
                curveToRelative(1.211f, -0.404f, 1.737f, -1.825f, 1.08f, -2.92f)
                close()
                moveTo(12.0f, 7.703f)
                lineToRelative(-5.753f, -2.132f)
                lineToRelative(5.753f, -2.336f)
                lineToRelative(5.753f, 2.336f)
                lineToRelative(-5.753f, 2.132f)
                close()
                moveTo(18.994f, 13.598f)
                lineToRelative(3.001f, -1.34f)
                lineToRelative(-0.007f, 8.39f)
                lineToRelative(-9.988f, 3.329f)
                lineToRelative(-9.988f, -3.329f)
                lineToRelative(-0.007f, -8.39f)
                lineToRelative(3.001f, 1.34f)
                lineToRelative(0.004f, 4.887f)
                lineToRelative(5.496f, 1.832f)
                lineToRelative(-0.003f, -5.618f)
                curveToRelative(0.541f, -0.225f, 1.036f, -0.562f, 1.439f, -1.013f)
                lineToRelative(0.058f, -0.064f)
                lineToRelative(0.058f, 0.064f)
                curveToRelative(0.403f, 0.451f, 0.898f, 0.788f, 1.439f, 1.013f)
                lineToRelative(-0.003f, 5.618f)
                lineToRelative(5.496f, -1.832f)
                lineToRelative(0.004f, -4.887f)
                close()
            }
        }
        .build()
        return _boxOpen!!
    }

private var _boxOpen: ImageVector? = null
