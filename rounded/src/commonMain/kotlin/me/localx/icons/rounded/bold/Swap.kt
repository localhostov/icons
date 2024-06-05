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

public val Icons.Bold.Swap: ImageVector
    get() {
        if (_swap != null) {
            return _swap!!
        }
        _swap = Builder(name = "Swap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.723f, 19.604f)
                lineToRelative(-3.525f, 3.525f)
                curveToRelative(-0.386f, 0.386f, -1.011f, 0.386f, -1.397f, 0.0f)
                lineToRelative(-3.525f, -3.525f)
                curveToRelative(-0.592f, -0.592f, -0.173f, -1.604f, 0.664f, -1.604f)
                horizontalLineToRelative(2.059f)
                verticalLineToRelative(-9.25f)
                curveToRelative(0.0f, -0.965f, -0.785f, -1.75f, -1.75f, -1.75f)
                reflectiveCurveToRelative(-1.75f, 0.785f, -1.75f, 1.75f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 2.619f, -2.131f, 4.75f, -4.75f, 4.75f)
                reflectiveCurveToRelative(-4.75f, -2.131f, -4.75f, -4.75f)
                verticalLineTo(6.0f)
                horizontalLineTo(1.941f)
                curveToRelative(-0.837f, 0.0f, -1.256f, -1.012f, -0.664f, -1.604f)
                lineTo(4.802f, 0.871f)
                curveToRelative(0.386f, -0.386f, 1.011f, -0.386f, 1.397f, 0.0f)
                lineToRelative(3.525f, 3.525f)
                curveToRelative(0.592f, 0.592f, 0.173f, 1.604f, -0.664f, 1.604f)
                horizontalLineToRelative(-2.059f)
                verticalLineToRelative(9.25f)
                curveToRelative(0.0f, 0.965f, 0.785f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.785f, 1.75f, -1.75f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -2.619f, 2.131f, -4.75f, 4.75f, -4.75f)
                reflectiveCurveToRelative(4.75f, 2.131f, 4.75f, 4.75f)
                verticalLineToRelative(9.25f)
                horizontalLineToRelative(2.059f)
                curveToRelative(0.837f, 0.0f, 1.256f, 1.012f, 0.664f, 1.604f)
                close()
            }
        }
        .build()
        return _swap!!
    }

private var _swap: ImageVector? = null
