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

public val Icons.Bold.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) {
            return _cameraSlash!!
        }
        _cameraSlash = Builder(name = "CameraSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 18.0f)
                curveToRelative(-2.485f, 0.0f, -4.5f, -2.015f, -4.5f, -4.5f)
                curveToRelative(0.0f, -0.317f, 0.034f, -0.625f, 0.097f, -0.924f)
                lineToRelative(5.327f, 5.327f)
                curveToRelative(-0.298f, 0.062f, -0.607f, 0.097f, -0.924f, 0.097f)
                close()
                moveTo(23.961f, 21.84f)
                lineToRelative(-2.121f, 2.121f)
                lineTo(0.039f, 2.16f)
                lineTo(2.16f, 0.039f)
                lineToRelative(4.323f, 4.323f)
                lineToRelative(2.137f, -2.362f)
                horizontalLineToRelative(6.76f)
                lineToRelative(2.715f, 3.0f)
                horizontalLineToRelative(1.405f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(12.379f)
                lineToRelative(0.961f, 0.961f)
                close()
                moveTo(8.607f, 6.486f)
                lineToRelative(2.588f, 2.588f)
                curveToRelative(0.261f, -0.048f, 0.53f, -0.074f, 0.805f, -0.074f)
                curveToRelative(2.485f, 0.0f, 4.5f, 2.015f, 4.5f, 4.5f)
                curveToRelative(0.0f, 0.275f, -0.026f, 0.544f, -0.074f, 0.805f)
                lineToRelative(3.574f, 3.574f)
                verticalLineToRelative(-9.379f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.737f)
                lineToRelative(-2.715f, -3.0f)
                horizontalLineToRelative(-4.096f)
                lineToRelative(-1.345f, 1.486f)
                close()
                moveTo(3.949f, 20.0f)
                verticalLineToRelative(-11.051f)
                lineToRelative(-2.403f, -2.403f)
                curveToRelative(-0.377f, 0.558f, -0.597f, 1.231f, -0.597f, 1.953f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(17.051f)
                lineToRelative(-3.0f, -3.0f)
                lineTo(3.949f, 19.999f)
                close()
            }
        }
        .build()
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
