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

public val Icons.Outline.FaceSmileTear: ImageVector
    get() {
        if (_faceSmileTear != null) {
            return _faceSmileTear!!
        }
        _faceSmileTear = Builder(name = "FaceSmileTear", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 9.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(8.5f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(14.0f, 16.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.59f, -2.0f, -3.6f, -2.0f, -3.6f)
                curveToRelative(0.0f, 0.0f, -2.0f, 1.969f, -2.0f, 3.6f)
                close()
                moveTo(7.664f, 14.252f)
                lineToRelative(-1.33f, 1.493f)
                curveToRelative(0.103f, 0.092f, 2.559f, 2.254f, 5.666f, 2.254f)
                curveToRelative(0.184f, 0.0f, 0.36f, -0.018f, 0.537f, -0.035f)
                curveToRelative(-0.332f, -0.583f, -0.537f, -1.247f, -0.537f, -1.965f)
                curveToRelative(-2.331f, 0.0f, -4.316f, -1.73f, -4.336f, -1.748f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                close()
            }
        }
        .build()
        return _faceSmileTear!!
    }

private var _faceSmileTear: ImageVector? = null
