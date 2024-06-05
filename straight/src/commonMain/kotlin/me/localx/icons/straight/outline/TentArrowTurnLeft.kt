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

public val Icons.Outline.TentArrowTurnLeft: ImageVector
    get() {
        if (_tentArrowTurnLeft != null) {
            return _tentArrowTurnLeft!!
        }
        _tentArrowTurnLeft = Builder(name = "TentArrowTurnLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.787f)
                lineTo(2.366f, 20.188f)
                curveToRelative(-0.474f, 0.778f, -0.491f, 1.716f, -0.045f, 2.509f)
                curveToRelative(0.451f, 0.804f, 1.312f, 1.303f, 2.247f, 1.303f)
                horizontalLineToRelative(14.865f)
                curveToRelative(0.935f, 0.0f, 1.795f, -0.499f, 2.246f, -1.302f)
                curveToRelative(0.445f, -0.793f, 0.43f, -1.731f, -0.087f, -2.573f)
                lineTo(12.0f, 6.787f)
                close()
                moveTo(10.556f, 22.0f)
                lineToRelative(1.444f, -2.186f)
                lineToRelative(1.443f, 2.186f)
                horizontalLineToRelative(-2.887f)
                close()
                moveTo(19.935f, 21.718f)
                curveToRelative(-0.048f, 0.085f, -0.192f, 0.282f, -0.503f, 0.282f)
                horizontalLineToRelative(-3.592f)
                lineToRelative(-3.841f, -5.814f)
                lineToRelative(-3.841f, 5.814f)
                horizontalLineToRelative(-3.592f)
                curveToRelative(-0.311f, 0.0f, -0.456f, -0.197f, -0.503f, -0.282f)
                curveToRelative(-0.05f, -0.088f, -0.114f, -0.263f, -0.005f, -0.464f)
                lineToRelative(7.94f, -11.042f)
                lineToRelative(7.926f, 11.016f)
                curveToRelative(0.129f, 0.212f, 0.062f, 0.397f, 0.01f, 0.489f)
                close()
                moveTo(23.999f, 10.0f)
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
            }
        }
        .build()
        return _tentArrowTurnLeft!!
    }

private var _tentArrowTurnLeft: ImageVector? = null
