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

public val Icons.Outline.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 9.04f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.04f)
                curveToRelative(-1.497f, 1.311f, -7.0f, 6.427f, -7.0f, 10.817f)
                curveToRelative(0.0f, 3.035f, 2.927f, 4.102f, 3.044f, 4.143f)
                horizontalLineToRelative(17.912f)
                curveToRelative(0.117f, -0.042f, 3.044f, -1.108f, 3.044f, -4.143f)
                curveToRelative(0.0f, -4.39f, -5.503f, -9.506f, -7.0f, -10.817f)
                close()
                moveTo(20.585f, 22.0f)
                lineTo(3.415f, 22.0f)
                curveToRelative(-0.396f, -0.186f, -1.415f, -0.796f, -1.415f, -2.143f)
                curveToRelative(0.0f, -0.9f, 0.347f, -1.899f, 0.89f, -2.908f)
                horizontalLineToRelative(15.768f)
                curveToRelative(-0.434f, -0.656f, -0.958f, -1.337f, -1.524f, -2.0f)
                lineTo(4.188f, 14.949f)
                curveToRelative(1.513f, -2.019f, 3.43f, -3.833f, 4.45f, -4.679f)
                lineToRelative(0.362f, -0.3f)
                lineTo(9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(7.97f)
                lineToRelative(0.362f, 0.3f)
                curveToRelative(1.846f, 1.529f, 6.638f, 6.232f, 6.638f, 9.587f)
                curveToRelative(0.0f, 1.347f, -1.019f, 1.957f, -1.415f, 2.143f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
