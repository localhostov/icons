package me.localx.icons.straight.outline

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

public val Icons.Outline.DrinkAlt: ImageVector
    get() {
        if (_drinkAlt != null) {
            return _drinkAlt!!
        }
        _drinkAlt = Builder(name = "DrinkAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.362f, 14.0f)
                horizontalLineToRelative(2.016f)
                lineToRelative(-0.752f, 6.0f)
                horizontalLineTo(10.61f)
                close()
                moveTo(21.927f, 7.653f)
                lineTo(19.883f, 24.0f)
                horizontalLineTo(4.117f)
                lineTo(2.056f, 7.556f)
                arcTo(3.021f, 3.021f, 0.0f, false, true, 5.0f, 4.0f)
                horizontalLineToRelative(7.615f)
                lineToRelative(0.5f, -4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(14.883f)
                lineToRelative(-0.251f, 2.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.928f, 3.653f)
                close()
                moveTo(14.381f, 6.0f)
                lineToRelative(-0.5f, 4.0f)
                horizontalLineToRelative(5.742f)
                lineToRelative(0.337f, -2.688f)
                arcToRelative(1.068f, 1.068f, 0.0f, false, false, -0.179f, -0.937f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 6.0f)
                close()
                moveTo(4.024f, 7.216f)
                lineTo(4.374f, 10.0f)
                horizontalLineToRelative(7.49f)
                lineToRelative(0.5f, -4.0f)
                horizontalLineTo(5.0f)
                arcTo(1.006f, 1.006f, 0.0f, false, false, 4.024f, 7.216f)
                close()
                moveTo(18.117f, 22.0f)
                lineToRelative(1.254f, -10.0f)
                horizontalLineTo(4.625f)
                lineTo(5.882f, 22.0f)
                close()
            }
        }
        .build()
        return _drinkAlt!!
    }

private var _drinkAlt: ImageVector? = null
