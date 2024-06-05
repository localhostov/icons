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

public val Icons.Filled.Tty: ImageVector
    get() {
        if (_tty != null) {
            return _tty!!
        }
        _tty = Builder(name = "Tty", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-4.244f)
                curveToRelative(-1.334f, -0.496f, -2.679f, -0.75f, -4.005f, -0.756f)
                curveToRelative(-1.371f, 0.01f, -2.694f, 0.244f, -3.995f, 0.745f)
                verticalLineToRelative(4.255f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(-3.75f)
                curveToRelative(0.0f, -1.414f, 0.564f, -2.76f, 1.593f, -3.788f)
                curveTo(3.741f, 3.314f, 7.629f, 2.021f, 11.996f, 2.0f)
                curveToRelative(4.372f, 0.013f, 8.191f, 1.242f, 10.412f, 3.462f)
                curveToRelative(1.028f, 1.028f, 1.594f, 2.374f, 1.593f, 3.789f)
                verticalLineToRelative(3.749f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(23.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(23.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(3.0f, 16.0f)
                lineTo(1.0f, 16.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(3.0f, 20.0f)
                lineTo(1.0f, 20.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _tty!!
    }

private var _tty: ImageVector? = null
