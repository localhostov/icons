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

public val Icons.Filled.CupStraw: ImageVector
    get() {
        if (_cupStraw != null) {
            return _cupStraw!!
        }
        _cupStraw = Builder(name = "CupStraw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 5.0f)
                horizontalLineToRelative(-8.493f)
                lineToRelative(0.376f, -3.0f)
                horizontalLineToRelative(5.117f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-6.883f)
                lineToRelative(-0.627f, 5.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.611f)
                lineToRelative(1.695f, 14.351f)
                curveToRelative(0.177f, 1.51f, 1.458f, 2.649f, 2.979f, 2.649f)
                horizontalLineToRelative(9.43f)
                curveToRelative(1.521f, 0.0f, 2.803f, -1.139f, 2.979f, -2.648f)
                lineToRelative(1.695f, -14.352f)
                horizontalLineToRelative(1.611f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _cupStraw!!
    }

private var _cupStraw: ImageVector? = null
