package me.localx.icons.straight.filled

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

public val Icons.Filled.MarkerTime: ImageVector
    get() {
        if (_markerTime != null) {
            return _markerTime!!
        }
        _markerTime = Builder(name = "MarkerTime", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, 5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                close()
                moveTo(12.793f, 12.207f)
                lineTo(11.0f, 10.414f)
                verticalLineToRelative(-3.414f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(1.207f, 1.207f)
                close()
                moveTo(19.071f, 2.936f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -14.134f, 14.149f)
                lineToRelative(7.063f, 6.909f)
                lineToRelative(7.071f, -6.916f)
                arcToRelative(10.011f, 10.011f, 0.0f, false, false, 0.0f, -14.142f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 7.0f, -7.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, true, -7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _markerTime!!
    }

private var _markerTime: ImageVector? = null
