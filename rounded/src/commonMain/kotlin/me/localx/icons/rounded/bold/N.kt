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

public val Icons.Bold.N: ImageVector
    get() {
        if (_n != null) {
            return _n!!
        }
        _n = Builder(name = "N", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 24.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineTo(3.919f)
                curveTo(2.0f, 2.011f, 3.256f, 0.471f, 5.126f, 0.087f)
                curveToRelative(1.866f, -0.384f, 3.63f, 0.537f, 4.383f, 2.292f)
                lineToRelative(7.74f, 18.062f)
                curveToRelative(0.265f, 0.617f, 0.806f, 0.58f, 1.021f, 0.534f)
                curveToRelative(0.22f, -0.045f, 0.729f, -0.222f, 0.729f, -0.894f)
                verticalLineTo(1.5f)
                curveToRelative(0.034f, -1.972f, 2.967f, -1.971f, 3.0f, 0.0f)
                verticalLineTo(20.081f)
                curveToRelative(0.0f, 1.908f, -1.256f, 3.448f, -3.126f, 3.832f)
                curveToRelative(-1.863f, 0.387f, -3.631f, -0.536f, -4.383f, -2.291f)
                lineTo(6.751f, 3.56f)
                curveToRelative(-0.265f, -0.618f, -0.803f, -0.58f, -1.022f, -0.534f)
                curveToRelative(-0.219f, 0.045f, -0.729f, 0.222f, -0.729f, 0.894f)
                verticalLineTo(22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _n!!
    }

private var _n: ImageVector? = null
