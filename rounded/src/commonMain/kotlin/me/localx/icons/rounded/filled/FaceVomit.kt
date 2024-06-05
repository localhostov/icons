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

public val Icons.Filled.FaceVomit: ImageVector
    get() {
        if (_faceVomit != null) {
            return _faceVomit!!
        }
        _faceVomit = Builder(name = "FaceVomit", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(22.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-4.115f)
                curveToRelative(-0.818f, -0.443f, -1.907f, -0.885f, -3.0f, -0.885f)
                reflectiveCurveToRelative(-2.182f, 0.442f, -3.0f, 0.885f)
                verticalLineToRelative(4.115f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 3.509f, -1.515f, 6.656f, -3.916f, 8.85f)
                curveToRelative(-0.54f, -0.524f, -1.274f, -0.85f, -2.084f, -0.85f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.296f, 0.0f, 0.589f, -0.131f, 0.787f, -0.383f)
                curveToRelative(0.341f, -0.435f, 0.265f, -1.063f, -0.169f, -1.404f)
                curveToRelative(-0.849f, -0.666f, -3.094f, -2.213f, -5.617f, -2.213f)
                reflectiveCurveToRelative(-4.769f, 1.548f, -5.617f, 2.213f)
                curveToRelative(-0.435f, 0.341f, -0.511f, 0.969f, -0.169f, 1.404f)
                curveToRelative(0.198f, 0.251f, 0.491f, 0.367f, 0.787f, 0.367f)
                verticalLineToRelative(3.015f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.379f, 0.0f, -0.738f, 0.077f, -1.071f, 0.206f)
                curveToRelative(0.047f, -0.228f, 0.071f, -0.464f, 0.071f, -0.706f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.264f, 0.0f, -0.519f, 0.035f, -0.766f, 0.09f)
                curveToRelative(-0.467f, -1.277f, -0.734f, -2.65f, -0.734f, -4.09f)
                curveTo(0.0f, 5.373f, 5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                close()
                moveTo(11.0f, 9.0f)
                curveToRelative(0.0f, -0.334f, -0.167f, -0.646f, -0.445f, -0.832f)
                lineToRelative(-3.0f, -2.0f)
                curveToRelative(-0.46f, -0.307f, -1.081f, -0.182f, -1.387f, 0.277f)
                curveToRelative(-0.306f, 0.459f, -0.182f, 1.081f, 0.277f, 1.387f)
                lineToRelative(1.752f, 1.168f)
                lineToRelative(-1.752f, 1.168f)
                curveToRelative(-0.459f, 0.306f, -0.583f, 0.927f, -0.277f, 1.387f)
                curveToRelative(0.193f, 0.289f, 0.51f, 0.445f, 0.833f, 0.445f)
                curveToRelative(0.19f, 0.0f, 0.383f, -0.054f, 0.554f, -0.168f)
                lineToRelative(3.0f, -2.0f)
                curveToRelative(0.278f, -0.186f, 0.445f, -0.498f, 0.445f, -0.832f)
                close()
                moveTo(15.803f, 9.0f)
                lineToRelative(1.752f, -1.168f)
                curveToRelative(0.459f, -0.306f, 0.583f, -0.927f, 0.277f, -1.387f)
                curveToRelative(-0.306f, -0.459f, -0.928f, -0.584f, -1.387f, -0.277f)
                lineToRelative(-3.0f, 2.0f)
                curveToRelative(-0.278f, 0.186f, -0.445f, 0.498f, -0.445f, 0.832f)
                reflectiveCurveToRelative(0.167f, 0.646f, 0.445f, 0.832f)
                lineToRelative(3.0f, 2.0f)
                curveToRelative(0.17f, 0.114f, 0.363f, 0.168f, 0.554f, 0.168f)
                curveToRelative(0.323f, 0.0f, 0.64f, -0.156f, 0.833f, -0.445f)
                curveToRelative(0.306f, -0.459f, 0.182f, -1.081f, -0.277f, -1.387f)
                lineToRelative(-1.752f, -1.168f)
                close()
            }
        }
        .build()
        return _faceVomit!!
    }

private var _faceVomit: ImageVector? = null
