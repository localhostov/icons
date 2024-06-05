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

public val Icons.Filled.Golf: ImageVector
    get() {
        if (_golf != null) {
            return _golf!!
        }
        _golf = Builder(name = "Golf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 10.0f)
                curveToRelative(-0.685f, 0.0f, -1.349f, 0.04f, -2.0f, 0.1f)
                verticalLineToRelative(6.9f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.947f)
                lineToRelative(6.915f, -3.494f)
                lineToRelative(-6.015f, -4.347f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.9f, 1.788f)
                verticalLineToRelative(8.922f)
                curveToRelative(-3.608f, 1.193f, -6.0f, 3.439f, -6.0f, 6.078f)
                curveToRelative(0.0f, 3.925f, 5.271f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(12.0f, -3.075f, 12.0f, -7.0f)
                reflectiveCurveToRelative(-5.271f, -7.0f, -12.0f, -7.0f)
                close()
                moveTo(15.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
