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

public val Icons.Filled.Dashboard: ImageVector
    get() {
        if (_dashboard != null) {
            return _dashboard!!
        }
        _dashboard = Builder(name = "Dashboard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 1.0f)
                arcToRelative(11.995f, 11.995f, 0.0f, false, false, -6.888f, 21.818f)
                lineToRelative(0.259f, 0.182f)
                horizontalLineToRelative(13.258f)
                lineToRelative(0.259f, -0.182f)
                arcToRelative(11.995f, 11.995f, 0.0f, false, false, -6.888f, -21.818f)
                close()
                moveTo(6.06f, 19.751f)
                arcToRelative(8.987f, 8.987f, 0.0f, false, true, 9.811f, -14.864f)
                lineToRelative(-1.526f, 1.526f)
                arcToRelative(6.936f, 6.936f, 0.0f, false, false, -2.345f, -0.413f)
                arcToRelative(6.992f, 6.992f, 0.0f, false, false, -4.618f, 12.249f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.512f, -3.926f)
                lineToRelative(4.781f, -4.781f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-4.781f, 4.781f)
                arcToRelative(1.976f, 1.976f, 0.0f, false, true, -1.926f, 2.512f)
                close()
                moveTo(17.94f, 19.751f)
                lineTo(16.618f, 18.251f)
                arcToRelative(6.944f, 6.944f, 0.0f, false, false, 1.969f, -7.594f)
                lineToRelative(1.526f, -1.526f)
                arcToRelative(8.948f, 8.948f, 0.0f, false, true, -2.173f, 10.62f)
                close()
            }
        }
        .build()
        return _dashboard!!
    }

private var _dashboard: ImageVector? = null
