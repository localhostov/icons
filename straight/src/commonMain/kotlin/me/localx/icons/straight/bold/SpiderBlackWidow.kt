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

public val Icons.Bold.SpiderBlackWidow: ImageVector
    get() {
        if (_spiderBlackWidow != null) {
            return _spiderBlackWidow!!
        }
        _spiderBlackWidow = Builder(name = "SpiderBlackWidow", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.535f)
                lineToRelative(-6.382f, -2.797f)
                lineToRelative(4.382f, -2.337f)
                lineTo(22.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.6f)
                lineToRelative(-4.106f, 2.19f)
                curveToRelative(0.068f, -0.252f, 0.106f, -0.516f, 0.106f, -0.79f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.273f, 0.037f, 0.538f, 0.106f, 0.79f)
                lineToRelative(-4.106f, -2.19f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.4f)
                lineToRelative(4.382f, 2.337f)
                lineTo(0.0f, 11.535f)
                verticalLineToRelative(3.465f)
                lineToRelative(5.461f, -2.504f)
                lineTo(0.0f, 18.95f)
                verticalLineToRelative(5.05f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.95f)
                lineToRelative(2.37f, -2.802f)
                curveToRelative(0.939f, 2.76f, 3.556f, 4.752f, 6.63f, 4.752f)
                reflectiveCurveToRelative(5.691f, -1.992f, 6.63f, -4.752f)
                lineToRelative(2.37f, 2.802f)
                verticalLineToRelative(3.95f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.05f)
                lineToRelative(-5.461f, -6.454f)
                lineToRelative(5.461f, 2.504f)
                verticalLineToRelative(-3.465f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, -1.791f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.791f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.791f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.791f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(14.0f, 13.0f)
                lineToRelative(-1.6f, 2.0f)
                lineToRelative(1.6f, 2.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(1.6f, -2.0f)
                lineToRelative(-1.6f, -2.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _spiderBlackWidow!!
    }

private var _spiderBlackWidow: ImageVector? = null
