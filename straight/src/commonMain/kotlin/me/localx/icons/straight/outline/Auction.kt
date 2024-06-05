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

public val Icons.Outline.Auction: ImageVector
    get() {
        if (_auction != null) {
            return _auction!!
        }
        _auction = Builder(name = "Auction", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.705f, 15.39f)
                lineToRelative(-1.025f, 1.025f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(7.889f, -7.89f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-0.994f, 0.994f)
                lineToRelative(-7.082f, -7.082f)
                lineToRelative(0.994f, -0.994f)
                lineTo(13.074f, 0.029f)
                lineToRelative(-7.89f, 7.89f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.024f, -1.024f)
                lineToRelative(2.827f, 2.827f)
                lineTo(0.023f, 21.562f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(10.427f, -10.427f)
                lineToRelative(2.841f, 2.841f)
                close()
                moveTo(11.778f, 9.635f)
                lineToRelative(3.043f, -3.043f)
                lineToRelative(1.672f, 1.672f)
                lineToRelative(-3.043f, 3.043f)
                lineToRelative(-1.672f, -1.672f)
                close()
                moveTo(16.119f, 13.975f)
                lineToRelative(-1.254f, -1.254f)
                lineToRelative(3.043f, -3.043f)
                lineToRelative(1.254f, 1.254f)
                lineToRelative(-3.042f, 3.043f)
                close()
                moveTo(12.08f, 3.852f)
                lineToRelative(1.327f, 1.327f)
                lineToRelative(-3.043f, 3.043f)
                lineToRelative(-1.327f, -1.327f)
                lineToRelative(3.043f, -3.043f)
                close()
                moveTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.051f)
                curveToRelative(0.232f, -1.14f, 1.242f, -2.0f, 2.449f, -2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.208f, 0.0f, 2.217f, 0.86f, 2.449f, 2.0f)
                horizontalLineToRelative(1.051f)
                close()
            }
        }
        .build()
        return _auction!!
    }

private var _auction: ImageVector? = null
