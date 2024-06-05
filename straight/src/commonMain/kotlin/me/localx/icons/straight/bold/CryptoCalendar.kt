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

public val Icons.Bold.CryptoCalendar: ImageVector
    get() {
        if (_cryptoCalendar != null) {
            return _cryptoCalendar!!
        }
        _cryptoCalendar = Builder(name = "CryptoCalendar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(7.221f)
                curveToRelative(-0.815f, -0.926f, -1.838f, -1.663f, -3.0f, -2.134f)
                verticalLineToRelative(-1.587f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(7.587f)
                curveToRelative(0.471f, 1.162f, 1.208f, 2.185f, 2.134f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.5f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(19.5f, 16.5f)
                curveToRelative(0.0f, -0.386f, -0.314f, -0.7f, -0.7f, -0.7f)
                horizontalLineToRelative(-1.95f)
                verticalLineToRelative(1.4f)
                horizontalLineToRelative(1.95f)
                curveToRelative(0.386f, 0.0f, 0.7f, -0.314f, 0.7f, -0.7f)
                close()
                moveTo(19.3f, 18.8f)
                horizontalLineToRelative(-2.45f)
                verticalLineToRelative(1.4f)
                horizontalLineToRelative(2.45f)
                curveToRelative(0.386f, 0.0f, 0.7f, -0.314f, 0.7f, -0.7f)
                reflectiveCurveToRelative(-0.314f, -0.7f, -0.7f, -0.7f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(21.6f, 19.5f)
                curveToRelative(0.0f, -0.719f, -0.331f, -1.361f, -0.849f, -1.783f)
                curveToRelative(0.221f, -0.354f, 0.349f, -0.771f, 0.349f, -1.217f)
                curveToRelative(0.0f, -1.269f, -1.032f, -2.3f, -2.3f, -2.3f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(-1.95f)
                verticalLineToRelative(7.6f)
                horizontalLineToRelative(1.95f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.268f, 0.0f, 2.3f, -1.031f, 2.3f, -2.3f)
                close()
            }
        }
        .build()
        return _cryptoCalendar!!
    }

private var _cryptoCalendar: ImageVector? = null
