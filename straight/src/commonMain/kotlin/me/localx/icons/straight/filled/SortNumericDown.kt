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

public val Icons.Filled.SortNumericDown: ImageVector
    get() {
        if (_sortNumericDown != null) {
            return _sortNumericDown!!
        }
        _sortNumericDown = Builder(name = "SortNumericDown", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(18.0f, 3.379f)
                verticalLineToRelative(7.621f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 0.0f)
                horizontalLineToRelative(-1.501f)
                lineToRelative(-3.216f, 3.303f)
                lineToRelative(1.434f, 1.395f)
                lineToRelative(1.283f, -1.318f)
                close()
                moveTo(22.0f, 16.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(1.544f, 0.0f, 2.885f, -0.878f, 3.552f, -2.162f)
                curveToRelative(-0.332f, 0.105f, -0.686f, 0.162f, -1.052f, 0.162f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(18.5f, 18.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _sortNumericDown!!
    }

private var _sortNumericDown: ImageVector? = null
