package me.localx.icons.straight.bold

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

public val Icons.Bold.FaceConfounded: ImageVector
    get() {
        if (_faceConfounded != null) {
            return _faceConfounded!!
        }
        _faceConfounded = Builder(name = "FaceConfounded", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                curveToRelative(0.0f, -2.267f, 3.369f, -3.0f, 5.0f, -3.0f)
                curveToRelative(0.0f, 0.0f, -2.0f, 2.0f, -2.0f, 3.0f)
                reflectiveCurveToRelative(2.0f, 3.0f, 2.0f, 3.0f)
                curveToRelative(-1.631f, 0.0f, -5.0f, -0.733f, -5.0f, -3.0f)
                close()
                moveTo(11.0f, 9.0f)
                curveToRelative(0.0f, -2.267f, -3.369f, -3.0f, -5.0f, -3.0f)
                curveToRelative(0.0f, 0.0f, 2.0f, 2.0f, 2.0f, 3.0f)
                reflectiveCurveToRelative(-2.0f, 3.0f, -2.0f, 3.0f)
                curveToRelative(1.631f, 0.0f, 5.0f, -0.733f, 5.0f, -3.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -4.963f, -4.037f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.037f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                close()
                moveTo(16.439f, 12.939f)
                lineToRelative(-1.439f, 1.439f)
                lineToRelative(-1.483f, -1.483f)
                lineToRelative(-1.51f, 1.49f)
                lineToRelative(-1.507f, -1.507f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.439f, -1.439f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(3.561f, 3.561f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.493f, 1.493f)
                lineToRelative(1.51f, -1.49f)
                lineToRelative(1.497f, 1.497f)
                lineToRelative(3.561f, -3.561f)
                lineToRelative(-2.121f, -2.121f)
                close()
            }
        }
        .build()
        return _faceConfounded!!
    }

private var _faceConfounded: ImageVector? = null
