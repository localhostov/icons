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

public val Icons.Outline.Iot: ImageVector
    get() {
        if (_iot != null) {
            return _iot!!
        }
        _iot = Builder(name = "Iot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.657f, 6.343f)
                lineToRelative(-1.414f, 1.414f)
                curveToRelative(-1.133f, -1.133f, -2.64f, -1.757f, -4.243f, -1.757f)
                reflectiveCurveToRelative(-3.109f, 0.624f, -4.243f, 1.757f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(1.511f, -1.511f, 3.52f, -2.343f, 5.657f, -2.343f)
                reflectiveCurveToRelative(4.146f, 0.832f, 5.657f, 2.343f)
                close()
                moveTo(6.344f, 17.657f)
                curveToRelative(1.56f, 1.56f, 3.608f, 2.34f, 5.657f, 2.34f)
                reflectiveCurveToRelative(4.097f, -0.78f, 5.657f, -2.34f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(-2.34f, 2.34f, -6.146f, 2.34f, -8.485f, 0.0f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(12.001f, 16.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(12.001f, 14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.897f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(19.072f, 4.929f)
                lineToRelative(1.414f, -1.414f)
                curveTo(15.807f, -1.164f, 8.193f, -1.164f, 3.515f, 3.515f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(3.899f, -3.898f, 10.243f, -3.898f, 14.143f, 0.0f)
                close()
                moveTo(4.929f, 19.072f)
                lineToRelative(-1.414f, 1.414f)
                curveToRelative(2.339f, 2.34f, 5.413f, 3.509f, 8.485f, 3.509f)
                reflectiveCurveToRelative(6.146f, -1.169f, 8.485f, -3.509f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(-3.899f, 3.898f, -10.243f, 3.898f, -14.143f, 0.0f)
                close()
                moveTo(17.0f, 8.001f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _iot!!
    }

private var _iot: ImageVector? = null
