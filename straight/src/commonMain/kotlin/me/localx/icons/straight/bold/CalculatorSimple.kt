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

public val Icons.Bold.CalculatorSimple: ImageVector
    get() {
        if (_calculatorSimple != null) {
            return _calculatorSimple!!
        }
        _calculatorSimple = Builder(name = "CalculatorSimple", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 10.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-10.5f)
                lineTo(0.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(10.5f)
                lineTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(10.5f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(16.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 3.0f)
                lineTo(0.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(21.5f, 3.0f)
                lineTo(21.5f, 0.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(5.872f, 15.507f)
                lineToRelative(-1.872f, 1.872f)
                lineToRelative(-1.872f, -1.872f)
                lineTo(0.007f, 17.628f)
                lineToRelative(1.872f, 1.872f)
                lineTo(0.007f, 21.372f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.872f, -1.872f)
                lineToRelative(1.872f, 1.872f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-1.872f, -1.872f)
                lineToRelative(1.872f, -1.872f)
                lineToRelative(-2.121f, -2.121f)
                close()
            }
        }
        .build()
        return _calculatorSimple!!
    }

private var _calculatorSimple: ImageVector? = null
