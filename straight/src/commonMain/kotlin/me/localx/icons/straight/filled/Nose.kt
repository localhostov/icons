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

public val Icons.Filled.Nose: ImageVector
    get() {
        if (_nose != null) {
            return _nose!!
        }
        _nose = Builder(name = "Nose", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 19.439f)
                curveToRelative(-0.021f, -1.424f, -0.78f, -2.975f, -2.258f, -4.61f)
                curveToRelative(-1.452f, -1.606f, -2.898f, -4.765f, -3.955f, -7.071f)
                lineToRelative(-0.722f, -1.556f)
                curveToRelative(-0.882f, -1.872f, -1.065f, -2.262f, -1.065f, -5.202f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.239f, -5.0f, 5.0f)
                verticalLineToRelative(6.688f)
                curveToRelative(1.693f, -0.775f, 3.124f, -1.127f, 3.271f, -1.161f)
                lineToRelative(0.459f, 1.947f)
                curveToRelative(-0.077f, 0.018f, -7.73f, 1.887f, -7.73f, 6.526f)
                curveToRelative(0.0f, 2.408f, 1.564f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(2.403f)
                curveToRelative(-0.242f, -0.341f, -0.346f, -0.674f, -0.381f, -0.945f)
                curveToRelative(-0.077f, -0.595f, 0.138f, -1.029f, 0.205f, -1.148f)
                reflectiveCurveToRelative(0.331f, -0.526f, 0.88f, -0.766f)
                curveToRelative(0.47f, -0.207f, 1.249f, -0.327f, 2.282f, 0.259f)
                curveToRelative(0.644f, 0.365f, 1.157f, 0.799f, 1.652f, 1.219f)
                curveToRelative(0.847f, 0.715f, 1.535f, 1.286f, 2.685f, 1.366f)
                curveToRelative(1.958f, -0.041f, 3.426f, -0.581f, 4.337f, -1.632f)
                curveToRelative(1.024f, -1.182f, 0.972f, -2.542f, 0.936f, -2.912f)
                close()
            }
        }
        .build()
        return _nose!!
    }

private var _nose: ImageVector? = null
