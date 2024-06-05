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
                moveToRelative(10.0f, 14.11f)
                lineToRelative(11.0f, 3.143f)
                verticalLineToRelative(6.747f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.484f)
                lineToRelative(-8.0f, -2.286f)
                verticalLineToRelative(6.769f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-4.266f, -3.391f)
                curveToRelative(-0.866f, -0.722f, -0.983f, -2.008f, -0.261f, -2.874f)
                curveToRelative(0.722f, -0.866f, 2.008f, -0.983f, 2.874f, -0.261f)
                lineToRelative(1.64f, 1.222f)
                verticalLineToRelative(-9.275f)
                curveToRelative(0.0f, -0.911f, 0.799f, -1.632f, 1.739f, -1.479f)
                curveToRelative(0.737f, 0.12f, 1.273f, 0.812f, 1.273f, 1.56f)
                verticalLineToRelative(4.61f)
                close()
                moveTo(20.5f, 0.0f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _subscriptionAlt!!
    }

private var _subscriptionAlt: ImageVector? = null
