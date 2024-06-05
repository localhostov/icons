package me.localx.icons.rounded.outline

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

public val Icons.Outline.UserTag: ImageVector
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
                moveTo(21.76f, 18.7f)
                lineToRelative(-3.005f, 3.043f)
                curveToRelative(-0.157f, 0.159f, -0.366f, 0.247f, -0.588f, 0.248f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-0.222f, 0.0f, -0.43f, -0.087f, -0.584f, -0.24f)
                lineToRelative(-3.705f, -3.72f)
                curveToRelative(-0.207f, -0.207f, -0.312f, -0.493f, -0.288f, -0.785f)
                lineToRelative(0.238f, -2.979f)
                curveToRelative(0.014f, -0.172f, 0.148f, -0.313f, 0.319f, -0.336f)
                curveToRelative(0.0f, 0.0f, 3.158f, -0.414f, 3.201f, -0.414f)
                curveToRelative(0.264f, 0.0f, 0.522f, 0.106f, 0.71f, 0.295f)
                lineToRelative(3.7f, 3.714f)
                curveToRelative(0.324f, 0.322f, 0.326f, 0.85f, 0.005f, 1.175f)
                close()
                moveTo(18.0f, 16.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(8.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(11.309f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveTo(2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(8.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(10.0f, 15.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -4.963f, 4.038f, -9.0f, 9.0f, -9.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _userTag!!
    }

private var _userTag: ImageVector? = null
