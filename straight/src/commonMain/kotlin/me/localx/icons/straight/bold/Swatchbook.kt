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

public val Icons.Bold.Swatchbook: ImageVector
    get() {
        if (_swatchbook != null) {
            return _swatchbook!!
        }
        _swatchbook = Builder(name = "Swatchbook", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.485f, 12.0f)
                lineToRelative(2.485f, -2.485f)
                lineTo(14.485f, 1.03f)
                lineToRelative(-2.485f, 2.485f)
                lineTo(12.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(-3.515f)
                close()
                moveTo(14.485f, 5.272f)
                lineToRelative(4.243f, 4.243f)
                lineToRelative(-6.728f, 6.728f)
                lineTo(12.0f, 7.757f)
                lineToRelative(2.485f, -2.485f)
                close()
                moveTo(9.0f, 12.0f)
                lineTo(3.0f, 12.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(9.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(3.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-9.515f)
                lineToRelative(6.0f, -6.0f)
                horizontalLineToRelative(3.515f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(7.5f, 18.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _swatchbook!!
    }

private var _swatchbook: ImageVector? = null
