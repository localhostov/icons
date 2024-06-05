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

public val Icons.Filled.SquareB: ImageVector
    get() {
        if (_squareB != null) {
            return _squareB!!
        }
        _squareB = Builder(name = "SquareB", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 11.001f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.501f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(14.049f, 13.001f)
                horizontalLineToRelative(-6.048f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(4.545f)
                curveToRelative(1.078f, 0.0f, 1.955f, -0.876f, 1.955f, -1.955f)
                curveToRelative(0.0f, -0.605f, -0.204f, -1.101f, -0.573f, -1.472f)
                curveToRelative(-0.368f, -0.37f, -0.857f, -0.573f, -1.379f, -0.573f)
                close()
                moveTo(24.001f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.243f, 2.243f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(18.001f, 14.971f)
                curveToRelative(0.0f, -1.062f, -0.41f, -2.06f, -1.155f, -2.808f)
                curveToRelative(-0.433f, -0.435f, -0.95f, -0.756f, -1.514f, -0.95f)
                curveToRelative(0.422f, -0.634f, 0.669f, -1.395f, 0.669f, -2.212f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.929f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(4.545f)
                curveToRelative(2.181f, 0.0f, 3.955f, -1.774f, 3.955f, -4.03f)
                close()
            }
        }
        .build()
        return _squareB!!
    }

private var _squareB: ImageVector? = null
