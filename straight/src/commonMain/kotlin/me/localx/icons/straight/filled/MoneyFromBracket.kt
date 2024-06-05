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

public val Icons.Filled.MoneyFromBracket: ImageVector
    get() {
        if (_moneyFromBracket != null) {
            return _moneyFromBracket!!
        }
        _moneyFromBracket = Builder(name = "MoneyFromBracket", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                close()
                moveTo(20.0f, 24.0f)
                lineTo(4.0f, 24.0f)
                lineTo(4.0f, 4.0f)
                lineTo(20.0f, 4.0f)
                lineTo(20.0f, 24.0f)
                close()
                moveTo(9.0f, 20.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(15.86f, 13.08f)
                curveToRelative(0.8f, -3.04f, -1.91f, -5.75f, -4.94f, -4.94f)
                curveToRelative(-1.34f, 0.35f, -2.41f, 1.44f, -2.77f, 2.77f)
                curveToRelative(-0.8f, 3.04f, 1.91f, 5.75f, 4.94f, 4.94f)
                curveToRelative(1.34f, -0.35f, 2.41f, -1.44f, 2.77f, -2.77f)
                close()
                moveTo(18.0f, 20.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.34f, 0.0f, 0.0f, 1.34f, 0.0f, 3.0f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 9.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 3.0f)
                close()
            }
        }
        .build()
        return _moneyFromBracket!!
    }

private var _moneyFromBracket: ImageVector? = null
