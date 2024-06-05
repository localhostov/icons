package me.localx.icons.rounded.outline

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

public val Icons.Outline.Flute: ImageVector
    get() {
        if (_flute != null) {
            return _flute!!
        }
        _flute = Builder(name = "Flute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.123f, 1.335f)
                lineToRelative(-0.457f, -0.458f)
                curveToRelative(-0.96f, -0.958f, -2.45f, -1.153f, -3.626f, -0.472f)
                curveToRelative(-0.529f, 0.307f, -1.354f, 0.695f, -2.277f, 0.803f)
                curveToRelative(-0.76f, 0.088f, -1.474f, 0.432f, -2.01f, 0.969f)
                curveToRelative(-0.854f, 0.853f, -11.84f, 11.92f, -13.58f, 13.661f)
                curveTo(0.417f, 16.592f, 0.001f, 17.597f, 0.001f, 18.665f)
                reflectiveCurveToRelative(0.416f, 2.073f, 1.172f, 2.828f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(0.779f, 0.78f, 1.804f, 1.17f, 2.828f, 1.17f)
                reflectiveCurveToRelative(2.049f, -0.39f, 2.829f, -1.17f)
                curveToRelative(0.0f, 0.0f, 0.0f, -0.001f, 0.002f, -0.002f)
                lineToRelative(13.573f, -13.654f)
                curveToRelative(0.54f, -0.54f, 0.886f, -1.255f, 0.974f, -2.015f)
                curveToRelative(0.085f, -0.73f, 0.362f, -1.518f, 0.802f, -2.276f)
                curveToRelative(0.682f, -1.175f, 0.488f, -2.666f, -0.472f, -3.625f)
                close()
                moveTo(20.042f, 2.135f)
                curveToRelative(0.157f, -0.091f, 0.331f, -0.135f, 0.504f, -0.135f)
                curveToRelative(0.259f, 0.0f, 0.515f, 0.1f, 0.706f, 0.291f)
                lineToRelative(0.457f, 0.458f)
                curveToRelative(0.319f, 0.319f, 0.383f, 0.816f, 0.155f, 1.208f)
                curveToRelative(-0.351f, 0.605f, -0.608f, 1.215f, -0.792f, 1.826f)
                lineToRelative(-2.856f, -2.856f)
                curveToRelative(0.611f, -0.184f, 1.221f, -0.442f, 1.826f, -0.792f)
                close()
                moveTo(6.828f, 21.495f)
                curveToRelative(-0.779f, 0.777f, -2.048f, 0.778f, -2.827f, -0.001f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(-0.378f, -0.378f, -0.586f, -0.88f, -0.586f, -1.414f)
                reflectiveCurveToRelative(0.208f, -1.036f, 0.586f, -1.414f)
                curveToRelative(1.742f, -1.742f, 12.638f, -12.718f, 13.522f, -13.603f)
                lineToRelative(4.243f, 4.243f)
                lineToRelative(-13.524f, 13.604f)
                close()
                moveTo(16.0f, 9.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(12.5f, 13.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(9.0f, 16.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _flute!!
    }

private var _flute: ImageVector? = null
