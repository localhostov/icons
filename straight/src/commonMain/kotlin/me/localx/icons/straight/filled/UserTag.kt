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

public val Icons.Filled.UserTag: ImageVector
    get() {
        if (_userTag != null) {
            return _userTag!!
        }
        _userTag = Builder(name = "UserTag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(4.691f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(23.169f, 16.111f)
                lineToRelative(-4.745f, -4.764f)
                lineToRelative(-6.442f, 0.852f)
                lineToRelative(-0.5f, 6.266f)
                lineToRelative(4.683f, 4.701f)
                curveToRelative(0.535f, 0.532f, 1.244f, 0.825f, 1.998f, 0.825f)
                curveToRelative(0.004f, 0.0f, 0.008f, 0.0f, 0.012f, 0.0f)
                curveToRelative(0.759f, -0.003f, 1.47f, -0.302f, 2.003f, -0.842f)
                lineToRelative(3.005f, -3.044f)
                curveToRelative(1.092f, -1.105f, 1.084f, -2.898f, -0.014f, -3.993f)
                close()
                moveTo(16.0f, 17.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(9.416f, 19.224f)
                lineToRelative(0.417f, -5.224f)
                horizontalLineToRelative(-5.332f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(14.173f)
                lineToRelative(-4.758f, -4.776f)
                close()
            }
        }
        .build()
        return _userTag!!
    }

private var _userTag: ImageVector? = null
