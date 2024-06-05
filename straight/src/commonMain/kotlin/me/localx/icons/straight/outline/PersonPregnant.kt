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

public val Icons.Outline.PersonPregnant: ImageVector
    get() {
        if (_personPregnant != null) {
            return _personPregnant!!
        }
        _personPregnant = Builder(name = "PersonPregnant", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(18.0f, 14.5f)
                curveToRelative(0.0f, 1.713f, -0.946f, 4.512f, -1.055f, 4.826f)
                lineToRelative(-0.232f, 0.674f)
                horizontalLineToRelative(-2.713f)
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
                lineToRelative(0.114f, 0.909f)
                curveToRelative(1.923f, 0.896f, 3.175f, 2.817f, 3.175f, 4.963f)
                close()
                moveTo(16.0f, 14.5f)
                curveToRelative(0.0f, -1.5f, -0.968f, -2.828f, -2.408f, -3.305f)
                lineToRelative(-0.6f, -0.198f)
                lineToRelative(-0.266f, -2.121f)
                curveToRelative(-0.062f, -0.5f, -0.489f, -0.876f, -0.992f, -0.876f)
                horizontalLineToRelative(-1.469f)
                curveToRelative(-0.503f, 0.0f, -0.93f, 0.376f, -0.992f, 0.876f)
                lineToRelative(-0.311f, 2.487f)
                lineToRelative(3.485f, 1.742f)
                lineToRelative(-0.895f, 1.789f)
                lineToRelative(-2.853f, -1.427f)
                lineToRelative(-0.567f, 4.532f)
                horizontalLineToRelative(7.139f)
                curveToRelative(0.309f, -1.006f, 0.729f, -2.583f, 0.729f, -3.5f)
                close()
            }
        }
        .build()
        return _personPregnant!!
    }

private var _personPregnant: ImageVector? = null
