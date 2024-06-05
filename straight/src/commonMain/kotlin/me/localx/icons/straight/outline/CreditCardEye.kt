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

public val Icons.Outline.CreditCardEye: ImageVector
    get() {
        if (_creditCardEye != null) {
            return _creditCardEye!!
        }
        _creditCardEye = Builder(name = "CreditCardEye", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 13.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(23.412f, 19.039f)
                lineToRelative(0.24f, 0.461f)
                lineToRelative(-0.24f, 0.462f)
                curveToRelative(-0.493f, 0.947f, -2.412f, 4.038f, -6.412f, 4.038f)
                reflectiveCurveToRelative(-5.919f, -3.091f, -6.413f, -4.038f)
                lineToRelative(-0.241f, -0.462f)
                lineToRelative(0.241f, -0.462f)
                curveToRelative(0.494f, -0.947f, 2.417f, -4.038f, 6.413f, -4.038f)
                reflectiveCurveToRelative(5.92f, 3.091f, 6.412f, 4.039f)
                close()
                moveTo(21.371f, 19.5f)
                curveToRelative(-0.635f, -0.996f, -1.988f, -2.5f, -4.371f, -2.5f)
                reflectiveCurveToRelative(-3.735f, 1.504f, -4.371f, 2.5f)
                curveToRelative(0.636f, 0.996f, 1.99f, 2.5f, 4.371f, 2.5f)
                reflectiveCurveToRelative(3.736f, -1.504f, 4.371f, -2.5f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(11.346f)
                curveToRelative(-0.506f, -0.611f, -1.17f, -1.261f, -2.0f, -1.827f)
                verticalLineToRelative(-5.518f)
                lineTo(2.0f, 9.001f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(6.876f)
                curveToRelative(-0.02f, 0.037f, -0.044f, 0.08f, -0.062f, 0.113f)
                lineToRelative(-1.039f, 1.887f)
                lineTo(0.0f, 20.001f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineTo(22.0f, 7.0f)
                close()
                moveTo(17.0f, 18.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _creditCardEye!!
    }

private var _creditCardEye: ImageVector? = null
