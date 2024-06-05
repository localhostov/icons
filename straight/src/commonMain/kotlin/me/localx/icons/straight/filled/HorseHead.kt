package me.localx.icons.straight.filled

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

public val Icons.Filled.HorseHead: ImageVector
    get() {
        if (_horseHead != null) {
            return _horseHead!!
        }
        _horseHead = Builder(name = "HorseHead", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.983f, 17.183f)
                curveToRelative(-0.102f, -1.131f, -0.683f, -2.19f, -1.594f, -2.906f)
                curveToRelative(-2.75f, -2.162f, -3.855f, -4.382f, -4.925f, -6.532f)
                curveToRelative(-0.709f, -1.425f, -1.382f, -2.777f, -2.464f, -3.971f)
                lineTo(15.0f, 0.0f)
                curveToRelative(-1.905f, 0.0f, -3.5f, 1.332f, -3.902f, 3.116f)
                curveTo(4.198f, 3.921f, 0.0f, 8.894f, 0.0f, 16.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(15.068f)
                lineToRelative(-0.079f, -0.15f)
                curveToRelative(-1.332f, -2.414f, -2.112f, -4.494f, -2.151f, -4.598f)
                lineToRelative(-0.838f, -2.252f)
                lineToRelative(9.846f, 4.549f)
                curveToRelative(0.247f, -0.281f, 0.616f, -0.7f, 1.117f, -1.264f)
                curveToRelative(0.75f, -0.845f, 1.122f, -1.976f, 1.021f, -3.102f)
                close()
                moveTo(14.5f, 13.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _horseHead!!
    }

private var _horseHead: ImageVector? = null
