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

public val Icons.Filled.SirenOn: ImageVector
    get() {
        if (_sirenOn != null) {
            return _sirenOn!!
        }
        _sirenOn = Builder(name = "SirenOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.136f, 6.317f)
                lineTo(0.389f, 3.687f)
                lineToRelative(1.384f, -1.444f)
                lineToRelative(2.747f, 2.631f)
                lineToRelative(-1.384f, 1.444f)
                close()
                moveTo(8.434f, 3.844f)
                lineTo(7.896f, 0.052f)
                lineToRelative(-1.98f, 0.281f)
                lineToRelative(0.538f, 3.792f)
                lineToRelative(1.98f, -0.281f)
                close()
                moveTo(18.084f, 0.333f)
                lineToRelative(-1.98f, -0.281f)
                lineToRelative(-0.538f, 3.792f)
                lineToRelative(1.98f, 0.281f)
                lineToRelative(0.538f, -3.792f)
                close()
                moveTo(23.61f, 3.686f)
                lineToRelative(-1.384f, -1.444f)
                lineToRelative(-2.747f, 2.631f)
                lineToRelative(1.384f, 1.444f)
                lineToRelative(2.747f, -2.631f)
                close()
                moveTo(23.999f, 22.999f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 19.999f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(3.031f, 18.0f)
                lineToRelative(1.149f, -8.506f)
                curveToRelative(0.249f, -1.988f, 1.956f, -3.494f, 3.968f, -3.494f)
                horizontalLineToRelative(7.703f)
                curveToRelative(2.013f, 0.0f, 3.719f, 1.506f, 3.969f, 3.504f)
                lineToRelative(1.148f, 8.496f)
                lineTo(3.031f, 18.0f)
                close()
                moveTo(7.607f, 14.0f)
                horizontalLineToRelative(2.018f)
                lineToRelative(0.27f, -2.0f)
                horizontalLineToRelative(2.104f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.852f)
                lineToRelative(-0.54f, 4.0f)
                close()
            }
        }
        .build()
        return _sirenOn!!
    }

private var _sirenOn: ImageVector? = null
