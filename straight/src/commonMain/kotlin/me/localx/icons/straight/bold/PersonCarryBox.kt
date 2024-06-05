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

public val Icons.Bold.PersonCarryBox: ImageVector
    get() {
        if (_personCarryBox != null) {
            return _personCarryBox!!
        }
        _personCarryBox = Builder(name = "PersonCarryBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(3.0f, 18.117f)
                verticalLineToRelative(5.883f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.972f)
                lineToRelative(-2.377f, -1.46f)
                curveToRelative(-0.22f, -0.135f, -0.426f, -0.288f, -0.623f, -0.451f)
                close()
                moveTo(21.0f, 5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-11.331f)
                lineToRelative(-1.669f, -2.67f)
                verticalLineToRelative(5.059f)
                lineToRelative(2.886f, 1.772f)
                verticalLineToRelative(6.839f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.161f)
                lineToRelative(-3.456f, -2.122f)
                curveToRelative(-0.882f, -0.541f, -1.43f, -1.521f, -1.43f, -2.557f)
                verticalLineToRelative(-5.661f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.392f)
                curveToRelative(1.213f, 0.0f, 2.322f, 0.614f, 2.968f, 1.644f)
                lineToRelative(1.472f, 2.356f)
                horizontalLineToRelative(1.669f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(18.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _personCarryBox!!
    }

private var _personCarryBox: ImageVector? = null
