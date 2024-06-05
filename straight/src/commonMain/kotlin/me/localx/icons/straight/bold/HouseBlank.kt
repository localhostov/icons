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

public val Icons.Bold.HouseBlank: ImageVector
    get() {
        if (_houseBlank != null) {
            return _houseBlank!!
        }
        _houseBlank = Builder(name = "HouseBlank", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.657f, 7.419f)
                lineTo(14.157f, 0.768f)
                curveToRelative(-1.271f, -0.994f, -3.043f, -0.992f, -4.314f, 0.0f)
                lineTo(1.342f, 7.42f)
                curveToRelative(-0.853f, 0.669f, -1.342f, 1.674f, -1.342f, 2.756f)
                verticalLineToRelative(13.824f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 10.176f)
                curveToRelative(0.0f, -1.082f, -0.489f, -2.087f, -1.343f, -2.757f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 10.176f)
                curveToRelative(0.0f, -0.154f, 0.07f, -0.299f, 0.192f, -0.394f)
                lineTo(11.692f, 3.131f)
                curveToRelative(0.182f, -0.143f, 0.436f, -0.143f, 0.615f, 0.0f)
                lineToRelative(8.499f, 6.65f)
                curveToRelative(0.123f, 0.096f, 0.193f, 0.24f, 0.193f, 0.395f)
                verticalLineToRelative(10.824f)
                close()
            }
        }
        .build()
        return _houseBlank!!
    }

private var _houseBlank: ImageVector? = null
