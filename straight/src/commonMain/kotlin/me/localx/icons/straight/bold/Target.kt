package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0f)
                    curveTo(9.6266f, 0.0f, 7.3066f, 0.7038f, 5.3332f, 2.0224f)
                    curveTo(3.3598f, 3.3409f, 1.8217f, 5.2151f, 0.9135f, 7.4078f)
                    curveTo(0.0052f, 9.6005f, -0.2324f, 12.0133f, 0.2306f, 14.3411f)
                    curveTo(0.6936f, 16.6689f, 1.8365f, 18.8071f, 3.5147f, 20.4853f)
                    curveTo(5.1929f, 22.1635f, 7.3312f, 23.3064f, 9.6589f, 23.7694f)
                    curveTo(11.9867f, 24.2324f, 14.3995f, 23.9948f, 16.5922f, 23.0866f)
                    curveTo(18.7849f, 22.1783f, 20.6591f, 20.6402f, 21.9776f, 18.6668f)
                    curveTo(23.2962f, 16.6935f, 24.0f, 14.3734f, 24.0f, 12.0f)
                    curveTo(23.9966f, 8.8185f, 22.7312f, 5.7682f, 20.4815f, 3.5185f)
                    curveTo(18.2318f, 1.2688f, 15.1815f, 0.0034f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(13.5f, 20.865f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(20.865f)
                    curveTo(8.6612f, 20.5504f, 6.9652f, 19.6731f, 5.6461f, 18.3539f)
                    curveTo(4.3269f, 17.0348f, 3.4496f, 15.3388f, 3.135f, 13.5f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(10.5f)
                    horizontalLineTo(3.135f)
                    curveTo(3.4496f, 8.6612f, 4.3269f, 6.9652f, 5.6461f, 5.6461f)
                    curveTo(6.9652f, 4.3269f, 8.6612f, 3.4496f, 10.5f, 3.135f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(3.135f)
                    curveTo(15.3391f, 3.449f, 17.0353f, 4.3262f, 18.3546f, 5.6454f)
                    curveTo(19.6738f, 6.9647f, 20.551f, 8.6609f, 20.865f, 10.5f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(13.5f)
                    horizontalLineTo(20.865f)
                    curveTo(20.551f, 15.3391f, 19.6738f, 17.0353f, 18.3546f, 18.3546f)
                    curveTo(17.0353f, 19.6738f, 15.3391f, 20.551f, 13.5f, 20.865f)
                    close()
                    moveTo(13.5f, 10.5f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(13.5f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(13.5f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(10.5f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(10.5f)
                    close()
                }
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
