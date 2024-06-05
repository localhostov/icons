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

public val Icons.Filled.SkeletonRibs: ImageVector
    get() {
        if (_skeletonRibs != null) {
            return _skeletonRibs!!
        }
        _skeletonRibs = Builder(name = "SkeletonRibs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.0f)
                lineTo(13.0f, 2.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.0f)
                lineTo(0.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.246f, 4.0f)
                lineTo(1.141f, 17.63f)
                curveToRelative(-0.365f, 1.55f, -0.009f, 3.153f, 0.976f, 4.397f)
                curveToRelative(0.993f, 1.253f, 2.486f, 1.973f, 4.096f, 1.973f)
                horizontalLineToRelative(11.576f)
                curveToRelative(1.602f, 0.0f, 3.09f, -0.72f, 4.084f, -1.975f)
                curveToRelative(0.994f, -1.255f, 1.354f, -2.87f, 0.988f, -4.422f)
                lineToRelative(-3.107f, -13.603f)
                horizontalLineToRelative(4.246f)
                lineTo(24.0f, 2.0f)
                close()
                moveTo(11.0f, 4.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.614f, 7.0f)
                lineToRelative(0.683f, -3.0f)
                horizontalLineToRelative(4.702f)
                close()
                moveTo(19.53f, 12.0f)
                horizontalLineToRelative(-6.53f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.845f)
                lineToRelative(0.685f, 3.0f)
                close()
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(6.987f)
                lineToRelative(0.685f, 3.0f)
                horizontalLineToRelative(-7.672f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(11.0f, 17.0f)
                lineTo(3.336f, 17.0f)
                lineToRelative(0.683f, -3.0f)
                horizontalLineToRelative(6.98f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(11.0f, 12.0f)
                lineTo(4.475f, 12.0f)
                lineToRelative(0.683f, -3.0f)
                horizontalLineToRelative(5.841f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(6.213f, 22.0f)
                curveToRelative(-0.995f, 0.0f, -1.917f, -0.443f, -2.528f, -1.214f)
                curveToRelative(-0.41f, -0.518f, -0.626f, -1.141f, -0.661f, -1.786f)
                horizontalLineToRelative(7.976f)
                verticalLineToRelative(3.0f)
                lineTo(6.213f, 22.0f)
                close()
                moveTo(17.789f, 22.0f)
                horizontalLineToRelative(-4.789f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.976f)
                curveToRelative(-0.041f, 0.642f, -0.259f, 1.264f, -0.67f, 1.783f)
                curveToRelative(-0.613f, 0.773f, -1.53f, 1.217f, -2.517f, 1.217f)
                close()
                moveTo(18.388f, 7.0f)
                horizontalLineToRelative(-5.388f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.703f)
                lineToRelative(0.685f, 3.0f)
                close()
            }
        }
        .build()
        return _skeletonRibs!!
    }

private var _skeletonRibs: ImageVector? = null
