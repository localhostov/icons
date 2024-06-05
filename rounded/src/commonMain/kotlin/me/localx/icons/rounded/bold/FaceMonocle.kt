package me.localx.icons.rounded.bold

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

public val Icons.Bold.FaceMonocle: ImageVector
    get() {
        if (_faceMonocle != null) {
            return _faceMonocle!!
        }
        _faceMonocle = Builder(name = "FaceMonocle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 0.731f, -0.066f, 1.465f, -0.198f, 2.181f)
                curveToRelative(-0.15f, 0.814f, -0.936f, 1.349f, -1.746f, 1.204f)
                curveToRelative(-0.815f, -0.15f, -1.354f, -0.932f, -1.204f, -1.747f)
                curveToRelative(0.099f, -0.536f, 0.148f, -1.088f, 0.148f, -1.638f)
                curveToRelative(0.0f, -4.963f, -4.038f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.037f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                curveToRelative(0.144f, 0.0f, 0.287f, -0.003f, 0.429f, -0.01f)
                curveToRelative(0.841f, -0.023f, 1.53f, 0.601f, 1.569f, 1.428f)
                reflectiveCurveToRelative(-0.6f, 1.529f, -1.428f, 1.568f)
                curveToRelative(-0.189f, 0.009f, -0.379f, 0.014f, -0.571f, 0.014f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(7.5f, 17.0f)
                curveToRelative(1.078f, 0.0f, 2.442f, 0.189f, 3.429f, 1.671f)
                curveToRelative(0.289f, 0.434f, 0.765f, 0.668f, 1.25f, 0.668f)
                curveToRelative(0.286f, 0.0f, 0.575f, -0.081f, 0.831f, -0.252f)
                curveToRelative(0.689f, -0.459f, 0.875f, -1.391f, 0.416f, -2.08f)
                curveToRelative(-1.33f, -1.995f, -3.324f, -3.007f, -5.925f, -3.007f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(9.0f, 9.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
                moveTo(18.969f, 10.197f)
                curveToRelative(0.02f, 0.098f, 0.031f, 12.303f, 0.031f, 12.303f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-7.776f)
                curveToRelative(-0.471f, 0.168f, -0.971f, 0.276f, -1.5f, 0.276f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.019f, -4.5f, 4.5f, -4.5f)
                curveToRelative(2.378f, 0.0f, 4.31f, 1.859f, 4.469f, 4.197f)
                close()
                moveTo(16.0f, 10.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _faceMonocle!!
    }

private var _faceMonocle: ImageVector? = null
