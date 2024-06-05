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

public val Icons.Bold.HouseLaptop: ImageVector
    get() {
        if (_houseLaptop != null) {
            return _houseLaptop!!
        }
        _houseLaptop = Builder(name = "HouseLaptop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 8.16f)
                curveToRelative(0.0f, -1.08f, 0.49f, -2.09f, 1.34f, -2.76f)
                lineTo(7.34f, 0.71f)
                curveToRelative(1.27f, -0.99f, 3.04f, -0.99f, 4.31f, 0.0f)
                lineToRelative(2.34f, 1.83f)
                lineTo(13.99f, 1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.89f)
                lineToRelative(0.66f, 0.51f)
                curveToRelative(0.89f, 0.7f, 1.34f, 1.57f, 1.34f, 2.59f)
                horizontalLineToRelative(-3.0f)
                reflectiveCurveToRelative(0.0f, -0.05f, 0.0f, -0.05f)
                curveToRelative(0.0f, 0.0f, -0.03f, -0.06f, -0.19f, -0.18f)
                lineTo(9.81f, 3.07f)
                curveToRelative(-0.18f, -0.14f, -0.43f, -0.14f, -0.62f, 0.0f)
                lineTo(3.19f, 7.77f)
                curveToRelative(-0.12f, 0.1f, -0.19f, 0.24f, -0.19f, 0.39f)
                verticalLineToRelative(7.84f)
                close()
                moveTo(24.0f, 20.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                lineTo(8.0f, 24.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(10.5f, 13.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(2.0f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _houseLaptop!!
    }

private var _houseLaptop: ImageVector? = null
