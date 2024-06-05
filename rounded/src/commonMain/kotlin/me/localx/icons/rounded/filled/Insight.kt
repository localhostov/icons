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

public val Icons.Filled.Insight: ImageVector
    get() {
        if (_insight != null) {
            return _insight!!
        }
        _insight = Builder(name = "Insight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 20.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.933f, 0.0f, -3.5f, -1.567f, -3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(21.0f, 9.0f)
                curveToRelative(0.0f, 2.59f, -1.118f, 5.055f, -3.068f, 6.763f)
                curveToRelative(-0.739f, 0.648f, -1.275f, 1.413f, -1.594f, 2.237f)
                lineTo(7.563f, 18.0f)
                curveToRelative(-0.358f, -0.877f, -0.926f, -1.702f, -1.695f, -2.417f)
                curveToRelative(-2.149f, -2.001f, -3.167f, -4.83f, -2.793f, -7.761f)
                curveTo(3.59f, 3.782f, 6.904f, 0.517f, 10.956f, 0.059f)
                curveToRelative(2.567f, -0.289f, 5.13f, 0.522f, 7.038f, 2.227f)
                curveToRelative(1.91f, 1.707f, 3.006f, 4.154f, 3.006f, 6.714f)
                close()
                moveTo(16.0f, 7.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.62f)
                curveToRelative(0.091f, -0.391f, 0.146f, -0.746f, 0.146f, -0.974f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.228f, 0.054f, 0.583f, 0.145f, 0.974f)
                horizontalLineToRelative(-0.671f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.651f)
                curveToRelative(-0.401f, -0.095f, -0.767f, -0.151f, -1.0f, -0.151f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.233f, 0.0f, 0.599f, -0.056f, 1.0f, -0.151f)
                verticalLineToRelative(0.651f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.871f)
                curveToRelative(-0.598f, 0.137f, -1.368f, 0.271f, -1.6f, 0.271f)
                curveToRelative(-0.773f, 0.0f, -1.4f, -0.627f, -1.4f, -1.4f)
                curveToRelative(0.0f, -0.773f, 0.627f, -1.4f, 1.4f, -1.4f)
                curveToRelative(0.232f, 0.0f, 1.002f, 0.134f, 1.6f, 0.271f)
                verticalLineToRelative(-0.871f)
                close()
            }
        }
        .build()
        return _insight!!
    }

private var _insight: ImageVector? = null
