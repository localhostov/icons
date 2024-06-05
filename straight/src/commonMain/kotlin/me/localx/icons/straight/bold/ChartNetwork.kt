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
                moveTo(21.0f, 13.0f)
                arcToRelative(2.991f, 2.991f, 0.0f, false, false, -2.078f, 0.837f)
                lineToRelative(-1.556f, -0.631f)
                arcTo(5.45f, 5.45f, 0.0f, false, false, 17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -6.54f, -5.4f)
                lineTo(9.928f, 4.761f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 7.173f, 5.982f)
                lineTo(8.28f, 7.953f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, false, -1.168f, 6.566f)
                lineTo(4.036f, 17.184f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 6.0f, 20.0f)
                arcToRelative(3.061f, 3.061f, 0.0f, false, false, -0.044f, -0.51f)
                lineToRelative(3.207f, -2.78f)
                arcToRelative(5.489f, 5.489f, 0.0f, false, false, 6.754f, -0.854f)
                lineToRelative(2.175f, 0.881f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 21.0f, 13.0f)
                close()
                moveTo(12.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 14.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 14.5f)
                close()
            }
        }
        .build()
        return _chartNetwork!!
    }

private var _chartNetwork: ImageVector? = null
