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

public val Icons.Outline.SubscriptionAlt: ImageVector
    get() {
        if (_subscriptionAlt != null) {
            return _subscriptionAlt!!
        }
        _subscriptionAlt = Builder(name = "SubscriptionAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 16.769f)
                lineToRelative(8.0f, 3.0f)
                verticalLineToRelative(4.231f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.846f)
                lineToRelative(-8.0f, -3.0f)
                verticalLineToRelative(-6.047f)
                curveToRelative(0.0f, -0.537f, -0.362f, -1.017f, -0.825f, -1.093f)
                curveToRelative(-0.303f, -0.048f, -0.595f, 0.03f, -0.822f, 0.224f)
                curveToRelative(-0.224f, 0.19f, -0.353f, 0.468f, -0.353f, 0.762f)
                verticalLineToRelative(11.712f)
                reflectiveCurveToRelative(-4.301f, -3.425f, -4.32f, -3.443f)
                curveToRelative(-0.402f, -0.373f, -1.034f, -0.354f, -1.41f, 0.048f)
                curveToRelative(-0.377f, 0.403f, -0.356f, 1.038f, 0.046f, 1.416f)
                lineToRelative(2.352f, 2.268f)
                horizontalLineToRelative(-2.881f)
                lineToRelative(-0.849f, -0.818f)
                curveToRelative(-1.196f, -1.12f, -1.26f, -3.022f, -0.13f, -4.23f)
                curveToRelative(1.115f, -1.194f, 2.983f, -1.269f, 4.193f, -0.182f)
                lineToRelative(0.998f, 0.794f)
                verticalLineToRelative(-7.563f)
                curveToRelative(0.0f, -0.881f, 0.385f, -1.714f, 1.057f, -2.286f)
                reflectiveCurveToRelative(1.56f, -0.818f, 2.439f, -0.674f)
                curveToRelative(1.428f, 0.232f, 2.504f, 1.551f, 2.504f, 3.066f)
                verticalLineToRelative(4.662f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineTo(3.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(6.101f)
                curveToRelative(0.151f, -0.744f, 0.481f, -1.416f, 0.922f, -2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-7.023f)
                curveToRelative(0.441f, 0.584f, 0.771f, 1.256f, 0.922f, 2.0f)
                horizontalLineToRelative(8.101f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _subscriptionAlt!!
    }

private var _subscriptionAlt: ImageVector? = null
