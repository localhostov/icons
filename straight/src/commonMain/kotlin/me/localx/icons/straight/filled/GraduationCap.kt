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

public val Icons.Filled.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-10.71f)
                lineToRelative(-7.88f, 5.082f)
                arcToRelative(3.892f, 3.892f, 0.0f, false, true, -4.24f, 0.0f)
                lineToRelative(-9.88f, -6.372f)
                lineToRelative(9.88f, -6.373f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 4.24f, 0.0f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(5.894f, 5.894f, 0.0f, false, true, -3.2f, -0.947f)
                lineToRelative(-4.8f, -3.093f)
                verticalLineToRelative(7.454f)
                lineToRelative(0.293f, 0.293f)
                curveToRelative(0.094f, 0.093f, 2.354f, 2.293f, 7.707f, 2.293f)
                reflectiveCurveToRelative(7.613f, -2.2f, 7.707f, -2.293f)
                lineToRelative(0.293f, -0.293f)
                verticalLineToRelative(-7.454f)
                lineToRelative(-4.8f, 3.093f)
                arcToRelative(5.894f, 5.894f, 0.0f, false, true, -3.2f, 0.947f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
