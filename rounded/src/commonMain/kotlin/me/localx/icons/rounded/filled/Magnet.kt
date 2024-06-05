package me.localx.icons.rounded.filled

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

public val Icons.Filled.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = Builder(name = "Magnet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 6.998f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(5.002f)
                curveToRelative(0.0f, 3.247f, -1.276f, 6.288f, -3.593f, 8.563f)
                curveToRelative(-2.263f, 2.221f, -5.24f, 3.437f, -8.405f, 3.437f)
                curveToRelative(-0.075f, 0.0f, -0.15f, 0.0f, -0.226f, -0.002f)
                curveTo(5.283f, 23.879f, 0.0f, 18.333f, 0.0f, 11.635f)
                verticalLineToRelative(-4.637f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.239f, 5.0f, -5.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(4.5f, -0.002f)
                horizontalLineToRelative(-2.0f)
                curveTo(1.119f, -0.002f, 0.0f, 1.117f, 0.0f, 2.498f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.5f)
                curveTo(7.0f, 1.117f, 5.881f, -0.002f, 4.5f, -0.002f)
                close()
                moveTo(17.0f, 2.498f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.5f)
                curveTo(24.0f, 1.117f, 22.881f, -0.002f, 21.5f, -0.002f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
