package me.localx.icons.straight.bold

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

public val Icons.Bold.SquarePhoneHangup: ImageVector
    get() {
        if (_squarePhoneHangup != null) {
            return _squarePhoneHangup!!
        }
        _squarePhoneHangup = Builder(name = "SquarePhoneHangup", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.173f, 11.017f)
                curveToRelative(0.504f, 0.504f, 0.828f, 1.192f, 0.827f, 1.96f)
                verticalLineToRelative(2.023f)
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
                close()
                moveTo(24.0f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.5f)
                close()
            }
        }
        .build()
        return _squarePhoneHangup!!
    }

private var _squarePhoneHangup: ImageVector? = null
