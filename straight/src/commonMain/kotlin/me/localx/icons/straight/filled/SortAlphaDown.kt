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

public val Icons.Filled.SortAlphaDown: ImageVector
    get() {
        if (_sortAlphaDown != null) {
            return _sortAlphaDown!!
        }
        _sortAlphaDown = Builder(name = "SortAlphaDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(4.698f)
                lineToRelative(-4.698f, 5.638f)
                verticalLineToRelative(2.362f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.698f)
                lineToRelative(4.698f, -5.638f)
                verticalLineToRelative(-2.362f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
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
                moveTo(20.0f, 5.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(11.914f, 18.914f)
                lineToRelative(-4.5f, 4.5f)
                curveToRelative(-0.39f, 0.39f, -0.902f, 0.585f, -1.414f, 0.585f)
                reflectiveCurveToRelative(-1.024f, -0.195f, -1.414f, -0.585f)
                lineTo(0.086f, 18.914f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.5f, 3.5f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 21.0f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _sortAlphaDown!!
    }

private var _sortAlphaDown: ImageVector? = null
