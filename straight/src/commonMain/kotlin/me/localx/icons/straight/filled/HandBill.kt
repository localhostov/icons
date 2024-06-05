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

public val Icons.Filled.HandBill: ImageVector
    get() {
        if (_handBill != null) {
            return _handBill!!
        }
        _handBill = Builder(name = "HandBill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.433f, 14.7f)
                lineToRelative(-3.92f, 4.317f)
                curveToRelative(-0.569f, 0.626f, -1.375f, 0.983f, -2.221f, 0.983f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(-9.962f)
                lineToRelative(3.412f, -2.991f)
                curveToRelative(0.737f, -0.673f, 1.699f, -1.047f, 2.698f, -1.047f)
                horizontalLineToRelative(1.89f)
                verticalLineToRelative(4.073f)
                lineToRelative(-3.365f, 3.331f)
                lineToRelative(1.404f, 1.404f)
                lineToRelative(3.275f, -3.243f)
                curveToRelative(0.728f, -0.603f, 1.772f, -0.752f, 2.586f, -0.272f)
                curveToRelative(1.254f, 0.739f, 1.457f, 2.39f, 0.533f, 3.407f)
                close()
                moveTo(24.0f, 4.0f)
                verticalLineToRelative(3.984f)
                lineToRelative(-0.005f, 0.015f)
                curveToRelative(-0.352f, 0.0f, -0.713f, 0.045f, -1.08f, 0.141f)
                curveToRelative(-1.33f, 0.36f, -2.42f, 1.43f, -2.77f, 2.77f)
                curveToRelative(-0.711f, 2.661f, 1.292f, 5.075f, 3.85f, 5.081f)
                lineToRelative(0.005f, 0.012f)
                verticalLineToRelative(3.996f)
                horizontalLineToRelative(-13.678f)
                lineToRelative(3.592f, -3.956f)
                curveToRelative(0.047f, -0.052f, 0.092f, -0.105f, 0.136f, -0.158f)
                curveToRelative(0.17f, 0.642f, 0.753f, 1.114f, 1.45f, 1.114f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.21f, 0.0f, -0.41f, 0.043f, -0.591f, 0.121f)
                curveToRelative(0.11f, -0.5f, 0.129f, -1.022f, 0.049f, -1.543f)
                curveToRelative(-0.191f, -1.26f, -0.937f, -2.356f, -2.044f, -3.008f)
                curveToRelative(-0.885f, -0.521f, -1.923f, -0.674f, -2.914f, -0.479f)
                verticalLineToRelative(-5.091f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(17.0f, 8.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _handBill!!
    }

private var _handBill: ImageVector? = null
