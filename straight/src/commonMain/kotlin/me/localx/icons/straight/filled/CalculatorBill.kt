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

public val Icons.Filled.CalculatorBill: ImageVector
    get() {
        if (_calculatorBill != null) {
            return _calculatorBill!!
        }
        _calculatorBill = Builder(name = "CalculatorBill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.5f, 10.0f)
                lineTo(2.5f, 10.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 14.0f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineToRelative(-11.76f)
                curveToRelative(0.48f, 0.716f, 0.76f, 1.576f, 0.76f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(8.0f, 2.5f)
                curveTo(8.0f, 1.034f, 6.739f, -0.137f, 5.242f, 0.013f)
                curveToRelative(-1.301f, 0.13f, -2.242f, 1.322f, -2.242f, 2.63f)
                verticalLineToRelative(5.357f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                lineTo(21.0f, 6.0f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }
        .build()
        return _calculatorBill!!
    }

private var _calculatorBill: ImageVector? = null
