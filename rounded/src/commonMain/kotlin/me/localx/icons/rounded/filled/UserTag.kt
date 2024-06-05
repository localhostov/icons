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
                moveToRelative(23.169f, 16.111f)
                lineToRelative(-3.698f, -3.712f)
                curveToRelative(-0.657f, -0.658f, -1.599f, -0.983f, -2.518f, -0.856f)
                lineToRelative(-3.073f, 0.405f)
                curveToRelative(-1.1f, 0.146f, -1.962f, 1.055f, -2.05f, 2.16f)
                lineToRelative(-0.238f, 2.979f)
                curveToRelative(-0.069f, 0.875f, 0.246f, 1.733f, 0.865f, 2.355f)
                lineToRelative(3.708f, 3.723f)
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
                moveTo(14.173f, 24.0f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -4.963f, 4.038f, -9.0f, 9.0f, -9.0f)
                curveToRelative(0.28f, 0.0f, 0.556f, 0.017f, 0.829f, 0.042f)
                lineToRelative(-0.23f, 2.888f)
                curveToRelative(-0.116f, 1.458f, 0.41f, 2.888f, 1.442f, 3.925f)
                lineToRelative(3.133f, 3.146f)
                close()
                moveTo(8.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(4.691f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _userTag!!
    }

private var _userTag: ImageVector? = null
