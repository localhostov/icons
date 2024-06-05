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
                moveToRelative(17.994f, 2.286f)
                curveTo(16.086f, 0.581f, 13.524f, -0.229f, 10.956f, 0.059f)
                curveTo(6.904f, 0.517f, 3.59f, 3.782f, 3.075f, 7.822f)
                curveToRelative(-0.374f, 2.931f, 0.644f, 5.76f, 2.793f, 7.761f)
                curveToRelative(0.769f, 0.715f, 1.336f, 1.54f, 1.695f, 2.417f)
                horizontalLineToRelative(8.856f)
                curveToRelative(0.328f, -0.873f, 0.838f, -1.645f, 1.513f, -2.237f)
                curveToRelative(1.95f, -1.708f, 3.068f, -4.173f, 3.068f, -6.763f)
                curveToRelative(0.0f, -2.56f, -1.096f, -5.007f, -3.006f, -6.714f)
                close()
                moveTo(16.0f, 8.371f)
                curveToRelative(-0.598f, -0.137f, -1.368f, -0.271f, -1.6f, -0.271f)
                curveToRelative(-0.773f, 0.0f, -1.4f, 0.627f, -1.4f, 1.4f)
                curveToRelative(0.0f, 0.773f, 0.627f, 1.4f, 1.4f, 1.4f)
                curveToRelative(0.232f, 0.0f, 1.002f, -0.134f, 1.6f, -0.271f)
                verticalLineToRelative(2.371f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.151f)
                curveToRelative(-0.401f, 0.095f, -0.767f, 0.151f, -1.0f, 0.151f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.233f, 0.0f, 0.599f, 0.056f, 1.0f, 0.151f)
                verticalLineToRelative(-2.151f)
                horizontalLineToRelative(2.171f)
                curveToRelative(-0.091f, -0.391f, -0.145f, -0.746f, -0.145f, -0.974f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.228f, -0.054f, 0.583f, -0.146f, 0.974f)
                horizontalLineToRelative(2.12f)
                verticalLineToRelative(2.371f)
                close()
                moveTo(7.992f, 20.0f)
                horizontalLineToRelative(8.024f)
                curveToRelative(-0.005f, 0.105f, -0.015f, 0.209f, -0.015f, 0.315f)
                verticalLineToRelative(3.685f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-3.851f)
                curveToRelative(0.0f, -0.05f, -0.007f, -0.099f, -0.008f, -0.149f)
                close()
            }
        }
        .build()
        return _insight!!
    }

private var _insight: ImageVector? = null
