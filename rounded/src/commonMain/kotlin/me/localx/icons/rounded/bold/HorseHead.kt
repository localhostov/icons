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

public val Icons.Bold.HorseHead: ImageVector
    get() {
        if (_horseHead != null) {
            return _horseHead!!
        }
        _horseHead = Builder(name = "HorseHead", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 13.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(22.389f, 14.276f)
                curveToRelative(-2.75f, -2.162f, -3.855f, -4.383f, -4.924f, -6.531f)
                curveToRelative(-0.705f, -1.416f, -1.395f, -2.752f, -2.465f, -3.941f)
                lineTo(15.0f, 0.814f)
                curveToRelative(0.0f, -0.543f, -0.521f, -0.926f, -1.045f, -0.785f)
                curveToRelative(-1.462f, 0.395f, -2.587f, 1.6f, -2.876f, 3.103f)
                curveTo(4.195f, 3.948f, 0.0f, 8.905f, 0.0f, 16.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -3.137f, 0.976f, -10.407f, 9.961f, -10.499f)
                curveToRelative(0.71f, 0.855f, 1.23f, 1.9f, 1.818f, 3.082f)
                curveToRelative(1.103f, 2.216f, 2.476f, 4.974f, 5.783f, 7.573f)
                curveToRelative(0.251f, 0.197f, 0.405f, 0.48f, 0.433f, 0.796f)
                curveToRelative(0.028f, 0.31f, -0.07f, 0.609f, -0.277f, 0.842f)
                curveToRelative(-0.278f, 0.313f, -0.538f, 0.608f, -0.762f, 0.862f)
                lineToRelative(-7.307f, -3.508f)
                curveToRelative(-1.07f, -0.514f, -2.285f, 0.36f, -2.137f, 1.538f)
                curveToRelative(0.283f, 2.264f, 1.045f, 4.293f, 2.06f, 6.081f)
                curveToRelative(0.262f, 0.461f, 0.763f, 0.733f, 1.293f, 0.733f)
                curveToRelative(1.165f, 0.0f, 1.866f, -1.253f, 1.293f, -2.267f)
                curveToRelative(-0.359f, -0.636f, -0.678f, -1.304f, -0.942f, -2.005f)
                lineToRelative(4.443f, 2.133f)
                curveToRelative(1.211f, 0.581f, 2.661f, 0.286f, 3.55f, -0.721f)
                curveToRelative(0.268f, -0.305f, 0.533f, -0.604f, 0.755f, -0.855f)
                curveToRelative(0.75f, -0.845f, 1.122f, -1.976f, 1.021f, -3.102f)
                curveToRelative(-0.102f, -1.131f, -0.674f, -2.184f, -1.594f, -2.906f)
                close()
            }
        }
        .build()
        return _horseHead!!
    }

private var _horseHead: ImageVector? = null
