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

public val Icons.Bold.FaceSmileHalo: ImageVector
    get() {
        if (_faceSmileHalo != null) {
            return _faceSmileHalo!!
        }
        _faceSmileHalo = Builder(name = "FaceSmileHalo", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveToRelative(4.108f, 0.0f, 11.0f, -0.455f, 11.0f, -3.5f)
                reflectiveCurveTo(16.108f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(1.0f, 0.455f, 1.0f, 3.5f)
                reflectiveCurveToRelative(6.892f, 3.5f, 11.0f, 3.5f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(2.647f, 0.0f, 4.725f, 0.228f, 6.142f, 0.5f)
                curveToRelative(-1.417f, 0.272f, -3.494f, 0.5f, -6.142f, 0.5f)
                reflectiveCurveToRelative(-4.725f, -0.228f, -6.142f, -0.5f)
                curveToRelative(1.417f, -0.272f, 3.494f, -0.5f, 6.142f, -0.5f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                curveToRelative(0.0f, -1.769f, 0.395f, -3.444f, 1.085f, -4.957f)
                curveToRelative(0.73f, 0.462f, 1.656f, 0.841f, 2.777f, 1.139f)
                curveToRelative(-0.547f, 1.161f, -0.862f, 2.452f, -0.862f, 3.818f)
                curveToRelative(0.0f, 4.962f, 4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                curveToRelative(0.0f, -1.366f, -0.315f, -2.657f, -0.862f, -3.818f)
                curveToRelative(1.121f, -0.297f, 2.047f, -0.676f, 2.777f, -1.139f)
                curveToRelative(0.69f, 1.513f, 1.085f, 3.188f, 1.085f, 4.957f)
                close()
                moveTo(11.0f, 13.0f)
                reflectiveCurveToRelative(-2.0f, -2.0f, -3.0f, -2.0f)
                reflectiveCurveToRelative(-3.0f, 2.0f, -3.0f, 2.0f)
                curveToRelative(0.0f, -1.631f, 0.733f, -5.0f, 3.0f, -5.0f)
                reflectiveCurveToRelative(3.0f, 3.369f, 3.0f, 5.0f)
                close()
                moveTo(19.0f, 13.0f)
                reflectiveCurveToRelative(-2.0f, -2.0f, -3.0f, -2.0f)
                reflectiveCurveToRelative(-3.0f, 2.0f, -3.0f, 2.0f)
                curveToRelative(0.0f, -1.631f, 0.733f, -5.0f, 3.0f, -5.0f)
                reflectiveCurveToRelative(3.0f, 3.369f, 3.0f, 5.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-3.023f, 0.0f, -5.399f, -2.092f, -5.499f, -2.181f)
                lineToRelative(1.998f, -2.237f)
                curveToRelative(0.012f, 0.01f, 1.64f, 1.418f, 3.501f, 1.418f)
                reflectiveCurveToRelative(3.489f, -1.409f, 3.506f, -1.423f)
                lineToRelative(1.993f, 2.242f)
                curveToRelative(-0.1f, 0.089f, -2.476f, 2.181f, -5.499f, 2.181f)
                close()
            }
        }
        .build()
        return _faceSmileHalo!!
    }

private var _faceSmileHalo: ImageVector? = null
