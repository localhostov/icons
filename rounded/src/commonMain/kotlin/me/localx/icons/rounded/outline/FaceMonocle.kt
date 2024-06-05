package me.localx.icons.rounded.outline

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

public val Icons.Outline.FaceMonocle: ImageVector
    get() {
        if (_faceMonocle != null) {
            return _faceMonocle!!
        }
        _faceMonocle = Builder(name = "FaceMonocle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 0.733f, -0.066f, 1.467f, -0.198f, 2.181f)
                curveToRelative(-0.1f, 0.544f, -0.625f, 0.904f, -1.164f, 0.803f)
                curveToRelative(-0.543f, -0.1f, -0.903f, -0.621f, -0.803f, -1.164f)
                curveToRelative(0.109f, -0.595f, 0.165f, -1.207f, 0.165f, -1.819f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(0.927f, 0.0f, 1.844f, -0.127f, 2.728f, -0.376f)
                curveToRelative(0.534f, -0.151f, 1.084f, 0.158f, 1.234f, 0.689f)
                curveToRelative(0.15f, 0.532f, -0.159f, 1.085f, -0.69f, 1.234f)
                curveToRelative(-1.061f, 0.3f, -2.162f, 0.452f, -3.272f, 0.452f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(7.0f, 16.0f)
                curveToRelative(0.948f, 0.0f, 3.465f, 0.0f, 5.168f, 2.555f)
                curveToRelative(0.193f, 0.289f, 0.51f, 0.445f, 0.833f, 0.445f)
                curveToRelative(0.19f, 0.0f, 0.383f, -0.055f, 0.554f, -0.168f)
                curveToRelative(0.459f, -0.307f, 0.583f, -0.927f, 0.277f, -1.387f)
                curveToRelative(-1.524f, -2.286f, -3.823f, -3.445f, -6.832f, -3.445f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(7.5f, 10.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(20.0f, 10.5f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(18.0f, 14.238f)
                curveToRelative(-0.716f, 0.48f, -1.575f, 0.762f, -2.5f, 0.762f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.019f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(18.0f, 10.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _faceMonocle!!
    }

private var _faceMonocle: ImageVector? = null
