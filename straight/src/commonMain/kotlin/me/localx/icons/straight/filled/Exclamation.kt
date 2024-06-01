package me.localx.icons.straight.filled

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

public val Icons.Filled.Exclamation: ImageVector
    get() {
        if (_exclamation != null) {
            return _exclamation!!
        }
        _exclamation = Builder(name = "Exclamation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 12.0f)
                    curveTo(24.0f, 14.3734f, 23.2962f, 16.6935f, 21.9776f, 18.6668f)
                    curveTo(20.6591f, 20.6402f, 18.7849f, 22.1783f, 16.5922f, 23.0866f)
                    curveTo(14.3995f, 23.9948f, 11.9867f, 24.2324f, 9.6589f, 23.7694f)
                    curveTo(7.3312f, 23.3064f, 5.1929f, 22.1635f, 3.5147f, 20.4853f)
                    curveTo(1.8365f, 18.8071f, 0.6936f, 16.6689f, 0.2306f, 14.3411f)
                    curveTo(-0.2324f, 12.0133f, 0.0052f, 9.6005f, 0.9135f, 7.4078f)
                    curveTo(1.8217f, 5.2151f, 3.3598f, 3.3409f, 5.3332f, 2.0224f)
                    curveTo(7.3066f, 0.7038f, 9.6266f, 0.0f, 12.0f, 0.0f)
                    curveTo(15.1815f, 0.0034f, 18.2318f, 1.2688f, 20.4815f, 3.5185f)
                    curveTo(22.7312f, 5.7682f, 23.9966f, 8.8185f, 24.0f, 12.0f)
                    close()
                    moveTo(13.0f, 5.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(5.0f)
                    close()
                    moveTo(13.0f, 17.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(17.0f)
                    close()
                }
            }
        }
        .build()
        return _exclamation!!
    }

private var _exclamation: ImageVector? = null
