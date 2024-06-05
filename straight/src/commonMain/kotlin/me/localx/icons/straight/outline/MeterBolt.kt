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

public val Icons.Outline.MeterBolt: ImageVector
    get() {
        if (_meterBolt != null) {
            return _meterBolt!!
        }
        _meterBolt = Builder(name = "MeterBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.977f, 19.998f)
                horizontalLineToRelative(0.113f)
                lineToRelative(-1.925f, 3.241f)
                curveToRelative(-1.3f, 0.484f, -2.699f, 0.761f, -4.166f, 0.761f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(5.99f, 0.0f, 10.954f, 4.416f, 11.844f, 10.161f)
                lineToRelative(-2.403f, -1.428f)
                curveToRelative(-1.358f, -3.912f, -5.072f, -6.733f, -9.441f, -6.733f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.242f, 0.0f, 4.307f, -0.751f, 5.977f, -2.002f)
                close()
                moveTo(23.768f, 16.684f)
                curveToRelative(-0.273f, -0.43f, -0.74f, -0.686f, -1.249f, -0.686f)
                horizontalLineToRelative(-4.124f)
                lineToRelative(2.964f, -4.987f)
                lineToRelative(-1.719f, -1.021f)
                lineToRelative(-3.484f, 5.866f)
                curveToRelative(-0.23f, 0.463f, -0.206f, 1.002f, 0.066f, 1.441f)
                curveToRelative(0.272f, 0.438f, 0.743f, 0.701f, 1.259f, 0.701f)
                horizontalLineToRelative(4.122f)
                lineToRelative(-2.963f, 4.991f)
                lineToRelative(1.72f, 1.021f)
                lineToRelative(3.501f, -5.906f)
                curveToRelative(0.215f, -0.461f, 0.18f, -0.992f, -0.093f, -1.421f)
                close()
                moveTo(7.0f, 11.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 11.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 11.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _meterBolt!!
    }

private var _meterBolt: ImageVector? = null
