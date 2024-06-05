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

public val Icons.Filled.FaceSmileTongue: ImageVector
    get() {
        if (_faceSmileTongue != null) {
            return _faceSmileTongue!!
        }
        _faceSmileTongue = Builder(name = "FaceSmileTongue", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(5.0f, 11.0f)
                curveToRelative(0.0f, -1.892f, 1.232f, -4.0f, 3.0f, -4.0f)
                reflectiveCurveToRelative(3.0f, 2.108f, 3.0f, 4.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.054f, -0.679f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(17.648f, 20.606f)
                curveToRelative(-0.454f, 0.274f, -0.932f, 0.395f, -1.404f, 0.395f)
                curveToRelative(-1.18f, 0.0f, -2.318f, -0.753f, -2.922f, -1.753f)
                lineToRelative(-0.767f, -1.27f)
                curveToRelative(-0.182f, 0.014f, -0.367f, 0.021f, -0.555f, 0.021f)
                curveToRelative(-3.107f, 0.0f, -5.563f, -2.162f, -5.666f, -2.254f)
                curveToRelative(-0.412f, -0.368f, -0.448f, -1.0f, -0.08f, -1.412f)
                curveToRelative(0.367f, -0.411f, 0.999f, -0.448f, 1.41f, -0.082f)
                curveToRelative(0.022f, 0.02f, 2.006f, 1.748f, 4.336f, 1.748f)
                curveToRelative(2.35f, 0.0f, 4.068f, -1.527f, 4.085f, -1.542f)
                curveToRelative(0.224f, -0.202f, 0.528f, -0.294f, 0.825f, -0.246f)
                curveToRelative(0.298f, 0.047f, 0.559f, 0.226f, 0.71f, 0.487f)
                lineToRelative(0.846f, 1.462f)
                curveToRelative(0.836f, 1.383f, 0.768f, 3.486f, -0.818f, 4.445f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.054f, -0.679f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.892f, 1.232f, -4.0f, 3.0f, -4.0f)
                reflectiveCurveToRelative(3.0f, 2.108f, 3.0f, 4.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(16.745f, 17.18f)
                curveToRelative(0.343f, 0.566f, 0.373f, 1.411f, -0.131f, 1.715f)
                curveToRelative(-0.505f, 0.307f, -1.238f, -0.114f, -1.58f, -0.681f)
                lineToRelative(-0.409f, -0.677f)
                curveToRelative(0.734f, -0.259f, 1.352f, -0.587f, 1.819f, -0.879f)
                lineToRelative(0.301f, 0.521f)
                close()
            }
        }
        .build()
        return _faceSmileTongue!!
    }

private var _faceSmileTongue: ImageVector? = null
