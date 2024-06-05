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
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(14.5f, 5.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(5.0f, 12.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                close()
                moveTo(14.956f, 19.489f)
                curveToRelative(0.015f, -0.163f, 0.044f, -0.322f, 0.044f, -0.489f)
                verticalLineToRelative(-1.659f)
                curveToRelative(-0.688f, 0.334f, -1.361f, 0.595f, -2.0f, 0.809f)
                verticalLineToRelative(0.85f)
                curveToRelative(0.0f, 1.5f, -1.0f, 3.0f, -2.5f, 3.0f)
                reflectiveCurveToRelative(-2.5f, -1.5f, -2.5f, -3.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(0.012f, -0.002f)
                curveToRelative(0.003f, -0.519f, 0.394f, -0.959f, 0.92f, -0.995f)
                curveToRelative(0.051f, -0.004f, 5.168f, -0.394f, 8.347f, -3.696f)
                curveToRelative(0.294f, -0.303f, 0.745f, -0.389f, 1.128f, -0.22f)
                curveToRelative(0.384f, 0.171f, 0.62f, 0.565f, 0.59f, 0.985f)
                curveToRelative(-0.106f, 1.488f, -1.119f, 4.212f, -4.042f, 5.418f)
                close()
                moveTo(13.0f, 8.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _faceZany!!
    }

private var _faceZany: ImageVector? = null
