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

public val Icons.Filled.RegionPin: ImageVector
    get() {
        if (_regionPin != null) {
            return _regionPin!!
        }
        _regionPin = Builder(name = "RegionPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.888f, 1.611f)
                curveToRelative(-1.039f, -1.039f, -2.419f, -1.611f, -3.888f, -1.611f)
                reflectiveCurveToRelative(-2.851f, 0.572f, -3.888f, 1.611f)
                curveToRelative(-1.04f, 1.038f, -1.612f, 2.419f, -1.612f, 3.889f)
                reflectiveCurveToRelative(0.576f, 2.854f, 1.649f, 3.926f)
                lineToRelative(3.851f, 3.572f)
                lineToRelative(3.888f, -3.609f)
                curveToRelative(1.04f, -1.038f, 1.612f, -2.419f, 1.612f, -3.889f)
                reflectiveCurveToRelative(-0.572f, -2.851f, -1.612f, -3.889f)
                close()
                moveTo(12.0f, 7.006f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(1.74f, 11.632f)
                lineToRelative(0.502f, -3.109f)
                curveToRelative(0.199f, -1.232f, 1.118f, -2.171f, 2.287f, -2.438f)
                curveToRelative(0.139f, 1.787f, 0.911f, 3.463f, 2.26f, 4.807f)
                lineToRelative(5.212f, 4.835f)
                lineToRelative(5.301f, -4.923f)
                curveToRelative(1.279f, -1.277f, 2.033f, -2.935f, 2.17f, -4.719f)
                curveToRelative(1.169f, 0.267f, 2.088f, 1.206f, 2.287f, 2.438f)
                lineToRelative(0.841f, 5.243f)
                lineToRelative(-12.214f, 5.552f)
                lineTo(1.74f, 11.632f)
                close()
                moveTo(22.927f, 15.812f)
                lineToRelative(1.073f, 6.688f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-8.346f)
                lineToRelative(-3.634f, -3.23f)
                lineToRelative(10.907f, -4.958f)
                close()
                moveTo(12.643f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineToRelative(0.013f, -1.659f)
                lineToRelative(1.35f, -8.369f)
                lineToRelative(11.281f, 10.028f)
                close()
            }
        }
        .build()
        return _regionPin!!
    }

private var _regionPin: ImageVector? = null
