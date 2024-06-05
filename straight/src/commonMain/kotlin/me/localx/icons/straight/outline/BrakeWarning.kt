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

public val Icons.Outline.BrakeWarning: ImageVector
    get() {
        if (_brakeWarning != null) {
            return _brakeWarning!!
        }
        _brakeWarning = Builder(name = "BrakeWarning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.929f, 19.071f)
                lineToRelative(-1.414f, 1.414f)
                curveTo(-1.164f, 15.807f, -1.164f, 8.193f, 3.515f, 3.515f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(-3.898f, 3.899f, -3.898f, 10.243f, 0.0f, 14.143f)
                close()
                moveTo(20.485f, 3.515f)
                lineToRelative(-1.414f, 1.414f)
                curveToRelative(3.898f, 3.899f, 3.898f, 10.243f, 0.0f, 14.143f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(4.678f, -4.679f, 4.678f, -12.292f, 0.0f, -16.971f)
                close()
                moveTo(12.0f, 13.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveTo(7.589f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
                moveTo(13.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 7.0f)
                close()
            }
        }
        .build()
        return _brakeWarning!!
    }

private var _brakeWarning: ImageVector? = null
