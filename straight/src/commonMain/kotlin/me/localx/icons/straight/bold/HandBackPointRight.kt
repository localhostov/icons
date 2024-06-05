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

public val Icons.Bold.HandBackPointRight: ImageVector
    get() {
        if (_handBackPointRight != null) {
            return _handBackPointRight!!
        }
        _handBackPointRight = Builder(name = "HandBackPointRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineToRelative(-5.937f)
                lineToRelative(-3.975f, -3.975f)
                curveToRelative(-1.364f, -1.365f, -3.584f, -1.365f, -4.972f, 0.022f)
                lineTo(-0.015f, 7.397f)
                lineTo(0.002f, 22.0f)
                lineTo(14.171f, 22.0f)
                lineToRelative(2.0f, -8.0f)
                horizontalLineToRelative(3.829f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(20.0f, 11.0f)
                horizontalLineToRelative(-6.171f)
                lineToRelative(-2.0f, 8.0f)
                lineTo(2.998f, 19.0f)
                lineToRelative(-0.012f, -10.397f)
                lineTo(7.26f, 4.146f)
                curveToRelative(0.196f, -0.194f, 0.513f, -0.193f, 0.708f, 0.0f)
                lineToRelative(1.854f, 1.854f)
                horizontalLineToRelative(-1.821f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _handBackPointRight!!
    }

private var _handBackPointRight: ImageVector? = null
