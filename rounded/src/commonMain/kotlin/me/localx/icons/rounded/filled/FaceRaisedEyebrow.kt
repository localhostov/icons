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

public val Icons.Filled.FaceRaisedEyebrow: ImageVector
    get() {
        if (_faceRaisedEyebrow != null) {
            return _faceRaisedEyebrow!!
        }
        _faceRaisedEyebrow = Builder(name = "FaceRaisedEyebrow", defaultWidth = 512.0.dp,
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
                moveTo(6.0f, 7.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                close()
                moveTo(10.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(16.0f, 17.0f)
                lineTo(8.0f, 17.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(15.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.949f, 7.712f)
                curveToRelative(-0.456f, 0.312f, -1.078f, 0.197f, -1.391f, -0.256f)
                curveToRelative(-0.025f, -0.031f, -0.367f, -0.456f, -1.058f, -0.456f)
                curveToRelative(-0.972f, 0.0f, -1.569f, 1.365f, -1.575f, 1.38f)
                curveToRelative(-0.161f, 0.384f, -0.534f, 0.617f, -0.926f, 0.617f)
                curveToRelative(-0.126f, 0.0f, -0.254f, -0.024f, -0.377f, -0.074f)
                curveToRelative(-0.509f, -0.209f, -0.755f, -0.787f, -0.549f, -1.297f)
                curveToRelative(0.394f, -0.976f, 1.559f, -2.626f, 3.427f, -2.626f)
                curveToRelative(1.744f, 0.0f, 2.612f, 1.187f, 2.705f, 1.321f)
                curveToRelative(0.313f, 0.455f, 0.199f, 1.077f, -0.256f, 1.391f)
                close()
            }
        }
        .build()
        return _faceRaisedEyebrow!!
    }

private var _faceRaisedEyebrow: ImageVector? = null
