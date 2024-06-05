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

public val Icons.Outline.PersonDress: ImageVector
    get() {
        if (_personDress != null) {
            return _personDress!!
        }
        _personDress = Builder(name = "PersonDress", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(19.261f, 14.674f)
                lineToRelative(-3.238f, -3.548f)
                lineToRelative(1.109f, 8.874f)
                horizontalLineToRelative(-2.133f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.133f)
                lineToRelative(1.109f, -8.874f)
                lineToRelative(-3.238f, 3.548f)
                lineToRelative(-1.478f, -1.349f)
                reflectiveCurveToRelative(5.807f, -6.366f, 5.85f, -6.41f)
                lineToRelative(0.023f, -0.025f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.547f, -0.552f, 1.304f, -0.891f, 2.131f, -0.891f)
                horizontalLineToRelative(1.469f)
                curveToRelative(0.827f, 0.0f, 1.584f, 0.339f, 2.131f, 0.892f)
                horizontalLineToRelative(0.001f)
                reflectiveCurveToRelative(0.023f, 0.024f, 0.023f, 0.024f)
                curveToRelative(0.043f, 0.044f, 5.85f, 6.41f, 5.85f, 6.41f)
                lineToRelative(-1.478f, 1.349f)
                close()
                moveTo(12.734f, 8.0f)
                horizontalLineToRelative(-1.469f)
                curveToRelative(-0.473f, 0.0f, -0.9f, 0.288f, -0.992f, 0.876f)
                lineToRelative(-1.141f, 9.124f)
                horizontalLineToRelative(5.734f)
                lineToRelative(-1.141f, -9.124f)
                curveToRelative(-0.074f, -0.581f, -0.487f, -0.876f, -0.992f, -0.876f)
                close()
            }
        }
        .build()
        return _personDress!!
    }

private var _personDress: ImageVector? = null
