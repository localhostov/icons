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

public val Icons.Bold.CreditCardEye: ImageVector
    get() {
        if (_creditCardEye != null) {
            return _creditCardEye!!
        }
        _creditCardEye = Builder(name = "CreditCardEye", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24.0f, 4.5f)
                verticalLineToRelative(11.803f)
                curveToRelative(-0.733f, -0.852f, -1.724f, -1.732f, -3.0f, -2.371f)
                verticalLineToRelative(-4.931f)
                lineTo(3.0f, 9.001f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.276f)
                curveToRelative(-0.961f, 1.037f, -1.551f, 2.074f, -1.818f, 2.612f)
                lineToRelative(-0.192f, 0.388f)
                lineTo(0.0f, 19.001f)
                lineTo(0.0f, 4.5f)
                curveTo(0.0f, 2.57f, 1.57f, 1.0f, 3.5f, 1.0f)
                lineTo(20.5f, 1.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 6.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 4.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(21.0f, 6.0f)
                close()
                moveTo(23.75f, 19.5f)
                curveToRelative(-0.577f, 1.165f, -2.592f, 4.5f, -6.75f, 4.5f)
                reflectiveCurveToRelative(-6.175f, -3.338f, -6.75f, -4.5f)
                curveToRelative(0.577f, -1.165f, 2.592f, -4.5f, 6.75f, -4.5f)
                reflectiveCurveToRelative(6.173f, 3.334f, 6.75f, 4.5f)
                close()
                moveTo(19.0f, 19.5f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _creditCardEye!!
    }

private var _creditCardEye: ImageVector? = null
