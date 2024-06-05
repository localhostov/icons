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

public val Icons.Filled.FaceZany: ImageVector
    get() {
        if (_faceZany != null) {
            return _faceZany!!
        }
        _faceZany = Builder(name = "FaceZany", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                close()
                moveTo(11.0f, 7.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(7.0f, 14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.897f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(18.31f, 12.572f)
                reflectiveCurveToRelative(-2.402f, 2.067f, -5.177f, 3.206f)
                curveToRelative(-2.775f, 1.139f, -5.931f, 1.352f, -5.93f, 1.353f)
                curveToRelative(0.229f, 0.3f, 0.497f, 0.595f, 0.798f, 0.876f)
                verticalLineToRelative(0.993f)
                curveToRelative(0.0f, 1.5f, 1.0f, 3.0f, 2.5f, 3.0f)
                reflectiveCurveToRelative(2.5f, -1.5f, 2.5f, -3.0f)
                verticalLineToRelative(-1.038f)
                curveToRelative(0.298f, -0.103f, 0.597f, -0.213f, 0.893f, -0.334f)
                curveToRelative(0.378f, -0.155f, 0.747f, -0.327f, 1.107f, -0.506f)
                verticalLineToRelative(1.878f)
                curveToRelative(0.0f, 0.103f, -0.013f, 0.201f, -0.018f, 0.302f)
                curveToRelative(2.804f, -1.366f, 3.614f, -4.477f, 3.328f, -6.73f)
                close()
            }
        }
        .build()
        return _faceZany!!
    }

private var _faceZany: ImageVector? = null
