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

public val Icons.Filled.UserMdChat: ImageVector
    get() {
        if (_userMdChat != null) {
            return _userMdChat!!
        }
        _userMdChat = Builder(name = "UserMdChat", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -3.525f, 2.042f, -6.574f, 5.0f, -8.05f)
                verticalLineToRelative(3.328f)
                curveToRelative(-0.595f, 0.346f, -1.0f, 0.984f, -1.0f, 1.723f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.738f, -0.405f, -1.376f, -1.0f, -1.723f)
                verticalLineToRelative(-4.046f)
                curveToRelative(0.644f, -0.147f, 1.312f, -0.232f, 2.0f, -0.232f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.338f, 0.0f, 0.671f, 0.022f, 1.0f, 0.059f)
                verticalLineToRelative(4.125f)
                curveToRelative(-1.161f, 0.414f, -2.0f, 1.514f, -2.0f, 2.816f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.302f, -0.839f, -2.402f, -2.0f, -2.816f)
                verticalLineToRelative(-3.659f)
                curveToRelative(3.49f, 1.239f, 6.0f, 4.565f, 6.0f, 8.475f)
                close()
                moveTo(22.631f, 8.353f)
                curveToRelative(0.944f, -0.991f, 1.428f, -2.27f, 1.363f, -3.601f)
                curveTo(23.867f, 2.173f, 21.827f, 0.133f, 19.248f, 0.006f)
                curveToRelative(-1.328f, -0.068f, -2.611f, 0.419f, -3.603f, 1.363f)
                curveToRelative(-1.046f, 0.996f, -1.646f, 2.397f, -1.646f, 3.845f)
                verticalLineToRelative(2.458f)
                curveToRelative(0.0f, 1.6f, 1.037f, 2.328f, 2.0f, 2.328f)
                horizontalLineToRelative(2.782f)
                curveToRelative(1.449f, 0.0f, 2.852f, -0.601f, 3.849f, -1.647f)
                close()
                moveTo(12.0f, 7.672f)
                verticalLineToRelative(-2.458f)
                curveToRelative(0.0f, -1.299f, 0.357f, -2.568f, 1.0f, -3.677f)
                curveToRelative(-1.062f, -0.953f, -2.461f, -1.537f, -4.0f, -1.537f)
                curveTo(5.686f, 0.0f, 3.0f, 2.686f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.515f, 0.0f, 2.894f, -0.566f, 3.95f, -1.491f)
                curveToRelative(-0.57f, -0.709f, -0.95f, -1.65f, -0.95f, -2.837f)
                close()
            }
        }
        .build()
        return _userMdChat!!
    }

private var _userMdChat: ImageVector? = null
