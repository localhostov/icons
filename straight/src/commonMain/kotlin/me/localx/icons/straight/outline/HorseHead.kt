package me.localx.icons.straight.outline

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

public val Icons.Outline.HorseHead: ImageVector
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
                curveToRelative(-0.102f, -1.131f, -0.683f, -2.19f, -1.594f, -2.906f)
                curveToRelative(-2.75f, -2.162f, -3.855f, -4.382f, -4.925f, -6.532f)
                curveToRelative(-0.709f, -1.425f, -1.382f, -2.777f, -2.464f, -3.971f)
                lineTo(15.0f, 0.0f)
                curveToRelative(-1.905f, 0.0f, -3.5f, 1.332f, -3.902f, 3.116f)
                curveTo(4.198f, 3.921f, 0.0f, 8.894f, 0.0f, 16.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -7.309f, 4.058f, -11.5f, 11.133f, -11.5f)
                horizontalLineToRelative(0.277f)
                curveToRelative(0.956f, 1.009f, 1.537f, 2.177f, 2.265f, 3.639f)
                curveToRelative(1.113f, 2.236f, 2.375f, 4.771f, 5.479f, 7.211f)
                curveToRelative(0.48f, 0.376f, 0.785f, 0.928f, 0.837f, 1.512f)
                curveToRelative(0.052f, 0.58f, -0.139f, 1.161f, -0.525f, 1.597f)
                curveToRelative(-0.427f, 0.481f, -0.759f, 0.857f, -1.002f, 1.133f)
                lineToRelative(-10.173f, -5.058f)
                lineToRelative(0.761f, 2.283f)
                curveToRelative(0.035f, 0.105f, 0.744f, 2.214f, 2.015f, 4.684f)
                lineToRelative(0.978f, 2.0f)
                horizontalLineToRelative(2.452f)
                lineToRelative(-0.879f, -1.504f)
                curveToRelative(-0.709f, -1.213f, -1.294f, -2.435f, -1.733f, -3.442f)
                lineToRelative(7.071f, 3.516f)
                lineToRelative(0.507f, -0.582f)
                reflectiveCurveToRelative(0.478f, -0.548f, 1.5f, -1.702f)
                curveToRelative(0.75f, -0.845f, 1.122f, -1.976f, 1.021f, -3.102f)
                close()
            }
        }
        .build()
        return _horseHead!!
    }

private var _horseHead: ImageVector? = null
