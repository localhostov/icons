package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.MenuBurger: ImageVector
    get() {
        if (_menuBurger != null) {
            return _menuBurger!!
        }
        _menuBurger = Builder(name = "MenuBurger", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 490.667f, viewportHeight = 490.667f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(469.333f, 224.0f)
                horizontalLineToRelative(-448.0f)
                curveTo(9.551f, 224.0f, 0.0f, 233.551f, 0.0f, 245.333f)
                curveToRelative(0.0f, 11.782f, 9.551f, 21.333f, 21.333f, 21.333f)
                horizontalLineToRelative(448.0f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                curveTo(490.667f, 233.551f, 481.115f, 224.0f, 469.333f, 224.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.333f, 117.333f)
                horizontalLineToRelative(448.0f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                reflectiveCurveToRelative(-9.551f, -21.333f, -21.333f, -21.333f)
                horizontalLineToRelative(-448.0f)
                curveTo(9.551f, 74.667f, 0.0f, 84.218f, 0.0f, 96.0f)
                reflectiveCurveTo(9.551f, 117.333f, 21.333f, 117.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(469.333f, 373.333f)
                horizontalLineToRelative(-448.0f)
                curveTo(9.551f, 373.333f, 0.0f, 382.885f, 0.0f, 394.667f)
                curveTo(0.0f, 406.449f, 9.551f, 416.0f, 21.333f, 416.0f)
                horizontalLineToRelative(448.0f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                curveTo(490.667f, 382.885f, 481.115f, 373.333f, 469.333f, 373.333f)
                close()
            }
        }
        .build()
        return _menuBurger!!
    }

private var _menuBurger: ImageVector? = null
