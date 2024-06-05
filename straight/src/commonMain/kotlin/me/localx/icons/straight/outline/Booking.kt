package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Booking: ImageVector
    get() {
        if (_booking != null) {
            return _booking!!
        }
        _booking = Builder(name = "Booking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 9.0f)
                horizontalLineToRelative(8.023f)
                curveToRelative(0.717f, -0.949f, 1.758f, -1.634f, 2.961f, -1.888f)
                verticalLineToRelative(-0.112f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.992f)
                verticalLineToRelative(0.111f)
                curveToRelative(1.206f, 0.252f, 2.25f, 0.938f, 2.969f, 1.889f)
                horizontalLineToRelative(1.023f)
                verticalLineToRelative(6.765f)
                lineToRelative(2.0f, 0.747f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(3.116f)
                curveToRelative(0.146f, -0.712f, 0.456f, -1.391f, 0.916f, -2.0f)
                horizontalLineToRelative(-2.032f)
                verticalLineToRelative(-9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 17.152f)
                verticalLineToRelative(-5.045f)
                curveToRelative(0.0f, -1.516f, -1.076f, -2.834f, -2.504f, -3.066f)
                curveToRelative(-0.88f, -0.144f, -1.768f, 0.103f, -2.439f, 0.674f)
                curveToRelative(-0.672f, 0.571f, -1.057f, 1.404f, -1.057f, 2.286f)
                verticalLineToRelative(7.563f)
                lineToRelative(-1.014f, -0.808f)
                lineToRelative(-0.003f, 0.004f)
                curveToRelative(-1.21f, -1.072f, -3.064f, -0.997f, -4.174f, 0.191f)
                curveToRelative(-1.13f, 1.208f, -1.066f, 3.11f, 0.13f, 4.23f)
                lineToRelative(0.849f, 0.818f)
                horizontalLineToRelative(2.881f)
                lineToRelative(-2.352f, -2.268f)
                curveToRelative(-0.403f, -0.378f, -0.424f, -1.013f, -0.046f, -1.416f)
                curveToRelative(0.375f, -0.402f, 1.008f, -0.421f, 1.41f, -0.048f)
                curveToRelative(0.02f, 0.019f, 4.32f, 3.443f, 4.32f, 3.443f)
                verticalLineToRelative(-11.712f)
                curveToRelative(0.0f, -0.294f, 0.129f, -0.572f, 0.353f, -0.762f)
                curveToRelative(0.228f, -0.193f, 0.52f, -0.271f, 0.822f, -0.224f)
                curveToRelative(0.463f, 0.076f, 0.825f, 0.556f, 0.825f, 1.093f)
                verticalLineToRelative(6.433f)
                lineToRelative(7.0f, 2.615f)
                verticalLineToRelative(2.845f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.232f)
                lineToRelative(-7.0f, -2.615f)
                close()
            }
        }
        .build()
        return _booking!!
    }

private var _booking: ImageVector? = null
