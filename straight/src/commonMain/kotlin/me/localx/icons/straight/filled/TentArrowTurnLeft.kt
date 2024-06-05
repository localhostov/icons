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

public val Icons.Filled.TentArrowTurnLeft: ImageVector
    get() {
        if (_tentArrowTurnLeft != null) {
            return _tentArrowTurnLeft!!
        }
        _tentArrowTurnLeft = Builder(name = "TentArrowTurnLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                lineTo(2.994f, 6.0f)
                lineToRelative(2.302f, 2.291f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.583f, 6.406f)
                curveToRelative(-0.775f, -0.775f, -0.775f, -2.037f, 0.0f, -2.812f)
                lineTo(3.881f, 0.295f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.291f, 2.291f)
                horizontalLineToRelative(14.995f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
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
        return _tentArrowTurnLeft!!
    }

private var _tentArrowTurnLeft: ImageVector? = null
