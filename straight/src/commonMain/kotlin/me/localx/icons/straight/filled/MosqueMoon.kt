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

public val Icons.Filled.MosqueMoon: ImageVector
    get() {
        if (_mosqueMoon != null) {
            return _mosqueMoon!!
        }
        _mosqueMoon = Builder(name = "MosqueMoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 17.61f)
                curveToRelative(0.0f, -4.285f, -3.708f, -6.157f, -6.415f, -7.523f)
                curveToRelative(-0.731f, -0.369f, -1.718f, -0.87f, -2.234f, -1.287f)
                curveToRelative(-0.033f, -0.081f, -0.232f, -0.635f, -0.314f, -1.832f)
                curveToRelative(1.359f, -0.155f, 2.486f, -1.057f, 2.963f, -2.291f)
                curveToRelative(-0.405f, 0.157f, -0.842f, 0.251f, -1.303f, 0.251f)
                curveToRelative(-2.002f, 0.0f, -3.626f, -1.623f, -3.626f, -3.626f)
                curveToRelative(0.0f, -0.461f, 0.095f, -0.897f, 0.251f, -1.303f)
                curveToRelative(-1.357f, 0.524f, -2.323f, 1.833f, -2.323f, 3.374f)
                curveToRelative(0.0f, 1.409f, 0.813f, 2.617f, 1.987f, 3.217f)
                curveToRelative(-0.058f, 1.57f, -0.308f, 2.172f, -0.308f, 2.172f)
                lineToRelative(0.008f, 0.007f)
                curveToRelative(-0.505f, 0.422f, -1.524f, 0.939f, -2.272f, 1.316f)
                curveToRelative(-2.707f, 1.367f, -6.415f, 3.239f, -6.415f, 7.523f)
                curveToRelative(0.0f, 1.48f, 0.721f, 3.036f, 1.949f, 4.39f)
                horizontalLineToRelative(-1.949f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.949f)
                curveToRelative(1.228f, -1.354f, 1.949f, -2.91f, 1.949f, -4.39f)
                close()
            }
        }
        .build()
        return _mosqueMoon!!
    }

private var _mosqueMoon: ImageVector? = null
