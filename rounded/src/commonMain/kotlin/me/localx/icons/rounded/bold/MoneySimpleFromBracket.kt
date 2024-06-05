package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveTo(21.0f, 7.86f)
                verticalLineToRelative(10.64f)
                curveToRelative(0.0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                lineTo(3.0f, 7.86f)
                curveTo(1.28f, 7.42f, 0.0f, 5.86f, 0.0f, 4.0f)
                curveTo(0.0f, 1.8f, 1.79f, 0.0f, 4.0f, 0.0f)
                lineTo(20.0f, 0.0f)
                curveTo(22.21f, 0.0f, 24.0f, 1.8f, 24.0f, 4.0f)
                curveToRelative(0.0f, 1.86f, -1.28f, 3.41f, -3.0f, 3.86f)
                close()
                moveTo(18.0f, 18.5f)
                lineTo(18.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _moneySimpleFromBracket!!
    }

private var _moneySimpleFromBracket: ImageVector? = null
