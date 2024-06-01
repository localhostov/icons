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

public val Icons.Filled.Utensils: ImageVector
    get() {
        if (_utensils != null) {
            return _utensils!!
        }
        _utensils = Builder(name = "Utensils", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.6092f, 0.8119f)
                    curveTo(18.3591f, 0.4732f, 18.0084f, 0.222f, 17.6072f, 0.0942f)
                    curveTo(17.2061f, -0.0336f, 16.7748f, -0.0315f, 16.3748f, 0.1001f)
                    curveTo(15.9749f, 0.2318f, 15.6267f, 0.4863f, 15.3798f, 0.8274f)
                    curveTo(15.133f, 1.1686f, 15.0001f, 1.5789f, 15.0002f, 1.9999f)
                    verticalLineTo(23.9999f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(19.6659f)
                    curveTo(21.8002f, 14.4139f, 24.4002f, 8.1559f, 18.6092f, 0.8119f)
                    close()
                    moveTo(12.0002f, -1.0E-4f)
                    verticalLineTo(8.9999f)
                    curveTo(12.0002f, 9.7956f, 11.6841f, 10.5587f, 11.1215f, 11.1213f)
                    curveTo(10.5589f, 11.6839f, 9.7958f, 11.9999f, 9.0001f, 11.9999f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(23.9999f)
                    horizontalLineTo(6.0002f)
                    verticalLineTo(11.9999f)
                    horizontalLineTo(5.0002f)
                    curveTo(4.2045f, 11.9999f, 3.4414f, 11.6839f, 2.8788f, 11.1213f)
                    curveTo(2.3162f, 10.5587f, 2.0001f, 9.7956f, 2.0001f, 8.9999f)
                    verticalLineTo(-1.0E-4f)
                    horizontalLineTo(4.0002f)
                    verticalLineTo(8.9999f)
                    curveTo(4.0002f, 9.2652f, 4.1055f, 9.5195f, 4.293f, 9.7071f)
                    curveTo(4.4806f, 9.8946f, 4.7349f, 9.9999f, 5.0002f, 9.9999f)
                    horizontalLineTo(6.0002f)
                    verticalLineTo(-1.0E-4f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(9.9999f)
                    horizontalLineTo(9.0001f)
                    curveTo(9.2654f, 9.9999f, 9.5197f, 9.8946f, 9.7073f, 9.7071f)
                    curveTo(9.8948f, 9.5195f, 10.0002f, 9.2652f, 10.0002f, 8.9999f)
                    verticalLineTo(-1.0E-4f)
                    horizontalLineTo(12.0002f)
                    close()
                }
            }
        }
        .build()
        return _utensils!!
    }

private var _utensils: ImageVector? = null
