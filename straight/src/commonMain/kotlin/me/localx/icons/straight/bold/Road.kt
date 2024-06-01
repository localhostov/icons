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

public val Icons.Bold.Road: ImageVector
    get() {
        if (_road != null) {
            return _road!!
        }
        _road = Builder(name = "Road", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0f, 0.0f)
                    horizontalLineTo(7.0f)
                    curveTo(6.1746f, -2.0E-4f, 5.3757f, 0.2914f, 4.7444f, 0.8231f)
                    curveTo(4.1131f, 1.3548f, 3.6901f, 2.0926f, 3.55f, 2.906f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.033f)
                    lineTo(20.451f, 2.892f)
                    curveTo(20.3079f, 2.081f, 19.8835f, 1.3464f, 19.2523f, 0.8174f)
                    curveTo(18.6211f, 0.2885f, 17.8235f, -0.001f, 17.0f, 0.0f)
                    close()
                    moveTo(3.543f, 21.0f)
                    lineTo(6.506f, 3.414f)
                    curveTo(6.5263f, 3.2978f, 6.587f, 3.1925f, 6.6774f, 3.1168f)
                    curveTo(6.7678f, 3.041f, 6.8821f, 2.9997f, 7.0f, 3.0f)
                    horizontalLineTo(17.0f)
                    curveTo(17.1154f, 2.9997f, 17.2274f, 3.0394f, 17.3169f, 3.1124f)
                    curveTo(17.4064f, 3.1853f, 17.4679f, 3.2869f, 17.491f, 3.4f)
                    lineTo(20.48f, 21.0f)
                    horizontalLineTo(3.543f)
                    close()
                    moveTo(10.5f, 4.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(4.0f)
                    close()
                    moveTo(10.5f, 10.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(10.0f)
                    close()
                    moveTo(10.5f, 16.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(16.0f)
                    close()
                }
            }
        }
        .build()
        return _road!!
    }

private var _road: ImageVector? = null
