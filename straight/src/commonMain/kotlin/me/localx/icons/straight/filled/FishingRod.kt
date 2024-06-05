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

public val Icons.Filled.FishingRod: ImageVector
    get() {
        if (_fishingRod != null) {
            return _fishingRod!!
        }
        _fishingRod = Builder(name = "FishingRod", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.858f, 22.871f)
                lineToRelative(0.142f, 1.129f)
                lineToRelative(-3.0f, -1.0f)
                lineToRelative(-3.0f, 1.0f)
                lineToRelative(0.142f, -1.129f)
                curveToRelative(0.136f, -1.079f, 0.705f, -1.99f, 1.243f, -2.64f)
                curveToRelative(-1.004f, -1.016f, -2.385f, -2.791f, -2.385f, -4.892f)
                curveToRelative(0.0f, -3.227f, 3.263f, -5.698f, 3.402f, -5.802f)
                lineToRelative(0.598f, -0.446f)
                lineToRelative(0.598f, 0.446f)
                curveToRelative(0.139f, 0.104f, 3.402f, 2.575f, 3.402f, 5.802f)
                curveToRelative(0.0f, 2.101f, -1.382f, 3.877f, -2.385f, 4.892f)
                curveToRelative(0.538f, 0.65f, 1.108f, 1.561f, 1.243f, 2.64f)
                close()
                moveTo(8.0f, 15.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-0.352f, 0.0f, -0.686f, -0.072f, -1.0f, -0.184f)
                verticalLineToRelative(4.184f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.775f, 0.448f, -1.441f, 1.094f, -1.773f)
                curveTo(1.6f, 9.366f, 4.582f, 0.0f, 20.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                lineTo(21.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 2.015f)
                curveTo(7.909f, 2.335f, 4.416f, 8.003f, 3.394f, 12.475f)
                curveToRelative(0.465f, -0.297f, 1.014f, -0.475f, 1.606f, -0.475f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(6.0f, 15.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.449f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _fishingRod!!
    }

private var _fishingRod: ImageVector? = null
