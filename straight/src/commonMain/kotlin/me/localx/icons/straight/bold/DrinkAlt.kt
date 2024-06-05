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

public val Icons.Bold.DrinkAlt: ImageVector
    get() {
        if (_drinkAlt != null) {
            return _drinkAlt!!
        }
        _drinkAlt = Builder(name = "DrinkAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.255f, 6.27f)
                arcTo(3.373f, 3.373f, 0.0f, false, false, 18.61f, 5.0f)
                lineTo(15.064f, 5.0f)
                lineToRelative(0.256f, -2.0f)
                lineTo(20.0f, 3.0f)
                lineTo(20.0f, 0.0f)
                lineTo(12.68f, 0.0f)
                lineToRelative(-0.641f, 5.0f)
                lineTo(5.39f, 5.0f)
                arcTo(3.39f, 3.39f, 0.0f, false, false, 2.065f, 9.051f)
                lineTo(4.077f, 24.0f)
                lineTo(19.923f, 24.0f)
                lineTo(21.934f, 9.056f)
                arcTo(3.371f, 3.371f, 0.0f, false, false, 21.255f, 6.27f)
                close()
                moveTo(18.61f, 8.0f)
                arcToRelative(0.378f, 0.378f, 0.0f, false, true, 0.38f, 0.474f)
                lineTo(18.784f, 10.0f)
                lineTo(14.423f, 10.0f)
                lineToRelative(0.256f, -2.0f)
                close()
                moveTo(5.086f, 8.146f)
                arcTo(0.377f, 0.377f, 0.0f, false, true, 5.39f, 8.0f)
                horizontalLineToRelative(6.264f)
                lineTo(11.4f, 10.0f)
                lineTo(5.22f, 10.0f)
                lineTo(5.01f, 8.474f)
                arcTo(0.379f, 0.379f, 0.0f, false, true, 5.086f, 8.146f)
                close()
                moveTo(6.7f, 21.0f)
                lineTo(5.624f, 13.0f)
                lineTo(18.379f, 13.0f)
                lineTo(17.3f, 21.0f)
                close()
                moveTo(10.757f, 15.0f)
                horizontalLineToRelative(3.025f)
                lineToRelative(-0.513f, 4.0f)
                lineTo(10.244f, 19.0f)
                close()
            }
        }
        .build()
        return _drinkAlt!!
    }

private var _drinkAlt: ImageVector? = null
