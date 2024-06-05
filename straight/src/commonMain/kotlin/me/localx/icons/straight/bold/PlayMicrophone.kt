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

public val Icons.Bold.PlayMicrophone: ImageVector
    get() {
        if (_playMicrophone != null) {
            return _playMicrophone!!
        }
        _playMicrophone = Builder(name = "PlayMicrophone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.933f, -0.13f, 1.846f, -0.366f, 2.727f)
                lineToRelative(-2.735f, -1.538f)
                curveToRelative(0.062f, -0.39f, 0.101f, -0.786f, 0.101f, -1.188f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(13.0f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.934f)
                lineToRelative(2.832f, 1.593f)
                curveToRelative(0.11f, -0.496f, 0.168f, -1.007f, 0.168f, -1.526f)
                lineTo(19.0f, 7.0f)
                curveToRelative(0.0f, -3.86f, -3.141f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveTo(5.0f, 3.14f, 5.0f, 7.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 3.86f, 3.141f, 7.0f, 7.0f, 7.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(3.0f, 13.5f)
                verticalLineToRelative(-0.5f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 5.79f, 4.71f, 10.5f, 10.5f, 10.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-4.136f, 0.0f, -7.5f, -3.364f, -7.5f, -7.5f)
                close()
                moveTo(14.0f, 24.022f)
                lineToRelative(9.708f, -5.459f)
                lineToRelative(-9.708f, -5.459f)
                verticalLineToRelative(10.919f)
                close()
            }
        }
        .build()
        return _playMicrophone!!
    }

private var _playMicrophone: ImageVector? = null
