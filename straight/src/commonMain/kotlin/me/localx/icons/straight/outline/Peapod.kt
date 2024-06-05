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

public val Icons.Outline.Peapod: ImageVector
    get() {
        if (_peapod != null) {
            return _peapod!!
        }
        _peapod = Builder(name = "Peapod", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.999f, 0.972f)
                lineToRelative(-0.028f, -0.972f)
                horizontalLineToRelative(-0.972f)
                curveTo(22.597f, 0.0f, 13.082f, 0.075f, 6.579f, 6.579f)
                curveTo(0.077f, 13.083f, 0.0f, 22.597f, 0.0f, 22.999f)
                verticalLineToRelative(0.972f)
                reflectiveCurveToRelative(1.071f, 0.03f, 1.186f, 0.03f)
                curveToRelative(1.482f, 0.0f, 9.941f, -0.287f, 16.234f, -6.58f)
                curveTo(24.194f, 10.647f, 24.01f, 1.364f, 23.999f, 0.972f)
                close()
                moveTo(16.007f, 16.007f)
                curveToRelative(-4.901f, 4.901f, -11.448f, 5.798f, -13.949f, 5.959f)
                curveToRelative(0.212f, -2.546f, 1.215f, -9.251f, 5.936f, -13.973f)
                curveToRelative(4.723f, -4.723f, 11.43f, -5.724f, 13.975f, -5.936f)
                curveToRelative(-0.156f, 2.497f, -1.044f, 9.032f, -5.961f, 13.95f)
                close()
                moveTo(8.0f, 14.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(8.0f, 18.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _peapod!!
    }

private var _peapod: ImageVector? = null
