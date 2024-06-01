package me.localx.icons.straight.outline

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

public val Icons.Outline.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                    moveTo(20.227f, 6.329f)
                    curveTo(21.2734f, 7.8444f, 21.878f, 9.6209f, 21.973f, 11.46f)
                    lineTo(19.237f, 9.533f)
                    lineTo(20.227f, 6.329f)
                    close()
                    moveTo(14.711f, 2.384f)
                    lineTo(12.0f, 4.354f)
                    lineTo(9.289f, 2.384f)
                    curveTo(11.0601f, 1.872f, 12.9399f, 1.872f, 14.711f, 2.384f)
                    close()
                    moveTo(14.5f, 11.056f)
                    lineTo(13.548f, 14.0f)
                    horizontalLineTo(10.448f)
                    lineTo(9.5f, 11.056f)
                    lineTo(12.0f, 9.236f)
                    lineTo(14.5f, 11.056f)
                    close()
                    moveTo(4.763f, 9.533f)
                    lineTo(2.027f, 11.46f)
                    curveTo(2.1222f, 9.621f, 2.7263f, 7.8447f, 3.772f, 6.329f)
                    lineTo(4.763f, 9.533f)
                    close()
                    moveTo(4.007f, 17.985f)
                    lineTo(7.482f, 18.0f)
                    lineTo(8.567f, 21.38f)
                    curveTo(6.7515f, 20.7116f, 5.1679f, 19.5326f, 4.007f, 17.985f)
                    close()
                    moveTo(10.843f, 21.927f)
                    lineTo(8.942f, 16.0f)
                    lineTo(2.831f, 15.982f)
                    curveTo(2.5286f, 15.2843f, 2.3075f, 14.5542f, 2.172f, 13.806f)
                    lineTo(7.1f, 10.331f)
                    lineTo(5.324f, 4.576f)
                    curveTo(5.8741f, 4.0774f, 6.4778f, 3.6414f, 7.124f, 3.276f)
                    lineTo(11.957f, 6.8f)
                    lineTo(7.144f, 10.3f)
                    lineTo(9.0f, 16.0f)
                    horizontalLineTo(15.0f)
                    lineTo(16.855f, 10.292f)
                    lineTo(12.043f, 6.8f)
                    lineTo(16.88f, 3.28f)
                    curveTo(17.5262f, 3.6455f, 18.1299f, 4.0814f, 18.68f, 4.58f)
                    lineTo(16.9f, 10.331f)
                    lineTo(21.831f, 13.805f)
                    curveTo(21.6956f, 14.5529f, 21.4744f, 15.2827f, 21.172f, 15.98f)
                    lineTo(15.058f, 16.0f)
                    lineTo(13.158f, 21.927f)
                    curveTo(12.3897f, 22.0243f, 11.6123f, 22.0243f, 10.844f, 21.927f)
                    horizontalLineTo(10.843f)
                    close()
                    moveTo(15.432f, 21.38f)
                    lineTo(16.518f, 18.0f)
                    lineTo(19.993f, 17.989f)
                    curveTo(18.8318f, 19.5358f, 17.2477f, 20.7135f, 15.432f, 21.38f)
                    close()
                }
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
