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

public val Icons.Outline.MarkerTime: ImageVector
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
                lineToRelative(-7.063f, -6.909f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 14.134f, -14.149f)
                arcToRelative(10.011f, 10.011f, 0.0f, false, true, 0.0f, 14.142f)
                close()
                moveTo(12.0f, 2.006f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.657f, 13.658f)
                lineToRelative(5.657f, 5.536f)
                lineToRelative(5.665f, -5.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.665f, -13.654f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.0f, -6.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, -6.0f, 6.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                close()
                moveTo(14.207f, 10.793f)
                lineTo(13.0f, 9.586f)
                verticalLineToRelative(-2.586f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.414f)
                lineToRelative(1.793f, 1.793f)
                close()
            }
        }
        .build()
        return _markerTime!!
    }

private var _markerTime: ImageVector? = null
