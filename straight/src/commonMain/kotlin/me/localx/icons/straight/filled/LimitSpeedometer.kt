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

public val Icons.Filled.LimitSpeedometer: ImageVector
    get() {
        if (_limitSpeedometer != null) {
            return _limitSpeedometer!!
        }
        _limitSpeedometer = Builder(name = "LimitSpeedometer", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 12.0f)
                lineToRelative(-7.0f, 12.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(-7.0f, -12.0f)
                close()
                moveTo(18.0f, 23.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 20.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.768f, 17.0f)
                lineToRelative(4.083f, -7.0f)
                horizontalLineToRelative(2.298f)
                lineToRelative(3.012f, 5.164f)
                curveToRelative(0.538f, -1.307f, 0.839f, -2.715f, 0.839f, -4.164f)
                curveTo(22.0f, 4.934f, 17.065f, 0.0f, 11.0f, 0.0f)
                reflectiveCurveTo(0.0f, 4.934f, 0.0f, 11.0f)
                curveToRelative(0.0f, 3.574f, 1.752f, 6.938f, 4.686f, 9.0f)
                lineToRelative(0.585f, 0.411f)
                lineToRelative(2.228f, -3.411f)
                horizontalLineToRelative(4.268f)
                close()
                moveTo(4.518f, 5.815f)
                lineToRelative(1.296f, -1.296f)
                lineToRelative(4.584f, 4.584f)
                curveToRelative(0.191f, -0.061f, 0.39f, -0.102f, 0.601f, -0.102f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.211f, 0.042f, -0.41f, 0.102f, -0.601f)
                lineToRelative(-4.584f, -4.584f)
                close()
            }
        }
        .build()
        return _limitSpeedometer!!
    }

private var _limitSpeedometer: ImageVector? = null
