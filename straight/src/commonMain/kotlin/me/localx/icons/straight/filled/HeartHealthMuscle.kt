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

public val Icons.Filled.HeartHealthMuscle: ImageVector
    get() {
        if (_heartHealthMuscle != null) {
            return _heartHealthMuscle!!
        }
        _heartHealthMuscle = Builder(name = "HeartHealthMuscle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 2.0f)
                curveToRelative(0.0f, 2.333f, -4.0f, 5.0f, -4.0f, 5.0f)
                curveToRelative(0.0f, 0.0f, -4.0f, -2.667f, -4.0f, -5.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(24.0f, 10.469f)
                reflectiveCurveToRelative(-1.482f, -0.5f, -3.577f, -0.5f)
                curveToRelative(-1.299f, 0.0f, -2.607f, 0.737f, -3.602f, 1.48f)
                curveToRelative(0.787f, 0.571f, 1.268f, 1.1f, 1.311f, 1.148f)
                lineToRelative(-1.492f, 1.332f)
                curveToRelative(-0.018f, -0.02f, -2.015f, -1.96f, -4.14f, -1.96f)
                curveToRelative(-2.376f, 0.0f, -4.81f, 1.852f, -6.213f, 3.133f)
                curveToRelative(1.393f, -3.503f, 0.345f, -8.359f, 0.901f, -9.93f)
                lineToRelative(2.84f, -0.904f)
                verticalLineToRelative(-0.981f)
                lineToRelative(1.981f, -0.788f)
                curveToRelative(0.0f, -1.048f, -0.905f, -2.5f, -3.0f, -2.5f)
                curveToRelative(-1.5f, 0.0f, -2.714f, 1.071f, -2.714f, 1.071f)
                curveTo(-0.515f, 6.31f, 0.009f, 15.612f, 0.009f, 18.755f)
                curveToRelative(0.0f, 0.0f, 4.658f, 5.238f, 11.991f, 5.238f)
                reflectiveCurveToRelative(12.0f, -3.143f, 12.0f, -3.143f)
                verticalLineToRelative(-10.381f)
                close()
            }
        }
        .build()
        return _heartHealthMuscle!!
    }

private var _heartHealthMuscle: ImageVector? = null
