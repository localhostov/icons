package me.localx.icons.rounded.filled

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
                moveToRelative(23.9f, 11.437f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.9f, 1.563f)
                arcToRelative(11.878f, 11.878f, 0.0f, false, false, 3.759f, 8.712f)
                arcToRelative(4.84f, 4.84f, 0.0f, false, false, 3.354f, 1.288f)
                horizontalLineToRelative(9.767f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, false, 3.509f, -1.429f)
                arcToRelative(11.944f, 11.944f, 0.0f, false, false, 3.511f, -10.134f)
                close()
                moveTo(7.472f, 19.661f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.412f, 0.09f)
                arcToRelative(8.993f, 8.993f, 0.0f, false, true, 5.94f, -15.751f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, true, 2.249f, 0.283f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -0.5f, 1.938f)
                arcToRelative(6.994f, 6.994f, 0.0f, false, false, -6.367f, 12.028f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.09f, 1.412f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.512f, -3.926f)
                lineToRelative(3.781f, -3.781f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, 1.414f)
                lineToRelative(-3.781f, 3.781f)
                arcToRelative(1.976f, 1.976f, 0.0f, false, true, -1.926f, 2.512f)
                close()
                moveTo(17.94f, 19.751f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.322f, -1.5f)
                arcToRelative(6.992f, 6.992f, 0.0f, false, false, 2.161f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.938f, -0.5f)
                arcToRelative(9.094f, 9.094f, 0.0f, false, true, 0.283f, 2.249f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -3.06f, 6.751f)
                close()
            }
        }
        .build()
        return _dashboard!!
    }

private var _dashboard: ImageVector? = null
