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

public val Icons.Bold.AngleSmallDown: ImageVector
    get() {
        if (_angleSmallDown != null) {
            return _angleSmallDown!!
        }
        _angleSmallDown = Builder(name = "AngleSmallDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 16.0f)
                curveTo(11.3371f, 16.0004f, 10.7012f, 15.7374f, 10.2321f, 15.269f)
                lineTo(4.9391f, 9.975f)
                lineTo(7.0611f, 7.854f)
                lineTo(12.0001f, 12.793f)
                lineTo(16.9391f, 7.854f)
                lineTo(19.0611f, 9.975f)
                lineTo(13.7681f, 15.268f)
                curveTo(13.5359f, 15.5001f, 13.2603f, 15.6843f, 12.9569f, 15.8099f)
                curveTo(12.6535f, 15.9355f, 12.3284f, 16.0001f, 12.0001f, 16.0f)
                close()
            }
        }
        .build()
        return _angleSmallDown!!
    }

private var _angleSmallDown: ImageVector? = null
