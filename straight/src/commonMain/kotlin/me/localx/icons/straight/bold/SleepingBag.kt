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
                moveTo(19.345f, 2.798f)
                curveToRelative(-0.329f, -1.622f, -1.771f, -2.798f, -3.43f, -2.798f)
                horizontalLineToRelative(-7.829f)
                curveToRelative(-1.658f, 0.0f, -3.101f, 1.177f, -3.43f, 2.798f)
                curveToRelative(-0.3f, 1.472f, -0.656f, 3.742f, -0.656f, 6.202f)
                curveToRelative(0.0f, 5.115f, 1.957f, 13.489f, 2.04f, 13.843f)
                lineToRelative(0.271f, 1.156f)
                horizontalLineToRelative(11.377f)
                lineToRelative(0.271f, -1.156f)
                curveToRelative(0.083f, -0.354f, 2.04f, -8.729f, 2.04f, -13.843f)
                curveToRelative(0.0f, -2.454f, -0.356f, -4.727f, -0.655f, -6.202f)
                close()
                moveTo(7.596f, 3.396f)
                curveToRelative(0.048f, -0.233f, 0.249f, -0.396f, 0.49f, -0.396f)
                horizontalLineToRelative(7.829f)
                curveToRelative(0.241f, 0.0f, 0.442f, 0.163f, 0.49f, 0.395f)
                curveToRelative(0.241f, 1.19f, 0.522f, 2.95f, 0.582f, 4.874f)
                curveToRelative(-2.386f, 0.426f, -6.464f, 1.51f, -9.759f, 4.146f)
                curveToRelative(-0.139f, -1.223f, -0.229f, -2.4f, -0.229f, -3.415f)
                curveToRelative(0.0f, -2.21f, 0.324f, -4.267f, 0.596f, -5.604f)
                close()
                moveTo(8.702f, 21.0f)
                curveToRelative(-0.319f, -1.476f, -0.866f, -4.165f, -1.254f, -6.879f)
                lineToRelative(5.552f, 2.379f)
                lineToRelative(3.953f, -6.112f)
                curveToRelative(-0.221f, 3.641f, -1.186f, 8.438f, -1.655f, 10.611f)
                horizontalLineToRelative(-6.596f)
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
