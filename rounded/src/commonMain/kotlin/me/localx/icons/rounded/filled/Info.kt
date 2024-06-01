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
                    moveTo(12.0f, 24.0f)
                    curveTo(14.3734f, 24.0f, 16.6935f, 23.2962f, 18.6668f, 21.9776f)
                    curveTo(20.6402f, 20.6591f, 22.1783f, 18.7849f, 23.0866f, 16.5922f)
                    curveTo(23.9948f, 14.3995f, 24.2324f, 11.9867f, 23.7694f, 9.6589f)
                    curveTo(23.3064f, 7.3312f, 22.1635f, 5.1929f, 20.4853f, 3.5147f)
                    curveTo(18.8071f, 1.8365f, 16.6689f, 0.6936f, 14.3411f, 0.2306f)
                    curveTo(12.0133f, -0.2324f, 9.6005f, 0.0052f, 7.4078f, 0.9135f)
                    curveTo(5.2151f, 1.8217f, 3.3409f, 3.3598f, 2.0224f, 5.3332f)
                    curveTo(0.7038f, 7.3066f, 0.0f, 9.6266f, 0.0f, 12.0f)
                    curveTo(0.0034f, 15.1815f, 1.2688f, 18.2318f, 3.5185f, 20.4815f)
                    curveTo(5.7682f, 22.7312f, 8.8185f, 23.9966f, 12.0f, 24.0f)
                    close()
                    moveTo(12.0f, 5.0f)
                    curveTo(12.2967f, 5.0f, 12.5867f, 5.088f, 12.8334f, 5.2528f)
                    curveTo(13.08f, 5.4176f, 13.2723f, 5.6519f, 13.3858f, 5.926f)
                    curveTo(13.4994f, 6.2001f, 13.5291f, 6.5017f, 13.4712f, 6.7926f)
                    curveTo(13.4133f, 7.0836f, 13.2704f, 7.3509f, 13.0607f, 7.5607f)
                    curveTo(12.8509f, 7.7704f, 12.5836f, 7.9133f, 12.2926f, 7.9712f)
                    curveTo(12.0017f, 8.0291f, 11.7001f, 7.9994f, 11.426f, 7.8858f)
                    curveTo(11.1519f, 7.7723f, 10.9176f, 7.58f, 10.7528f, 7.3334f)
                    curveTo(10.588f, 7.0867f, 10.5f, 6.7967f, 10.5f, 6.5f)
                    curveTo(10.5f, 6.1022f, 10.658f, 5.7207f, 10.9393f, 5.4393f)
                    curveTo(11.2206f, 5.158f, 11.6022f, 5.0f, 12.0f, 5.0f)
                    close()
                    moveTo(11.0f, 10.0f)
                    horizontalLineTo(12.0f)
                    curveTo(12.5304f, 10.0f, 13.0391f, 10.2107f, 13.4142f, 10.5858f)
                    curveTo(13.7893f, 10.9609f, 14.0f, 11.4696f, 14.0f, 12.0f)
                    verticalLineTo(18.0f)
                    curveTo(14.0f, 18.2652f, 13.8946f, 18.5196f, 13.7071f, 18.7071f)
                    curveTo(13.5196f, 18.8946f, 13.2652f, 19.0f, 13.0f, 19.0f)
                    curveTo(12.7348f, 19.0f, 12.4804f, 18.8946f, 12.2929f, 18.7071f)
                    curveTo(12.1054f, 18.5196f, 12.0f, 18.2652f, 12.0f, 18.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(11.0f)
                    curveTo(10.7348f, 12.0f, 10.4804f, 11.8946f, 10.2929f, 11.7071f)
                    curveTo(10.1054f, 11.5196f, 10.0f, 11.2652f, 10.0f, 11.0f)
                    curveTo(10.0f, 10.7348f, 10.1054f, 10.4804f, 10.2929f, 10.2929f)
                    curveTo(10.4804f, 10.1054f, 10.7348f, 10.0f, 11.0f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _info!!
    }

private var _info: ImageVector? = null
