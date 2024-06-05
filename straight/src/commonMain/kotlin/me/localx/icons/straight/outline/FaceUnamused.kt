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

public val Icons.Outline.FaceUnamused: ImageVector
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
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(18.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.653f, 0.0f, -1.208f, -0.417f, -1.414f, -1.0f)
                horizontalLineToRelative(-2.086f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(7.086f, 11.0f)
                horizontalLineToRelative(-2.086f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.653f, 0.0f, -1.208f, -0.417f, -1.414f, -1.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(1.965f, 0.0f, 3.531f, 1.149f, 3.597f, 1.198f)
                lineToRelative(-1.194f, 1.604f)
                curveToRelative(-0.007f, -0.005f, -1.114f, -0.802f, -2.403f, -0.802f)
                reflectiveCurveToRelative(-2.396f, 0.797f, -2.407f, 0.805f)
                lineToRelative(-1.19f, -1.607f)
                curveToRelative(0.066f, -0.049f, 1.632f, -1.198f, 3.597f, -1.198f)
                close()
            }
        }
        .build()
        return _faceUnamused!!
    }

private var _faceUnamused: ImageVector? = null
