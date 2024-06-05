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

public val Icons.Filled.SubscriptionAlt: ImageVector
    get() {
        if (_subscriptionAlt != null) {
            return _subscriptionAlt!!
        }
        _subscriptionAlt = Builder(name = "SubscriptionAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 16.462f)
                lineToRelative(9.0f, 3.538f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(5.538f)
                lineToRelative(-1.821f, -1.628f)
                curveToRelative(-0.917f, -0.858f, -0.96f, -2.307f, -0.098f, -3.23f)
                curveToRelative(0.861f, -0.922f, 2.313f, -0.97f, 3.235f, -0.109f)
                curveToRelative(0.034f, 0.032f, 1.069f, 0.898f, 2.145f, 1.784f)
                verticalLineToRelative(-8.817f)
                curveToRelative(0.0f, -1.215f, 1.083f, -2.176f, 2.336f, -1.973f)
                curveToRelative(0.983f, 0.16f, 1.664f, 1.083f, 1.664f, 2.08f)
                verticalLineToRelative(4.355f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineTo(3.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(7.126f)
                curveToRelative(0.444f, -1.725f, 2.01f, -3.0f, 3.874f, -3.0f)
                reflectiveCurveToRelative(3.43f, 1.275f, 3.874f, 3.0f)
                horizontalLineToRelative(9.126f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _subscriptionAlt!!
    }

private var _subscriptionAlt: ImageVector? = null
