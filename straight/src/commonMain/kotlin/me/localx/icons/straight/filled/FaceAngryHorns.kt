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

public val Icons.Filled.FaceAngryHorns: ImageVector
    get() {
        if (_faceAngryHorns != null) {
            return _faceAngryHorns!!
        }
        _faceAngryHorns = Builder(name = "FaceAngryHorns", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                lineToRelative(-5.0f, 2.273f)
                curveToRelative(-1.973f, -1.424f, -4.386f, -2.273f, -7.0f, -2.273f)
                curveToRelative(-2.529f, 0.0f, -4.874f, 0.791f, -6.811f, 2.131f)
                lineTo(0.5f, 0.0f)
                lineTo(1.625f, 5.998f)
                curveToRelative(-1.027f, 1.768f, -1.625f, 3.814f, -1.625f, 6.002f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                curveToRelative(0.0f, -1.908f, -0.459f, -3.706f, -1.255f, -5.309f)
                lineToRelative(1.255f, -6.691f)
                close()
                moveTo(6.602f, 7.201f)
                reflectiveCurveToRelative(2.798f, 2.106f, 2.845f, 2.144f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.335f, 0.276f, 0.553f, 0.688f, 0.553f, 1.155f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.154f, 0.03f, -0.299f, 0.073f, -0.439f)
                lineToRelative(-1.674f, -1.262f)
                lineToRelative(1.203f, -1.598f)
                close()
                moveTo(16.334f, 17.746f)
                curveToRelative(-0.018f, -0.016f, -2.003f, -1.746f, -4.334f, -1.746f)
                reflectiveCurveToRelative(-4.316f, 1.73f, -4.336f, 1.747f)
                lineToRelative(-1.33f, -1.493f)
                curveToRelative(0.103f, -0.092f, 2.559f, -2.254f, 5.666f, -2.254f)
                reflectiveCurveToRelative(5.563f, 2.162f, 5.666f, 2.254f)
                lineToRelative(-1.332f, 1.492f)
                close()
                moveTo(16.927f, 10.061f)
                curveToRelative(0.043f, 0.14f, 0.073f, 0.285f, 0.073f, 0.439f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.467f, 0.218f, -0.879f, 0.553f, -1.154f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.047f, -0.038f, 2.845f, -2.144f, 2.845f, -2.144f)
                lineToRelative(1.203f, 1.598f)
                lineToRelative(-1.674f, 1.262f)
                close()
            }
        }
        .build()
        return _faceAngryHorns!!
    }

private var _faceAngryHorns: ImageVector? = null
