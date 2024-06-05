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

public val Icons.Filled.Pompebled: ImageVector
    get() {
        if (_pompebled != null) {
            return _pompebled!!
        }
        _pompebled = Builder(name = "Pompebled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.55f, 11.454f)
                curveToRelative(0.874f, 0.874f, 2.08f, 0.598f, 3.145f, -0.029f)
                curveToRelative(1.222f, -0.718f, 2.905f, -1.65f, 3.942f, -1.604f)
                curveToRelative(1.056f, 0.046f, 2.034f, 0.513f, 2.971f, 1.45f)
                curveToRelative(1.856f, 1.857f, 1.856f, 4.867f, 0.0f, 6.724f)
                lineToRelative(-1.454f, 1.454f)
                curveToRelative(-4.587f, 4.587f, -13.939f, 6.513f, -18.525f, 1.926f)
                curveTo(-1.959f, 16.788f, -0.043f, 7.434f, 4.544f, 2.847f)
                lineToRelative(1.454f, -1.454f)
                curveToRelative(1.857f, -1.857f, 4.867f, -1.857f, 6.723f, 0.0f)
                curveToRelative(0.937f, 0.937f, 1.403f, 1.915f, 1.449f, 2.972f)
                curveToRelative(0.045f, 1.037f, -0.886f, 2.721f, -1.604f, 3.943f)
                curveToRelative(-0.626f, 1.065f, -0.89f, 2.274f, -0.017f, 3.147f)
                close()
            }
        }
        .build()
        return _pompebled!!
    }

private var _pompebled: ImageVector? = null
