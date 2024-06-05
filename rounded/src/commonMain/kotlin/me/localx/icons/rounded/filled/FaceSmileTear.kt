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

public val Icons.Filled.FaceSmileTear: ImageVector
    get() {
        if (_faceSmileTear != null) {
            return _faceSmileTear!!
        }
        _faceSmileTear = Builder(name = "FaceSmileTear", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(8.5f, 8.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(11.001f, 17.916f)
                curveToRelative(-0.055f, 0.0f, -0.11f, -0.004f, -0.166f, -0.014f)
                curveToRelative(-2.539f, -0.424f, -4.423f, -2.085f, -4.501f, -2.156f)
                curveToRelative(-0.412f, -0.368f, -0.448f, -1.0f, -0.08f, -1.412f)
                curveToRelative(0.368f, -0.411f, 0.999f, -0.447f, 1.41f, -0.082f)
                curveToRelative(0.016f, 0.014f, 1.547f, 1.351f, 3.5f, 1.677f)
                curveToRelative(0.545f, 0.091f, 0.913f, 0.606f, 0.822f, 1.151f)
                curveToRelative(-0.082f, 0.489f, -0.505f, 0.835f, -0.985f, 0.835f)
                close()
                moveTo(15.5f, 8.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16.0f, 18.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.097f, 0.952f, -2.686f, 1.542f, -3.385f)
                curveToRelative(0.241f, -0.285f, 0.678f, -0.287f, 0.92f, -0.003f)
                curveToRelative(0.591f, 0.691f, 1.538f, 2.266f, 1.538f, 3.388f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _faceSmileTear!!
    }

private var _faceSmileTear: ImageVector? = null
