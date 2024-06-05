package me.localx.icons.straight.outline

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

public val Icons.Outline.BoxTissue: ImageVector
    get() {
        if (_boxTissue != null) {
            return _boxTissue!!
        }
        _boxTissue = Builder(name = "BoxTissue", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                horizontalLineToRelative(-1.58f)
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
                lineToRelative(0.666f, 7.989f)
                horizontalLineToRelative(-1.58f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(13.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 11.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(8.511f, 4.0f)
                curveToRelative(1.007f, -0.011f, 1.786f, -0.71f, 2.355f, -1.221f)
                curveToRelative(0.314f, -0.282f, 0.86f, -0.76f, 1.145f, -0.779f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.252f, 0.0f, 0.808f, 0.498f, 1.121f, 0.779f)
                curveToRelative(0.569f, 0.511f, 1.349f, 1.21f, 2.377f, 1.221f)
                curveToRelative(0.995f, -0.011f, 1.769f, -0.694f, 2.336f, -1.203f)
                lineToRelative(-0.767f, 9.203f)
                horizontalLineToRelative(-1.994f)
                lineToRelative(0.327f, -3.917f)
                lineToRelative(-1.992f, -0.166f)
                lineToRelative(-0.341f, 4.083f)
                horizontalLineToRelative(-2.161f)
                lineToRelative(-0.507f, -6.083f)
                lineToRelative(-1.992f, 0.166f)
                lineToRelative(0.493f, 5.917f)
                horizontalLineToRelative(-1.994f)
                lineToRelative(-0.767f, -9.203f)
                curveToRelative(0.567f, 0.509f, 1.342f, 1.192f, 2.357f, 1.203f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                lineTo(22.0f, 19.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(22.0f, 17.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.747f)
                lineToRelative(0.333f, 4.0f)
                horizontalLineToRelative(13.84f)
                lineToRelative(0.333f, -4.0f)
                horizontalLineToRelative(1.747f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _boxTissue!!
    }

private var _boxTissue: ImageVector? = null
