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

public val Icons.Outline.JarAlt: ImageVector
    get() {
        if (_jarAlt != null) {
            return _jarAlt!!
        }
        _jarAlt = Builder(name = "JarAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 4.418f)
                lineTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                verticalLineToRelative(4.418f)
                curveToRelative(-1.764f, 0.773f, -3.0f, 2.536f, -3.0f, 4.582f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -2.046f, -1.236f, -3.809f, -3.0f, -4.582f)
                close()
                moveTo(7.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(6.0f)
                lineTo(4.0f, 17.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(20.0f, 21.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-10.0f)
                lineTo(4.0f, 9.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _jarAlt!!
    }

private var _jarAlt: ImageVector? = null
