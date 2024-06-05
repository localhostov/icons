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

public val Icons.Bold.ChartNetwork: ImageVector
    get() {
        if (_chartNetwork != null) {
            return _chartNetwork!!
        }
        _chartNetwork = Builder(name = "ChartNetwork", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 13.5f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, -1.653f, 0.5f)
                lineToRelative(-1.019f, -0.509f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -7.894f, -7.8f)
                lineToRelative(-0.6f, -1.081f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 7.171f, 6.0f)
                lineToRelative(0.6f, 1.074f)
                arcToRelative(6.49f, 6.49f, 0.0f, false, false, -1.322f, 8.3f)
                lineTo(3.64f, 18.069f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 5.861f, 20.1f)
                lineToRelative(2.693f, -2.586f)
                arcToRelative(6.49f, 6.49f, 0.0f, false, false, 8.429f, -1.34f)
                lineToRelative(1.023f, 0.511f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 21.0f, 13.5f)
                close()
                moveTo(12.0f, 15.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 15.5f, 12.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 15.5f)
                close()
            }
        }
        .build()
        return _chartNetwork!!
    }

private var _chartNetwork: ImageVector? = null
