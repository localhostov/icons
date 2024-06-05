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

public val Icons.Bold.MosqueMoon: ImageVector
    get() {
        if (_mosqueMoon != null) {
            return _mosqueMoon!!
        }
        _mosqueMoon = Builder(name = "MosqueMoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 17.5f)
                curveToRelative(0.0f, -4.388f, -3.83f, -6.322f, -6.364f, -7.601f)
                curveToRelative(-0.787f, -0.398f, -1.978f, -0.999f, -2.175f, -1.32f)
                curveToRelative(0.0f, 0.0f, -0.295f, -0.389f, -0.411f, -1.612f)
                curveToRelative(1.353f, -0.159f, 2.475f, -1.06f, 2.951f, -2.29f)
                curveToRelative(-0.405f, 0.157f, -0.842f, 0.251f, -1.303f, 0.251f)
                curveToRelative(-2.002f, 0.0f, -3.626f, -1.623f, -3.626f, -3.626f)
                curveToRelative(0.0f, -0.461f, 0.095f, -0.897f, 0.251f, -1.303f)
                curveToRelative(-1.357f, 0.524f, -2.323f, 1.833f, -2.323f, 3.374f)
                curveToRelative(0.0f, 1.407f, 0.81f, 2.613f, 1.982f, 3.214f)
                curveToRelative(-0.084f, 1.534f, -0.443f, 1.99f, -0.443f, 1.99f)
                curveToRelative(-0.197f, 0.321f, -1.388f, 0.922f, -2.175f, 1.32f)
                curveToRelative(-2.534f, 1.279f, -6.364f, 3.213f, -6.364f, 7.601f)
                curveToRelative(0.0f, 1.168f, 0.428f, 2.378f, 1.181f, 3.5f)
                horizontalLineToRelative(-1.181f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.181f)
                curveToRelative(0.754f, -1.122f, 1.181f, -2.332f, 1.181f, -3.5f)
                close()
                moveTo(16.682f, 21.0f)
                lineTo(7.318f, 21.0f)
                curveToRelative(-1.397f, -1.023f, -2.318f, -2.39f, -2.318f, -3.5f)
                curveToRelative(0.0f, -2.36f, 1.955f, -3.529f, 4.716f, -4.923f)
                curveToRelative(0.825f, -0.416f, 1.63f, -0.823f, 2.284f, -1.299f)
                curveToRelative(0.654f, 0.476f, 1.459f, 0.883f, 2.284f, 1.299f)
                curveToRelative(2.761f, 1.395f, 4.716f, 2.563f, 4.716f, 4.923f)
                curveToRelative(0.0f, 1.11f, -0.921f, 2.477f, -2.318f, 3.5f)
                close()
            }
        }
        .build()
        return _mosqueMoon!!
    }

private var _mosqueMoon: ImageVector? = null
