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

public val Icons.Outline.Builder: ImageVector
    get() {
        if (_builder != null) {
            return _builder!!
        }
        _builder = Builder(name = "Builder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 9.0f)
                curveToRelative(0.0f, 1.687f, 0.716f, 3.305f, 1.964f, 4.44f)
                curveToRelative(1.106f, 1.006f, 2.557f, 1.559f, 4.049f, 1.559f)
                curveToRelative(0.19f, 0.0f, 0.382f, -0.009f, 0.573f, -0.027f)
                curveToRelative(3.036f, -0.289f, 5.414f, -3.007f, 5.414f, -6.187f)
                verticalLineToRelative(-0.785f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.032f, -2.467f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-1.0f)
                curveTo(5.467f, 0.0f, 3.0f, 2.468f, 3.0f, 5.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(13.0f, 8.785f)
                curveToRelative(0.0f, 2.16f, -1.583f, 4.003f, -3.604f, 4.196f)
                curveToRelative(-1.146f, 0.106f, -2.243f, -0.253f, -3.086f, -1.021f)
                curveToRelative(-0.833f, -0.758f, -1.31f, -1.836f, -1.31f, -2.961f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.785f)
                close()
                moveTo(5.0f, 5.5f)
                curveToRelative(0.0f, -1.758f, 1.308f, -3.204f, 3.0f, -3.449f)
                verticalLineToRelative(2.949f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.949f)
                curveToRelative(1.692f, 0.245f, 3.0f, 1.691f, 3.0f, 3.449f)
                verticalLineToRelative(0.5f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(13.0f, 18.0f)
                lineTo(5.0f, 18.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(12.0f, 21.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(22.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _builder!!
    }

private var _builder: ImageVector? = null
