package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.PhoneCross: ImageVector
    get() {
        if (_phoneCross != null) {
            return _phoneCross!!
        }
        _phoneCross = Builder(name = "PhoneCross", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.327f, 14.891f)
                arcTo(10.7f, 10.7f, 0.0f, false, true, 9.121f, 9.662f)
                lineTo(12.083f, 6.7f)
                lineTo(5.442f, 0.058f)
                lineTo(1.8f, 3.7f)
                curveToRelative(-7.39f, 7.908f, 10.583f, 25.889f, 18.5f, 18.5f)
                lineToRelative(3.646f, -3.645f)
                lineTo(17.3f, 11.916f)
                close()
                moveTo(18.174f, 20.083f)
                curveTo(13.425f, 24.417f, -0.558f, 11.343f, 3.918f, 5.824f)
                lineTo(5.442f, 4.3f)
                lineToRelative(2.4f, 2.4f)
                lineTo(5.573f, 8.967f)
                lineToRelative(0.369f, 0.919f)
                arcToRelative(13.937f, 13.937f, 0.0f, false, false, 8.2f, 8.181f)
                lineToRelative(0.908f, 0.347f)
                lineTo(17.3f, 16.158f)
                lineToRelative(2.4f, 2.4f)
                close()
                moveTo(21.137f, 4.983f)
                lineTo(23.968f, 7.813f)
                lineTo(21.847f, 9.936f)
                lineTo(19.016f, 7.105f)
                lineToRelative(-2.83f, 2.831f)
                lineTo(14.064f, 7.814f)
                lineTo(16.9f, 4.984f)
                lineTo(14.064f, 2.153f)
                lineTo(16.186f, 0.032f)
                lineToRelative(2.83f, 2.831f)
                lineTo(21.847f, 0.032f)
                lineToRelative(2.121f, 2.121f)
                close()
            }
        }
        .build()
        return _phoneCross!!
    }

private var _phoneCross: ImageVector? = null
