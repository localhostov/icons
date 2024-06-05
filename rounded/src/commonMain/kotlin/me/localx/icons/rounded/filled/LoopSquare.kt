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

public val Icons.Filled.LoopSquare: ImageVector
    get() {
        if (_loopSquare != null) {
            return _loopSquare!!
        }
        _loopSquare = Builder(name = "LoopSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.71f, 10.069f)
                curveToRelative(-0.195f, 0.197f, -0.453f, 0.296f, -0.71f, 0.296f)
                curveToRelative(-0.255f, 0.0f, -0.509f, -0.097f, -0.704f, -0.29f)
                lineToRelative(-2.296f, -2.277f)
                verticalLineToRelative(10.202f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(18.0f, 7.798f)
                lineToRelative(-2.296f, 2.277f)
                curveToRelative(-0.393f, 0.387f, -1.025f, 0.387f, -1.414f, -0.006f)
                curveToRelative(-0.389f, -0.392f, -0.387f, -1.025f, 0.006f, -1.414f)
                lineToRelative(2.958f, -2.934f)
                curveToRelative(0.93f, -0.929f, 2.561f, -0.931f, 3.494f, 0.002f)
                lineToRelative(2.956f, 2.931f)
                curveToRelative(0.393f, 0.389f, 0.395f, 1.022f, 0.006f, 1.414f)
                close()
                moveTo(9.704f, 15.344f)
                curveToRelative(0.393f, -0.389f, 0.395f, -1.022f, 0.006f, -1.414f)
                curveToRelative(-0.391f, -0.394f, -1.022f, -0.395f, -1.414f, -0.006f)
                lineToRelative(-2.296f, 2.277f)
                lineTo(6.0f, 6.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                verticalLineToRelative(10.202f)
                lineToRelative(-2.296f, -2.277f)
                curveToRelative(-0.392f, -0.388f, -1.024f, -0.387f, -1.414f, 0.006f)
                curveToRelative(-0.389f, 0.392f, -0.387f, 1.025f, 0.006f, 1.414f)
                lineToRelative(2.955f, 2.931f)
                curveToRelative(0.467f, 0.468f, 1.088f, 0.725f, 1.749f, 0.725f)
                reflectiveCurveToRelative(1.282f, -0.257f, 1.746f, -0.722f)
                lineToRelative(2.958f, -2.934f)
                close()
            }
        }
        .build()
        return _loopSquare!!
    }

private var _loopSquare: ImageVector? = null
