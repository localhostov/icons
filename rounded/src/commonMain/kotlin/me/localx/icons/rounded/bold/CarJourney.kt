package me.localx.icons.rounded.bold

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

public val Icons.Bold.CarJourney: ImageVector
    get() {
        if (_carJourney != null) {
            return _carJourney!!
        }
        _carJourney = Builder(name = "CarJourney", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.5f, 19.0f)
                horizontalLineToRelative(-0.919f)
                lineToRelative(-1.631f, -2.94f)
                curveToRelative(-0.705f, -1.271f, -2.044f, -2.06f, -3.498f, -2.06f)
                horizontalLineToRelative(-2.452f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.77f, 0.44f, 1.43f, 1.077f, 1.764f)
                curveToRelative(-0.045f, 0.155f, -0.077f, 0.316f, -0.077f, 0.486f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.784f, 1.75f, -1.75f)
                curveToRelative(0.0f, -0.086f, -0.013f, -0.168f, -0.025f, -0.25f)
                horizontalLineToRelative(3.05f)
                curveToRelative(-0.012f, 0.082f, -0.025f, 0.164f, -0.025f, 0.25f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.784f, 1.75f, -1.75f)
                curveToRelative(0.0f, -0.086f, -0.013f, -0.168f, -0.025f, -0.25f)
                horizontalLineToRelative(0.525f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(3.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.452f)
                curveToRelative(0.363f, 0.0f, 0.698f, 0.197f, 0.874f, 0.515f)
                lineToRelative(0.824f, 1.485f)
                lineTo(3.0f, 19.0f)
                close()
                moveTo(17.0f, 8.5f)
                lineTo(17.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.66f, 0.0f, 1.315f, 0.128f, 1.926f, 0.377f)
                lineToRelative(3.095f, 1.259f)
                curveToRelative(0.639f, 0.399f, 0.639f, 1.329f, 0.0f, 1.729f)
                lineToRelative(-3.521f, 1.636f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 17.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.019f, -4.5f, 4.5f, -4.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
            }
        }
        .build()
        return _carJourney!!
    }

private var _carJourney: ImageVector? = null
