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

public val Icons.Outline.LocationExclamation: ImageVector
    get() {
        if (_locationExclamation != null) {
            return _locationExclamation!!
        }
        _locationExclamation = Builder(name = "LocationExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.07f, 2.929f)
                curveToRelative(-1.889f, -1.889f, -4.399f, -2.929f, -7.07f, -2.929f)
                reflectiveCurveToRelative(-5.182f, 1.04f, -7.071f, 2.929f)
                curveToRelative(-3.899f, 3.899f, -3.899f, 10.243f, 0.008f, 14.15f)
                lineToRelative(7.063f, 6.907f)
                lineToRelative(7.07f, -6.915f)
                curveToRelative(1.89f, -1.889f, 2.93f, -4.4f, 2.93f, -7.071f)
                reflectiveCurveToRelative(-1.04f, -5.183f, -2.93f, -7.071f)
                close()
                moveTo(17.664f, 15.65f)
                lineToRelative(-5.664f, 5.54f)
                lineToRelative(-5.657f, -5.532f)
                curveToRelative(-3.119f, -3.119f, -3.119f, -8.195f, 0.0f, -11.314f)
                curveToRelative(1.512f, -1.511f, 3.521f, -2.343f, 5.657f, -2.343f)
                reflectiveCurveToRelative(4.146f, 0.832f, 5.656f, 2.343f)
                curveToRelative(1.512f, 1.511f, 2.344f, 3.521f, 2.344f, 5.657f)
                reflectiveCurveToRelative(-0.832f, 4.146f, -2.336f, 5.649f)
                close()
                moveTo(11.0f, 5.001f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(11.0f, 14.001f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _locationExclamation!!
    }

private var _locationExclamation: ImageVector? = null
