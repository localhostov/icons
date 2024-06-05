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

public val Icons.Outline.FaceConfounded: ImageVector
    get() {
        if (_faceConfounded != null) {
            return _faceConfounded!!
        }
        _faceConfounded = Builder(name = "FaceConfounded", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(16.375f, 11.781f)
                lineToRelative(-3.476f, -2.781f)
                lineToRelative(3.476f, -2.781f)
                lineToRelative(1.25f, 1.562f)
                lineToRelative(-1.524f, 1.219f)
                lineToRelative(1.524f, 1.219f)
                lineToRelative(-1.25f, 1.562f)
                close()
                moveTo(6.375f, 10.219f)
                lineToRelative(1.524f, -1.219f)
                lineToRelative(-1.524f, -1.219f)
                lineToRelative(1.25f, -1.562f)
                lineToRelative(3.476f, 2.781f)
                lineToRelative(-3.476f, 2.781f)
                lineToRelative(-1.25f, -1.562f)
                close()
                moveTo(19.087f, 15.348f)
                lineToRelative(-3.066f, 3.066f)
                lineToRelative(-2.004f, -2.004f)
                lineToRelative(-2.017f, 1.997f)
                lineToRelative(-2.021f, -2.0f)
                lineToRelative(-2.024f, 2.004f)
                lineToRelative(-3.05f, -3.052f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.644f, 1.644f)
                lineToRelative(2.017f, -1.996f)
                lineToRelative(2.021f, 2.0f)
                lineToRelative(2.024f, -2.003f)
                lineToRelative(1.996f, 1.996f)
                lineToRelative(1.652f, -1.652f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _faceConfounded!!
    }

private var _faceConfounded: ImageVector? = null
