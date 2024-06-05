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

public val Icons.Filled.FaceUnamused: ImageVector
    get() {
        if (_faceUnamused != null) {
            return _faceUnamused!!
        }
        _faceUnamused = Builder(name = "FaceUnamused", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(6.0f, 11.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.652f, 0.0f, -1.202f, -0.419f, -1.408f, -1.0f)
                horizontalLineToRelative(-1.092f)
                close()
                moveTo(15.802f, 18.597f)
                curveToRelative(-0.196f, 0.264f, -0.498f, 0.403f, -0.803f, 0.403f)
                curveToRelative(-0.208f, 0.0f, -0.417f, -0.064f, -0.596f, -0.198f)
                curveToRelative(-0.007f, -0.005f, -1.114f, -0.802f, -2.403f, -0.802f)
                reflectiveCurveToRelative(-2.396f, 0.797f, -2.407f, 0.805f)
                curveToRelative(-0.444f, 0.324f, -1.07f, 0.23f, -1.396f, -0.213f)
                curveToRelative(-0.326f, -0.443f, -0.235f, -1.065f, 0.206f, -1.394f)
                curveToRelative(0.066f, -0.049f, 1.632f, -1.198f, 3.597f, -1.198f)
                reflectiveCurveToRelative(3.531f, 1.149f, 3.597f, 1.198f)
                curveToRelative(0.443f, 0.33f, 0.535f, 0.957f, 0.205f, 1.399f)
                close()
                moveTo(16.5f, 12.0f)
                curveToRelative(-0.652f, 0.0f, -1.202f, -0.419f, -1.408f, -1.0f)
                horizontalLineToRelative(-1.092f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _faceUnamused!!
    }

private var _faceUnamused: ImageVector? = null
