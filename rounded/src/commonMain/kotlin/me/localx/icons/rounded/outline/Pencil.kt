package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.8532f, 1.148f)
                    curveTo(22.1733f, 0.4692f, 21.2519f, 0.088f, 20.2912f, 0.088f)
                    curveTo(19.3304f, 0.088f, 18.409f, 0.4692f, 17.7292f, 1.148f)
                    lineTo(1.4651f, 17.412f)
                    curveTo(0.9994f, 17.8751f, 0.6301f, 18.426f, 0.3787f, 19.0328f)
                    curveTo(0.1272f, 19.6396f, -0.0015f, 20.2902f, 2.0E-4f, 20.947f)
                    verticalLineTo(23.0f)
                    curveTo(2.0E-4f, 23.2652f, 0.1055f, 23.5196f, 0.293f, 23.7071f)
                    curveTo(0.4806f, 23.8947f, 0.7349f, 24.0f, 1.0001f, 24.0f)
                    horizontalLineTo(3.0531f)
                    curveTo(3.7099f, 24.0019f, 4.3605f, 23.8734f, 4.9673f, 23.6221f)
                    curveTo(5.5741f, 23.3708f, 6.125f, 23.0017f, 6.5882f, 22.536f)
                    lineTo(22.8532f, 6.271f)
                    curveTo(23.5317f, 5.5912f, 23.9127f, 4.67f, 23.9127f, 3.7095f)
                    curveTo(23.9127f, 2.749f, 23.5317f, 1.8278f, 22.8532f, 1.148f)
                    close()
                    moveTo(5.1741f, 21.122f)
                    curveTo(4.6102f, 21.6823f, 3.8481f, 21.9977f, 3.0531f, 22.0f)
                    horizontalLineTo(2.0001f)
                    verticalLineTo(20.947f)
                    curveTo(1.9991f, 20.5529f, 2.0763f, 20.1625f, 2.2272f, 19.7985f)
                    curveTo(2.3781f, 19.4344f, 2.5997f, 19.1039f, 2.8791f, 18.826f)
                    lineTo(15.2222f, 6.483f)
                    lineTo(17.5222f, 8.783f)
                    lineTo(5.1741f, 21.122f)
                    close()
                    moveTo(21.4382f, 4.857f)
                    lineTo(18.9322f, 7.364f)
                    lineTo(16.6322f, 5.069f)
                    lineTo(19.1392f, 2.562f)
                    curveTo(19.2902f, 2.4113f, 19.4694f, 2.2919f, 19.6666f, 2.2104f)
                    curveTo(19.8638f, 2.129f, 20.0751f, 2.0872f, 20.2884f, 2.0874f)
                    curveTo(20.5018f, 2.0877f, 20.713f, 2.1299f, 20.91f, 2.2118f)
                    curveTo(21.107f, 2.2936f, 21.286f, 2.4135f, 21.4367f, 2.5645f)
                    curveTo(21.5873f, 2.7155f, 21.7068f, 2.8948f, 21.7882f, 3.0919f)
                    curveTo(21.8697f, 3.2891f, 21.9115f, 3.5004f, 21.9112f, 3.7138f)
                    curveTo(21.911f, 3.9271f, 21.8687f, 4.1383f, 21.7869f, 4.3354f)
                    curveTo(21.705f, 4.5324f, 21.5852f, 4.7113f, 21.4342f, 4.862f)
                    lineTo(21.4382f, 4.857f)
                    close()
                }
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
