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

public val Icons.Outline.SortNumericDownAlt: ImageVector
    get() {
        if (_sortNumericDownAlt != null) {
            return _sortNumericDownAlt!!
        }
        _sortNumericDownAlt = Builder(name = "SortNumericDownAlt", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 0.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.364f, 0.0f, 0.709f, -0.072f, 1.039f, -0.175f)
                curveToRelative(-0.666f, 1.286f, -1.994f, 2.175f, -3.539f, 2.175f)
                verticalLineToRelative(2.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(17.0f, 3.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(21.0f, 13.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.621f)
                lineToRelative(-1.284f, 1.318f)
                lineToRelative(-1.433f, -1.395f)
                lineToRelative(3.215f, -3.303f)
                horizontalLineToRelative(1.501f)
                close()
                moveTo(10.5f, 17.5f)
                lineToRelative(1.414f, 1.414f)
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
                close()
            }
        }
        .build()
        return _sortNumericDownAlt!!
    }

private var _sortNumericDownAlt: ImageVector? = null
