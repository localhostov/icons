package me.localx.icons.rounded.filled

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

public val Icons.Filled._5: ImageVector
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
                horizontalLineTo(5.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.5f, 0.0f, 2.902f, -0.593f, 3.947f, -1.67f)
                reflectiveCurveToRelative(1.596f, -2.497f, 1.55f, -4.0f)
                curveToRelative(-0.088f, -2.939f, -2.676f, -5.33f, -5.77f, -5.33f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 1.794f, 5.794f, 0.0f, 8.0f, 0.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(8.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
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
