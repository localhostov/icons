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

public val Icons.Outline.SquareB: ImageVector
    get() {
        if (_squareB != null) {
            return _squareB!!
        }
        _squareB = Builder(name = "SquareB", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.331f, 11.213f)
                curveToRelative(0.422f, -0.634f, 0.669f, -1.395f, 0.669f, -2.212f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.929f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(4.545f)
                curveToRelative(2.181f, 0.0f, 3.955f, -1.774f, 3.955f, -4.03f)
                curveToRelative(0.0f, -1.062f, -0.41f, -2.06f, -1.155f, -2.808f)
                curveToRelative(-0.433f, -0.435f, -0.95f, -0.756f, -1.514f, -0.95f)
                close()
                moveTo(8.0f, 8.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.501f)
                close()
                moveTo(14.045f, 17.001f)
                horizontalLineToRelative(-4.545f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.674f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(6.048f)
                curveToRelative(0.521f, 0.0f, 1.011f, 0.203f, 1.379f, 0.573f)
                curveToRelative(0.369f, 0.371f, 0.573f, 0.867f, 0.573f, 1.472f)
                curveToRelative(0.0f, 1.078f, -0.877f, 1.955f, -1.955f, 1.955f)
                close()
                moveTo(19.0f, 0.0f)
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
            }
        }
        .build()
        return _squareB!!
    }

private var _squareB: ImageVector? = null
