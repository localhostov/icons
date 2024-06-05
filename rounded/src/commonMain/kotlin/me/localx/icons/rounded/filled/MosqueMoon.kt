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
                moveToRelative(21.0f, 22.0f)
                horizontalLineToRelative(-0.949f)
                curveToRelative(1.228f, -1.354f, 1.949f, -2.91f, 1.949f, -4.39f)
                curveToRelative(0.0f, -4.285f, -3.708f, -6.157f, -6.415f, -7.523f)
                curveToRelative(-0.731f, -0.369f, -1.718f, -0.87f, -2.234f, -1.287f)
                curveToRelative(-0.032f, -0.081f, -0.229f, -0.628f, -0.312f, -1.807f)
                curveToRelative(1.193f, -0.067f, 2.236f, -0.683f, 2.887f, -1.599f)
                curveToRelative(0.202f, -0.285f, -0.038f, -0.671f, -0.383f, -0.619f)
                curveToRelative(-0.175f, 0.026f, -0.354f, 0.04f, -0.537f, 0.04f)
                curveToRelative(-2.111f, 0.0f, -3.822f, -1.711f, -3.822f, -3.822f)
                curveToRelative(0.0f, -0.183f, 0.014f, -0.362f, 0.04f, -0.537f)
                curveToRelative(0.052f, -0.345f, -0.334f, -0.585f, -0.619f, -0.383f)
                curveToRelative(-1.051f, 0.747f, -1.708f, 2.009f, -1.593f, 3.422f)
                curveToRelative(0.106f, 1.301f, 0.884f, 2.414f, 1.976f, 3.019f)
                curveToRelative(-0.053f, 1.624f, -0.31f, 2.248f, -0.31f, 2.248f)
                lineToRelative(0.008f, 0.007f)
                curveToRelative(-0.505f, 0.422f, -1.524f, 0.939f, -2.272f, 1.316f)
                curveToRelative(-2.707f, 1.367f, -6.415f, 3.239f, -6.415f, 7.523f)
                curveToRelative(0.0f, 1.48f, 0.721f, 3.036f, 1.949f, 4.39f)
                horizontalLineToRelative(-0.949f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _mosqueMoon!!
    }

private var _mosqueMoon: ImageVector? = null
