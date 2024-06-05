package me.localx.icons.rounded.outline

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

public val Icons.Outline.CopyAlt: ImageVector
    get() {
        if (_copyAlt != null) {
            return _copyAlt!!
        }
        _copyAlt = Builder(name = "CopyAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 20.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineToRelative(-8.757f)
                arcToRelative(3.972f, 3.972f, 0.0f, false, false, -1.172f, -2.829f)
                lineToRelative(-2.242f, -2.242f)
                arcToRelative(3.972f, 3.972f, 0.0f, false, false, -2.829f, -1.172f)
                horizontalLineToRelative(-4.757f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                close()
                moveTo(4.0f, 15.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                reflectiveCurveToRelative(4.919f, 0.014f, 5.0f, 0.024f)
                verticalLineToRelative(1.976f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(1.976f)
                curveToRelative(0.01f, 0.081f, 0.024f, 9.0f, 0.024f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 8.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineToRelative(-11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _copyAlt!!
    }

private var _copyAlt: ImageVector? = null
