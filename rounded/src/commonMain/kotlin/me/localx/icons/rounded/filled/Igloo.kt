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

public val Icons.Filled.Igloo: ImageVector
    get() {
        if (_igloo != null) {
            return _igloo!!
        }
        _igloo = Builder(name = "Igloo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 0.057f)
                curveToRelative(4.402f, 0.366f, 8.136f, 3.105f, 9.903f, 6.943f)
                lineTo(13.0f, 7.0f)
                lineTo(13.0f, 0.057f)
                close()
                moveTo(7.0f, 9.0f)
                lineTo(0.456f, 9.0f)
                curveToRelative(-0.296f, 1.074f, -0.456f, 2.199f, -0.456f, 3.351f)
                verticalLineToRelative(3.649f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, -1.038f, -0.147f, -2.039f, -0.396f, -3.0f)
                horizontalLineToRelative(-6.604f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(11.0f, 7.0f)
                lineTo(11.0f, 0.048f)
                curveToRelative(-0.052f, 0.004f, -0.103f, 0.001f, -0.156f, 0.006f)
                curveTo(6.512f, 0.462f, 2.959f, 3.241f, 1.198f, 7.0f)
                lineTo(11.0f, 7.0f)
                close()
                moveTo(16.0f, 18.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(2.485f, 0.0f, 4.5f, -2.015f, 4.5f, -4.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(0.0f, 19.5f)
                curveToRelative(0.0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(15.0f, 15.38f)
                verticalLineToRelative(-6.38f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.38f)
                curveToRelative(0.733f, -0.839f, 1.798f, -1.38f, 3.0f, -1.38f)
                reflectiveCurveToRelative(2.267f, 0.541f, 3.0f, 1.38f)
                close()
            }
        }
        .build()
        return _igloo!!
    }

private var _igloo: ImageVector? = null
