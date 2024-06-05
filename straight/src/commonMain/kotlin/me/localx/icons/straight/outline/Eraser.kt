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

public val Icons.Outline.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.353f, 21.0f)
                lineToRelative(8.716f, -8.746f)
                curveToRelative(1.206f, -1.21f, 1.206f, -3.179f, 0.0f, -4.389f)
                lineToRelative(-5.935f, -5.955f)
                curveToRelative(-1.17f, -1.175f, -3.213f, -1.175f, -4.383f, 0.0f)
                lineTo(0.882f, 13.82f)
                curveToRelative(-1.206f, 1.21f, -1.206f, 3.179f, 0.0f, 4.389f)
                lineToRelative(4.774f, 4.791f)
                horizontalLineToRelative(18.344f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-9.647f)
                close()
                moveTo(14.167f, 3.323f)
                curveToRelative(0.416f, -0.416f, 1.135f, -0.416f, 1.551f, 0.0f)
                lineToRelative(5.935f, 5.955f)
                curveToRelative(0.43f, 0.431f, 0.43f, 1.134f, 0.0f, 1.565f)
                lineToRelative(-5.504f, 5.523f)
                lineToRelative(-7.49f, -7.515f)
                lineToRelative(5.509f, -5.527f)
                close()
                moveTo(6.486f, 21.0f)
                lineToRelative(-4.188f, -4.203f)
                curveToRelative(-0.43f, -0.431f, -0.43f, -1.134f, 0.0f, -1.565f)
                lineToRelative(4.949f, -4.966f)
                lineToRelative(7.49f, 7.515f)
                lineToRelative(-3.207f, 3.218f)
                horizontalLineToRelative(-5.043f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
