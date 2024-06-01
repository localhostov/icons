package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.TimePast: ImageVector
    get() {
        if (_timePast != null) {
            return _timePast!!
        }
        _timePast = Builder(name = "TimePast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0f)
                    curveTo(9.0485f, 0.0052f, 6.2016f, 1.0941f, 4.0f, 3.06f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(5.143f)
                    curveTo(2.0005f, 5.6354f, 2.1964f, 6.1074f, 2.5445f, 6.4555f)
                    curveTo(2.8926f, 6.8036f, 3.3647f, 6.9995f, 3.857f, 7.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(4.86f)
                    curveTo(6.4828f, 3.3451f, 8.6301f, 2.3053f, 10.9347f, 2.0584f)
                    curveTo(13.2394f, 1.8115f, 15.5582f, 2.3728f, 17.4948f, 3.6464f)
                    curveTo(19.4313f, 4.92f, 20.8653f, 6.8267f, 21.5516f, 9.0406f)
                    curveTo(22.2379f, 11.2545f, 22.1338f, 13.638f, 21.2572f, 15.7837f)
                    curveTo(20.3805f, 17.9293f, 18.7857f, 19.7038f, 16.7455f, 20.8037f)
                    curveTo(14.7053f, 21.9037f, 12.3464f, 22.2607f, 10.0721f, 21.8139f)
                    curveTo(7.7977f, 21.367f, 5.7492f, 20.144f, 4.2769f, 18.3539f)
                    curveTo(2.8045f, 16.5638f, 1.9997f, 14.3178f, 2.0f, 12.0f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0f, 14.3734f, 0.7038f, 16.6935f, 2.0224f, 18.6668f)
                    curveTo(3.3409f, 20.6402f, 5.2151f, 22.1783f, 7.4078f, 23.0866f)
                    curveTo(9.6005f, 23.9948f, 12.0133f, 24.2324f, 14.3411f, 23.7694f)
                    curveTo(16.6689f, 23.3064f, 18.8071f, 22.1635f, 20.4853f, 20.4853f)
                    curveTo(22.1635f, 18.8071f, 23.3064f, 16.6689f, 23.7694f, 14.3411f)
                    curveTo(24.2324f, 12.0133f, 23.9948f, 9.6005f, 23.0866f, 7.4078f)
                    curveTo(22.1783f, 5.2151f, 20.6402f, 3.3409f, 18.6668f, 2.0224f)
                    curveTo(16.6935f, 0.7038f, 14.3734f, 0.0f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.0002f, 6.9994f)
                    verticalLineTo(12.4134f)
                    lineTo(14.2932f, 15.7064f)
                    lineTo(15.7072f, 14.2924f)
                    lineTo(13.0002f, 11.5854f)
                    verticalLineTo(6.9994f)
                    horizontalLineTo(11.0002f)
                    close()
                }
            }
        }
        .build()
        return _timePast!!
    }

private var _timePast: ImageVector? = null
