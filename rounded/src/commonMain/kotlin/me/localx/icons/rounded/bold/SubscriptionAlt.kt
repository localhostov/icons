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

public val Icons.Bold.SubscriptionAlt: ImageVector
    get() {
        if (_subscriptionAlt != null) {
            return _subscriptionAlt!!
        }
        _subscriptionAlt = Builder(name = "SubscriptionAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.989f, 0.736f, 1.84f, 1.713f, 1.979f)
                curveToRelative(0.819f, 0.117f, 1.39f, 0.877f, 1.272f, 1.697f)
                curveToRelative(-0.118f, 0.82f, -0.885f, 1.386f, -1.698f, 1.272f)
                curveToRelative(-2.444f, -0.35f, -4.287f, -2.478f, -4.287f, -4.949f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 2.243f, 2.243f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(17.08f, 16.708f)
                lineToRelative(-6.08f, -1.824f)
                verticalLineToRelative(-5.291f)
                curveToRelative(0.0f, -0.704f, -0.447f, -1.368f, -1.129f, -1.543f)
                curveToRelative(-1.001f, -0.256f, -1.884f, 0.492f, -1.884f, 1.449f)
                verticalLineToRelative(10.269f)
                lineToRelative(-1.64f, -1.296f)
                curveToRelative(-0.866f, -0.722f, -2.153f, -0.604f, -2.874f, 0.261f)
                curveToRelative(-0.722f, 0.866f, -0.605f, 2.153f, 0.261f, 2.874f)
                lineToRelative(1.68f, 1.483f)
                curveToRelative(0.663f, 0.585f, 1.516f, 0.908f, 2.4f, 0.908f)
                horizontalLineToRelative(0.762f)
                curveToRelative(1.338f, 0.0f, 2.423f, -1.085f, 2.423f, -2.423f)
                verticalLineToRelative(-3.561f)
                lineToRelative(5.219f, 1.566f)
                curveToRelative(1.065f, 0.319f, 1.781f, 1.281f, 1.781f, 2.394f)
                verticalLineToRelative(0.524f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-0.524f)
                curveToRelative(0.0f, -2.448f, -1.575f, -4.565f, -3.92f, -5.268f)
                close()
            }
        }
        .build()
        return _subscriptionAlt!!
    }

private var _subscriptionAlt: ImageVector? = null
