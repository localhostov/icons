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

public val Icons.Filled.BoxTissue: ImageVector
    get() {
        if (_boxTissue != null) {
            return _boxTissue!!
        }
        _boxTissue = Builder(name = "BoxTissue", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(7.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(0.153f)
                lineToRelative(1.0f, 6.0f)
                horizontalLineToRelative(15.693f)
                lineToRelative(1.0f, -6.0f)
                horizontalLineToRelative(0.153f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(5.847f, 12.0f)
                horizontalLineToRelative(3.067f)
                lineToRelative(-0.493f, -5.917f)
                lineToRelative(1.992f, -0.166f)
                lineToRelative(0.507f, 6.083f)
                horizontalLineToRelative(2.161f)
                lineToRelative(0.341f, -4.083f)
                lineToRelative(1.992f, 0.166f)
                lineToRelative(-0.327f, 3.917f)
                horizontalLineToRelative(3.067f)
                lineTo(20.086f, 0.011f)
                lineToRelative(-1.075f, -0.011f)
                curveToRelative(-1.075f, -0.009f, -1.82f, 0.698f, -2.397f, 1.217f)
                curveToRelative(-0.295f, 0.265f, -0.871f, 0.78f, -1.103f, 0.783f)
                curveToRelative(-0.253f, -0.003f, -0.829f, -0.519f, -1.124f, -0.783f)
                curveToRelative(-0.573f, -0.515f, -1.356f, -1.217f, -2.354f, -1.217f)
                curveToRelative(-1.061f, -0.009f, -1.843f, 0.698f, -2.42f, 1.217f)
                curveToRelative(-0.295f, 0.265f, -0.871f, 0.78f, -1.103f, 0.783f)
                curveToRelative(-0.253f, -0.003f, -0.829f, -0.519f, -1.124f, -0.783f)
                curveTo(6.809f, 0.698f, 6.019f, -0.006f, 4.989f, 0.0f)
                lineToRelative(-1.075f, 0.011f)
                lineToRelative(1.933f, 11.989f)
                close()
                moveTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _boxTissue!!
    }

private var _boxTissue: ImageVector? = null
