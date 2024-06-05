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

public val Icons.Filled.Massage: ImageVector
    get() {
        if (_massage != null) {
            return _massage!!
        }
        _massage = Builder(name = "Massage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 22.0f)
                curveToRelative(0.0f, -6.075f, 4.925f, -11.0f, 11.0f, -11.0f)
                curveToRelative(0.0f, 6.075f, -4.925f, 11.0f, -11.0f, 11.0f)
                moveToRelative(-2.0f, 0.0f)
                curveToRelative(0.0f, -6.075f, -4.925f, -11.0f, -11.0f, -11.0f)
                curveToRelative(0.0f, 6.075f, 4.925f, 11.0f, 11.0f, 11.0f)
                moveToRelative(1.0f, -5.0f)
                curveToRelative(1.026f, -2.452f, 2.782f, -4.526f, 4.995f, -5.947f)
                curveToRelative(-0.208f, -3.283f, -1.724f, -6.53f, -4.288f, -9.093f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-0.707f, 0.707f)
                curveToRelative(-2.563f, 2.563f, -4.08f, 5.81f, -4.288f, 9.093f)
                curveToRelative(2.213f, 1.421f, 3.969f, 3.495f, 4.995f, 5.947f)
                close()
            }
        }
        .build()
        return _massage!!
    }

private var _massage: ImageVector? = null
