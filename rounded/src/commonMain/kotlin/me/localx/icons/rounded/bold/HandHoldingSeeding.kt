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

public val Icons.Bold.HandHoldingSeeding: ImageVector
    get() {
        if (_handHoldingSeeding != null) {
            return _handHoldingSeeding!!
        }
        _handHoldingSeeding = Builder(name = "HandHoldingSeeding", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.193f, 15.543f)
                lineToRelative(-4.929f, 4.859f)
                curveToRelative(-2.354f, 2.32f, -5.47f, 3.598f, -8.775f, 3.598f)
                horizontalLineTo(1.5f)
                curveToRelative(-1.972f, -0.034f, -1.971f, -2.966f, 0.0f, -3.0f)
                horizontalLineToRelative(7.989f)
                curveToRelative(2.383f, 0.0f, 4.638f, -0.875f, 6.39f, -2.47f)
                curveToRelative(-0.561f, 0.3f, -1.201f, 0.47f, -1.88f, 0.47f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.972f, -0.034f, -1.971f, -2.966f, 0.0f, -3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.308f, -0.006f, 1.307f, -1.994f, 0.0f, -2.0f)
                horizontalLineToRelative(-5.188f)
                curveToRelative(-2.27f, 0.0f, -4.404f, 0.884f, -6.011f, 2.489f)
                lineToRelative(-0.239f, 0.24f)
                curveToRelative(-0.584f, 0.586f, -1.533f, 0.59f, -2.121f, 0.004f)
                curveToRelative(-0.587f, -0.584f, -0.589f, -1.534f, -0.004f, -2.121f)
                lineToRelative(0.241f, -0.242f)
                curveToRelative(2.175f, -2.174f, 5.062f, -3.37f, 8.134f, -3.37f)
                horizontalLineToRelative(5.188f)
                curveToRelative(1.678f, 0.0f, 3.117f, 1.038f, 3.71f, 2.506f)
                lineToRelative(1.82f, -1.753f)
                curveToRelative(0.527f, -0.528f, 1.286f, -0.81f, 2.056f, -0.744f)
                curveToRelative(0.771f, 0.062f, 1.476f, 0.46f, 1.932f, 1.093f)
                curveToRelative(0.745f, 1.035f, 0.604f, 2.515f, -0.324f, 3.441f)
                close()
                moveTo(11.0f, 7.383f)
                verticalLineToRelative(1.117f)
                curveToRelative(0.034f, 1.972f, 2.966f, 1.971f, 3.0f, 0.0f)
                verticalLineToRelative(-1.117f)
                curveToRelative(3.703f, -0.468f, 5.748f, -2.378f, 6.0f, -6.266f)
                curveToRelative(0.04f, -0.611f, -0.472f, -1.123f, -1.083f, -1.083f)
                curveToRelative(-3.333f, 0.216f, -5.5f, 1.461f, -6.417f, 4.074f)
                curveTo(11.583f, 1.495f, 9.416f, 0.25f, 6.083f, 0.034f)
                curveToRelative(-0.611f, -0.04f, -1.123f, 0.472f, -1.083f, 1.083f)
                curveToRelative(0.252f, 3.888f, 2.297f, 5.798f, 6.0f, 6.266f)
                close()
            }
        }
        .build()
        return _handHoldingSeeding!!
    }

private var _handHoldingSeeding: ImageVector? = null
