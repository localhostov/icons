package me.localx.icons.straight.outline

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

public val Icons.Outline.MapMarker: ImageVector
    get() {
        if (_mapMarker != null) {
            return _mapMarker!!
        }
        _mapMarker = Builder(name = "MapMarker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 6.0f)
                close()
                moveTo(16.0f, 22.03f)
                lineToRelative(8.0f, 1.948f)
                lineTo(24.0f, 13.483f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.133f, -2.871f)
                lineToRelative(-2.1f, -0.7f)
                arcTo(8.037f, 8.037f, 0.0f, false, false, 20.0f, 8.006f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(8.111f, 8.111f, 0.0f, false, false, 0.1f, 1.212f)
                arcTo(2.992f, 2.992f, 0.0f, false, false, 0.0f, 12.0f)
                verticalLineToRelative(9.752f)
                lineToRelative(7.983f, 2.281f)
                close()
                moveTo(7.757f, 3.764f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.493f, 8.477f)
                lineTo(12.0f, 16.4f)
                lineTo(7.757f, 12.249f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -8.485f)
                close()
                moveTo(2.0f, 12.0f)
                arcToRelative(0.985f, 0.985f, 0.0f, false, true, 0.446f, -0.832f)
                arcTo(1.007f, 1.007f, 0.0f, false, true, 3.43f, 11.1f)
                lineToRelative(1.434f, 0.518f)
                arcToRelative(8.036f, 8.036f, 0.0f, false, false, 1.487f, 2.056f)
                lineTo(12.0f, 19.2f)
                lineToRelative(5.657f, -5.533f)
                arcToRelative(8.032f, 8.032f, 0.0f, false, false, 1.4f, -1.882f)
                lineToRelative(2.217f, 0.741f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.725f, 0.961f)
                verticalLineToRelative(7.949f)
                lineTo(16.0f, 19.97f)
                lineToRelative(-7.98f, 2.0f)
                lineTo(2.0f, 20.246f)
                close()
            }
        }
        .build()
        return _mapMarker!!
    }

private var _mapMarker: ImageVector? = null
