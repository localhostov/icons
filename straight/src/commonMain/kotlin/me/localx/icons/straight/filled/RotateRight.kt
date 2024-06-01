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

public val Icons.Filled.RotateRight: ImageVector
    get() {
        if (_rotateRight != null) {
            return _rotateRight!!
        }
        _rotateRight = Builder(name = "RotateRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 12.0f)
                    curveTo(22.0003f, 14.3178f, 21.1955f, 16.5638f, 19.7231f, 18.3539f)
                    curveTo(18.2508f, 20.144f, 16.2023f, 21.367f, 13.928f, 21.8138f)
                    curveTo(11.6536f, 22.2607f, 9.2947f, 21.9037f, 7.2545f, 20.8037f)
                    curveTo(5.2143f, 19.7038f, 3.6195f, 17.9293f, 2.7429f, 15.7837f)
                    curveTo(1.8662f, 13.638f, 1.7621f, 11.2545f, 2.4484f, 9.0406f)
                    curveTo(3.1347f, 6.8267f, 4.5687f, 4.92f, 6.5052f, 3.6464f)
                    curveTo(8.4418f, 2.3728f, 10.7606f, 1.8115f, 13.0653f, 2.0584f)
                    curveTo(15.3699f, 2.3053f, 17.5172f, 3.3451f, 19.14f, 5.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(20.143f)
                    curveTo(20.6353f, 6.9995f, 21.1074f, 6.8036f, 21.4555f, 6.4555f)
                    curveTo(21.8037f, 6.1074f, 21.9995f, 5.6353f, 22.0f, 5.143f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(3.06f)
                    curveTo(17.9519f, 1.2282f, 15.3372f, 0.1547f, 12.5928f, 0.0189f)
                    curveTo(9.8484f, -0.1168f, 7.1405f, 0.6934f, 4.9216f, 2.3142f)
                    curveTo(2.7028f, 3.9351f, 1.1074f, 6.2683f, 0.4021f, 8.924f)
                    curveTo(-0.3032f, 11.5797f, -0.0758f, 14.397f, 1.0464f, 16.9052f)
                    curveTo(2.1686f, 19.4134f, 4.1177f, 21.4604f, 6.5678f, 22.7043f)
                    curveTo(9.0179f, 23.9482f, 11.8207f, 24.3135f, 14.5078f, 23.7393f)
                    curveTo(17.1949f, 23.1651f, 19.6035f, 21.686f, 21.3312f, 19.5494f)
                    curveTo(23.0589f, 17.4127f, 24.001f, 14.7478f, 24.0f, 12.0f)
                    horizontalLineTo(22.0f)
                    close()
                }
            }
        }
        .build()
        return _rotateRight!!
    }

private var _rotateRight: ImageVector? = null
