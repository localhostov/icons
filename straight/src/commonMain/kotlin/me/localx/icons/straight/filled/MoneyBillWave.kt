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

public val Icons.Filled.MoneyBillWave: ImageVector
    get() {
        if (_moneyBillWave != null) {
            return _moneyBillWave!!
        }
        _moneyBillWave = Builder(name = "MoneyBillWave", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(24.001f, 7.0f)
                verticalLineToRelative(12.285f)
                lineToRelative(-0.587f, 0.266f)
                curveToRelative(-0.131f, 0.06f, -3.233f, 1.449f, -6.413f, 1.449f)
                curveToRelative(-1.64f, 0.0f, -3.488f, -0.528f, -5.275f, -1.039f)
                curveToRelative(-1.654f, -0.473f, -3.365f, -0.961f, -4.725f, -0.961f)
                curveToRelative(-2.731f, 0.0f, -5.549f, 1.303f, -5.578f, 1.315f)
                lineToRelative(-1.423f, 0.666f)
                lineTo(-0.0f, 7.158f)
                curveToRelative(0.0f, -1.128f, 0.618f, -2.148f, 1.615f, -2.663f)
                curveToRelative(1.325f, -0.683f, 3.333f, -1.496f, 5.386f, -1.496f)
                curveToRelative(1.662f, 0.0f, 3.266f, 0.535f, 4.816f, 1.051f)
                curveToRelative(1.463f, 0.488f, 2.845f, 0.949f, 4.183f, 0.949f)
                curveToRelative(1.386f, 0.0f, 2.517f, -0.362f, 3.426f, -0.653f)
                curveToRelative(0.302f, -0.097f, 0.577f, -0.185f, 0.828f, -0.251f)
                curveToRelative(0.898f, -0.239f, 1.835f, -0.048f, 2.573f, 0.52f)
                curveToRelative(0.746f, 0.574f, 1.174f, 1.443f, 1.174f, 2.384f)
                close()
                moveTo(5.0f, 15.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(5.0f, 8.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                close()
                moveTo(21.0f, 16.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(21.0f, 9.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _moneyBillWave!!
    }

private var _moneyBillWave: ImageVector? = null
