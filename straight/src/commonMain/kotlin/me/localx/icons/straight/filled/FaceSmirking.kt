package me.localx.icons.straight.filled

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

public val Icons.Filled.FaceSmirking: ImageVector
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
                moveTo(13.0f, 9.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.652f, 0.0f, -1.202f, -0.419f, -1.408f, -1.0f)
                horizontalLineToRelative(-2.092f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(5.0f, 11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.652f, 0.0f, -1.202f, -0.419f, -1.408f, -1.0f)
                horizontalLineToRelative(-2.092f)
                close()
                moveTo(14.0f, 18.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.138f, 0.0f, 3.114f, -1.472f, 3.155f, -1.535f)
                lineToRelative(1.695f, 1.061f)
                curveToRelative(-0.062f, 0.101f, -1.57f, 2.474f, -4.85f, 2.474f)
                close()
            }
        }
        .build()
        return _faceSmirking!!
    }

private var _faceSmirking: ImageVector? = null
