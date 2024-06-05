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

public val Icons.Bold.HoneyPot: ImageVector
    get() {
        if (_honeyPot != null) {
            return _honeyPot!!
        }
        _honeyPot = Builder(name = "HoneyPot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 3.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                lineTo(1.5f, 0.0f)
                curveTo(0.671f, 0.0f, 0.0f, 0.671f, 0.0f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.346f)
                curveTo(0.687f, 5.111f, 0.0f, 7.632f, 0.0f, 10.0f)
                curveToRelative(0.0f, 4.322f, 2.732f, 9.356f, 3.907f, 11.32f)
                curveToRelative(0.989f, 1.652f, 2.8f, 2.68f, 4.727f, 2.68f)
                horizontalLineToRelative(6.733f)
                curveToRelative(1.926f, 0.0f, 3.737f, -1.027f, 4.727f, -2.681f)
                curveToRelative(1.175f, -1.963f, 3.907f, -6.997f, 3.907f, -11.319f)
                curveToRelative(0.0f, -2.368f, -0.687f, -4.889f, -1.846f, -7.0f)
                horizontalLineToRelative(0.346f)
                close()
                moveTo(21.0f, 10.0f)
                curveToRelative(0.0f, 2.442f, -1.334f, 6.19f, -3.481f, 9.779f)
                curveToRelative(-0.451f, 0.753f, -1.275f, 1.221f, -2.152f, 1.221f)
                horizontalLineToRelative(-6.733f)
                curveToRelative(-0.877f, 0.0f, -1.702f, -0.468f, -2.152f, -1.22f)
                curveToRelative(-2.147f, -3.59f, -3.481f, -7.338f, -3.481f, -9.78f)
                reflectiveCurveToRelative(0.961f, -5.167f, 2.432f, -7.0f)
                horizontalLineToRelative(0.568f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.568f)
                curveToRelative(1.471f, 1.833f, 2.432f, 4.561f, 2.432f, 7.0f)
                close()
            }
        }
        .build()
        return _honeyPot!!
    }

private var _honeyPot: ImageVector? = null
