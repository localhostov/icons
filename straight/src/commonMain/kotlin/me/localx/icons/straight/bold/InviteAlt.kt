package me.localx.icons.straight.bold

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

public val Icons.Bold.InviteAlt: ImageVector
    get() {
        if (_inviteAlt != null) {
            return _inviteAlt!!
        }
        _inviteAlt = Builder(name = "InviteAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.985f, 13.515f)
                curveToRelative(-1.198f, -1.064f, -2.739f, -1.599f, -4.339f, -1.504f)
                curveToRelative(-1.6f, 0.094f, -3.067f, 0.806f, -4.132f, 2.004f)
                curveToRelative(-1.064f, 1.198f, -1.599f, 2.739f, -1.504f, 4.339f)
                curveToRelative(0.094f, 1.6f, 0.806f, 3.067f, 2.004f, 4.132f)
                curveToRelative(1.198f, 1.064f, 2.739f, 1.599f, 4.339f, 1.504f)
                curveToRelative(1.6f, -0.094f, 3.067f, -0.806f, 4.132f, -2.004f)
                curveToRelative(1.064f, -1.198f, 1.599f, -2.739f, 1.504f, -4.339f)
                curveToRelative(-0.094f, -1.6f, -0.806f, -3.067f, -2.004f, -4.132f)
                close()
                moveTo(18.0f, 14.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(21.0f, 20.64f)
                reflectiveCurveToRelative(-0.007f, 0.011f, -0.011f, 0.015f)
                curveToRelative(-0.68f, 0.766f, -1.652f, 1.273f, -2.753f, 1.338f)
                curveToRelative(-1.282f, 0.076f, -2.449f, -0.476f, -3.236f, -1.375f)
                verticalLineToRelative(-0.119f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(0.14f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(7.721f)
                curveToRelative(-0.815f, -0.926f, -1.838f, -1.663f, -3.0f, -2.134f)
                verticalLineToRelative(-0.587f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(7.587f)
                curveToRelative(0.471f, 1.162f, 1.208f, 2.185f, 2.134f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _inviteAlt!!
    }

private var _inviteAlt: ImageVector? = null
