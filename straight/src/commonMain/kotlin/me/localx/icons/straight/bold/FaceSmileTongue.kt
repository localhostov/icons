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

public val Icons.Bold.FaceSmileTongue: ImageVector
    get() {
        if (_faceSmileTongue != null) {
            return _faceSmileTongue!!
        }
        _faceSmileTongue = Builder(name = "FaceSmileTongue", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 10.0f)
                curveToRelative(-1.0f, 0.0f, -3.0f, 2.0f, -3.0f, 2.0f)
                curveToRelative(0.0f, -1.631f, 0.733f, -5.0f, 3.0f, -5.0f)
                reflectiveCurveToRelative(3.0f, 3.369f, 3.0f, 5.0f)
                curveToRelative(0.0f, 0.0f, -2.0f, -2.0f, -3.0f, -2.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveToRelative(-2.267f, 0.0f, -3.0f, 3.369f, -3.0f, 5.0f)
                curveToRelative(0.0f, 0.0f, 2.0f, -2.0f, 3.0f, -2.0f)
                reflectiveCurveToRelative(3.0f, 2.0f, 3.0f, 2.0f)
                curveToRelative(0.0f, -1.631f, -0.733f, -5.0f, -3.0f, -5.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -4.962f, -4.038f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                curveToRelative(0.286f, 0.0f, 0.568f, -0.017f, 0.848f, -0.043f)
                curveToRelative(0.88f, 0.671f, 1.923f, 1.034f, 2.953f, 1.034f)
                curveToRelative(0.779f, 0.0f, 1.55f, -0.207f, 2.234f, -0.642f)
                curveToRelative(1.105f, -0.703f, 1.813f, -1.893f, 1.943f, -3.263f)
                curveToRelative(0.053f, -0.567f, 0.007f, -1.142f, -0.126f, -1.701f)
                curveToRelative(0.728f, -1.299f, 1.148f, -2.793f, 1.148f, -4.385f)
                close()
                moveTo(16.005f, 13.5f)
                curveToRelative(-0.019f, 0.016f, -1.872f, 1.623f, -4.005f, 1.623f)
                reflectiveCurveToRelative(-3.987f, -1.606f, -4.005f, -1.623f)
                lineToRelative(-1.994f, 2.241f)
                curveToRelative(0.109f, 0.097f, 2.704f, 2.381f, 6.0f, 2.381f)
                curveToRelative(0.322f, 0.0f, 0.635f, -0.028f, 0.941f, -0.069f)
                lineToRelative(0.3f, 0.42f)
                curveToRelative(0.805f, 1.266f, 2.454f, 1.994f, 3.72f, 1.189f)
                curveToRelative(1.266f, -0.805f, 1.304f, -2.608f, 0.499f, -3.873f)
                lineToRelative(-1.454f, -2.289f)
                close()
            }
        }
        .build()
        return _faceSmileTongue!!
    }

private var _faceSmileTongue: ImageVector? = null
