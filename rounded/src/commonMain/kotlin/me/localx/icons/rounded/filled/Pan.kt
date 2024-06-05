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

public val Icons.Filled.Pan: ImageVector
    get() {
        if (_pan != null) {
            return _pan!!
        }
        _pan = Builder(name = "Pan", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 0.0f)
                curveTo(6.665f, -0.189f, 1.6f, 8.253f, 5.139f, 14.618f)
                lineTo(0.879f, 18.879f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.242f, 4.242f)
                lineToRelative(4.261f, -4.26f)
                curveTo(15.748f, 22.4f, 24.189f, 17.336f, 24.0f, 10.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 14.0f, 0.0f)
                close()
                moveTo(14.0f, 17.0f)
                curveTo(4.749f, 16.7f, 4.751f, 3.294f, 14.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                curveToRelative(-6.607f, 0.21f, -6.607f, 9.791f, 0.0f, 10.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcTo(7.009f, 7.009f, 0.0f, false, true, 14.0f, 17.0f)
                close()
            }
        }
        .build()
        return _pan!!
    }

private var _pan: ImageVector? = null
