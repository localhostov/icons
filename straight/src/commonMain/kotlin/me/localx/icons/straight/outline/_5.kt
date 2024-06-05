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

public val Icons.Outline._5: ImageVector
    get() {
        if (__5 != null) {
            return __5!!
        }
        __5 = Builder(name = "_5", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 24.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(12.5f)
                curveToRelative(1.5f, 0.0f, 2.902f, -0.593f, 3.947f, -1.67f)
                reflectiveCurveToRelative(1.596f, -2.497f, 1.55f, -4.0f)
                curveToRelative(-0.088f, -2.939f, -2.676f, -5.33f, -5.77f, -5.33f)
                horizontalLineTo(4.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.228f)
                curveToRelative(4.164f, 0.0f, 7.649f, 3.262f, 7.77f, 7.271f)
                curveToRelative(0.061f, 2.048f, -0.689f, 3.984f, -2.114f, 5.452f)
                curveToRelative(-1.426f, 1.469f, -3.337f, 2.277f, -5.383f, 2.277f)
                close()
            }
        }
        .build()
        return __5!!
    }

private var __5: ImageVector? = null
