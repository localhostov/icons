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

public val Icons.Bold.Swatchbook: ImageVector
    get() {
        if (_swatchbook != null) {
            return _swatchbook!!
        }
        _swatchbook = Builder(name = "Swatchbook", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.39f, 12.039f)
                curveToRelative(1.287f, -1.57f, 1.217f, -3.888f, -0.248f, -5.353f)
                lineToRelative(-2.829f, -2.829f)
                curveToRelative(-1.464f, -1.464f, -3.782f, -1.535f, -5.353f, -0.248f)
                curveToRelative(-0.199f, -2.021f, -1.889f, -3.61f, -3.961f, -3.61f)
                horizontalLineToRelative(-4.0f)
                curveTo(1.794f, 0.0f, 0.0f, 1.794f, 0.0f, 4.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.072f, -1.589f, -3.761f, -3.61f, -3.961f)
                close()
                moveTo(15.192f, 5.979f)
                lineToRelative(2.829f, 2.829f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.415f)
                lineToRelative(-6.021f, 6.021f)
                lineTo(12.0f, 7.757f)
                lineToRelative(1.778f, -1.778f)
                curveToRelative(0.389f, -0.39f, 1.024f, -0.391f, 1.415f, 0.0f)
                close()
                moveTo(3.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 12.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(3.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(21.0f, 20.0f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-8.515f)
                lineToRelative(6.0f, -6.0f)
                horizontalLineToRelative(2.514f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(6.0f, 19.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _swatchbook!!
    }

private var _swatchbook: ImageVector? = null
