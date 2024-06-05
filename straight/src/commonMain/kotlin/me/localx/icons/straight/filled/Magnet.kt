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
                moveToRelative(17.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(5.002f)
                curveToRelative(0.0f, 3.247f, -1.276f, 6.288f, -3.593f, 8.563f)
                curveToRelative(-2.263f, 2.221f, -5.24f, 3.437f, -8.405f, 3.437f)
                curveToRelative(-0.075f, 0.0f, -0.15f, 0.0f, -0.226f, -0.002f)
                curveToRelative(-6.493f, -0.119f, -11.776f, -5.665f, -11.776f, -12.363f)
                verticalLineToRelative(-4.637f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.239f, 5.0f, -5.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(7.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(7.0f)
                lineTo(7.0f, 0.0f)
                close()
                moveTo(17.0f, 0.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(7.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
