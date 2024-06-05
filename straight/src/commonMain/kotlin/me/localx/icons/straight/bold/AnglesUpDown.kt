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

public val Icons.Bold.AnglesUpDown: ImageVector
    get() {
        if (_anglesUpDown != null) {
            return _anglesUpDown!!
        }
        _anglesUpDown = Builder(name = "AnglesUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.049f, 10.573f)
                lineToRelative(-2.098f, -2.146f)
                lineTo(9.542f, 1.007f)
                curveToRelative(0.648f, -0.646f, 1.523f, -1.007f, 2.454f, -1.007f)
                horizontalLineToRelative(0.007f)
                curveToRelative(0.93f, 0.002f, 1.804f, 0.363f, 2.461f, 1.018f)
                lineToRelative(7.584f, 7.409f)
                lineToRelative(-2.096f, 2.146f)
                lineToRelative(-7.595f, -7.419f)
                curveToRelative(-0.136f, -0.134f, -0.283f, -0.153f, -0.36f, -0.153f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.093f, 0.0f, -0.229f, 0.025f, -0.347f, 0.142f)
                lineToRelative(-7.601f, 7.431f)
                close()
                moveTo(12.348f, 20.857f)
                curveToRelative(-0.125f, 0.125f, -0.273f, 0.144f, -0.351f, 0.144f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.076f, 0.0f, -0.223f, -0.019f, -0.356f, -0.151f)
                lineToRelative(-7.591f, -7.421f)
                lineToRelative(-2.098f, 2.145f)
                lineToRelative(7.582f, 7.412f)
                curveToRelative(0.658f, 0.655f, 1.532f, 1.016f, 2.463f, 1.016f)
                horizontalLineToRelative(0.007f)
                curveToRelative(0.93f, -0.002f, 1.803f, -0.363f, 2.45f, -1.007f)
                lineToRelative(7.595f, -7.42f)
                lineToRelative(-2.096f, -2.146f)
                lineToRelative(-7.604f, 7.43f)
                close()
            }
        }
        .build()
        return _anglesUpDown!!
    }

private var _anglesUpDown: ImageVector? = null
