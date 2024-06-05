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
                moveTo(23.983f, 17.183f)
                curveToRelative(-0.102f, -1.131f, -0.674f, -2.184f, -1.594f, -2.906f)
                curveToRelative(-2.75f, -2.162f, -3.855f, -4.383f, -4.924f, -6.531f)
                curveToRelative(-0.71f, -1.425f, -1.383f, -2.778f, -2.465f, -3.971f)
                lineTo(15.0f, 0.0f)
                curveToRelative(-1.905f, 0.0f, -3.5f, 1.332f, -3.902f, 3.116f)
                curveTo(4.198f, 3.921f, 0.0f, 8.894f, 0.0f, 16.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -3.137f, 0.976f, -10.407f, 9.961f, -10.499f)
                curveToRelative(0.71f, 0.855f, 1.23f, 1.9f, 1.818f, 3.082f)
                curveToRelative(1.103f, 2.216f, 2.476f, 4.974f, 5.783f, 7.573f)
                curveToRelative(0.251f, 0.197f, 0.405f, 0.48f, 0.433f, 0.796f)
                curveToRelative(0.028f, 0.31f, -0.07f, 0.609f, -0.277f, 0.842f)
                curveToRelative(-0.278f, 0.313f, -0.538f, 0.608f, -0.762f, 0.862f)
                lineToRelative(-9.786f, -4.698f)
                lineToRelative(0.341f, 2.728f)
                curveToRelative(0.322f, 2.58f, 1.267f, 4.854f, 2.498f, 6.814f)
                horizontalLineToRelative(3.685f)
                curveToRelative(-0.995f, -1.25f, -1.878f, -2.678f, -2.48f, -4.272f)
                lineToRelative(6.493f, 3.117f)
                lineToRelative(0.751f, -0.855f)
                reflectiveCurveToRelative(0.673f, -0.769f, 1.503f, -1.705f)
                curveToRelative(0.75f, -0.845f, 1.122f, -1.976f, 1.021f, -3.102f)
                close()
            }
        }
        .build()
        return _horseHead!!
    }

private var _horseHead: ImageVector? = null
