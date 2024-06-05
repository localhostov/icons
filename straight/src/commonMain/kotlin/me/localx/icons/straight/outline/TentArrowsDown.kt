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

public val Icons.Outline.TentArrowsDown: ImageVector
    get() {
        if (_tentArrowsDown != null) {
            return _tentArrowsDown!!
        }
        _tentArrowsDown = Builder(name = "TentArrowsDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.787f)
                lineTo(2.366f, 20.188f)
                curveToRelative(-0.474f, 0.778f, -0.491f, 1.716f, -0.045f, 2.509f)
                curveToRelative(0.451f, 0.804f, 1.312f, 1.303f, 2.247f, 1.303f)
                horizontalLineToRelative(14.864f)
                curveToRelative(0.935f, 0.0f, 1.795f, -0.499f, 2.247f, -1.303f)
                curveToRelative(0.446f, -0.793f, 0.429f, -1.73f, -0.087f, -2.572f)
                lineTo(12.0f, 6.787f)
                close()
                moveTo(10.556f, 22.0f)
                lineToRelative(1.444f, -2.186f)
                lineToRelative(1.444f, 2.186f)
                horizontalLineToRelative(-2.888f)
                close()
                moveTo(19.935f, 21.718f)
                curveToRelative(-0.047f, 0.085f, -0.192f, 0.282f, -0.503f, 0.282f)
                horizontalLineToRelative(-3.592f)
                lineToRelative(-3.841f, -5.814f)
                lineToRelative(-3.841f, 5.814f)
                horizontalLineToRelative(-3.592f)
                curveToRelative(-0.311f, 0.0f, -0.456f, -0.197f, -0.503f, -0.282f)
                curveToRelative(-0.05f, -0.088f, -0.114f, -0.263f, -0.005f, -0.464f)
                lineToRelative(7.94f, -11.042f)
                lineToRelative(7.926f, 11.017f)
                curveToRelative(0.128f, 0.211f, 0.061f, 0.396f, 0.009f, 0.488f)
                close()
                moveTo(3.594f, 8.417f)
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
                moveTo(17.594f, 8.417f)
                lineToRelative(-3.298f, -3.299f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.291f, 2.291f)
                lineTo(18.001f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.006f)
                lineToRelative(2.291f, -2.302f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.298f, 3.299f)
                curveToRelative(-0.388f, 0.388f, -0.897f, 0.582f, -1.406f, 0.582f)
                reflectiveCurveToRelative(-1.019f, -0.194f, -1.406f, -0.582f)
                close()
            }
        }
        .build()
        return _tentArrowsDown!!
    }

private var _tentArrowsDown: ImageVector? = null
