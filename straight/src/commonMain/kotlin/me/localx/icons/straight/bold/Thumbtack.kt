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

public val Icons.Bold.Thumbtack: ImageVector
    get() {
        if (_thumbtack != null) {
            return _thumbtack!!
        }
        _thumbtack = Builder(name = "Thumbtack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.123f, 24.0f)
                lineToRelative(6.444f, -6.444f)
                lineToRelative(4.9f, 4.9f)
                lineToRelative(1.06f, -1.061f)
                arcToRelative(8.509f, 8.509f, 0.0f, false, false, 2.185f, -8.17f)
                lineToRelative(3.343f, -3.354f)
                lineToRelative(0.493f, 0.494f)
                arcToRelative(2.049f, 2.049f, 0.0f, false, false, 2.621f, 0.292f)
                arcToRelative(1.992f, 1.992f, 0.0f, false, false, 0.254f, -3.026f)
                lineTo(16.455f, 0.641f)
                arcTo(2.049f, 2.049f, 0.0f, false, false, 13.834f, 0.349f)
                arcToRelative(1.992f, 1.992f, 0.0f, false, false, -0.254f, 3.026f)
                lineToRelative(0.559f, 0.56f)
                lineTo(10.789f, 7.3f)
                lineToRelative(-0.064f, -0.02f)
                arcToRelative(8.485f, 8.485f, 0.0f, false, false, -8.114f, 2.2f)
                lineTo(1.55f, 10.537f)
                lineToRelative(4.9f, 4.9f)
                lineTo(0.0f, 21.877f)
                close()
                moveTo(9.884f, 10.153f)
                lineToRelative(1.733f, 0.561f)
                lineToRelative(4.64f, -4.654f)
                lineToRelative(1.677f, 1.681f)
                lineTo(13.3f, 12.391f)
                lineToRelative(0.525f, 1.642f)
                arcToRelative(5.479f, 5.479f, 0.0f, false, true, -0.51f, 4.024f)
                lineTo(5.942f, 10.686f)
                arcTo(5.388f, 5.388f, 0.0f, false, true, 9.884f, 10.153f)
                close()
            }
        }
        .build()
        return _thumbtack!!
    }

private var _thumbtack: ImageVector? = null
