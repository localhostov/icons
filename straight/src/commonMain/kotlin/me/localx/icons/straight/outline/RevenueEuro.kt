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

public val Icons.Outline.RevenueEuro: ImageVector
    get() {
        if (_revenueEuro != null) {
            return _revenueEuro!!
        }
        _revenueEuro = Builder(name = "RevenueEuro", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 11.812f)
                curveToRelative(-0.608f, -0.353f, -1.282f, -0.6f, -2.0f, -0.721f)
                lineTo(21.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(11.812f)
                close()
                moveTo(18.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.54f)
                curveToRelative(0.578f, -0.519f, 1.254f, -0.926f, 2.0f, -1.19f)
                lineTo(18.0f, 3.0f)
                close()
                moveTo(20.0f, 22.0f)
                curveToRelative(-0.737f, 0.0f, -1.375f, -0.405f, -1.722f, -1.0f)
                horizontalLineToRelative(1.722f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.722f)
                curveToRelative(0.347f, -0.595f, 0.985f, -1.0f, 1.722f, -1.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.859f, 0.0f, -3.411f, 1.28f, -3.858f, 3.0f)
                horizontalLineToRelative(-1.142f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.142f)
                curveToRelative(0.447f, 1.72f, 1.999f, 3.0f, 3.858f, 3.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(6.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(1.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-12.0f)
                lineTo(1.0f, 12.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(11.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(18.0f)
                close()
            }
        }
        .build()
        return _revenueEuro!!
    }

private var _revenueEuro: ImageVector? = null
