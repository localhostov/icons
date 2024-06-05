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

public val Icons.Bold.MapMarker: ImageVector
    get() {
        if (_mapMarker != null) {
            return _mapMarker!!
        }
        _mapMarker = Builder(name = "MapMarker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 8.0f)
                close()
                moveTo(7.97f, 24.06f)
                lineTo(0.0f, 21.608f)
                lineTo(0.0f, 12.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.032f, 8.544f)
                arcToRelative(7.992f, 7.992f, 0.0f, true, true, 15.807f, 1.03f)
                lineToRelative(1.686f, 0.564f)
                arcTo(3.493f, 3.493f, 0.0f, false, true, 24.0f, 13.483f)
                lineTo(24.0f, 24.114f)
                lineToRelative(-8.483f, -2.066f)
                close()
                moveTo(8.464f, 11.536f)
                lineTo(12.0f, 14.993f)
                lineToRelative(3.547f, -3.469f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -7.083f, 0.012f)
                close()
                moveTo(3.0f, 19.392f)
                lineToRelative(5.03f, 1.547f)
                lineToRelative(7.453f, -1.987f)
                lineTo(21.0f, 20.3f)
                lineTo(21.0f, 13.483f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.362f, -0.48f)
                lineToRelative(-1.931f, -0.645f)
                arcToRelative(8.032f, 8.032f, 0.0f, false, true, -1.05f, 1.3f)
                lineTo(12.0f, 19.189f)
                lineTo(6.355f, 13.668f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.236f, -1.61f)
                lineTo(3.76f, 11.567f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.537f, 0.019f)
                arcTo(0.489f, 0.489f, 0.0f, false, false, 3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _mapMarker!!
    }

private var _mapMarker: ImageVector? = null
