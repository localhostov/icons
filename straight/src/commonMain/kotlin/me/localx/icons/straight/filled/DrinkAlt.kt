package me.localx.icons.straight.filled

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

public val Icons.Filled.DrinkAlt: ImageVector
    get() {
        if (_drinkAlt != null) {
            return _drinkAlt!!
        }
        _drinkAlt = Builder(name = "DrinkAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.883f, 2.0f)
                lineToRelative(-0.251f, 2.0f)
                lineTo(12.616f, 4.0f)
                lineToRelative(0.5f, -4.0f)
                lineTo(20.0f, 0.0f)
                lineTo(20.0f, 2.0f)
                close()
                moveTo(2.661f, 5.122f)
                arcToRelative(2.925f, 2.925f, 0.0f, false, false, -0.6f, 2.434f)
                lineTo(2.362f, 10.0f)
                horizontalLineToRelative(9.5f)
                lineToRelative(0.752f, -6.0f)
                lineTo(5.0f, 4.0f)
                arcTo(2.986f, 2.986f, 0.0f, false, false, 2.661f, 5.122f)
                close()
                moveTo(21.341f, 5.122f)
                arcTo(2.985f, 2.985f, 0.0f, false, false, 19.0f, 4.0f)
                lineTo(14.632f, 4.0f)
                lineToRelative(-0.752f, 6.0f)
                horizontalLineToRelative(7.753f)
                lineToRelative(0.294f, -2.347f)
                arcTo(2.982f, 2.982f, 0.0f, false, false, 21.341f, 5.125f)
                close()
                moveTo(12.626f, 20.0f)
                lineTo(10.61f, 20.0f)
                lineToRelative(1.0f, -8.0f)
                horizontalLineToRelative(-9.0f)
                lineToRelative(1.5f, 12.0f)
                lineTo(19.883f, 24.0f)
                lineToRelative(1.5f, -12.0f)
                lineTo(13.629f, 12.0f)
                close()
            }
        }
        .build()
        return _drinkAlt!!
    }

private var _drinkAlt: ImageVector? = null
