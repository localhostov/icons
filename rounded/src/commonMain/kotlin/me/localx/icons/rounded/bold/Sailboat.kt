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

public val Icons.Bold.Sailboat: ImageVector
    get() {
        if (_sailboat != null) {
            return _sailboat!!
        }
        _sailboat = Builder(name = "Sailboat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.572f, 16.399f)
                curveToRelative(-0.536f, -0.876f, -1.469f, -1.399f, -2.494f, -1.399f)
                lineTo(2.921f, 15.0f)
                curveToRelative(-1.021f, 0.0f, -1.952f, 0.52f, -2.489f, 1.391f)
                curveToRelative(-0.529f, 0.858f, -0.576f, 1.906f, -0.126f, 2.802f)
                curveToRelative(0.901f, 1.796f, 3.197f, 4.808f, 8.447f, 4.808f)
                horizontalLineToRelative(6.465f)
                curveToRelative(5.237f, 0.0f, 7.553f, -3.001f, 8.467f, -4.79f)
                curveToRelative(0.458f, -0.896f, 0.416f, -1.947f, -0.112f, -2.811f)
                close()
                moveTo(15.218f, 21.0f)
                horizontalLineToRelative(-6.465f)
                curveToRelative(-2.707f, 0.0f, -4.618f, -1.009f, -5.686f, -3.0f)
                lineToRelative(17.883f, -0.034f)
                curveToRelative(-1.083f, 2.014f, -3.011f, 3.034f, -5.732f, 3.034f)
                close()
                moveTo(13.5f, 13.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.576f, 0.0f, 1.102f, -0.33f, 1.352f, -0.85f)
                reflectiveCurveToRelative(0.18f, -1.137f, -0.18f, -1.587f)
                lineTo(14.679f, 0.563f)
                curveToRelative(-0.397f, -0.498f, -1.065f, -0.689f, -1.668f, -0.479f)
                curveToRelative(-0.601f, 0.211f, -1.003f, 0.778f, -1.004f, 1.415f)
                lineToRelative(-0.007f, 10.0f)
                curveToRelative(0.0f, 0.398f, 0.158f, 0.779f, 0.439f, 1.062f)
                curveToRelative(0.281f, 0.281f, 0.663f, 0.439f, 1.061f, 0.439f)
                close()
                moveTo(15.004f, 5.775f)
                lineToRelative(3.377f, 4.225f)
                horizontalLineToRelative(-3.38f)
                lineToRelative(0.003f, -4.225f)
                close()
                moveTo(1.13f, 12.11f)
                curveToRelative(-0.241f, -0.541f, -0.141f, -1.173f, 0.255f, -1.613f)
                lineTo(7.38f, 3.83f)
                curveToRelative(0.416f, -0.461f, 1.072f, -0.62f, 1.652f, -0.397f)
                curveToRelative(0.58f, 0.222f, 0.963f, 0.778f, 0.963f, 1.399f)
                lineToRelative(0.005f, 6.667f)
                curveToRelative(0.0f, 0.397f, -0.158f, 0.779f, -0.439f, 1.062f)
                curveToRelative(-0.281f, 0.281f, -0.663f, 0.439f, -1.061f, 0.439f)
                lineTo(2.5f, 13.0f)
                curveToRelative(-0.592f, 0.0f, -1.129f, -0.349f, -1.37f, -0.89f)
                close()
            }
        }
        .build()
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
