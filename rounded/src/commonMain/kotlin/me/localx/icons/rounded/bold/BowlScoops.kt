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

public val Icons.Bold.BowlScoops: ImageVector
    get() {
        if (_bowlScoops != null) {
            return _bowlScoops!!
        }
        _bowlScoops = Builder(name = "BowlScoops", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.784f, 10.818f)
                curveToRelative(0.729f, 0.394f, 1.639f, 0.126f, 2.034f, -0.603f)
                curveToRelative(0.742f, -1.367f, 2.228f, -2.216f, 3.876f, -2.216f)
                curveToRelative(1.665f, 0.0f, 3.268f, 0.891f, 3.987f, 2.216f)
                curveToRelative(0.263f, 0.483f, 0.769f, 0.784f, 1.318f, 0.784f)
                reflectiveCurveToRelative(1.056f, -0.301f, 1.318f, -0.784f)
                curveToRelative(0.742f, -1.367f, 2.228f, -2.216f, 3.876f, -2.216f)
                curveToRelative(1.666f, 0.0f, 3.268f, 0.891f, 3.987f, 2.216f)
                curveToRelative(0.271f, 0.501f, 0.787f, 0.784f, 1.319f, 0.784f)
                curveToRelative(0.242f, 0.0f, 0.487f, -0.059f, 0.715f, -0.182f)
                curveToRelative(0.728f, -0.396f, 0.998f, -1.306f, 0.603f, -2.034f)
                curveToRelative(-1.01f, -1.861f, -2.906f, -3.188f, -5.064f, -3.627f)
                curveToRelative(-0.819f, -3.021f, -3.572f, -5.157f, -6.755f, -5.157f)
                reflectiveCurveToRelative(-5.922f, 2.126f, -6.748f, 5.136f)
                curveToRelative(-2.159f, 0.411f, -4.028f, 1.731f, -5.07f, 3.648f)
                curveToRelative(-0.395f, 0.728f, -0.125f, 1.639f, 0.603f, 2.034f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.534f, 0.0f, 2.892f, 0.868f, 3.561f, 2.174f)
                curveToRelative(-1.36f, 0.295f, -2.597f, 0.953f, -3.573f, 1.895f)
                curveToRelative(-0.973f, -0.914f, -2.211f, -1.568f, -3.56f, -1.874f)
                curveToRelative(0.665f, -1.318f, 2.03f, -2.195f, 3.572f, -2.195f)
                close()
                moveTo(23.917f, 14.641f)
                lineToRelative(-0.723f, 1.859f)
                curveToRelative(-1.488f, 2.483f, -4.025f, 2.535f, -6.842f, 2.5f)
                horizontalLineToRelative(-2.851f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.851f)
                curveToRelative(-2.817f, 0.035f, -5.354f, -0.017f, -6.842f, -2.5f)
                lineToRelative(-0.723f, -1.859f)
                curveToRelative(-0.307f, -0.789f, 0.275f, -1.641f, 1.122f, -1.641f)
                horizontalLineToRelative(21.589f)
                curveToRelative(0.847f, 0.0f, 1.429f, 0.851f, 1.122f, 1.641f)
                close()
            }
        }
        .build()
        return _bowlScoops!!
    }

private var _bowlScoops: ImageVector? = null
