package me.localx.icons.rounded.outline

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

public val Icons.Outline.CitrusSlice: ImageVector
    get() {
        if (_citrusSlice != null) {
            return _citrusSlice!!
        }
        _citrusSlice = Builder(name = "CitrusSlice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.932f, 1.788f)
                curveToRelative(-0.584f, -0.977f, -1.571f, -1.619f, -2.71f, -1.759f)
                curveToRelative(-1.157f, -0.141f, -2.288f, 0.246f, -3.108f, 1.066f)
                lineTo(1.095f, 16.113f)
                curveToRelative(-0.821f, 0.822f, -1.21f, 1.956f, -1.066f, 3.111f)
                curveToRelative(0.142f, 1.138f, 0.783f, 2.125f, 1.76f, 2.708f)
                curveToRelative(2.339f, 1.396f, 4.937f, 2.077f, 7.518f, 2.077f)
                curveToRelative(3.796f, 0.0f, 7.555f, -1.474f, 10.391f, -4.311f)
                curveToRelative(4.765f, -4.766f, 5.685f, -12.13f, 2.234f, -17.91f)
                close()
                moveTo(18.961f, 17.547f)
                lineToRelative(-7.547f, -7.547f)
                horizontalLineToRelative(10.57f)
                curveToRelative(-0.149f, 2.723f, -1.174f, 5.384f, -3.023f, 7.547f)
                close()
                moveTo(10.0f, 11.414f)
                lineToRelative(7.547f, 7.547f)
                curveToRelative(-2.163f, 1.849f, -4.824f, 2.873f, -7.547f, 3.023f)
                verticalLineToRelative(-10.57f)
                close()
                moveTo(17.527f, 2.509f)
                curveToRelative(0.33f, -0.33f, 0.769f, -0.509f, 1.229f, -0.509f)
                curveToRelative(0.774f, 0.0f, 1.193f, 0.37f, 1.459f, 0.814f)
                curveToRelative(0.97f, 1.625f, 1.533f, 3.395f, 1.719f, 5.186f)
                horizontalLineToRelative(-9.897f)
                lineToRelative(5.491f, -5.491f)
                close()
                moveTo(2.014f, 18.977f)
                curveToRelative(-0.067f, -0.54f, 0.114f, -1.068f, 0.496f, -1.45f)
                lineToRelative(5.491f, -5.491f)
                verticalLineToRelative(9.897f)
                curveToRelative(-1.791f, -0.186f, -3.561f, -0.749f, -5.186f, -1.72f)
                curveToRelative(-0.444f, -0.265f, -0.736f, -0.716f, -0.8f, -1.237f)
                close()
            }
        }
        .build()
        return _citrusSlice!!
    }

private var _citrusSlice: ImageVector? = null
