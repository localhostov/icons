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

public val Icons.Filled.Cheese: ImageVector
    get() {
        if (_cheese != null) {
            return _cheese!!
        }
        _cheese = Builder(name = "Cheese", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.1432f, 8.0389f)
                    curveTo(3.5385f, 5.2564f, 5.5576f, 2.8338f, 8.0432f, 0.9599f)
                    curveTo(8.8674f, 0.356f, 9.858f, 0.0212f, 10.8796f, 0.0013f)
                    curveTo(11.9012f, -0.0186f, 12.9041f, 0.2775f, 13.7512f, 0.8489f)
                    lineTo(23.3322f, 7.9999f)
                    horizontalLineTo(2.6732f)
                    curveTo(2.4959f, 8.0013f, 2.3188f, 8.0143f, 2.1432f, 8.0389f)
                    close()
                    moveTo(24.0002f, 9.9999f)
                    verticalLineTo(23.9999f)
                    horizontalLineTo(15.0002f)
                    curveTo(15.0002f, 23.2043f, 14.6841f, 22.4412f, 14.1215f, 21.8786f)
                    curveTo(13.5589f, 21.316f, 12.7958f, 20.9999f, 12.0002f, 20.9999f)
                    curveTo(11.2045f, 20.9999f, 10.4415f, 21.316f, 9.8789f, 21.8786f)
                    curveTo(9.3162f, 22.4412f, 9.0002f, 23.2043f, 9.0002f, 23.9999f)
                    horizontalLineTo(4.8332f)
                    curveTo(-0.5288f, 23.9219f, -0.6478f, 14.8419f, 0.8842f, 11.1309f)
                    curveTo(1.0445f, 10.7922f, 1.2978f, 10.5061f, 1.6146f, 10.3059f)
                    curveTo(1.9313f, 10.1056f, 2.2984f, 9.9995f, 2.6732f, 9.9999f)
                    horizontalLineTo(24.0002f)
                    close()
                    moveTo(9.0002f, 14.9999f)
                    curveTo(9.0002f, 14.4695f, 8.7895f, 13.9608f, 8.4144f, 13.5857f)
                    curveTo(8.0393f, 13.2106f, 7.5306f, 12.9999f, 7.0002f, 12.9999f)
                    curveTo(6.4697f, 12.9999f, 5.961f, 13.2106f, 5.586f, 13.5857f)
                    curveTo(5.2109f, 13.9608f, 5.0002f, 14.4695f, 5.0002f, 14.9999f)
                    curveTo(5.0002f, 15.5304f, 5.2109f, 16.0391f, 5.586f, 16.4141f)
                    curveTo(5.961f, 16.7892f, 6.4697f, 16.9999f, 7.0002f, 16.9999f)
                    curveTo(7.5306f, 16.9999f, 8.0393f, 16.7892f, 8.4144f, 16.4141f)
                    curveTo(8.7895f, 16.0391f, 9.0002f, 15.5304f, 9.0002f, 14.9999f)
                    close()
                    moveTo(20.0002f, 17.9999f)
                    curveTo(20.0002f, 17.4695f, 19.7895f, 16.9608f, 19.4144f, 16.5857f)
                    curveTo(19.0393f, 16.2106f, 18.5306f, 15.9999f, 18.0002f, 15.9999f)
                    curveTo(17.4697f, 15.9999f, 16.961f, 16.2106f, 16.586f, 16.5857f)
                    curveTo(16.2109f, 16.9608f, 16.0002f, 17.4695f, 16.0002f, 17.9999f)
                    curveTo(16.0002f, 18.5304f, 16.2109f, 19.0391f, 16.586f, 19.4141f)
                    curveTo(16.961f, 19.7892f, 17.4697f, 19.9999f, 18.0002f, 19.9999f)
                    curveTo(18.5306f, 19.9999f, 19.0393f, 19.7892f, 19.4144f, 19.4141f)
                    curveTo(19.7895f, 19.0391f, 20.0002f, 18.5304f, 20.0002f, 17.9999f)
                    close()
                }
            }
        }
        .build()
        return _cheese!!
    }

private var _cheese: ImageVector? = null
