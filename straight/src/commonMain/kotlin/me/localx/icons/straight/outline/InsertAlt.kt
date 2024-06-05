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

public val Icons.Outline.InsertAlt: ImageVector
    get() {
        if (_insertAlt != null) {
            return _insertAlt!!
        }
        _insertAlt = Builder(name = "InsertAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-15.036f)
                lineToRelative(3.243f, 3.243f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-4.243f, -4.243f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.048f, 0.0f, -2.828f)
                lineToRelative(4.243f, -4.243f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.243f, 3.243f)
                horizontalLineToRelative(15.036f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                curveToRelative(4.469f, 0.0f, 8.262f, 2.947f, 9.539f, 7.0f)
                horizontalLineToRelative(2.066f)
                curveTo(22.268f, 3.833f, 17.579f, 0.0f, 12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(5.579f, 0.0f, 10.268f, -3.833f, 11.605f, -9.0f)
                horizontalLineToRelative(-2.066f)
                curveToRelative(-1.277f, 4.053f, -5.07f, 7.0f, -9.539f, 7.0f)
                close()
            }
        }
        .build()
        return _insertAlt!!
    }

private var _insertAlt: ImageVector? = null
