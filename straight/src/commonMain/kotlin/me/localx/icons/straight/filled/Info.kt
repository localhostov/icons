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

public val Icons.Filled.Info: ImageVector
    get() {
        if (_info != null) {
            return _info!!
        }
        _info = Builder(name = "Info", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                    moveTo(14.0f, 12.0f)
                    curveTo(14.0f, 11.4696f, 13.7893f, 10.9609f, 13.4142f, 10.5858f)
                    curveTo(13.0391f, 10.2107f, 12.5304f, 10.0f, 12.0f, 10.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(12.0f)
                    close()
                    moveTo(12.0f, 5.0f)
                    curveTo(11.7033f, 5.0f, 11.4133f, 5.088f, 11.1667f, 5.2528f)
                    curveTo(10.92f, 5.4176f, 10.7277f, 5.6519f, 10.6142f, 5.926f)
                    curveTo(10.5007f, 6.2001f, 10.471f, 6.5017f, 10.5288f, 6.7926f)
                    curveTo(10.5867f, 7.0836f, 10.7296f, 7.3509f, 10.9393f, 7.5607f)
                    curveTo(11.1491f, 7.7704f, 11.4164f, 7.9133f, 11.7074f, 7.9712f)
                    curveTo(11.9983f, 8.0291f, 12.2999f, 7.9994f, 12.574f, 7.8858f)
                    curveTo(12.8481f, 7.7723f, 13.0824f, 7.58f, 13.2472f, 7.3334f)
                    curveTo(13.412f, 7.0867f, 13.5f, 6.7967f, 13.5f, 6.5f)
                    curveTo(13.5f, 6.1022f, 13.342f, 5.7206f, 13.0607f, 5.4393f)
                    curveTo(12.7794f, 5.158f, 12.3978f, 5.0f, 12.0f, 5.0f)
                    close()
                }
            }
        }
        .build()
        return _info!!
    }

private var _info: ImageVector? = null
