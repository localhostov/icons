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

public val Icons.Filled.Scalpel: ImageVector
    get() {
        if (_scalpel != null) {
            return _scalpel!!
        }
        _scalpel = Builder(name = "Scalpel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.19f, 5.719f)
                lineToRelative(-9.027f, 9.027f)
                lineToRelative(-4.044f, -3.774f)
                lineTo(19.281f, 1.81f)
                curveToRelative(1.078f, -1.078f, 2.831f, -1.078f, 3.909f, 0.0f)
                reflectiveCurveToRelative(1.078f, 2.831f, 0.0f, 3.909f)
                close()
                moveTo(0.0f, 21.091f)
                verticalLineToRelative(1.909f)
                reflectiveCurveToRelative(2.809f, 0.009f, 3.04f, 0.0f)
                curveToRelative(3.602f, -0.143f, 6.997f, -1.633f, 9.559f, -4.194f)
                lineToRelative(0.192f, -0.192f)
                lineToRelative(0.224f, -2.113f)
                lineToRelative(-4.365f, -4.058f)
                lineTo(0.0f, 21.091f)
                close()
            }
        }
        .build()
        return _scalpel!!
    }

private var _scalpel: ImageVector? = null
