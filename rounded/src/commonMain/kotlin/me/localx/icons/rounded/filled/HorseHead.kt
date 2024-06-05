package me.localx.icons.rounded.filled

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
                moveToRelative(22.39f, 14.277f)
                curveToRelative(-2.75f, -2.162f, -3.855f, -4.382f, -4.925f, -6.532f)
                curveToRelative(-0.709f, -1.425f, -1.382f, -2.777f, -2.464f, -3.971f)
                lineTo(15.001f, 0.867f)
                curveToRelative(0.0f, -0.577f, -0.556f, -0.992f, -1.11f, -0.832f)
                curveToRelative(-1.391f, 0.401f, -2.471f, 1.658f, -2.792f, 3.082f)
                curveTo(4.198f, 3.921f, 0.0f, 8.894f, 0.0f, 16.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.195f)
                curveToRelative(1.336f, 0.0f, 2.217f, -1.39f, 1.649f, -2.598f)
                curveToRelative(-0.509f, -1.082f, -0.987f, -2.101f, -1.005f, -2.15f)
                lineToRelative(-0.838f, -2.252f)
                lineToRelative(8.334f, 3.85f)
                curveToRelative(0.897f, 0.414f, 1.959f, 0.191f, 2.614f, -0.549f)
                lineToRelative(0.015f, -0.017f)
                curveToRelative(0.75f, -0.845f, 1.122f, -1.976f, 1.021f, -3.102f)
                curveToRelative(-0.102f, -1.131f, -0.683f, -2.19f, -1.594f, -2.906f)
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
