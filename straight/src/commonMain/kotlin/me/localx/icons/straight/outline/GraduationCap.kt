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

public val Icons.Outline.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.12f, 1.627f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -4.24f, 0.0f)
                lineToRelative(-9.88f, 6.373f)
                lineToRelative(4.0f, 2.58f)
                verticalLineToRelative(9.834f)
                lineToRelative(0.293f, 0.293f)
                curveToRelative(0.094f, 0.093f, 2.354f, 2.293f, 7.707f, 2.293f)
                reflectiveCurveToRelative(7.613f, -2.2f, 7.707f, -2.293f)
                lineToRelative(0.293f, -0.293f)
                verticalLineToRelative(-9.834f)
                lineToRelative(2.0f, -1.29f)
                verticalLineToRelative(10.71f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-12.0f)
                close()
                moveTo(18.0f, 19.516f)
                arcToRelative(10.557f, 10.557f, 0.0f, false, true, -6.0f, 1.484f)
                arcToRelative(10.558f, 10.558f, 0.0f, false, true, -6.0f, -1.483f)
                verticalLineToRelative(-7.647f)
                lineToRelative(3.88f, 2.5f)
                arcToRelative(3.892f, 3.892f, 0.0f, false, false, 4.24f, 0.0f)
                lineToRelative(3.88f, -2.5f)
                close()
                moveTo(13.036f, 12.692f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.072f, 0.0f)
                lineToRelative(-7.274f, -4.692f)
                lineToRelative(7.274f, -4.692f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.072f, 0.0f)
                lineToRelative(7.274f, 4.692f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
