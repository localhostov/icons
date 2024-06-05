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

public val Icons.Outline.Drum: ImageVector
    get() {
        if (_drum != null) {
            return _drum!!
        }
        _drum = Builder(name = "Drum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.516f, 10.226f)
                lineTo(22.631f, 0.014f)
                lineToRelative(1.354f, 1.473f)
                lineToRelative(-11.115f, 10.212f)
                lineToRelative(-1.354f, -1.473f)
                close()
                moveTo(24.0f, 9.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 3.584f, -5.383f, 6.5f, -12.0f, 6.5f)
                reflectiveCurveTo(0.0f, 21.084f, 0.0f, 17.5f)
                verticalLineToRelative(-8.0f)
                curveTo(0.0f, 5.855f, 5.271f, 3.0f, 12.0f, 3.0f)
                curveToRelative(1.42f, 0.0f, 2.775f, 0.128f, 4.03f, 0.363f)
                lineToRelative(-1.899f, 1.744f)
                curveToRelative(-0.679f, -0.07f, -1.391f, -0.107f, -2.131f, -0.107f)
                curveToRelative(-5.894f, 0.0f, -10.0f, 2.371f, -10.0f, 4.5f)
                reflectiveCurveToRelative(4.106f, 4.5f, 10.0f, 4.5f)
                reflectiveCurveToRelative(10.0f, -2.371f, 10.0f, -4.5f)
                curveToRelative(0.0f, -0.74f, -0.496f, -1.509f, -1.391f, -2.197f)
                lineToRelative(1.485f, -1.364f)
                curveToRelative(1.209f, 1.017f, 1.906f, 2.237f, 1.906f, 3.561f)
                close()
                moveTo(11.0f, 15.978f)
                curveToRelative(-1.424f, -0.061f, -2.77f, -0.251f, -4.0f, -0.549f)
                verticalLineToRelative(5.914f)
                curveToRelative(1.186f, 0.333f, 2.537f, 0.56f, 4.0f, 0.631f)
                verticalLineToRelative(-5.997f)
                close()
                moveTo(13.0f, 21.975f)
                curveToRelative(1.463f, -0.072f, 2.814f, -0.298f, 4.0f, -0.631f)
                verticalLineToRelative(-5.914f)
                curveToRelative(-1.23f, 0.298f, -2.576f, 0.488f, -4.0f, 0.549f)
                verticalLineToRelative(5.997f)
                close()
                moveTo(5.0f, 20.615f)
                verticalLineToRelative(-5.803f)
                curveToRelative(-1.181f, -0.453f, -2.198f, -1.019f, -3.0f, -1.673f)
                verticalLineToRelative(4.361f)
                curveToRelative(0.0f, 1.091f, 1.128f, 2.248f, 3.0f, 3.115f)
                close()
                moveTo(22.0f, 17.5f)
                verticalLineToRelative(-4.361f)
                curveToRelative(-0.802f, 0.654f, -1.819f, 1.22f, -3.0f, 1.673f)
                verticalLineToRelative(5.803f)
                curveToRelative(1.872f, -0.868f, 3.0f, -2.025f, 3.0f, -3.115f)
                close()
            }
        }
        .build()
        return _drum!!
    }

private var _drum: ImageVector? = null
