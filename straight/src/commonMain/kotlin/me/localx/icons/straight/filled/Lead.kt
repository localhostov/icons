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

public val Icons.Filled.Lead: ImageVector
    get() {
        if (_lead != null) {
            return _lead!!
        }
        _lead = Builder(name = "Lead", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(4.691f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(21.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.91f)
                curveToRelative(-0.423f, -2.507f, -2.403f, -4.486f, -4.91f, -4.91f)
                verticalLineToRelative(2.91f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.91f)
                curveToRelative(-2.507f, 0.423f, -4.486f, 2.403f, -4.91f, 4.91f)
                horizontalLineToRelative(2.91f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.91f)
                curveToRelative(0.423f, 2.507f, 2.403f, 4.486f, 4.91f, 4.91f)
                verticalLineToRelative(-2.91f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.91f)
                curveToRelative(2.507f, -0.423f, 4.486f, -2.403f, 4.91f, -4.91f)
                horizontalLineToRelative(-2.91f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, -1.459f, 0.397f, -2.822f, 1.079f, -4.0f)
                horizontalLineToRelative(-6.079f)
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.239f, -5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(12.721f)
                curveToRelative(-1.665f, -1.466f, -2.721f, -3.607f, -2.721f, -6.0f)
                close()
            }
        }
        .build()
        return _lead!!
    }

private var _lead: ImageVector? = null
