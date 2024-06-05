package me.localx.icons.straight.outline

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

public val Icons.Outline.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) {
            return _cameraSlash!!
        }
        _cameraSlash = Builder(name = "CameraSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 21.586f)
                verticalLineToRelative(-13.586f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.017f)
                lineToRelative(-2.727f, -4.0f)
                horizontalLineToRelative(-6.512f)
                lineToRelative(-2.566f, 3.764f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-0.957f, -0.957f)
                close()
                moveTo(21.0f, 8.0f)
                verticalLineToRelative(11.586f)
                lineToRelative(-4.196f, -4.196f)
                curveToRelative(0.13f, -0.45f, 0.196f, -0.915f, 0.196f, -1.39f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-0.474f, 0.0f, -0.94f, 0.066f, -1.39f, 0.196f)
                lineToRelative(-2.196f, -2.196f)
                horizontalLineToRelative(11.586f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(9.801f, 3.0f)
                horizontalLineToRelative(4.398f)
                lineToRelative(1.363f, 2.0f)
                horizontalLineToRelative(-7.125f)
                lineToRelative(1.363f, -2.0f)
                close()
                moveTo(9.077f, 13.319f)
                curveToRelative(-0.051f, 0.22f, -0.077f, 0.448f, -0.077f, 0.681f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.233f, 0.0f, 0.461f, -0.027f, 0.681f, -0.077f)
                lineToRelative(1.554f, 1.554f)
                curveToRelative(-0.678f, 0.337f, -1.439f, 0.523f, -2.235f, 0.523f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.796f, 0.186f, -1.556f, 0.523f, -2.235f)
                lineToRelative(1.554f, 1.554f)
                close()
                moveTo(16.758f, 21.0f)
                lineToRelative(2.0f, 2.0f)
                lineTo(1.0f, 23.0f)
                verticalLineToRelative(-15.0f)
                curveToRelative(0.0f, -0.766f, 0.289f, -1.465f, 0.762f, -1.995f)
                lineToRelative(1.42f, 1.42f)
                curveToRelative(-0.115f, 0.163f, -0.183f, 0.361f, -0.183f, 0.575f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(13.758f)
                close()
            }
        }
        .build()
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
