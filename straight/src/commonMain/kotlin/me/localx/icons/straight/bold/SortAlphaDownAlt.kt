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

public val Icons.Bold.SortAlphaDownAlt: ImageVector
    get() {
        if (_sortAlphaDownAlt != null) {
            return _sortAlphaDownAlt!!
        }
        _sortAlphaDownAlt = Builder(name = "SortAlphaDownAlt", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(20.333f, 19.5f)
                verticalLineToRelative(-2.667f)
                curveToRelative(0.0f, -0.736f, -0.598f, -1.333f, -1.333f, -1.333f)
                reflectiveCurveToRelative(-1.333f, 0.598f, -1.333f, 1.333f)
                verticalLineToRelative(2.667f)
                horizontalLineToRelative(2.667f)
                close()
                moveTo(13.017f, 18.518f)
                lineToRelative(-4.75f, 4.75f)
                curveToRelative(-0.487f, 0.487f, -1.127f, 0.731f, -1.768f, 0.731f)
                reflectiveCurveToRelative(-1.28f, -0.244f, -1.768f, -0.731f)
                lineTo(-0.018f, 18.518f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(2.896f, 2.896f)
                lineTo(4.999f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(7.999f, 19.293f)
                lineToRelative(2.896f, -2.896f)
                lineToRelative(2.121f, 2.121f)
                close()
            }
        }
        .build()
        return _sortAlphaDownAlt!!
    }

private var _sortAlphaDownAlt: ImageVector? = null
