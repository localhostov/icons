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

public val Icons.Outline.LimitSpeedometer: ImageVector
    get() {
        if (_limitSpeedometer != null) {
            return _limitSpeedometer!!
        }
        _limitSpeedometer = Builder(name = "LimitSpeedometer", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 12.0f)
                curveToRelative(0.0f, -0.178f, 0.031f, -0.347f, 0.074f, -0.512f)
                lineToRelative(-4.281f, -4.281f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(4.281f, 4.281f)
                curveToRelative(0.164f, -0.044f, 0.334f, -0.074f, 0.512f, -0.074f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(5.647f, 19.713f)
                curveToRelative(-2.296f, -1.894f, -3.647f, -4.724f, -3.647f, -7.713f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                curveToRelative(0.0f, 1.209f, -0.231f, 2.388f, -0.646f, 3.494f)
                lineToRelative(1.238f, 2.122f)
                curveToRelative(0.909f, -1.709f, 1.409f, -3.631f, 1.409f, -5.616f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.898f, 1.911f, 7.568f, 5.112f, 9.818f)
                lineToRelative(0.639f, 0.448f)
                lineToRelative(2.903f, -2.51f)
                lineToRelative(-1.309f, -1.514f)
                lineToRelative(-1.699f, 1.47f)
                close()
                moveTo(17.0f, 12.0f)
                lineToRelative(7.0f, 12.0f)
                horizontalLineToRelative(-14.0f)
                lineToRelative(7.0f, -12.0f)
                close()
                moveTo(18.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _limitSpeedometer!!
    }

private var _limitSpeedometer: ImageVector? = null
