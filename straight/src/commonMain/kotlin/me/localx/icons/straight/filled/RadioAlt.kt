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

public val Icons.Filled.RadioAlt: ImageVector
    get() {
        if (_radioAlt != null) {
            return _radioAlt!!
        }
        _radioAlt = Builder(name = "RadioAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 18.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(24.0f, 10.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-11.956f)
                lineTo(21.313f, 1.95f)
                lineToRelative(-0.627f, -1.899f)
                lineTo(2.514f, 6.049f)
                curveToRelative(-1.423f, 0.234f, -2.514f, 1.463f, -2.514f, 2.951f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(24.0f, 12.0f)
                verticalLineToRelative(12.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(10.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 15.0f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 18.0f)
                curveToRelative(0.0f, -2.205f, -1.795f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.795f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.795f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.795f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _radioAlt!!
    }

private var _radioAlt: ImageVector? = null
