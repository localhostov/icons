package me.localx.icons.straight.bold

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

public val Icons.Bold.CupStrawSwoosh: ImageVector
    get() {
        if (_cupStrawSwoosh != null) {
            return _cupStrawSwoosh!!
        }
        _cupStrawSwoosh = Builder(name = "CupStrawSwoosh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.999f, 5.0f)
                horizontalLineToRelative(-7.947f)
                lineToRelative(0.267f, -2.0f)
                horizontalLineToRelative(4.68f)
                lineTo(19.999f, 0.0f)
                horizontalLineToRelative(-7.32f)
                lineToRelative(-0.656f, 5.0f)
                lineTo(0.999f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.167f)
                lineToRelative(1.524f, 12.91f)
                curveToRelative(0.208f, 1.761f, 1.702f, 3.09f, 3.476f, 3.09f)
                horizontalLineToRelative(9.667f)
                curveToRelative(1.773f, 0.0f, 3.268f, -1.328f, 3.476f, -3.09f)
                lineToRelative(1.524f, -12.91f)
                horizontalLineToRelative(1.167f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(16.832f, 21.0f)
                lineTo(7.166f, 21.0f)
                curveToRelative(-0.253f, 0.0f, -0.467f, -0.189f, -0.497f, -0.441f)
                lineToRelative(-0.519f, -4.395f)
                curveToRelative(0.836f, -0.543f, 2.022f, -1.164f, 2.849f, -1.164f)
                curveToRelative(0.646f, 0.0f, 1.463f, 0.409f, 2.329f, 0.842f)
                curveToRelative(1.086f, 0.543f, 2.317f, 1.158f, 3.671f, 1.158f)
                curveToRelative(0.964f, 0.0f, 1.959f, -0.325f, 2.835f, -0.731f)
                lineToRelative(-0.506f, 4.289f)
                curveToRelative(-0.03f, 0.252f, -0.243f, 0.442f, -0.497f, 0.442f)
                close()
                moveTo(18.274f, 12.546f)
                curveToRelative(-0.806f, 0.581f, -2.293f, 1.454f, -3.275f, 1.454f)
                curveToRelative(-0.646f, 0.0f, -1.463f, -0.409f, -2.329f, -0.842f)
                curveToRelative(-1.086f, -0.543f, -2.317f, -1.158f, -3.671f, -1.158f)
                curveToRelative(-1.115f, 0.0f, -2.267f, 0.435f, -3.232f, 0.928f)
                lineToRelative(-0.582f, -4.928f)
                horizontalLineToRelative(13.625f)
                lineToRelative(-0.537f, 4.546f)
                close()
            }
        }
        .build()
        return _cupStrawSwoosh!!
    }

private var _cupStrawSwoosh: ImageVector? = null
