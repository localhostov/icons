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

public val Icons.Bold.MoneySimpleFromBracket: ImageVector
    get() {
        if (_moneySimpleFromBracket != null) {
            return _moneySimpleFromBracket!!
        }
        _moneySimpleFromBracket = Builder(name = "MoneySimpleFromBracket", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 11.0f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                close()
                moveTo(24.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(21.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                lineTo(20.5f, 0.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(18.0f, 21.0f)
                lineTo(18.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                lineTo(6.0f, 21.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _moneySimpleFromBracket!!
    }

private var _moneySimpleFromBracket: ImageVector? = null
