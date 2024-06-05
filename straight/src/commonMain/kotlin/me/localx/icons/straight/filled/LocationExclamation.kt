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

public val Icons.Filled.LocationExclamation: ImageVector
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
                moveTo(13.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _locationExclamation!!
    }

private var _locationExclamation: ImageVector? = null
