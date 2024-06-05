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

public val Icons.Filled.CalculatorSimple: ImageVector
    get() {
        if (_calculatorSimple != null) {
            return _calculatorSimple!!
        }
        _calculatorSimple = Builder(name = "CalculatorSimple", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 11.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-11.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.0f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(16.0f, 18.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 22.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 4.0f)
                lineTo(0.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 4.0f)
                lineTo(21.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(7.062f, 15.523f)
                lineToRelative(-2.562f, 2.562f)
                lineToRelative(-2.562f, -2.562f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.562f, 2.562f)
                lineToRelative(-2.562f, 2.562f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.562f, -2.562f)
                lineToRelative(2.562f, 2.562f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.562f, -2.562f)
                lineToRelative(2.562f, -2.562f)
                lineToRelative(-1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _calculatorSimple!!
    }

private var _calculatorSimple: ImageVector? = null
