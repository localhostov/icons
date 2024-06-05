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

public val Icons.Bold.PlayPause: ImageVector
    get() {
        if (_playPause != null) {
            return _playPause!!
        }
        _playPause = Builder(name = "PlayPause", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                lineTo(21.0f, 4.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                lineTo(16.0f, 4.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(3.626f, 20.579f)
                curveToRelative(-0.559f, 0.0f, -1.12f, -0.13f, -1.641f, -0.394f)
                curveToRelative(-1.225f, -0.621f, -1.985f, -1.859f, -1.985f, -3.232f)
                lineTo(0.0f, 7.047f)
                curveToRelative(0.0f, -1.373f, 0.761f, -2.611f, 1.985f, -3.231f)
                curveToRelative(1.209f, -0.614f, 2.687f, -0.494f, 3.781f, 0.311f)
                lineToRelative(6.754f, 4.953f)
                curveToRelative(0.94f, 0.689f, 1.48f, 1.754f, 1.48f, 2.921f)
                reflectiveCurveToRelative(-0.54f, 2.232f, -1.481f, 2.922f)
                lineToRelative(-6.754f, 4.953f)
                curveToRelative(-0.635f, 0.467f, -1.384f, 0.705f, -2.139f, 0.705f)
                close()
                moveTo(3.629f, 6.418f)
                curveToRelative(-0.096f, 0.0f, -0.193f, 0.024f, -0.289f, 0.073f)
                curveToRelative(-0.223f, 0.113f, -0.341f, 0.305f, -0.341f, 0.556f)
                verticalLineToRelative(9.906f)
                curveToRelative(0.0f, 0.25f, 0.118f, 0.442f, 0.341f, 0.556f)
                curveToRelative(0.224f, 0.113f, 0.448f, 0.095f, 0.649f, -0.053f)
                lineToRelative(6.755f, -4.954f)
                curveToRelative(0.167f, -0.122f, 0.254f, -0.295f, 0.254f, -0.502f)
                reflectiveCurveToRelative(-0.088f, -0.38f, -0.254f, -0.502f)
                lineTo(3.991f, 6.544f)
                curveToRelative(-0.115f, -0.084f, -0.236f, -0.126f, -0.361f, -0.126f)
                close()
            }
        }
        .build()
        return _playPause!!
    }

private var _playPause: ImageVector? = null
