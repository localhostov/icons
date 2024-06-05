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

public val Icons.Filled.GlassWhiskeyRocks: ImageVector
    get() {
        if (_glassWhiskeyRocks != null) {
            return _glassWhiskeyRocks!!
        }
        _glassWhiskeyRocks = Builder(name = "GlassWhiskeyRocks", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.001f, 14.0f)
                horizontalLineToRelative(-4.001f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.276f)
                curveToRelative(0.0f, 0.016f, 0.0f, 0.031f, 0.0f, 0.046f)
                verticalLineToRelative(1.678f)
                close()
                moveTo(14.187f, 11.526f)
                lineToRelative(-1.187f, 1.187f)
                verticalLineToRelative(1.287f)
                curveToRelative(0.0f, 0.497f, -0.183f, 0.953f, -0.484f, 1.303f)
                lineToRelative(1.671f, 1.671f)
                curveToRelative(0.035f, 0.034f, 0.092f, 0.035f, 0.127f, 0.0f)
                lineToRelative(2.66f, -2.661f)
                verticalLineToRelative(-0.126f)
                lineToRelative(-2.66f, -2.661f)
                curveToRelative(-0.034f, -0.032f, -0.091f, -0.035f, -0.127f, 0.0f)
                close()
                moveTo(23.996f, 4.298f)
                lineToRelative(-1.42f, 14.199f)
                curveToRelative(-0.256f, 2.567f, -2.396f, 4.502f, -4.976f, 4.502f)
                lineTo(6.324f, 22.999f)
                curveToRelative(-2.598f, 0.0f, -4.737f, -1.95f, -4.979f, -4.536f)
                lineTo(0.021f, 4.279f)
                curveToRelative(-0.078f, -0.838f, 0.203f, -1.677f, 0.77f, -2.299f)
                curveToRelative(0.567f, -0.623f, 1.376f, -0.979f, 2.218f, -0.979f)
                horizontalLineToRelative(18.001f)
                curveToRelative(0.847f, 0.0f, 1.657f, 0.36f, 2.226f, 0.987f)
                curveToRelative(0.567f, 0.627f, 0.844f, 1.47f, 0.76f, 2.312f)
                close()
                moveTo(19.001f, 14.249f)
                curveToRelative(0.0f, -0.558f, -0.218f, -1.083f, -0.612f, -1.477f)
                lineToRelative(-2.66f, -2.662f)
                curveToRelative(-0.743f, -0.742f, -1.912f, -0.807f, -2.73f, -0.195f)
                curveToRelative(-0.044f, -1.065f, -0.923f, -1.917f, -1.998f, -1.917f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.385f)
                lineToRelative(2.388f, 2.389f)
                curveToRelative(0.407f, 0.407f, 0.942f, 0.61f, 1.478f, 0.61f)
                reflectiveCurveToRelative(1.07f, -0.204f, 1.478f, -0.611f)
                lineToRelative(2.66f, -2.661f)
                curveToRelative(0.395f, -0.395f, 0.612f, -0.919f, 0.612f, -1.478f)
                close()
            }
        }
        .build()
        return _glassWhiskeyRocks!!
    }

private var _glassWhiskeyRocks: ImageVector? = null
