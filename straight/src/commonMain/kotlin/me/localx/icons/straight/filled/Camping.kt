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

public val Icons.Filled.Camping: ImageVector
    get() {
        if (_camping != null) {
            return _camping!!
        }
        _camping = Builder(name = "Camping", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9997f, 16.9191f)
                    lineTo(16.1837f, 24.0001f)
                    horizontalLineTo(7.8157f)
                    lineTo(11.9997f, 16.9191f)
                    close()
                    moveTo(23.5917f, 19.6001f)
                    lineTo(11.9997f, -0.0129f)
                    lineTo(0.4077f, 19.6001f)
                    curveTo(0.1453f, 20.0427f, 0.0048f, 20.5469f, 5.0E-4f, 21.0615f)
                    curveTo(-0.0039f, 21.576f, 0.1281f, 22.0825f, 0.383f, 22.5295f)
                    curveTo(0.6379f, 22.9765f, 1.0066f, 23.348f, 1.4516f, 23.6063f)
                    curveTo(1.8967f, 23.8646f, 2.4022f, 24.0005f, 2.9167f, 24.0001f)
                    horizontalLineTo(5.4917f)
                    lineTo(11.9997f, 12.9871f)
                    lineTo(18.5077f, 24.0001f)
                    horizontalLineTo(21.0827f)
                    curveTo(21.5973f, 24.0005f, 22.1028f, 23.8646f, 22.5478f, 23.6063f)
                    curveTo(22.9929f, 23.348f, 23.3616f, 22.9765f, 23.6165f, 22.5295f)
                    curveTo(23.8714f, 22.0825f, 24.0033f, 21.576f, 23.999f, 21.0615f)
                    curveTo(23.9947f, 20.5469f, 23.8541f, 20.0427f, 23.5917f, 19.6001f)
                    close()
                }
            }
        }
        .build()
        return _camping!!
    }

private var _camping: ImageVector? = null
