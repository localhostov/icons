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

public val Icons.Bold.TruckTow: ImageVector
    get() {
        if (_truckTow != null) {
            return _truckTow!!
        }
        _truckTow = Builder(name = "TruckTow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.615f, 11.602f)
                lineToRelative(-0.841f, -2.525f)
                curveToRelative(-0.614f, -1.84f, -2.33f, -3.077f, -4.269f, -3.077f)
                horizontalLineToRelative(-2.004f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(3.215f)
                lineTo(5.176f, 0.569f)
                curveToRelative(-0.285f, -0.359f, -0.718f, -0.569f, -1.176f, -0.569f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-1.82f)
                lineToRelative(5.399f, 6.82f)
                horizontalLineToRelative(-4.899f)
                curveToRelative(-3.033f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-0.536f)
                curveToRelative(1.694f, -0.243f, 3.0f, -1.704f, 3.0f, -3.464f)
                verticalLineToRelative(-3.526f)
                curveToRelative(0.0f, -0.808f, -0.129f, -1.606f, -0.385f, -2.372f)
                close()
                moveTo(18.505f, 9.0f)
                curveToRelative(0.646f, 0.0f, 1.219f, 0.412f, 1.423f, 1.025f)
                lineToRelative(0.841f, 2.525f)
                curveToRelative(0.153f, 0.459f, 0.231f, 0.938f, 0.231f, 1.423f)
                verticalLineToRelative(0.026f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.504f)
                close()
                moveTo(14.001f, 18.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _truckTow!!
    }

private var _truckTow: ImageVector? = null
