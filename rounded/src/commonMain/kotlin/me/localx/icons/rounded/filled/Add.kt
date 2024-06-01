package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.Add: ImageVector
    get() {
        if (_add != null) {
            return _add!!
        }
        _add = Builder(name = "Add", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
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
                    moveTo(16.0f, 13.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(16.0f)
                    curveTo(13.0f, 16.2652f, 12.8946f, 16.5196f, 12.7071f, 16.7071f)
                    curveTo(12.5196f, 16.8946f, 12.2652f, 17.0f, 12.0f, 17.0f)
                    curveTo(11.7348f, 17.0f, 11.4804f, 16.8946f, 11.2929f, 16.7071f)
                    curveTo(11.1054f, 16.5196f, 11.0f, 16.2652f, 11.0f, 16.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(8.0f)
                    curveTo(7.7348f, 13.0f, 7.4804f, 12.8946f, 7.2929f, 12.7071f)
                    curveTo(7.1054f, 12.5196f, 7.0f, 12.2652f, 7.0f, 12.0f)
                    curveTo(7.0f, 11.7348f, 7.1054f, 11.4804f, 7.2929f, 11.2929f)
                    curveTo(7.4804f, 11.1054f, 7.7348f, 11.0f, 8.0f, 11.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(8.0f)
                    curveTo(11.0f, 7.7348f, 11.1054f, 7.4804f, 11.2929f, 7.2929f)
                    curveTo(11.4804f, 7.1054f, 11.7348f, 7.0f, 12.0f, 7.0f)
                    curveTo(12.2652f, 7.0f, 12.5196f, 7.1054f, 12.7071f, 7.2929f)
                    curveTo(12.8946f, 7.4804f, 13.0f, 7.7348f, 13.0f, 8.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(16.0f)
                    curveTo(16.2652f, 11.0f, 16.5196f, 11.1054f, 16.7071f, 11.2929f)
                    curveTo(16.8946f, 11.4804f, 17.0f, 11.7348f, 17.0f, 12.0f)
                    curveTo(17.0f, 12.2652f, 16.8946f, 12.5196f, 16.7071f, 12.7071f)
                    curveTo(16.5196f, 12.8946f, 16.2652f, 13.0f, 16.0f, 13.0f)
                    close()
                }
            }
        }
        .build()
        return _add!!
    }

private var _add: ImageVector? = null
