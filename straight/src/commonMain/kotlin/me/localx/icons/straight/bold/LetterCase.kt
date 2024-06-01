package me.localx.icons.straight.bold

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

public val Icons.Bold.LetterCase: ImageVector
    get() {
        if (_letterCase != null) {
            return _letterCase!!
        }
        _letterCase = Builder(name = "LetterCase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.9999f, 7.0002f)
                    verticalLineTo(7.4242f)
                    curveTo(20.37f, 7.1453f, 19.6888f, 7.0009f, 18.9999f, 7.0002f)
                    curveTo(17.6738f, 7.0002f, 16.402f, 7.527f, 15.4644f, 8.4647f)
                    curveTo(14.5267f, 9.4024f, 13.9999f, 10.6742f, 13.9999f, 12.0002f)
                    curveTo(13.9999f, 13.3263f, 14.5267f, 14.5981f, 15.4644f, 15.5358f)
                    curveTo(16.402f, 16.4735f, 17.6738f, 17.0002f, 18.9999f, 17.0002f)
                    curveTo(19.6888f, 16.9996f, 20.37f, 16.8552f, 20.9999f, 16.5762f)
                    verticalLineTo(17.0002f)
                    horizontalLineTo(23.9999f)
                    verticalLineTo(7.0002f)
                    horizontalLineTo(20.9999f)
                    close()
                    moveTo(18.9999f, 14.0002f)
                    curveTo(18.6043f, 14.0002f, 18.2177f, 13.8829f, 17.8888f, 13.6632f)
                    curveTo(17.5599f, 13.4434f, 17.3035f, 13.1311f, 17.1521f, 12.7656f)
                    curveTo(17.0008f, 12.4002f, 16.9612f, 11.998f, 17.0383f, 11.6101f)
                    curveTo(17.1155f, 11.2221f, 17.306f, 10.8657f, 17.5857f, 10.586f)
                    curveTo(17.8654f, 10.3063f, 18.2218f, 10.1158f, 18.6097f, 10.0387f)
                    curveTo(18.9977f, 9.9615f, 19.3998f, 10.0011f, 19.7653f, 10.1525f)
                    curveTo(20.1307f, 10.3039f, 20.4431f, 10.5602f, 20.6628f, 10.8891f)
                    curveTo(20.8826f, 11.218f, 20.9999f, 11.6047f, 20.9999f, 12.0002f)
                    curveTo(20.9999f, 12.5307f, 20.7892f, 13.0394f, 20.4141f, 13.4145f)
                    curveTo(20.039f, 13.7895f, 19.5303f, 14.0002f, 18.9999f, 14.0002f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 16.9996f)
                    horizontalLineTo(3.354f)
                    lineTo(4.354f, 14.9996f)
                    horizontalLineTo(10.646f)
                    lineTo(11.646f, 16.9996f)
                    horizontalLineTo(15.0f)
                    lineTo(7.5f, 1.9996f)
                    lineTo(0.0f, 16.9996f)
                    close()
                    moveTo(5.854f, 11.9996f)
                    lineTo(7.5f, 8.7076f)
                    lineTo(9.146f, 11.9996f)
                    horizontalLineTo(5.854f)
                    close()
                }
            }
        }
        .build()
        return _letterCase!!
    }

private var _letterCase: ImageVector? = null
