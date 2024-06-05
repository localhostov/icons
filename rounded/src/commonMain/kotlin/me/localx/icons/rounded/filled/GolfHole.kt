package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.GolfHole: ImageVector
    get() {
        if (_golfHole != null) {
            return _golfHole!!
        }
        _golfHole = Builder(name = "GolfHole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-5.689f)
                lineToRelative(6.669f, -3.271f)
                curveToRelative(0.762f, -0.399f, 1.257f, -1.149f, 1.323f, -2.006f)
                curveToRelative(0.067f, -0.858f, -0.306f, -1.676f, -1.034f, -2.214f)
                lineTo(14.77f, 0.323f)
                curveToRelative(-0.035f, -0.024f, -0.073f, -0.046f, -0.112f, -0.065f)
                curveToRelative(-0.762f, -0.38f, -1.761f, -0.332f, -2.487f, 0.117f)
                curveToRelative(-0.438f, 0.27f, -1.17f, 0.931f, -1.17f, 2.318f)
                verticalLineToRelative(14.308f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(16.175f, 12.355f)
                curveToRelative(-0.295f, -0.054f, -0.591f, 0.029f, -0.817f, 0.219f)
                reflectiveCurveToRelative(-0.357f, 0.47f, -0.357f, 0.766f)
                verticalLineToRelative(3.66f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-3.66f)
                curveToRelative(0.0f, -0.296f, -0.131f, -0.576f, -0.357f, -0.766f)
                reflectiveCurveToRelative(-0.521f, -0.271f, -0.817f, -0.219f)
                curveToRelative(-4.826f, 0.855f, -7.825f, 3.018f, -7.825f, 5.645f)
                curveToRelative(0.0f, 3.42f, 5.159f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(12.0f, -2.58f, 12.0f, -6.0f)
                curveToRelative(0.0f, -2.626f, -2.999f, -4.789f, -7.825f, -5.645f)
                close()
            }
        }
        .build()
        return _golfHole!!
    }

private var _golfHole: ImageVector? = null
