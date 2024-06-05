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
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.593f)
                curveToRelative(-1.068f, -0.456f, -2.047f, -0.68f, -3.0f, -0.686f)
                curveToRelative(-1.003f, -0.006f, -1.978f, 0.228f, -3.0f, 0.686f)
                verticalLineToRelative(2.593f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.023f)
                curveToRelative(0.0f, -0.768f, 0.323f, -1.456f, 0.827f, -1.96f)
                curveToRelative(1.308f, -1.308f, 3.733f, -2.006f, 6.173f, -2.017f)
                curveToRelative(2.39f, -0.011f, 4.793f, 0.637f, 6.173f, 2.017f)
                curveToRelative(0.504f, 0.504f, 0.828f, 1.192f, 0.827f, 1.96f)
                verticalLineToRelative(2.023f)
                close()
            }
        }
        .build()
        return _squarePhoneHangup!!
    }

private var _squarePhoneHangup: ImageVector? = null
