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

public val Icons.Outline.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = Builder(name = "Magnet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.785f)
                curveToRelative(0.0f, 2.16f, -1.583f, 4.003f, -3.604f, 4.196f)
                curveToRelative(-1.147f, 0.106f, -2.242f, -0.253f, -3.086f, -1.021f)
                curveToRelative(-0.833f, -0.757f, -1.31f, -1.836f, -1.31f, -2.96f)
                lineTo(8.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(8.637f)
                curveToRelative(0.0f, 6.698f, 5.5f, 12.365f, 12.002f, 12.365f)
                curveToRelative(3.165f, 0.0f, 6.143f, -1.216f, 8.405f, -3.437f)
                curveToRelative(2.316f, -2.275f, 3.593f, -5.316f, 3.593f, -8.563f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(22.0f, 12.002f)
                curveToRelative(0.0f, 2.706f, -1.063f, 5.24f, -2.994f, 7.136f)
                curveToRelative(-1.931f, 1.896f, -4.466f, 2.928f, -7.194f, 2.862f)
                curveToRelative(-5.41f, -0.099f, -9.812f, -4.748f, -9.812f, -10.363f)
                verticalLineToRelative(-4.637f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.687f, 0.716f, 3.305f, 1.965f, 4.44f)
                curveToRelative(1.248f, 1.134f, 2.928f, 1.689f, 4.622f, 1.532f)
                curveToRelative(3.036f, -0.29f, 5.414f, -3.007f, 5.414f, -6.187f)
                verticalLineToRelative(-4.785f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.002f)
                close()
                moveTo(22.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
