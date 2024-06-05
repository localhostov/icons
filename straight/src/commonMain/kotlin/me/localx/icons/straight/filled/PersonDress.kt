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

public val Icons.Filled.PersonDress: ImageVector
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
                moveTo(19.262f, 14.674f)
                lineToRelative(-3.238f, -3.549f)
                lineToRelative(1.11f, 8.874f)
                horizontalLineToRelative(-2.133f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.133f)
                lineToRelative(1.11f, -8.874f)
                lineToRelative(-3.238f, 3.549f)
                lineToRelative(-1.477f, -1.349f)
                lineToRelative(5.88f, -6.427f)
                curveToRelative(0.547f, -0.552f, 1.297f, -0.899f, 2.124f, -0.899f)
                horizontalLineToRelative(1.469f)
                curveToRelative(0.827f, 0.0f, 1.576f, 0.346f, 2.124f, 0.899f)
                lineToRelative(5.88f, 6.427f)
                lineToRelative(-1.477f, 1.349f)
                close()
            }
        }
        .build()
        return _personDress!!
    }

private var _personDress: ImageVector? = null
