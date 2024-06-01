package me.localx.icons.straight.bold

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

public val Icons.Bold.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.435f, 6.0801f)
                    curveTo(17.1725f, 5.8175f, 17.8459f, 5.4017f, 18.411f, 4.8601f)
                    curveTo(20.217f, 3.0541f, 19.991f, 0.0091f, 19.991f, 0.0091f)
                    curveTo(19.991f, 0.0091f, 16.946f, -0.2169f, 15.14f, 1.5891f)
                    curveTo(14.1372f, 2.7538f, 13.5405f, 4.2133f, 13.44f, 5.7471f)
                    curveTo(13.2437f, 3.7465f, 12.6667f, 1.8019f, 11.74f, 0.0181f)
                    lineTo(9.081f, 1.4081f)
                    curveTo(9.825f, 2.8379f, 10.2899f, 4.3963f, 10.451f, 6.0001f)
                    horizontalLineTo(8.659f)
                    curveTo(6.3185f, 6.0489f, 4.0928f, 7.0237f, 2.4697f, 8.7107f)
                    curveTo(0.8466f, 10.3977f, -0.0415f, 12.6594f, 0.0f, 15.0001f)
                    curveTo(-0.107f, 21.2521f, 6.377f, 25.8381f, 12.0f, 23.3001f)
                    curveTo(17.624f, 25.8371f, 24.106f, 21.2521f, 24.0f, 15.0001f)
                    curveTo(24.0292f, 12.8503f, 23.2791f, 10.7626f, 21.8885f, 9.1229f)
                    curveTo(20.4979f, 7.4832f, 18.5607f, 6.4024f, 16.435f, 6.0801f)
                    close()
                    moveTo(15.341f, 21.0001f)
                    curveTo(14.4257f, 21.001f, 13.5255f, 20.7665f, 12.727f, 20.3191f)
                    lineTo(12.0f, 19.9191f)
                    lineTo(11.273f, 20.3191f)
                    curveTo(7.545f, 22.4501f, 2.916f, 19.3491f, 3.0f, 15.0001f)
                    curveTo(2.9578f, 13.4548f, 3.5295f, 11.9557f, 4.5902f, 10.8312f)
                    curveTo(5.6509f, 9.7066f, 7.1139f, 9.0482f, 8.659f, 9.0001f)
                    horizontalLineTo(15.341f)
                    curveTo(22.82f, 9.2471f, 22.814f, 20.7561f, 15.341f, 21.0001f)
                    close()
                }
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
