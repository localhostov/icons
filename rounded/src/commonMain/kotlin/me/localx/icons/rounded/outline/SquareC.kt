package me.localx.icons.rounded.outline

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

public val Icons.Outline.SquareC: ImageVector
    get() {
        if (_squareC != null) {
            return _squareC!!
        }
        _squareC = Builder(name = "SquareC", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(8.005f, 10.909f)
                verticalLineToRelative(2.182f)
                curveToRelative(0.0f, 2.156f, 1.731f, 3.909f, 3.858f, 3.909f)
                horizontalLineToRelative(0.545f)
                curveToRelative(1.307f, 0.0f, 2.522f, -0.65f, 3.251f, -1.738f)
                curveToRelative(0.308f, -0.458f, 0.929f, -0.581f, 1.388f, -0.274f)
                curveToRelative(0.458f, 0.308f, 0.582f, 0.929f, 0.274f, 1.388f)
                curveToRelative(-1.101f, 1.644f, -2.938f, 2.625f, -4.913f, 2.625f)
                horizontalLineToRelative(-0.545f)
                curveToRelative(-3.23f, 0.0f, -5.858f, -2.651f, -5.858f, -5.909f)
                verticalLineToRelative(-2.182f)
                curveToRelative(0.0f, -3.258f, 2.628f, -5.909f, 5.858f, -5.909f)
                horizontalLineToRelative(0.545f)
                curveToRelative(1.976f, 0.0f, 3.813f, 0.981f, 4.913f, 2.625f)
                curveToRelative(0.307f, 0.459f, 0.184f, 1.08f, -0.275f, 1.387f)
                curveToRelative(-0.461f, 0.307f, -1.081f, 0.184f, -1.387f, -0.275f)
                curveToRelative(-0.729f, -1.088f, -1.943f, -1.738f, -3.251f, -1.738f)
                horizontalLineToRelative(-0.545f)
                curveToRelative(-2.127f, 0.0f, -3.858f, 1.753f, -3.858f, 3.909f)
                close()
            }
        }
        .build()
        return _squareC!!
    }

private var _squareC: ImageVector? = null
