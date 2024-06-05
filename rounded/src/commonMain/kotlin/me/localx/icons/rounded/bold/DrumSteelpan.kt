package me.localx.icons.rounded.bold

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

public val Icons.Bold.DrumSteelpan: ImageVector
    get() {
        if (_drumSteelpan != null) {
            return _drumSteelpan!!
        }
        _drumSteelpan = Builder(name = "DrumSteelpan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.271f, 0.0f, 0.0f, 3.733f, 0.0f, 8.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 4.767f, 5.271f, 8.5f, 12.0f, 8.5f)
                reflectiveCurveToRelative(12.0f, -3.733f, 12.0f, -8.5f)
                verticalLineToRelative(-7.0f)
                curveTo(24.0f, 3.733f, 18.729f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(10.256f, 10.819f)
                curveToRelative(0.031f, -0.048f, 0.339f, -0.707f, 0.424f, -0.979f)
                curveToRelative(0.395f, 0.105f, 0.831f, 0.16f, 1.32f, 0.16f)
                reflectiveCurveToRelative(0.925f, -0.055f, 1.32f, -0.16f)
                curveToRelative(0.085f, 0.272f, 0.393f, 0.931f, 0.424f, 0.979f)
                curveToRelative(0.786f, 1.205f, 1.954f, 1.89f, 3.133f, 2.273f)
                curveToRelative(-1.416f, 0.572f, -3.096f, 0.908f, -4.877f, 0.908f)
                reflectiveCurveToRelative(-3.462f, -0.336f, -4.877f, -0.908f)
                curveToRelative(1.18f, -0.383f, 2.347f, -1.068f, 3.133f, -2.273f)
                close()
                moveTo(21.0f, 8.5f)
                curveToRelative(0.0f, 0.72f, -0.241f, 1.413f, -0.674f, 2.05f)
                curveToRelative(-1.146f, 0.048f, -3.182f, -0.121f, -4.023f, -1.302f)
                curveToRelative(-0.313f, -0.672f, -0.27f, -1.242f, 0.298f, -2.539f)
                curveToRelative(0.304f, -0.565f, 1.088f, -2.203f, 1.178f, -2.388f)
                curveToRelative(1.957f, 1.018f, 3.222f, 2.527f, 3.222f, 4.179f)
                close()
                moveTo(14.911f, 3.308f)
                curveToRelative(-0.38f, 0.751f, -0.721f, 1.433f, -1.001f, 2.069f)
                curveToRelative(-0.758f, 1.405f, -1.13f, 1.623f, -1.91f, 1.623f)
                reflectiveCurveToRelative(-1.152f, -0.218f, -1.91f, -1.623f)
                curveToRelative(-0.28f, -0.636f, -0.621f, -1.318f, -1.001f, -2.069f)
                curveToRelative(0.918f, -0.199f, 1.898f, -0.308f, 2.911f, -0.308f)
                reflectiveCurveToRelative(1.993f, 0.109f, 2.911f, 0.308f)
                close()
                moveTo(6.222f, 4.322f)
                curveToRelative(0.089f, 0.186f, 0.874f, 1.823f, 1.178f, 2.388f)
                curveToRelative(0.567f, 1.297f, 0.61f, 1.867f, 0.298f, 2.539f)
                curveToRelative(-0.841f, 1.182f, -2.877f, 1.354f, -4.022f, 1.304f)
                curveToRelative(-0.434f, -0.638f, -0.675f, -1.331f, -0.675f, -2.052f)
                curveToRelative(0.0f, -1.651f, 1.265f, -3.161f, 3.222f, -4.179f)
                close()
                moveTo(12.0f, 21.001f)
                curveToRelative(-4.879f, 0.0f, -9.0f, -2.519f, -9.0f, -5.5f)
                verticalLineToRelative(-1.322f)
                curveToRelative(2.182f, 1.741f, 5.38f, 2.822f, 9.0f, 2.822f)
                reflectiveCurveToRelative(6.818f, -1.081f, 9.0f, -2.822f)
                verticalLineToRelative(1.322f)
                curveToRelative(0.0f, 2.981f, -4.121f, 5.5f, -9.0f, 5.5f)
                close()
            }
        }
        .build()
        return _drumSteelpan!!
    }

private var _drumSteelpan: ImageVector? = null
