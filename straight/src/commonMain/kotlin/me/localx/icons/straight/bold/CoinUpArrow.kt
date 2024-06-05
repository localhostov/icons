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

public val Icons.Bold.CoinUpArrow: ImageVector
    get() {
        if (_coinUpArrow != null) {
            return _coinUpArrow!!
        }
        _coinUpArrow = Builder(name = "CoinUpArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 0.0f)
                curveToRelative(-4.275f, 0.0f, -7.5f, 1.935f, -7.5f, 4.5f)
                verticalLineToRelative(4.875f)
                curveToRelative(2.262f, 0.695f, 4.113f, 2.312f, 5.136f, 4.408f)
                curveToRelative(0.737f, 0.139f, 1.529f, 0.217f, 2.364f, 0.217f)
                curveToRelative(1.719f, 0.0f, 3.262f, -0.317f, 4.5f, -0.857f)
                verticalLineToRelative(1.357f)
                curveToRelative(0.0f, 0.374f, -1.596f, 1.5f, -4.5f, 1.5f)
                curveToRelative(-0.619f, 0.0f, -1.165f, -0.058f, -1.662f, -0.143f)
                curveToRelative(0.104f, 0.532f, 0.162f, 1.08f, 0.162f, 1.643f)
                curveToRelative(0.0f, 0.474f, -0.049f, 0.936f, -0.123f, 1.389f)
                curveToRelative(0.522f, 0.065f, 1.059f, 0.111f, 1.623f, 0.111f)
                curveToRelative(1.719f, 0.0f, 3.262f, -0.317f, 4.5f, -0.857f)
                verticalLineToRelative(1.357f)
                curveToRelative(0.0f, 0.374f, -1.596f, 1.5f, -4.5f, 1.5f)
                curveToRelative(-0.831f, 0.0f, -1.541f, -0.097f, -2.151f, -0.238f)
                curveToRelative(-0.409f, 0.983f, -1.0f, 1.869f, -1.726f, 2.624f)
                curveToRelative(1.119f, 0.39f, 2.436f, 0.614f, 3.877f, 0.614f)
                curveToRelative(4.275f, 0.0f, 7.5f, -1.935f, 7.5f, -4.5f)
                lineTo(24.0f, 4.5f)
                curveToRelative(0.0f, -2.565f, -3.225f, -4.5f, -7.5f, -4.5f)
                close()
                moveTo(16.5f, 3.0f)
                curveToRelative(2.904f, 0.0f, 4.5f, 1.126f, 4.5f, 1.5f)
                reflectiveCurveToRelative(-1.596f, 1.5f, -4.5f, 1.5f)
                reflectiveCurveToRelative(-4.5f, -1.126f, -4.5f, -1.5f)
                reflectiveCurveToRelative(1.596f, -1.5f, 4.5f, -1.5f)
                close()
                moveTo(16.5f, 11.0f)
                curveToRelative(-2.904f, 0.0f, -4.5f, -1.126f, -4.5f, -1.5f)
                verticalLineToRelative(-1.357f)
                curveToRelative(1.238f, 0.541f, 2.781f, 0.857f, 4.5f, 0.857f)
                reflectiveCurveToRelative(3.262f, -0.317f, 4.5f, -0.857f)
                verticalLineToRelative(1.357f)
                curveToRelative(0.0f, 0.374f, -1.596f, 1.5f, -4.5f, 1.5f)
                close()
                moveTo(6.5f, 11.0f)
                curveToRelative(-3.59f, 0.0f, -6.5f, 2.91f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(8.0f, 17.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(3.793f, -3.707f)
                curveToRelative(0.391f, -0.39f, 1.024f, -0.39f, 1.414f, 0.0f)
                lineToRelative(3.793f, 3.707f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _coinUpArrow!!
    }

private var _coinUpArrow: ImageVector? = null
