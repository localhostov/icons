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

public val Icons.Bold.ToiletsPortable: ImageVector
    get() {
        if (_toiletsPortable != null) {
            return _toiletsPortable!!
        }
        _toiletsPortable = Builder(name = "ToiletsPortable", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.412f, 0.592f)
                curveToRelative(-2.105f, -0.785f, -4.219f, -0.785f, -6.324f, 0.0f)
                curveToRelative(-0.81f, 0.302f, -1.518f, 0.786f, -2.088f, 1.394f)
                curveToRelative(-0.57f, -0.608f, -1.278f, -1.092f, -2.088f, -1.394f)
                curveTo(7.807f, -0.193f, 5.693f, -0.193f, 3.588f, 0.592f)
                curveTo(1.441f, 1.393f, 0.0f, 3.467f, 0.0f, 5.753f)
                verticalLineToRelative(16.747f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                lineTo(24.0f, 5.753f)
                curveToRelative(0.0f, -2.286f, -1.441f, -4.36f, -3.588f, -5.161f)
                close()
                moveTo(15.137f, 3.403f)
                curveToRelative(1.432f, -0.534f, 2.795f, -0.534f, 4.227f, 0.0f)
                curveToRelative(0.735f, 0.274f, 1.288f, 0.875f, 1.519f, 1.598f)
                horizontalLineToRelative(-7.265f)
                curveToRelative(0.231f, -0.723f, 0.784f, -1.323f, 1.519f, -1.598f)
                close()
                moveTo(4.637f, 3.403f)
                curveToRelative(1.432f, -0.534f, 2.795f, -0.534f, 4.227f, 0.0f)
                curveToRelative(0.735f, 0.274f, 1.288f, 0.875f, 1.519f, 1.598f)
                lineTo(3.118f, 5.001f)
                curveToRelative(0.231f, -0.723f, 0.784f, -1.323f, 1.519f, -1.598f)
                close()
                moveTo(3.0f, 8.001f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 19.001f)
                verticalLineToRelative(-11.0f)
                close()
                moveTo(13.5f, 19.001f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }
        .build()
        return _toiletsPortable!!
    }

private var _toiletsPortable: ImageVector? = null
