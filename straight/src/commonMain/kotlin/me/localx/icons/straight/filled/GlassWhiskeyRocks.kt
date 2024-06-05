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
                verticalLineToRelative(4.0f)
                close()
                moveTo(14.188f, 11.526f)
                lineToRelative(-1.187f, 1.187f)
                verticalLineToRelative(1.287f)
                curveToRelative(0.0f, 0.497f, -0.184f, 0.952f, -0.485f, 1.302f)
                lineToRelative(1.672f, 1.672f)
                curveToRelative(0.035f, 0.034f, 0.092f, 0.035f, 0.127f, 0.0f)
                lineToRelative(2.66f, -2.661f)
                verticalLineToRelative(-0.126f)
                lineToRelative(-2.66f, -2.661f)
                curveToRelative(-0.034f, -0.032f, -0.091f, -0.035f, -0.127f, 0.0f)
                close()
                moveTo(23.99f, 1.0f)
                lineToRelative(-1.931f, 19.299f)
                curveToRelative(-0.153f, 1.54f, -1.437f, 2.701f, -2.985f, 2.701f)
                lineTo(4.804f, 23.0f)
                curveToRelative(-1.559f, 0.0f, -2.843f, -1.17f, -2.987f, -2.721f)
                lineTo(0.018f, 1.0f)
                horizontalLineToRelative(23.973f)
                close()
                moveTo(19.0f, 14.25f)
                curveToRelative(0.0f, -0.558f, -0.218f, -1.083f, -0.612f, -1.477f)
                lineToRelative(-2.66f, -2.662f)
                curveToRelative(-0.745f, -0.744f, -1.913f, -0.8f, -2.731f, -0.182f)
                curveToRelative(-0.038f, -1.07f, -0.918f, -1.929f, -1.996f, -1.929f)
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
