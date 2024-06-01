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

public val Icons.Outline.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                    moveTo(15.254f, 7.332f)
                    curveTo(14.0194f, 5.8274f, 13.2544f, 3.993f, 13.054f, 2.057f)
                    curveTo(14.9865f, 2.2604f, 16.8171f, 3.0252f, 18.32f, 4.257f)
                    lineTo(15.254f, 7.332f)
                    close()
                    moveTo(13.836f, 8.75f)
                    lineTo(12.0f, 10.586f)
                    lineTo(5.676f, 4.262f)
                    curveTo(7.2081f, 3.0054f, 9.0803f, 2.2345f, 11.053f, 2.048f)
                    curveTo(11.2624f, 4.5167f, 12.2351f, 6.8591f, 13.836f, 8.75f)
                    close()
                    moveTo(10.586f, 12.0f)
                    lineTo(8.749f, 13.837f)
                    curveTo(6.8592f, 12.2354f, 4.5174f, 11.2623f, 2.049f, 11.053f)
                    curveTo(2.2352f, 9.0804f, 3.0057f, 7.2082f, 4.262f, 5.676f)
                    lineTo(10.586f, 12.0f)
                    close()
                    moveTo(7.332f, 15.254f)
                    lineTo(4.262f, 18.324f)
                    curveTo(3.0303f, 16.8211f, 2.2655f, 14.9905f, 2.062f, 13.058f)
                    curveTo(3.9958f, 13.2582f, 5.8283f, 14.0217f, 7.332f, 15.254f)
                    close()
                    moveTo(8.746f, 16.668f)
                    curveTo(9.9806f, 18.1726f, 10.7456f, 20.007f, 10.946f, 21.943f)
                    curveTo(9.013f, 21.7381f, 7.1823f, 20.9716f, 5.68f, 19.738f)
                    lineTo(8.746f, 16.668f)
                    close()
                    moveTo(10.163f, 15.251f)
                    lineTo(12.0f, 13.414f)
                    lineTo(18.324f, 19.738f)
                    curveTo(16.7922f, 20.9951f, 14.9198f, 21.766f, 12.947f, 21.952f)
                    curveTo(12.7379f, 19.4833f, 11.7648f, 17.1411f, 10.163f, 15.251f)
                    close()
                    moveTo(13.414f, 12.0f)
                    lineTo(15.25f, 10.164f)
                    curveTo(17.1404f, 11.7645f, 19.482f, 12.7372f, 21.95f, 12.947f)
                    curveTo(21.7635f, 14.9197f, 20.9926f, 16.7919f, 19.736f, 18.324f)
                    lineTo(13.414f, 12.0f)
                    close()
                    moveTo(16.668f, 8.746f)
                    lineTo(19.738f, 5.676f)
                    curveTo(20.9716f, 7.1783f, 21.7381f, 9.009f, 21.943f, 10.942f)
                    curveTo(20.0076f, 10.7423f, 18.1734f, 9.9788f, 16.668f, 8.746f)
                    close()
                }
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
