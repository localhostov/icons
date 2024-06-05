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

public val Icons.Filled.LightCeiling: ImageVector
    get() {
        if (_lightCeiling != null) {
            return _lightCeiling!!
        }
        _lightCeiling = Builder(name = "LightCeiling", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 5.027f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.027f)
                curveTo(4.85f, 5.538f, 0.0f, 10.697f, 0.0f, 16.976f)
                verticalLineToRelative(2.024f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.024f)
                curveToRelative(0.0f, -6.279f, -4.85f, -11.438f, -11.0f, -11.949f)
                close()
                moveTo(15.858f, 21.0f)
                curveToRelative(-0.447f, 1.72f, -1.999f, 3.0f, -3.858f, 3.0f)
                reflectiveCurveToRelative(-3.411f, -1.28f, -3.858f, -3.0f)
                horizontalLineToRelative(7.716f)
                close()
            }
        }
        .build()
        return _lightCeiling!!
    }

private var _lightCeiling: ImageVector? = null
