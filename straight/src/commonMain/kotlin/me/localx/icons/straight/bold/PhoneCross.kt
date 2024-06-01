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

public val Icons.Bold.PhoneCross: ImageVector
    get() {
        if (_phoneCross != null) {
            return _phoneCross!!
        }
        _phoneCross = Builder(name = "PhoneCross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.3269f, 14.891f)
                    curveTo(12.0265f, 13.8204f, 10.1814f, 11.9672f, 9.1209f, 9.662f)
                    lineTo(12.0829f, 6.7f)
                    lineTo(5.4419f, 0.058f)
                    lineTo(1.8f, 3.7f)
                    curveTo(-5.5901f, 11.608f, 12.3829f, 29.589f, 20.2999f, 22.2f)
                    lineTo(23.9459f, 18.555f)
                    lineTo(17.2999f, 11.916f)
                    lineTo(14.3269f, 14.891f)
                    close()
                    moveTo(18.1739f, 20.083f)
                    curveTo(13.4249f, 24.417f, -0.5581f, 11.343f, 3.9179f, 5.824f)
                    lineTo(5.4419f, 4.3f)
                    lineTo(7.8419f, 6.7f)
                    lineTo(5.5729f, 8.967f)
                    lineTo(5.9419f, 9.886f)
                    curveTo(6.6423f, 11.7579f, 7.737f, 13.4572f, 9.1518f, 14.8688f)
                    curveTo(10.5666f, 16.2803f, 12.2685f, 17.3711f, 14.1419f, 18.067f)
                    lineTo(15.0499f, 18.414f)
                    lineTo(17.2999f, 16.158f)
                    lineTo(19.6999f, 18.558f)
                    lineTo(18.1739f, 20.083f)
                    close()
                    moveTo(21.1369f, 4.983f)
                    lineTo(23.9679f, 7.813f)
                    lineTo(21.8469f, 9.936f)
                    lineTo(19.0159f, 7.105f)
                    lineTo(16.1859f, 9.936f)
                    lineTo(14.0639f, 7.814f)
                    lineTo(16.8999f, 4.984f)
                    lineTo(14.0639f, 2.153f)
                    lineTo(16.1859f, 0.032f)
                    lineTo(19.0159f, 2.863f)
                    lineTo(21.8469f, 0.032f)
                    lineTo(23.9679f, 2.153f)
                    lineTo(21.1369f, 4.983f)
                    close()
                }
            }
        }
        .build()
        return _phoneCross!!
    }

private var _phoneCross: ImageVector? = null
