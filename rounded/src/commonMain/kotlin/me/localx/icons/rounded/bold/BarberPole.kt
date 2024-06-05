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

public val Icons.Bold.BarberPole: ImageVector
    get() {
        if (_barberPole != null) {
            return _barberPole!!
        }
        _barberPole = Builder(name = "BarberPole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 18.0f)
                horizontalLineToRelative(-0.5f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.312f)
                curveToRelative(-1.039f, -1.79f, -2.973f, -3.0f, -5.188f, -3.0f)
                reflectiveCurveToRelative(-4.149f, 1.21f, -5.188f, 3.0f)
                horizontalLineToRelative(-1.312f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.312f)
                curveToRelative(1.039f, 1.79f, 2.973f, 3.0f, 5.188f, 3.0f)
                reflectiveCurveToRelative(4.149f, -1.21f, 5.188f, -3.0f)
                horizontalLineToRelative(1.312f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(9.0f, 7.621f)
                lineToRelative(6.0f, 6.0f)
                verticalLineToRelative(2.758f)
                lineToRelative(-6.0f, -6.0f)
                verticalLineToRelative(-2.758f)
                close()
                moveTo(15.0f, 9.379f)
                lineToRelative(-3.379f, -3.379f)
                horizontalLineToRelative(3.379f)
                verticalLineToRelative(3.379f)
                close()
                moveTo(9.0f, 14.621f)
                lineToRelative(3.379f, 3.379f)
                horizontalLineToRelative(-3.379f)
                verticalLineToRelative(-3.379f)
                close()
            }
        }
        .build()
        return _barberPole!!
    }

private var _barberPole: ImageVector? = null
