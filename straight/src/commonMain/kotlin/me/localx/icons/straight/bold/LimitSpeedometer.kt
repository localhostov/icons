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

public val Icons.Bold.LimitSpeedometer: ImageVector
    get() {
        if (_limitSpeedometer != null) {
            return _limitSpeedometer!!
        }
        _limitSpeedometer = Builder(name = "LimitSpeedometer", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.502f, 17.351f)
                lineToRelative(1.929f, 2.299f)
                lineToRelative(-3.375f, 2.831f)
                lineToRelative(-0.943f, -0.662f)
                curveTo(1.911f, 19.569f, 0.0f, 15.898f, 0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                curveToRelative(0.0f, 1.984f, -0.5f, 3.907f, -1.409f, 5.616f)
                lineToRelative(-1.914f, -3.282f)
                curveToRelative(0.204f, -0.754f, 0.323f, -1.536f, 0.323f, -2.334f)
                curveToRelative(0.0f, -4.963f, -4.038f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.037f, 3.0f, 12.0f)
                curveToRelative(0.0f, 2.543f, 1.086f, 4.957f, 2.95f, 6.653f)
                lineToRelative(1.552f, -1.303f)
                close()
                moveTo(8.585f, 6.414f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(3.544f, 3.544f)
                curveToRelative(0.042f, 1.067f, 0.915f, 1.921f, 1.992f, 1.921f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.039f, -0.796f, -1.884f, -1.81f, -1.981f)
                lineToRelative(-3.605f, -3.605f)
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
