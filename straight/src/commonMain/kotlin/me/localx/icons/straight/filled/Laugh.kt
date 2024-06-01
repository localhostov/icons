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

public val Icons.Filled.Laugh: ImageVector
    get() {
        if (_laugh != null) {
            return _laugh!!
        }
        _laugh = Builder(name = "Laugh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                    moveTo(6.0f, 11.0f)
                    verticalLineTo(10.0f)
                    curveTo(6.0f, 9.4696f, 6.2107f, 8.9609f, 6.5858f, 8.5858f)
                    curveTo(6.9609f, 8.2107f, 7.4696f, 8.0f, 8.0f, 8.0f)
                    curveTo(8.5304f, 8.0f, 9.0392f, 8.2107f, 9.4142f, 8.5858f)
                    curveTo(9.7893f, 8.9609f, 10.0f, 9.4696f, 10.0f, 10.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(6.0f)
                    close()
                    moveTo(12.007f, 19.0f)
                    curveTo(9.028f, 19.0f, 7.0f, 16.0f, 7.0f, 14.0f)
                    horizontalLineTo(17.0f)
                    curveTo(16.9268f, 15.3011f, 16.3774f, 16.5297f, 15.4566f, 17.4518f)
                    curveTo(14.5358f, 18.3739f, 13.308f, 18.925f, 12.007f, 19.0f)
                    close()
                    moveTo(14.0f, 11.0f)
                    verticalLineTo(10.0f)
                    curveTo(14.0f, 9.4696f, 14.2107f, 8.9609f, 14.5858f, 8.5858f)
                    curveTo(14.9609f, 8.2107f, 15.4696f, 8.0f, 16.0f, 8.0f)
                    curveTo(16.5304f, 8.0f, 17.0391f, 8.2107f, 17.4142f, 8.5858f)
                    curveTo(17.7893f, 8.9609f, 18.0f, 9.4696f, 18.0f, 10.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(14.0f)
                    close()
                }
            }
        }
        .build()
        return _laugh!!
    }

private var _laugh: ImageVector? = null
