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

public val Icons.Bold.VideoPlus: ImageVector
    get() {
        if (_videoPlus != null) {
            return _videoPlus!!
        }
        _videoPlus = Builder(name = "VideoPlus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.925f, 5.695f)
                curveToRelative(-0.663f, -0.332f, -1.443f, -0.262f, -2.037f, 0.183f)
                lineToRelative(-1.939f, 1.877f)
                curveToRelative(-0.365f, -2.681f, -2.669f, -4.755f, -5.449f, -4.755f)
                lineTo(5.5f, 3.0f)
                curveTo(2.467f, 3.0f, 0.0f, 5.467f, 0.0f, 8.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                lineTo(13.5f, 21.0f)
                curveToRelative(2.772f, 0.0f, 5.071f, -2.061f, 5.446f, -4.731f)
                lineToRelative(1.942f, 1.841f)
                curveToRelative(0.346f, 0.258f, 0.753f, 0.391f, 1.165f, 0.391f)
                curveToRelative(0.335f, 0.0f, 0.672f, -0.087f, 0.98f, -0.265f)
                curveToRelative(0.63f, -0.364f, 0.967f, -1.088f, 0.967f, -1.816f)
                lineTo(24.0f, 7.434f)
                curveToRelative(0.0f, -0.741f, -0.412f, -1.408f, -1.075f, -1.739f)
                close()
                moveTo(16.0f, 15.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 18.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                lineTo(13.5f, 6.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(13.5f, 12.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _videoPlus!!
    }

private var _videoPlus: ImageVector? = null
