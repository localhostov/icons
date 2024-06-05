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

public val Icons.Bold.SortAlphaUpAlt: ImageVector
    get() {
        if (_sortAlphaUpAlt != null) {
            return _sortAlphaUpAlt!!
        }
        _sortAlphaUpAlt = Builder(name = "SortAlphaUpAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 0.0f)
                lineTo(15.0f, 0.0f)
                lineTo(15.0f, 3.0f)
                horizontalLineToRelative(4.131f)
                lineToRelative(-4.131f, 4.957f)
                verticalLineToRelative(3.043f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.131f)
                lineToRelative(4.131f, -4.957f)
                lineTo(23.0f, 0.0f)
                close()
                moveTo(23.0f, 17.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(20.333f, 16.833f)
                curveToRelative(0.0f, -0.736f, -0.598f, -1.333f, -1.333f, -1.333f)
                reflectiveCurveToRelative(-1.333f, 0.598f, -1.333f, 1.333f)
                verticalLineToRelative(2.667f)
                horizontalLineToRelative(2.667f)
                verticalLineToRelative(-2.667f)
                close()
                moveTo(10.896f, 7.604f)
                lineToRelative(-2.896f, -2.896f)
                lineTo(8.0f, 24.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(5.0f, 4.707f)
                lineToRelative(-2.896f, 2.896f)
                lineTo(-0.018f, 5.482f)
                lineTo(4.732f, 0.732f)
                curveTo(5.22f, 0.245f, 5.859f, 0.0f, 6.5f, 0.0f)
                reflectiveCurveToRelative(1.28f, 0.244f, 1.768f, 0.731f)
                lineToRelative(4.75f, 4.75f)
                lineToRelative(-2.121f, 2.121f)
                close()
            }
        }
        .build()
        return _sortAlphaUpAlt!!
    }

private var _sortAlphaUpAlt: ImageVector? = null
