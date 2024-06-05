package me.localx.icons.straight.outline

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

public val Icons.Outline.UserNinja: ImageVector
    get() {
        if (_userNinja != null) {
            return _userNinja!!
        }
        _userNinja = Builder(name = "UserNinja", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 14.0f)
                lineTo(7.5f, 14.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.071f, 0.68f, -1.979f, 1.628f, -2.335f)
                curveToRelative(0.955f, 1.712f, 3.018f, 5.136f, 5.18f, 7.835f)
                horizontalLineToRelative(2.605f)
                curveToRelative(-0.396f, -0.46f, -0.787f, -0.939f, -1.168f, -1.428f)
                curveToRelative(2.385f, -3.138f, 3.69f, -5.675f, 4.056f, -6.429f)
                curveToRelative(0.985f, 0.336f, 1.699f, 1.259f, 1.699f, 2.357f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(8.836f, 16.0f)
                horizontalLineToRelative(6.29f)
                curveToRelative(-0.545f, 1.019f, -1.578f, 2.804f, -3.126f, 4.898f)
                curveToRelative(-1.305f, -1.83f, -2.424f, -3.631f, -3.164f, -4.898f)
                close()
                moveTo(15.0f, 5.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(20.812f, 6.017f)
                curveToRelative(-0.42f, -0.296f, -0.943f, -0.443f, -1.449f, -0.517f)
                curveToRelative(0.506f, -0.074f, 1.029f, -0.222f, 1.449f, -0.517f)
                curveToRelative(1.219f, -0.859f, 1.565f, -2.916f, 1.565f, -2.916f)
                curveToRelative(0.0f, 0.0f, -2.093f, -0.34f, -3.312f, 0.518f)
                curveToRelative(-0.643f, 0.453f, -1.039f, 1.234f, -1.273f, 1.876f)
                curveToRelative(-0.682f, -2.564f, -3.017f, -4.461f, -5.793f, -4.461f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(3.011f, 0.0f, 5.504f, -2.232f, 5.929f, -5.127f)
                curveToRelative(0.243f, 0.562f, 0.602f, 1.166f, 1.137f, 1.542f)
                curveToRelative(1.219f, 0.859f, 3.312f, 0.518f, 3.312f, 0.518f)
                curveToRelative(0.0f, 0.0f, -0.346f, -2.057f, -1.565f, -2.916f)
                close()
                moveTo(11.999f, 10.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _userNinja!!
    }

private var _userNinja: ImageVector? = null
