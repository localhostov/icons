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

public val Icons.Filled.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) {
            return _flowerTulip!!
        }
        _flowerTulip = Builder(name = "FlowerTulip", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.973f, 14.0002f)
                    curveTo(20.8312f, 13.9744f, 18.7319f, 14.5982f, 16.9516f, 15.7892f)
                    curveTo(15.1713f, 16.9802f, 13.7936f, 18.6827f, 13.0f, 20.6722f)
                    verticalLineTo(13.9102f)
                    curveTo(14.3965f, 13.6729f, 15.6643f, 12.9497f, 16.5792f, 11.8682f)
                    curveTo(17.4941f, 10.7868f, 17.9974f, 9.4167f, 18.0f, 8.0002f)
                    curveTo(18.0f, 4.0002f, 14.108f, 0.8722f, 14.085f, 0.8502f)
                    curveTo(12.8333f, 3.3932f, 12.1233f, 6.1685f, 12.0f, 9.0002f)
                    horizontalLineTo(10.0f)
                    curveTo(10.1201f, 5.8933f, 10.8893f, 2.8459f, 12.258f, 0.0542f)
                    curveTo(11.8177f, 0.0113f, 11.3733f, 0.0655f, 10.9561f, 0.2131f)
                    curveTo(10.539f, 0.3606f, 10.1594f, 0.5979f, 9.844f, 0.9082f)
                    curveTo(7.943f, 2.8482f, 6.0f, 5.2072f, 6.0f, 8.0002f)
                    curveTo(6.0026f, 9.4167f, 6.5059f, 10.7868f, 7.4208f, 11.8682f)
                    curveTo(8.3357f, 12.9497f, 9.6035f, 13.6729f, 11.0f, 13.9102f)
                    verticalLineTo(20.6722f)
                    curveTo(10.2064f, 18.6827f, 8.8287f, 16.9802f, 7.0484f, 15.7892f)
                    curveTo(5.2681f, 14.5982f, 3.1688f, 13.9744f, 1.027f, 14.0002f)
                    horizontalLineTo(0.0f)
                    lineTo(0.127f, 15.1242f)
                    curveTo(0.923f, 22.1452f, 7.5f, 24.0002f, 10.86f, 24.0002f)
                    horizontalLineTo(13.14f)
                    curveTo(16.505f, 24.0002f, 23.076f, 22.1452f, 23.871f, 15.1242f)
                    lineTo(24.0f, 14.0002f)
                    horizontalLineTo(22.973f)
                    close()
                }
            }
        }
        .build()
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
