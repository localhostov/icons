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

public val Icons.Filled.FaceMonocle: ImageVector
    get() {
        if (_faceMonocle != null) {
            return _faceMonocle!!
        }
        _faceMonocle = Builder(name = "FaceMonocle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                close()
                moveTo(20.0f, 20.926f)
                lineTo(20.0f, 10.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                curveToRelative(0.925f, 0.0f, 1.784f, -0.282f, 2.5f, -0.762f)
                verticalLineToRelative(8.143f)
                curveToRelative(-1.766f, 1.023f, -3.812f, 1.619f, -6.0f, 1.619f)
                curveTo(5.373f, 24.0f, 0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                curveToRelative(0.0f, 3.55f, -1.55f, 6.729f, -4.0f, 8.926f)
                close()
                moveTo(6.0f, 8.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(7.0f, 14.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                curveToRelative(0.948f, 0.0f, 3.465f, 0.0f, 5.168f, 2.555f)
                curveToRelative(0.193f, 0.289f, 0.51f, 0.445f, 0.833f, 0.445f)
                curveToRelative(0.19f, 0.0f, 0.383f, -0.055f, 0.554f, -0.168f)
                curveToRelative(0.459f, -0.307f, 0.583f, -0.927f, 0.277f, -1.387f)
                curveToRelative(-1.524f, -2.286f, -3.823f, -3.445f, -6.832f, -3.445f)
                close()
                moveTo(18.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.074f)
                curveToRelative(-0.614f, 0.551f, -1.282f, 1.039f, -2.0f, 1.455f)
                verticalLineToRelative(0.619f)
                close()
            }
        }
        .build()
        return _faceMonocle!!
    }

private var _faceMonocle: ImageVector? = null
