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

public val Icons.Filled.FaceSmileUpsideDown: ImageVector
    get() {
        if (_faceSmileUpsideDown != null) {
            return _faceSmileUpsideDown!!
        }
        _faceSmileUpsideDown = Builder(name = "FaceSmileUpsideDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(8.5f, 16.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.5f, 16.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.746f, 9.666f)
                curveToRelative(-0.197f, 0.221f, -0.471f, 0.334f, -0.746f, 0.334f)
                curveToRelative(-0.237f, 0.0f, -0.475f, -0.084f, -0.666f, -0.254f)
                curveToRelative(-0.018f, -0.016f, -2.003f, -1.746f, -4.334f, -1.746f)
                reflectiveCurveToRelative(-4.316f, 1.73f, -4.336f, 1.748f)
                curveToRelative(-0.413f, 0.366f, -1.044f, 0.328f, -1.411f, -0.084f)
                curveToRelative(-0.366f, -0.412f, -0.331f, -1.042f, 0.081f, -1.409f)
                curveToRelative(0.103f, -0.092f, 2.559f, -2.254f, 5.666f, -2.254f)
                reflectiveCurveToRelative(5.563f, 2.162f, 5.666f, 2.254f)
                curveToRelative(0.412f, 0.368f, 0.448f, 1.0f, 0.08f, 1.412f)
                close()
            }
        }
        .build()
        return _faceSmileUpsideDown!!
    }

private var _faceSmileUpsideDown: ImageVector? = null
