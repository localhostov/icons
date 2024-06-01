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

public val Icons.Bold.PhonePause: ImageVector
    get() {
        if (_phonePause != null) {
            return _phonePause!!
        }
        _phonePause = Builder(name = "PhonePause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.942f, 23.942f)
                    curveTo(8.7909f, 23.942f, -0.0f, 15.152f, -0.0f, 8.0f)
                    curveTo(-0.0065f, 7.1984f, 0.1463f, 6.4035f, 0.4494f, 5.6614f)
                    curveTo(0.7526f, 4.9193f, 1.2001f, 4.2448f, 1.7659f, 3.677f)
                    lineTo(5.4099f, 0.033f)
                    lineTo(12.052f, 6.674f)
                    lineTo(9.089f, 9.637f)
                    curveTo(10.1503f, 11.9427f, 11.9975f, 13.7956f, 14.3f, 14.864f)
                    lineTo(17.274f, 11.891f)
                    lineTo(23.915f, 18.532f)
                    lineTo(20.27f, 22.178f)
                    curveTo(19.7012f, 22.7438f, 19.0258f, 23.1911f, 18.2828f, 23.4939f)
                    curveTo(17.5399f, 23.7968f, 16.7442f, 23.949f, 15.942f, 23.942f)
                    close()
                    moveTo(5.4099f, 4.275f)
                    lineTo(3.886f, 5.8f)
                    curveTo(3.6f, 6.0898f, 3.3745f, 6.4335f, 3.2224f, 6.8112f)
                    curveTo(3.0703f, 7.1888f, 2.9947f, 7.5929f, 2.9999f, 8.0f)
                    curveTo(2.9999f, 13.875f, 10.949f, 20.942f, 15.942f, 20.942f)
                    curveTo(16.349f, 20.9472f, 16.7529f, 20.8717f, 17.1306f, 20.7198f)
                    curveTo(17.5082f, 20.5679f, 17.8519f, 20.3426f, 18.142f, 20.057f)
                    lineTo(19.667f, 18.532f)
                    lineTo(17.267f, 16.132f)
                    lineTo(15.012f, 18.387f)
                    lineTo(14.103f, 18.041f)
                    curveTo(12.231f, 17.3442f, 10.5308f, 16.2532f, 9.1174f, 14.8419f)
                    curveTo(7.704f, 13.4306f, 6.6105f, 11.7319f, 5.911f, 9.861f)
                    lineTo(5.542f, 8.942f)
                    lineTo(7.8099f, 6.674f)
                    lineTo(5.4099f, 4.275f)
                    close()
                    moveTo(23.0f, 0.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(23.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(18.0f, 0.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
