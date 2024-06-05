package me.localx.icons.straight.filled

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

public val Icons.Filled.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) {
            return _cameraSlash!!
        }
        _cameraSlash = Builder(name = "CameraSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 14.0f)
                curveToRelative(0.0f, -0.233f, 0.027f, -0.461f, 0.077f, -0.681f)
                lineToRelative(3.604f, 3.604f)
                curveToRelative(-0.22f, 0.051f, -0.448f, 0.077f, -0.681f, 0.077f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(14.235f, 18.477f)
                curveToRelative(-0.678f, 0.337f, -1.439f, 0.523f, -2.235f, 0.523f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.796f, 0.186f, -1.556f, 0.523f, -2.235f)
                lineTo(1.762f, 6.005f)
                curveToRelative(-0.474f, 0.531f, -0.762f, 1.23f, -0.762f, 1.995f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(17.758f)
                lineToRelative(-4.523f, -4.523f)
                close()
                moveTo(23.957f, 22.543f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(4.957f, 4.957f)
                horizontalLineToRelative(13.586f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(13.586f)
                lineToRelative(0.957f, 0.957f)
                close()
                moveTo(17.0f, 14.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-0.474f, 0.0f, -0.94f, 0.066f, -1.39f, 0.196f)
                lineToRelative(6.194f, 6.194f)
                curveToRelative(0.13f, -0.45f, 0.196f, -0.915f, 0.196f, -1.39f)
                close()
                moveTo(16.637f, 3.0f)
                lineToRelative(-1.386f, -2.0f)
                horizontalLineToRelative(-6.512f)
                lineToRelative(-1.341f, 2.0f)
                horizontalLineToRelative(9.239f)
                close()
            }
        }
        .build()
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
