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

public val Icons.Bold.FacePersevering: ImageVector
    get() {
        if (_facePersevering != null) {
            return _facePersevering!!
        }
        _facePersevering = Builder(name = "FacePersevering", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.037f, 3.0f, 3.0f, 7.037f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                reflectiveCurveTo(16.963f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(13.0f, 13.0f)
                curveToRelative(0.0f, 2.267f, 3.369f, 3.0f, 5.0f, 3.0f)
                curveToRelative(0.0f, 0.0f, -2.0f, -2.0f, -2.0f, -3.0f)
                reflectiveCurveToRelative(2.0f, -3.0f, 2.0f, -3.0f)
                curveToRelative(-1.631f, 0.0f, -5.0f, 0.733f, -5.0f, 3.0f)
                close()
                moveTo(11.0f, 13.0f)
                curveToRelative(0.0f, -2.267f, -3.369f, -3.0f, -5.0f, -3.0f)
                curveToRelative(0.0f, 0.0f, 2.0f, 2.0f, 2.0f, 3.0f)
                reflectiveCurveToRelative(-2.0f, 3.0f, -2.0f, 3.0f)
                curveToRelative(1.631f, 0.0f, 5.0f, -0.733f, 5.0f, -3.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(1.117f, 0.0f, 2.103f, 0.702f, 2.104f, 0.703f)
                lineToRelative(1.791f, -2.406f)
                curveToRelative(-0.178f, -0.133f, -1.802f, -1.297f, -3.896f, -1.297f)
                reflectiveCurveToRelative(-3.718f, 1.164f, -3.896f, 1.297f)
                lineToRelative(1.783f, 2.412f)
                curveToRelative(0.01f, -0.007f, 0.995f, -0.709f, 2.112f, -0.709f)
                close()
                moveTo(9.332f, 6.555f)
                lineToRelative(-1.664f, -1.109f)
                curveToRelative(-0.772f, 1.158f, -1.852f, 2.058f, -3.039f, 2.531f)
                lineToRelative(0.74f, 1.857f)
                curveToRelative(1.583f, -0.631f, 2.953f, -1.766f, 3.963f, -3.279f)
                close()
                moveTo(19.371f, 7.977f)
                curveToRelative(-1.188f, -0.474f, -2.267f, -1.373f, -3.039f, -2.531f)
                lineToRelative(-1.664f, 1.109f)
                curveToRelative(1.01f, 1.514f, 2.38f, 2.648f, 3.963f, 3.279f)
                lineToRelative(0.74f, -1.857f)
                close()
            }
        }
        .build()
        return _facePersevering!!
    }

private var _facePersevering: ImageVector? = null
