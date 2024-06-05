package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.TrainSubwayTunnel: ImageVector
    get() {
        if (_trainSubwayTunnel != null) {
            return _trainSubwayTunnel!!
        }
        _trainSubwayTunnel = Builder(name = "TrainSubwayTunnel", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                lineTo(21.0f, 12.0f)
                curveToRelative(0.0f, -4.963f, -4.038f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.037f, 3.0f, 12.0f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                lineTo(0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(19.0f, 12.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.374f, -0.693f, 2.586f, -1.748f, 3.306f)
                lineToRelative(0.864f, 1.411f)
                curveToRelative(0.433f, 0.706f, 0.21f, 1.63f, -0.496f, 2.062f)
                curveToRelative(-0.245f, 0.149f, -0.515f, 0.221f, -0.782f, 0.221f)
                curveToRelative(-0.505f, 0.0f, -0.998f, -0.255f, -1.281f, -0.717f)
                lineToRelative(-1.225f, -2.0f)
                curveToRelative(-0.056f, -0.091f, -0.101f, -0.186f, -0.135f, -0.283f)
                horizontalLineToRelative(-4.058f)
                curveToRelative(-0.034f, 0.097f, -0.079f, 0.192f, -0.135f, 0.283f)
                lineToRelative(-1.225f, 2.0f)
                curveToRelative(-0.283f, 0.462f, -0.776f, 0.717f, -1.281f, 0.717f)
                curveToRelative(-0.267f, 0.0f, -0.538f, -0.071f, -0.782f, -0.221f)
                curveToRelative(-0.706f, -0.433f, -0.928f, -1.356f, -0.496f, -2.062f)
                lineToRelative(0.77f, -1.257f)
                curveToRelative(-1.191f, -0.693f, -1.991f, -1.983f, -1.991f, -3.459f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.761f, 2.239f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                close()
                moveTo(11.0f, 17.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(16.0f, 17.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(16.0f, 12.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _trainSubwayTunnel!!
    }

private var _trainSubwayTunnel: ImageVector? = null
