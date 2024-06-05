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

public val Icons.Filled.SquarePhoneHangup: ImageVector
    get() {
        if (_squarePhoneHangup != null) {
            return _squarePhoneHangup!!
        }
        _squarePhoneHangup = Builder(name = "SquarePhoneHangup", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(18.947f, 13.905f)
                curveToRelative(0.0f, 0.605f, -0.49f, 1.095f, -1.095f, 1.095f)
                lineToRelative(-1.56f, -0.205f)
                curveToRelative(-0.605f, 0.0f, -1.095f, -0.49f, -1.095f, -1.095f)
                lineToRelative(-0.148f, -1.578f)
                curveToRelative(-1.939f, -0.868f, -3.968f, -0.91f, -6.099f, 0.0f)
                lineToRelative(-0.148f, 1.578f)
                curveToRelative(0.0f, 0.605f, -0.49f, 1.095f, -1.095f, 1.095f)
                lineToRelative(-1.56f, 0.205f)
                curveToRelative(-0.605f, 0.0f, -1.095f, -0.49f, -1.095f, -1.095f)
                lineToRelative(-0.053f, -1.038f)
                curveToRelative(0.0f, -0.747f, 0.314f, -1.416f, 0.804f, -1.906f)
                curveToRelative(2.711f, -2.711f, 9.874f, -2.517f, 12.391f, 0.0f)
                curveToRelative(0.49f, 0.49f, 0.805f, 1.159f, 0.804f, 1.906f)
                lineToRelative(-0.053f, 1.038f)
                close()
            }
        }
        .build()
        return _squarePhoneHangup!!
    }

private var _squarePhoneHangup: ImageVector? = null
