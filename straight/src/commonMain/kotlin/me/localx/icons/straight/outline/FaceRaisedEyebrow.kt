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

public val Icons.Outline.FaceRaisedEyebrow: ImageVector
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
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(7.0f, 15.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(17.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(8.5f, 9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(10.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.205f, 6.321f)
                lineToRelative(-1.646f, 1.135f)
                curveToRelative(-0.025f, -0.031f, -0.367f, -0.456f, -1.058f, -0.456f)
                curveToRelative(-1.0f, 0.0f, -1.661f, 1.364f, -1.668f, 1.378f)
                lineToRelative(-1.821f, -0.827f)
                curveToRelative(0.047f, -0.104f, 1.177f, -2.551f, 3.489f, -2.551f)
                curveToRelative(1.744f, 0.0f, 2.612f, 1.187f, 2.705f, 1.321f)
                close()
            }
        }
        .build()
        return _faceRaisedEyebrow!!
    }

private var _faceRaisedEyebrow: ImageVector? = null
