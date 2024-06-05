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

public val Icons.Filled.MeterBolt: ImageVector
    get() {
        if (_meterBolt != null) {
            return _meterBolt!!
        }
        _meterBolt = Builder(name = "MeterBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.36f, 24.011f)
                lineToRelative(-1.72f, -1.021f)
                lineToRelative(2.963f, -4.991f)
                horizontalLineToRelative(-4.122f)
                curveToRelative(-0.517f, 0.0f, -0.987f, -0.263f, -1.259f, -0.701f)
                curveToRelative(-0.272f, -0.439f, -0.296f, -0.979f, -0.066f, -1.441f)
                lineToRelative(3.484f, -5.866f)
                lineToRelative(1.719f, 1.021f)
                lineToRelative(-2.964f, 4.989f)
                horizontalLineToRelative(4.124f)
                curveToRelative(0.509f, 0.0f, 0.976f, 0.254f, 1.249f, 0.684f)
                curveToRelative(0.273f, 0.429f, 0.308f, 0.96f, 0.093f, 1.421f)
                lineToRelative(-3.501f, 5.906f)
                close()
                moveTo(16.154f, 23.259f)
                curveToRelative(-1.295f, 0.479f, -2.695f, 0.742f, -4.154f, 0.742f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(5.995f, 0.0f, 10.978f, 4.419f, 11.861f, 10.171f)
                lineToRelative(-4.861f, -2.889f)
                verticalLineToRelative(-0.282f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.519f)
                lineToRelative(-2.634f, 4.445f)
                curveToRelative(-0.542f, 1.088f, -0.483f, 2.354f, 0.157f, 3.388f)
                curveToRelative(0.64f, 1.031f, 1.746f, 1.646f, 2.959f, 1.646f)
                horizontalLineToRelative(0.609f)
                lineToRelative(-1.936f, 3.26f)
                close()
                moveTo(7.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _meterBolt!!
    }

private var _meterBolt: ImageVector? = null
