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

public val Icons.Outline.PersonDressSimple: ImageVector
    get() {
        if (_personDressSimple != null) {
            return _personDressSimple!!
        }
        _personDressSimple = Builder(name = "PersonDressSimple", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(15.0f, 20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.133f)
                lineToRelative(1.422f, -11.372f)
                curveToRelative(0.187f, -1.498f, 1.467f, -2.628f, 2.977f, -2.628f)
                horizontalLineToRelative(1.469f)
                curveToRelative(1.51f, 0.0f, 2.79f, 1.13f, 2.977f, 2.628f)
                lineToRelative(1.422f, 11.372f)
                horizontalLineToRelative(-2.133f)
                close()
                moveTo(9.133f, 18.0f)
                horizontalLineToRelative(5.734f)
                lineToRelative(-1.141f, -9.124f)
                curveToRelative(-0.062f, -0.5f, -0.489f, -0.876f, -0.992f, -0.876f)
                horizontalLineToRelative(-1.469f)
                curveToRelative(-0.503f, 0.0f, -0.93f, 0.376f, -0.992f, 0.876f)
                lineToRelative(-1.141f, 9.124f)
                close()
            }
        }
        .build()
        return _personDressSimple!!
    }

private var _personDressSimple: ImageVector? = null
