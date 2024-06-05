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

public val Icons.Bold.PenFancy: ImageVector
    get() {
        if (_penFancy != null) {
            return _penFancy!!
        }
        _penFancy = Builder(name = "PenFancy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.086f)
                curveToRelative(0.0f, -1.091f, -0.425f, -2.117f, -1.197f, -2.889f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.594f, -1.593f, -4.187f, -1.592f, -5.776f, -0.002f)
                lineTo(7.896f, 10.288f)
                lineToRelative(-3.457f, 1.156f)
                curveToRelative(-1.142f, 0.457f, -1.994f, 1.396f, -2.34f, 2.575f)
                lineTo(0.102f, 20.83f)
                curveToRelative(-0.255f, 0.868f, -0.016f, 1.805f, 0.624f, 2.445f)
                curveToRelative(0.47f, 0.471f, 1.101f, 0.724f, 1.747f, 0.724f)
                curveToRelative(0.232f, 0.0f, 0.467f, -0.033f, 0.696f, -0.1f)
                lineToRelative(6.812f, -1.999f)
                curveToRelative(1.18f, -0.346f, 2.117f, -1.199f, 2.595f, -2.391f)
                lineToRelative(1.313f, -3.656f)
                lineToRelative(8.914f, -8.878f)
                curveToRelative(0.772f, -0.771f, 1.197f, -1.798f, 1.197f, -2.89f)
                close()
                moveTo(9.771f, 18.444f)
                curveToRelative(-0.112f, 0.282f, -0.344f, 0.492f, -0.634f, 0.577f)
                lineToRelative(-3.866f, 1.134f)
                lineToRelative(2.437f, -2.45f)
                curveToRelative(0.39f, -0.392f, 0.388f, -1.025f, -0.004f, -1.414f)
                curveToRelative(-0.392f, -0.39f, -1.024f, -0.388f, -1.414f, 0.004f)
                lineToRelative(-2.458f, 2.471f)
                lineToRelative(1.145f, -3.904f)
                curveToRelative(0.085f, -0.29f, 0.295f, -0.521f, 0.493f, -0.603f)
                lineToRelative(3.17f, -1.058f)
                lineToRelative(2.216f, 2.216f)
                lineToRelative(-1.086f, 3.028f)
                close()
                moveTo(20.683f, 4.851f)
                lineToRelative(-8.091f, 8.058f)
                lineToRelative(-1.536f, -1.536f)
                lineTo(19.146f, 3.318f)
                curveToRelative(0.423f, -0.422f, 1.111f, -0.424f, 1.536f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.205f, 0.206f, 0.318f, 0.479f, 0.318f, 0.768f)
                reflectiveCurveToRelative(-0.112f, 0.562f, -0.316f, 0.766f)
                close()
            }
        }
        .build()
        return _penFancy!!
    }

private var _penFancy: ImageVector? = null
