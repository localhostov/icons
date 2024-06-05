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

public val Icons.Bold.ChartConnected: ImageVector
    get() {
        if (_chartConnected != null) {
            return _chartConnected!!
        }
        _chartConnected = Builder(name = "ChartConnected", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                lineToRelative(-0.124f, 0.0f)
                arcTo(8.492f, 8.492f, 0.0f, false, false, 17.0f, 5.124f)
                curveToRelative(0.0f, -0.041f, 0.0f, -0.082f, 0.0f, -0.124f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 5.0f)
                curveToRelative(0.0f, 0.042f, 0.0f, 0.083f, 0.0f, 0.124f)
                arcTo(8.492f, 8.492f, 0.0f, false, false, 5.124f, 7.0f)
                lineTo(5.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 5.0f, 17.0f)
                lineToRelative(0.127f, 0.0f)
                arcTo(8.611f, 8.611f, 0.0f, false, false, 7.0f, 18.872f)
                curveToRelative(0.0f, 0.043f, 0.0f, 0.085f, 0.0f, 0.128f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                curveToRelative(0.0f, -0.041f, 0.0f, -0.081f, 0.0f, -0.121f)
                arcTo(8.434f, 8.434f, 0.0f, false, false, 18.879f, 17.0f)
                lineTo(19.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 19.0f, 7.0f)
                close()
                moveTo(8.989f, 8.989f)
                arcToRelative(4.989f, 4.989f, 0.0f, false, false, 6.022f, 0.0f)
                arcToRelative(4.989f, 4.989f, 0.0f, false, false, 0.0f, 6.022f)
                arcToRelative(4.989f, 4.989f, 0.0f, false, false, -6.022f, 0.0f)
                arcToRelative(4.989f, 4.989f, 0.0f, false, false, 0.0f, -6.022f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(3.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 12.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 21.0f)
                close()
                moveTo(19.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 14.0f)
                close()
            }
        }
        .build()
        return _chartConnected!!
    }

private var _chartConnected: ImageVector? = null
