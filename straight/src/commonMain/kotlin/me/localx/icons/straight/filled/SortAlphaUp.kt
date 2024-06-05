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

public val Icons.Filled.SortAlphaUp: ImageVector
    get() {
        if (_sortAlphaUp != null) {
            return _sortAlphaUp!!
        }
        _sortAlphaUp = Builder(name = "SortAlphaUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.362f)
                lineToRelative(-4.698f, 5.638f)
                horizontalLineToRelative(4.698f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.362f)
                lineToRelative(4.698f, -5.638f)
                horizontalLineToRelative(-4.698f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(22.0f, 3.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(20.0f, 3.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(6.0f, 0.0f)
                curveTo(5.488f, 0.0f, 4.976f, 0.196f, 4.586f, 0.586f)
                lineTo(0.086f, 5.086f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.5f, -3.5f)
                lineTo(5.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 3.0f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(1.414f, -1.414f)
                lineTo(7.414f, 0.586f)
                curveTo(7.024f, 0.196f, 6.512f, 0.0f, 6.0f, 0.0f)
                close()
            }
        }
        .build()
        return _sortAlphaUp!!
    }

private var _sortAlphaUp: ImageVector? = null
