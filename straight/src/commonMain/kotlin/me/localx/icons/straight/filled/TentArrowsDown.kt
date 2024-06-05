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

public val Icons.Filled.TentArrowsDown: ImageVector
    get() {
        if (_tentArrowsDown != null) {
            return _tentArrowsDown!!
        }
        _tentArrowsDown = Builder(name = "TentArrowsDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.594f, 8.417f)
                lineTo(0.295f, 5.119f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.291f, 2.291f)
                lineTo(4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.006f)
                lineToRelative(2.291f, -2.302f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.298f, 3.299f)
                curveToRelative(-0.388f, 0.388f, -0.897f, 0.582f, -1.406f, 0.582f)
                reflectiveCurveToRelative(-1.019f, -0.194f, -1.406f, -0.582f)
                close()
                moveTo(19.0f, 8.999f)
                curveToRelative(0.509f, 0.0f, 1.019f, -0.194f, 1.406f, -0.582f)
                lineToRelative(3.298f, -3.299f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.291f, 2.302f)
                lineTo(19.999f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.995f)
                lineToRelative(-2.291f, -2.291f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.298f, 3.299f)
                curveToRelative(0.388f, 0.388f, 0.897f, 0.582f, 1.406f, 0.582f)
                close()
                moveTo(9.113f, 24.0f)
                horizontalLineToRelative(5.775f)
                lineToRelative(-2.887f, -4.371f)
                lineToRelative(-2.887f, 4.371f)
                close()
                moveTo(12.0f, 6.241f)
                lineTo(2.366f, 20.188f)
                curveToRelative(-0.474f, 0.778f, -0.491f, 1.716f, -0.045f, 2.509f)
                curveToRelative(0.451f, 0.804f, 1.312f, 1.303f, 2.247f, 1.303f)
                horizontalLineToRelative(2.148f)
                lineToRelative(5.284f, -8.0f)
                lineToRelative(5.285f, 8.0f)
                horizontalLineToRelative(2.148f)
                curveToRelative(0.935f, 0.0f, 1.795f, -0.499f, 2.246f, -1.302f)
                curveToRelative(0.445f, -0.793f, 0.43f, -1.731f, -0.076f, -2.558f)
                lineTo(12.0f, 6.241f)
                close()
            }
        }
        .build()
        return _tentArrowsDown!!
    }

private var _tentArrowsDown: ImageVector? = null
