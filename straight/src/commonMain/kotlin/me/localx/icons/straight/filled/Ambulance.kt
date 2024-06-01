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

public val Icons.Filled.Ambulance: ImageVector
    get() {
        if (_ambulance != null) {
            return _ambulance!!
        }
        _ambulance = Builder(name = "Ambulance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.761f, 11.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(17.05f)
                    curveTo(17.8236f, 4.0007f, 18.5805f, 4.2253f, 19.2293f, 4.6467f)
                    curveTo(19.878f, 5.0682f, 20.3909f, 5.6684f, 20.706f, 6.375f)
                    lineTo(22.761f, 11.0f)
                    close()
                    moveTo(24.0f, 15.062f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(7.0f)
                    curveTo(0.0f, 6.2043f, 0.3161f, 5.4412f, 0.8787f, 4.8786f)
                    curveTo(1.4413f, 4.316f, 2.2043f, 4.0f, 3.0f, 4.0f)
                    horizontalLineTo(10.0f)
                    lineTo(10.757f, 0.97f)
                    curveTo(10.8261f, 0.6926f, 10.986f, 0.4463f, 11.2113f, 0.2703f)
                    curveTo(11.4365f, 0.0943f, 11.7141f, -0.0013f, 12.0f, -0.0013f)
                    curveTo(12.2859f, -0.0013f, 12.5635f, 0.0943f, 12.7887f, 0.2703f)
                    curveTo(13.014f, 0.4463f, 13.1739f, 0.6926f, 13.243f, 0.97f)
                    lineTo(14.0f, 4.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(23.627f)
                    curveTo(23.8723f, 13.6598f, 23.9986f, 14.358f, 24.0f, 15.062f)
                    close()
                    moveTo(10.0f, 11.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(3.058f, 21.0f)
                    curveTo(3.0214f, 21.1642f, 3.0019f, 21.3318f, 3.0f, 21.5f)
                    curveTo(3.0f, 22.163f, 3.2634f, 22.7989f, 3.7322f, 23.2677f)
                    curveTo(4.2011f, 23.7366f, 4.837f, 24.0f, 5.5f, 24.0f)
                    curveTo(6.163f, 24.0f, 6.7989f, 23.7366f, 7.2678f, 23.2677f)
                    curveTo(7.7366f, 22.7989f, 8.0f, 22.163f, 8.0f, 21.5f)
                    curveTo(7.9981f, 21.3318f, 7.9786f, 21.1642f, 7.942f, 21.0f)
                    horizontalLineTo(3.058f)
                    close()
                    moveTo(17.058f, 21.0f)
                    curveTo(17.0214f, 21.1642f, 17.0019f, 21.3318f, 17.0f, 21.5f)
                    curveTo(17.0f, 22.163f, 17.2634f, 22.7989f, 17.7322f, 23.2677f)
                    curveTo(18.2011f, 23.7366f, 18.837f, 24.0f, 19.5f, 24.0f)
                    curveTo(20.163f, 24.0f, 20.7989f, 23.7366f, 21.2678f, 23.2677f)
                    curveTo(21.7366f, 22.7989f, 22.0f, 22.163f, 22.0f, 21.5f)
                    curveTo(21.9981f, 21.3318f, 21.9786f, 21.1642f, 21.942f, 21.0f)
                    horizontalLineTo(17.058f)
                    close()
                }
            }
        }
        .build()
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
