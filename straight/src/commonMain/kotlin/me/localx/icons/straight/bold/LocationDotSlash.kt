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

public val Icons.Bold.LocationDotSlash: ImageVector
    get() {
        if (_locationDotSlash != null) {
            return _locationDotSlash!!
        }
        _locationDotSlash = Builder(name = "LocationDotSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.131f, 17.01f)
                curveToRelative(3.838f, -3.904f, 3.819f, -10.203f, -0.06f, -14.081f)
                curveToRelative(-1.889f, -1.889f, -4.4f, -2.929f, -7.071f, -2.929f)
                curveToRelative(-2.641f, 0.0f, -5.126f, 1.018f, -7.01f, 2.869f)
                lineTo(2.161f, 0.039f)
                lineTo(0.04f, 2.16f)
                lineTo(21.839f, 23.961f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-4.83f, -4.83f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.87f, 0.0f, 3.627f, 0.729f, 4.95f, 2.05f)
                curveToRelative(2.713f, 2.713f, 2.728f, 7.117f, 0.06f, 9.839f)
                lineToRelative(-2.869f, -2.869f)
                curveToRelative(0.504f, -0.533f, 0.813f, -1.252f, 0.813f, -2.043f)
                curveToRelative(0.0f, -1.644f, -1.333f, -2.977f, -2.977f, -2.977f)
                curveToRelative(-0.791f, 0.0f, -1.51f, 0.309f, -2.043f, 0.813f)
                lineToRelative(-2.823f, -2.823f)
                curveToRelative(1.316f, -1.283f, 3.048f, -1.99f, 4.889f, -1.99f)
                close()
                moveTo(13.436f, 18.386f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-3.558f, 3.48f)
                lineToRelative(-7.059f, -6.904f)
                curveToRelative(-2.646f, -2.646f, -3.542f, -6.383f, -2.583f, -9.776f)
                lineToRelative(2.656f, 2.656f)
                curveToRelative(-0.01f, 1.811f, 0.662f, 3.612f, 2.037f, 4.987f)
                lineToRelative(4.95f, 4.841f)
                lineToRelative(1.436f, -1.405f)
                close()
            }
        }
        .build()
        return _locationDotSlash!!
    }

private var _locationDotSlash: ImageVector? = null
