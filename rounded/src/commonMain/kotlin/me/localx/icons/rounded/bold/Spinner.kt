package me.localx.icons.rounded.bold

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

public val Icons.Bold.Spinner: ImageVector
    get() {
        if (_spinner != null) {
            return _spinner!!
        }
        _spinner = Builder(name = "Spinner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.5661f, 24.0f)
                    curveTo(5.9387f, 23.9982f, 0.5676f, 18.6242f, 0.5693f, 11.9968f)
                    curveTo(0.5711f, 5.3694f, 5.9451f, -0.0018f, 12.5725f, 0.0f)
                    curveTo(17.0987f, 0.0012f, 21.2392f, 2.5491f, 23.2801f, 6.589f)
                    curveTo(23.6408f, 7.3348f, 23.3286f, 8.2317f, 22.5828f, 8.5924f)
                    curveTo(21.8562f, 8.9438f, 20.9818f, 8.6573f, 20.6041f, 7.9439f)
                    curveTo(18.3642f, 3.5067f, 12.9513f, 1.7254f, 8.5141f, 3.9652f)
                    curveTo(4.0768f, 6.2051f, 2.2955f, 11.618f, 4.5353f, 16.0553f)
                    curveTo(6.7752f, 20.4925f, 12.1881f, 22.2739f, 16.6254f, 20.034f)
                    curveTo(18.3353f, 19.1709f, 19.7253f, 17.7846f, 20.5931f, 16.077f)
                    curveTo(20.969f, 15.3385f, 21.8722f, 15.0446f, 22.6106f, 15.4205f)
                    curveTo(23.349f, 15.7963f, 23.6429f, 16.6996f, 23.2671f, 17.438f)
                    curveTo(21.2274f, 21.4723f, 17.0868f, 24.0114f, 12.5661f, 24.0f)
                    close()
                }
            }
        }
        .build()
        return _spinner!!
    }

private var _spinner: ImageVector? = null
