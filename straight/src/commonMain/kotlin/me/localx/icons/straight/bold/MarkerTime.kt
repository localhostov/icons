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

public val Icons.Bold.MarkerTime: ImageVector
    get() {
        if (_markerTime != null) {
            return _markerTime!!
        }
        _markerTime = Builder(name = "MarkerTime", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 23.994f)
                lineToRelative(-7.06f, -6.905f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 14.131f, -14.154f)
                arcToRelative(10.008f, 10.008f, 0.0f, false, true, 0.0f, 14.141f)
                close()
                moveTo(12.0f, 3.006f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -4.95f, 11.95f)
                lineToRelative(4.95f, 4.844f)
                lineToRelative(4.962f, -4.853f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -4.962f, -11.941f)
                close()
                moveTo(13.939f, 14.061f)
                lineTo(10.5f, 10.621f)
                verticalLineToRelative(-4.621f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.379f)
                lineToRelative(2.561f, 2.56f)
                close()
            }
        }
        .build()
        return _markerTime!!
    }

private var _markerTime: ImageVector? = null
