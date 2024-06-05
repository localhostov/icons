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

public val Icons.Bold.Cherry: ImageVector
    get() {
        if (_cherry != null) {
            return _cherry!!
        }
        _cherry = Builder(name = "Cherry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.021f, 12.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, -1.85f, 0.309f)
                curveToRelative(-0.668f, -2.816f, -2.16f, -7.665f, -5.038f, -10.984f)
                lineTo(12.055f, 0.081f)
                lineToRelative(-1.138f, 1.19f)
                curveToRelative(-3.137f, 3.276f, -4.6f, 8.108f, -5.23f, 11.0f)
                arcTo(5.847f, 5.847f, 0.0f, false, false, 3.952f, 12.0f)
                curveTo(2.01f, 12.0f, 0.0f, 13.87f, 0.0f, 17.0f)
                arcToRelative(6.887f, 6.887f, 0.0f, false, false, 6.75f, 7.0f)
                arcTo(6.65f, 6.65f, 0.0f, false, false, 12.0f, 21.39f)
                arcTo(6.65f, 6.65f, 0.0f, false, false, 17.25f, 24.0f)
                arcTo(6.887f, 6.887f, 0.0f, false, false, 24.0f, 17.0f)
                curveTo(24.0f, 13.87f, 21.977f, 12.0f, 20.021f, 12.0f)
                close()
                moveTo(11.947f, 4.732f)
                arcTo(26.2f, 26.2f, 0.0f, false, true, 15.0f, 12.039f)
                curveToRelative(-0.181f, -0.017f, -0.358f, -0.039f, -0.551f, -0.039f)
                arcTo(3.556f, 3.556f, 0.0f, false, false, 12.0f, 13.092f)
                arcTo(3.592f, 3.592f, 0.0f, false, false, 9.521f, 12.0f)
                arcToRelative(5.923f, 5.923f, 0.0f, false, false, -0.7f, 0.049f)
                arcTo(22.5f, 22.5f, 0.0f, false, true, 11.947f, 4.732f)
                close()
                moveTo(6.75f, 21.0f)
                arcTo(3.886f, 3.886f, 0.0f, false, true, 3.0f, 17.0f)
                curveToRelative(0.0f, -1.509f, 0.742f, -2.0f, 0.952f, -2.0f)
                arcToRelative(2.906f, 2.906f, 0.0f, false, true, 1.778f, 0.6f)
                lineToRelative(1.018f, 0.9f)
                lineToRelative(1.018f, -0.9f)
                arcTo(2.787f, 2.787f, 0.0f, false, true, 9.521f, 15.0f)
                curveToRelative(0.215f, 0.0f, 0.979f, 0.491f, 0.979f, 2.0f)
                arcTo(3.886f, 3.886f, 0.0f, false, true, 6.75f, 21.0f)
                close()
                moveTo(17.25f, 21.0f)
                arcToRelative(3.886f, 3.886f, 0.0f, false, true, -3.75f, -4.0f)
                curveToRelative(0.0f, -1.509f, 0.742f, -2.0f, 0.952f, -2.0f)
                arcToRelative(2.906f, 2.906f, 0.0f, false, true, 1.778f, 0.6f)
                lineToRelative(1.018f, 0.9f)
                lineToRelative(1.018f, -0.9f)
                arcToRelative(2.787f, 2.787f, 0.0f, false, true, 1.755f, -0.6f)
                curveToRelative(0.215f, 0.0f, 0.979f, 0.491f, 0.979f, 2.0f)
                arcTo(3.886f, 3.886f, 0.0f, false, true, 17.25f, 21.0f)
                close()
            }
        }
        .build()
        return _cherry!!
    }

private var _cherry: ImageVector? = null
