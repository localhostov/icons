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

public val Icons.Bold.Mars: ImageVector
    get() {
        if (_mars != null) {
            return _mars!!
        }
        _mars = Builder(name = "Mars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.498f, 0.0098f)
                    horizontalLineTo(16.0149f)
                    verticalLineTo(3.0006f)
                    horizontalLineTo(18.885f)
                    lineTo(14.2274f, 7.6582f)
                    curveTo(10.178f, 4.7765f, 4.5592f, 5.7232f, 1.6775f, 9.7726f)
                    curveTo(-1.2041f, 13.8221f, -0.2575f, 19.4408f, 3.792f, 22.3225f)
                    curveTo(7.8414f, 25.2042f, 13.4602f, 24.2575f, 16.3419f, 20.2081f)
                    curveTo(18.5645f, 17.0847f, 18.5645f, 12.8961f, 16.3419f, 9.7727f)
                    lineTo(20.9995f, 5.1151f)
                    verticalLineTo(7.9852f)
                    horizontalLineTo(23.9902f)
                    verticalLineTo(2.5021f)
                    curveTo(23.9903f, 1.1257f, 22.8744f, 0.0098f, 21.498f, 0.0098f)
                    close()
                    moveTo(9.0365f, 20.9451f)
                    curveTo(5.733f, 20.9451f, 3.055f, 18.2671f, 3.055f, 14.9636f)
                    curveTo(3.055f, 11.6601f, 5.733f, 8.9821f, 9.0365f, 8.9821f)
                    curveTo(12.34f, 8.9821f, 15.018f, 11.6601f, 15.018f, 14.9636f)
                    curveTo(15.0147f, 18.2657f, 12.3386f, 20.9418f, 9.0365f, 20.9451f)
                    close()
                }
            }
        }
        .build()
        return _mars!!
    }

private var _mars: ImageVector? = null
