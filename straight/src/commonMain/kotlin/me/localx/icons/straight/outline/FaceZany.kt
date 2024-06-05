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

public val Icons.Outline.FaceZany: ImageVector
    get() {
        if (_faceZany != null) {
            return _faceZany!!
        }
        _faceZany = Builder(name = "FaceZany", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 5.885f, -4.262f, 10.784f, -9.859f, 11.798f)
                curveToRelative(0.756f, -0.674f, 1.301f, -1.569f, 1.598f, -2.53f)
                curveToRelative(3.666f, -1.484f, 6.261f, -5.076f, 6.261f, -9.268f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 3.27f, 1.584f, 6.169f, 4.018f, 7.994f)
                curveToRelative(0.076f, 1.034f, 0.445f, 2.076f, 1.064f, 2.94f)
                curveTo(2.913f, 21.051f, 0.0f, 16.863f, 0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(13.998f, 19.701f)
                curveToRelative(-0.046f, 1.606f, -1.184f, 3.299f, -2.998f, 3.299f)
                curveToRelative(-1.853f, 0.0f, -3.0f, -1.765f, -3.0f, -3.4f)
                verticalLineToRelative(-1.593f)
                curveToRelative(-0.301f, -0.28f, -0.568f, -0.576f, -0.798f, -0.876f)
                curveToRelative(0.0f, -0.001f, 3.155f, -0.214f, 5.93f, -1.353f)
                curveToRelative(2.775f, -1.139f, 5.177f, -3.207f, 5.177f, -3.206f)
                curveToRelative(0.297f, 2.343f, -0.568f, 5.634f, -3.652f, 6.904f)
                curveToRelative(-0.221f, 0.09f, -0.441f, 0.165f, -0.659f, 0.225f)
                close()
                moveTo(12.0f, 19.6f)
                verticalLineToRelative(-1.322f)
                curveToRelative(-0.703f, 0.201f, -1.384f, 0.357f, -2.0f, 0.476f)
                verticalLineToRelative(0.846f)
                curveToRelative(0.0f, 0.662f, 0.411f, 1.4f, 1.0f, 1.4f)
                reflectiveCurveToRelative(1.0f, -0.738f, 1.0f, -1.4f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(14.5f, 12.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(14.5f, 7.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _faceZany!!
    }

private var _faceZany: ImageVector? = null
