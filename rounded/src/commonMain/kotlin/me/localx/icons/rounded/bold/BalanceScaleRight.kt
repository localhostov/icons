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

public val Icons.Bold.BalanceScaleRight: ImageVector
    get() {
        if (_balanceScaleRight != null) {
            return _balanceScaleRight!!
        }
        _balanceScaleRight = Builder(name = "BalanceScaleRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.5f)
                curveToRelative(0.219f, 6.249f, 9.441f, 5.76f, 8.937f, -0.431f)
                lineToRelative(-2.482f, -8.273f)
                curveToRelative(-0.479f, -1.598f, -1.792f, -2.793f, -3.401f, -3.114f)
                lineToRelative(-4.554f, -0.996f)
                verticalLineToRelative(-0.185f)
                curveToRelative(0.018f, -1.69f, -2.443f, -2.053f, -2.922f, -0.455f)
                lineTo(6.07f, 0.059f)
                curveToRelative(-1.533f, -0.304f, -3.037f, 0.592f, -3.494f, 2.118f)
                lineTo(0.057f, 11.092f)
                curveToRelative(-0.367f, 2.595f, 1.861f, 4.928f, 4.443f, 4.908f)
                curveToRelative(2.587f, 0.022f, 4.834f, -2.334f, 4.437f, -4.933f)
                lineTo(6.58f, 3.241f)
                lineToRelative(3.92f, 0.858f)
                lineTo(10.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.972f, 0.033f, -1.971f, 2.967f, 0.0f, 3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.972f, -0.033f, 1.971f, -2.967f, 0.0f, -3.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(13.5f, 4.755f)
                lineToRelative(3.939f, 0.862f)
                curveToRelative(0.093f, 0.019f, 0.182f, 0.045f, 0.268f, 0.08f)
                lineToRelative(-2.637f, 8.351f)
                curveToRelative(-0.046f, 0.146f, -0.07f, 0.298f, -0.07f, 0.452f)
                close()
                moveTo(4.448f, 6.567f)
                lineToRelative(1.335f, 4.433f)
                lineTo(3.199f, 11.0f)
                lineToRelative(1.249f, -4.433f)
                close()
                moveTo(20.784f, 14.0f)
                horizontalLineToRelative(-2.553f)
                lineToRelative(1.309f, -4.146f)
                lineToRelative(1.244f, 4.146f)
                close()
            }
        }
        .build()
        return _balanceScaleRight!!
    }

private var _balanceScaleRight: ImageVector? = null
