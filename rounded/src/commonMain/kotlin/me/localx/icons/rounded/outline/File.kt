package me.localx.icons.rounded.outline

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

public val Icons.Outline.File: ImageVector
    get() {
        if (_file != null) {
            return _file!!
        }
        _file = Builder(name = "File", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9491f, 5.5365f)
                    lineTo(16.4651f, 2.0505f)
                    curveTo(15.8164f, 1.3987f, 15.045f, 0.8818f, 14.1953f, 0.53f)
                    curveTo(13.3457f, 0.1781f, 12.4347f, -0.0019f, 11.5151f, 5.0E-4f)
                    horizontalLineTo(7.0001f)
                    curveTo(5.6745f, 0.0021f, 4.4037f, 0.5294f, 3.4663f, 1.4667f)
                    curveTo(2.529f, 2.4041f, 2.0017f, 3.6749f, 2.0001f, 5.0005f)
                    verticalLineTo(19.0005f)
                    curveTo(2.0017f, 20.3261f, 2.529f, 21.597f, 3.4663f, 22.5343f)
                    curveTo(4.4037f, 23.4716f, 5.6745f, 23.9989f, 7.0001f, 24.0005f)
                    horizontalLineTo(17.0001f)
                    curveTo(18.3257f, 23.9989f, 19.5966f, 23.4716f, 20.5339f, 22.5343f)
                    curveTo(21.4712f, 21.597f, 21.9985f, 20.3261f, 22.0001f, 19.0005f)
                    verticalLineTo(10.4855f)
                    curveTo(22.0026f, 9.5659f, 21.8226f, 8.655f, 21.4705f, 7.8055f)
                    curveTo(21.1185f, 6.956f, 20.6014f, 6.1848f, 19.9491f, 5.5365f)
                    close()
                    moveTo(18.5351f, 6.9505f)
                    curveTo(18.8405f, 7.2647f, 19.1031f, 7.6177f, 19.3161f, 8.0005f)
                    horizontalLineTo(15.0001f)
                    curveTo(14.7349f, 8.0005f, 14.4806f, 7.8952f, 14.293f, 7.7076f)
                    curveTo(14.1055f, 7.5201f, 14.0001f, 7.2657f, 14.0001f, 7.0005f)
                    verticalLineTo(2.6845f)
                    curveTo(14.3831f, 2.8974f, 14.7364f, 3.1597f, 15.0511f, 3.4645f)
                    lineTo(18.5351f, 6.9505f)
                    close()
                    moveTo(20.0001f, 19.0005f)
                    curveTo(20.0001f, 19.7962f, 19.6841f, 20.5592f, 19.1214f, 21.1218f)
                    curveTo(18.5588f, 21.6844f, 17.7958f, 22.0005f, 17.0001f, 22.0005f)
                    horizontalLineTo(7.0001f)
                    curveTo(6.2045f, 22.0005f, 5.4414f, 21.6844f, 4.8788f, 21.1218f)
                    curveTo(4.3162f, 20.5592f, 4.0001f, 19.7962f, 4.0001f, 19.0005f)
                    verticalLineTo(5.0005f)
                    curveTo(4.0001f, 4.2049f, 4.3162f, 3.4418f, 4.8788f, 2.8792f)
                    curveTo(5.4414f, 2.3166f, 6.2045f, 2.0005f, 7.0001f, 2.0005f)
                    horizontalLineTo(11.5151f)
                    curveTo(11.6791f, 2.0005f, 11.8381f, 2.0325f, 12.0001f, 2.0475f)
                    verticalLineTo(7.0005f)
                    curveTo(12.0001f, 7.7962f, 12.3162f, 8.5592f, 12.8788f, 9.1218f)
                    curveTo(13.4414f, 9.6844f, 14.2045f, 10.0005f, 15.0001f, 10.0005f)
                    horizontalLineTo(19.9531f)
                    curveTo(19.9681f, 10.1625f, 20.0001f, 10.3205f, 20.0001f, 10.4855f)
                    verticalLineTo(19.0005f)
                    close()
                }
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
