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

public val Icons.Bold.SleepingBag: ImageVector
    get() {
        if (_sleepingBag != null) {
            return _sleepingBag!!
        }
        _sleepingBag = Builder(name = "SleepingBag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.817f, 5.808f)
                curveToRelative(-0.368f, -3.311f, -3.147f, -5.808f, -6.466f, -5.808f)
                horizontalLineToRelative(-2.703f)
                curveToRelative(-3.319f, 0.0f, -6.099f, 2.497f, -6.465f, 5.807f)
                curveToRelative(-0.122f, 1.094f, -0.184f, 2.168f, -0.184f, 3.193f)
                curveToRelative(0.0f, 3.119f, 0.73f, 7.469f, 1.343f, 10.57f)
                curveToRelative(0.507f, 2.566f, 2.776f, 4.43f, 5.396f, 4.43f)
                horizontalLineToRelative(2.524f)
                curveToRelative(2.619f, 0.0f, 4.889f, -1.863f, 5.396f, -4.431f)
                curveToRelative(0.612f, -3.103f, 1.342f, -7.456f, 1.342f, -10.569f)
                curveToRelative(0.0f, -1.02f, -0.062f, -2.094f, -0.183f, -3.192f)
                close()
                moveTo(7.166f, 6.139f)
                curveToRelative(0.197f, -1.79f, 1.694f, -3.139f, 3.482f, -3.139f)
                horizontalLineToRelative(2.703f)
                curveToRelative(1.787f, 0.0f, 3.285f, 1.35f, 3.483f, 3.139f)
                curveToRelative(0.084f, 0.76f, 0.126f, 1.497f, 0.146f, 2.215f)
                curveToRelative(-2.391f, 0.429f, -6.46f, 1.514f, -9.744f, 4.136f)
                curveToRelative(-0.144f, -1.251f, -0.236f, -2.454f, -0.236f, -3.49f)
                curveToRelative(0.0f, -0.914f, 0.056f, -1.876f, 0.166f, -2.861f)
                close()
                moveTo(13.263f, 21.0f)
                horizontalLineToRelative(-2.524f)
                curveToRelative(-1.19f, 0.0f, -2.222f, -0.846f, -2.452f, -2.012f)
                curveToRelative(-0.286f, -1.445f, -0.597f, -3.169f, -0.842f, -4.889f)
                lineToRelative(3.447f, 1.231f)
                curveToRelative(1.244f, 0.444f, 2.63f, -0.004f, 3.378f, -1.092f)
                lineToRelative(2.685f, -3.906f)
                curveToRelative(-0.159f, 2.726f, -0.739f, 6.117f, -1.24f, 8.656f)
                curveToRelative(-0.23f, 1.166f, -1.262f, 2.012f, -2.452f, 2.012f)
                close()
                moveTo(9.5f, 6.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _sleepingBag!!
    }

private var _sleepingBag: ImageVector? = null
