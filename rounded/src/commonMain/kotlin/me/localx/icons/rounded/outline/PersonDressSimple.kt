package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveTo(16.249f, 18.985f)
                curveToRelative(-0.34f, 0.385f, -0.775f, 0.658f, -1.249f, 0.826f)
                verticalLineToRelative(3.188f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.188f)
                curveToRelative(-0.474f, -0.169f, -0.909f, -0.441f, -1.249f, -0.826f)
                curveToRelative(-0.569f, -0.645f, -0.834f, -1.504f, -0.728f, -2.357f)
                lineToRelative(0.876f, -7.008f)
                curveToRelative(0.257f, -2.063f, 2.02f, -3.62f, 4.101f, -3.62f)
                reflectiveCurveToRelative(3.844f, 1.557f, 4.101f, 3.621f)
                lineToRelative(0.876f, 7.007f)
                curveToRelative(0.106f, 0.854f, -0.158f, 1.712f, -0.728f, 2.357f)
                close()
                moveTo(9.008f, 16.876f)
                curveToRelative(-0.036f, 0.289f, 0.05f, 0.568f, 0.242f, 0.786f)
                curveToRelative(0.192f, 0.218f, 0.459f, 0.338f, 0.75f, 0.338f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.291f, 0.0f, 0.558f, -0.12f, 0.75f, -0.338f)
                curveToRelative(0.192f, -0.218f, 0.278f, -0.497f, 0.242f, -0.786f)
                lineToRelative(-0.876f, -7.008f)
                curveToRelative(-0.133f, -1.065f, -1.043f, -1.868f, -2.116f, -1.868f)
                reflectiveCurveToRelative(-1.983f, 0.803f, -2.116f, 1.868f)
                lineToRelative(-0.876f, 7.008f)
                close()
            }
        }
        .build()
        return _personDressSimple!!
    }

private var _personDressSimple: ImageVector? = null
