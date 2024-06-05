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

public val Icons.Filled.Motorcycle: ImageVector
    get() {
        if (_motorcycle != null) {
            return _motorcycle!!
        }
        _motorcycle = Builder(name = "Motorcycle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 16.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                curveToRelative(-5.073f, 0.032f, -6.868f, -6.867f, -2.49f, -9.31f)
                lineToRelative(1.542f, 4.626f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.9f, -0.632f)
                lineTo(18.407f, 11.06f)
                arcTo(4.974f, 4.974f, 0.0f, false, true, 24.0f, 16.0f)
                close()
                moveTo(18.407f, 11.06f)
                arcToRelative(4.926f, 4.926f, 0.0f, false, false, -1.9f, 0.63f)
                lineToRelative(-0.56f, -1.678f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.8f, 0.786f)
                lineTo(11.7f, 15.4f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, true, -1.771f, 1.306f)
                curveTo(8.969f, 22.768f, 0.117f, 22.166f, 0.0f, 16.0f)
                arcToRelative(4.992f, 4.992f, 0.0f, false, true, 6.342f, -4.794f)
                lineTo(6.8f, 10.6f)
                arcTo(1.006f, 1.006f, 0.0f, false, false, 6.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                arcTo(2.963f, 2.963f, 0.0f, false, true, 8.822f, 9.0f)
                horizontalLineToRelative(5.269f)
                arcToRelative(6.023f, 6.023f, 0.0f, false, true, 1.2f, -0.964f)
                lineToRelative(-0.557f, -1.668f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.838f, 5.0f)
                lineTo(11.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.838f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, true, 3.794f, 2.735f)
                lineToRelative(0.524f, 1.572f)
                curveToRelative(0.026f, -0.005f, 0.051f, -0.017f, 0.077f, -0.022f)
                arcToRelative(17.005f, 17.005f, 0.0f, false, true, 2.029f, -0.257f)
                curveTo(19.716f, 5.966f, 21.9f, 5.428f, 22.0f, 7.0f)
                lineTo(22.0f, 9.0f)
                curveToRelative(-0.091f, 1.541f, -2.223f, 1.054f, -2.706f, 0.031f)
                curveToRelative(-0.479f, 0.035f, -1.0f, 0.1f, -1.5f, 0.187f)
                close()
                moveTo(12.5f, 11.0f)
                lineTo(8.823f, 11.0f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, true, -0.427f, 0.8f)
                lineTo(6.0f, 15.0f)
                lineTo(8.5f, 15.0f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, false, 1.6f, -0.8f)
                close()
            }
        }
        .build()
        return _motorcycle!!
    }

private var _motorcycle: ImageVector? = null
