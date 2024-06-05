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

public val Icons.Bold.HandBackFist: ImageVector
    get() {
        if (_handBackFist != null) {
            return _handBackFist!!
        }
        _handBackFist = Builder(name = "HandBackFist", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 0.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(0.937f)
                lineToRelative(-3.975f, 3.975f)
                curveToRelative(-1.365f, 1.365f, -1.365f, 3.585f, 0.022f, 4.972f)
                lineToRelative(3.952f, 3.791f)
                verticalLineToRelative(6.326f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-5.711f)
                lineToRelative(1.606f, -4.016f)
                curveToRelative(0.261f, -0.652f, 0.394f, -1.34f, 0.394f, -2.044f)
                lineTo(22.999f, 2.181f)
                reflectiveCurveTo(11.448f, 0.0f, 10.0f, 0.0f)
                close()
                moveTo(20.0f, 12.229f)
                curveToRelative(0.0f, 0.32f, -0.06f, 0.632f, -0.179f, 0.929f)
                lineToRelative(-1.821f, 4.553f)
                verticalLineToRelative(3.289f)
                lineTo(9.0f, 21.0f)
                verticalLineToRelative(-4.605f)
                lineToRelative(-4.854f, -4.655f)
                curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0.0f, -0.708f)
                lineToRelative(1.854f, -1.854f)
                verticalLineToRelative(1.821f)
                horizontalLineToRelative(3.0f)
                lineTo(9.0f, 4.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.714f, 0.0f, 5.437f, 0.812f, 10.0f, 1.667f)
                verticalLineToRelative(7.563f)
                close()
            }
        }
        .build()
        return _handBackFist!!
    }

private var _handBackFist: ImageVector? = null
