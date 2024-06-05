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

public val Icons.Bold.HandPointRibbon: ImageVector
    get() {
        if (_handPointRibbon != null) {
            return _handPointRibbon!!
        }
        _handPointRibbon = Builder(name = "HandPointRibbon", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(12.5f, 15.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(20.5f, 8.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.0f, 16.662f)
                verticalLineToRelative(0.838f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-5.23f)
                curveToRelative(-1.403f, 0.0f, -2.74f, -0.529f, -3.763f, -1.489f)
                lineToRelative(-1.919f, -1.8f)
                lineToRelative(3.764f, -3.906f)
                curveToRelative(0.797f, -0.797f, 0.797f, -2.089f, 0.0f, -2.886f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.797f, -0.797f, -2.089f, -0.797f, -2.886f, 0.0f)
                lineToRelative(-3.465f, 3.569f)
                lineToRelative(0.004f, 0.009f)
                curveToRelative(-0.646f, 0.658f, -1.004f, 1.525f, -1.004f, 2.449f)
                curveToRelative(0.0f, 0.935f, 0.364f, 1.814f, 1.06f, 2.508f)
                lineToRelative(2.394f, 2.247f)
                curveToRelative(1.582f, 1.483f, 3.647f, 2.301f, 5.816f, 2.301f)
                horizontalLineToRelative(5.23f)
                curveToRelative(3.584f, 0.0f, 6.5f, -2.916f, 6.5f, -6.5f)
                verticalLineToRelative(-0.838f)
                curveToRelative(-0.455f, 0.217f, -0.964f, 0.338f, -1.5f, 0.338f)
                reflectiveCurveToRelative(-1.045f, -0.122f, -1.5f, -0.338f)
                close()
                moveTo(9.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(2.958f, 5.5f)
                lineToRelative(-1.801f, 0.838f)
                curveToRelative(-0.291f, 0.291f, -0.138f, 0.662f, 0.274f, 0.662f)
                lineTo(6.038f, 7.0f)
                verticalLineToRelative(1.415f)
                curveToRelative(1.01f, -0.247f, 2.085f, -0.101f, 3.0f, 0.436f)
                lineTo(9.038f, 4.0f)
                lineTo(1.431f, 4.0f)
                curveToRelative(-0.411f, 0.0f, -0.575f, 0.394f, -0.284f, 0.685f)
                lineToRelative(1.81f, 0.815f)
                close()
            }
        }
        .build()
        return _handPointRibbon!!
    }

private var _handPointRibbon: ImageVector? = null
