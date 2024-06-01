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

public val Icons.Filled.IceSkate: ImageVector
    get() {
        if (_iceSkate != null) {
            return _iceSkate!!
        }
        _iceSkate = Builder(name = "IceSkate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 19.9996f)
                    curveTo(22.0f, 20.5301f, 21.7893f, 21.0388f, 21.4142f, 21.4139f)
                    curveTo(21.0391f, 21.7889f, 20.5304f, 21.9996f, 20.0f, 21.9996f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(17.9996f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(15.0996f)
                    curveTo(21.9973f, 13.7134f, 21.5157f, 12.3707f, 20.6369f, 11.2987f)
                    curveTo(19.758f, 10.2267f, 18.5358f, 9.4912f, 17.177f, 9.2166f)
                    lineTo(15.441f, 8.8686f)
                    lineTo(13.362f, 12.4066f)
                    lineTo(11.638f, 11.3936f)
                    lineTo(13.365f, 8.4536f)
                    curveTo(13.1318f, 8.4058f, 12.907f, 8.3236f, 12.698f, 8.2096f)
                    lineTo(9.674f, 10.0466f)
                    lineTo(8.635f, 8.3376f)
                    lineTo(11.685f, 6.4836f)
                    lineTo(11.637f, 5.9996f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(3.9996f)
                    horizontalLineTo(11.438f)
                    lineTo(11.3f, 2.5756f)
                    curveTo(11.2408f, 2.1613f, 11.0955f, 1.7639f, 10.8735f, 1.4091f)
                    curveTo(10.6515f, 1.0542f, 10.3578f, 0.7498f, 10.0111f, 0.5152f)
                    curveTo(9.6644f, 0.2807f, 9.2725f, 0.1214f, 8.8605f, 0.0474f)
                    curveTo(8.4485f, -0.0266f, 8.0256f, -0.0136f, 7.619f, 0.0856f)
                    lineTo(0.0f, 2.2436f)
                    verticalLineTo(17.9996f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(21.9996f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(23.9996f)
                    horizontalLineTo(20.0f)
                    curveTo(21.0609f, 23.9996f, 22.0783f, 23.5782f, 22.8284f, 22.8281f)
                    curveTo(23.5786f, 22.0779f, 24.0f, 21.0605f, 24.0f, 19.9996f)
                    horizontalLineTo(22.0f)
                    close()
                    moveTo(14.0f, 21.9996f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(17.9996f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(21.9996f)
                    close()
                }
            }
        }
        .build()
        return _iceSkate!!
    }

private var _iceSkate: ImageVector? = null
