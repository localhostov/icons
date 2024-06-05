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

public val Icons.Outline.CupStraw: ImageVector
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
                lineTo(20.0f, 0.0f)
                horizontalLineToRelative(-6.883f)
                lineToRelative(-0.627f, 5.0f)
                lineTo(1.0f, 5.0f)
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
                moveTo(17.708f, 21.118f)
                curveToRelative(-0.059f, 0.503f, -0.486f, 0.882f, -0.993f, 0.882f)
                lineTo(7.285f, 22.0f)
                curveToRelative(-0.507f, 0.0f, -0.935f, -0.379f, -0.993f, -0.883f)
                lineToRelative(-1.667f, -14.117f)
                horizontalLineToRelative(14.75f)
                lineToRelative(-1.667f, 14.118f)
                close()
            }
        }
        .build()
        return _cupStraw!!
    }

private var _cupStraw: ImageVector? = null
