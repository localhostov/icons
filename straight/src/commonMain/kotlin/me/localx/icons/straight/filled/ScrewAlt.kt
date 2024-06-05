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

public val Icons.Filled.ScrewAlt: ImageVector
    get() {
        if (_screwAlt != null) {
            return _screwAlt!!
        }
        _screwAlt = Builder(name = "ScrewAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 13.67f)
                lineToRelative(6.0f, -5.512f)
                verticalLineToRelative(2.4f)
                lineToRelative(-6.0f, 5.512f)
                verticalLineToRelative(-2.4f)
                close()
                moveTo(3.0f, 20.972f)
                lineToRelative(0.086f, 0.086f)
                lineToRelative(5.914f, -5.433f)
                verticalLineToRelative(-2.351f)
                lineToRelative(-6.0f, 5.512f)
                verticalLineToRelative(2.186f)
                close()
                moveTo(6.216f, 8.0f)
                horizontalLineToRelative(-3.216f)
                verticalLineToRelative(2.954f)
                lineToRelative(3.216f, -2.954f)
                close()
                moveTo(4.397f, 22.368f)
                lineToRelative(1.603f, 1.603f)
                lineToRelative(3.0f, -3.0f)
                verticalLineToRelative(-2.832f)
                lineToRelative(-4.603f, 4.229f)
                close()
                moveTo(12.0f, 3.0f)
                lineTo(12.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(23.766f, 19.0f)
                lineToRelative(-2.887f, 5.0f)
                horizontalLineToRelative(-5.773f)
                lineToRelative(-2.887f, -5.0f)
                lineToRelative(2.887f, -5.0f)
                horizontalLineToRelative(5.773f)
                lineToRelative(2.887f, 5.0f)
                close()
                moveTo(20.0f, 19.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _screwAlt!!
    }

private var _screwAlt: ImageVector? = null
