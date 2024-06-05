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

public val Icons.Outline.FaceSmirking: ImageVector
    get() {
        if (_faceSmirking != null) {
            return _faceSmirking!!
        }
        _faceSmirking = Builder(name = "FaceSmirking", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(17.155f, 14.465f)
                lineToRelative(1.695f, 1.061f)
                curveToRelative(-0.062f, 0.101f, -1.57f, 2.474f, -4.85f, 2.474f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.138f, 0.0f, 3.114f, -1.472f, 3.155f, -1.535f)
                close()
                moveTo(15.086f, 11.0f)
                horizontalLineToRelative(-2.086f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.653f, 0.0f, -1.208f, -0.417f, -1.414f, -1.0f)
                close()
                moveTo(7.086f, 11.0f)
                horizontalLineToRelative(-2.086f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.653f, 0.0f, -1.208f, -0.417f, -1.414f, -1.0f)
                close()
            }
        }
        .build()
        return _faceSmirking!!
    }

private var _faceSmirking: ImageVector? = null
