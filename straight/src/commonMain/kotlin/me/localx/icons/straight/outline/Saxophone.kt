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

public val Icons.Outline.Saxophone: ImageVector
    get() {
        if (_saxophone != null) {
            return _saxophone!!
        }
        _saxophone = Builder(name = "Saxophone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.005f, 0.0f)
                curveToRelative(-1.328f, 0.0f, -2.514f, 0.891f, -2.882f, 2.166f)
                curveToRelative(0.0f, 0.0f, -0.21f, 0.728f, -0.217f, 0.752f)
                curveToRelative(-0.262f, -0.077f, -1.557f, -0.448f, -1.841f, -0.545f)
                lineToRelative(-0.645f, 1.894f)
                curveToRelative(0.307f, 0.104f, 1.669f, 0.496f, 1.93f, 0.573f)
                curveToRelative(-0.226f, 0.781f, -0.471f, 1.629f, -0.726f, 2.507f)
                curveToRelative(-0.338f, -0.1f, -1.749f, -0.505f, -2.033f, -0.602f)
                lineToRelative(-0.645f, 1.894f)
                curveToRelative(0.308f, 0.104f, 1.783f, 0.529f, 2.119f, 0.628f)
                curveToRelative(-0.139f, 0.475f, -0.278f, 0.952f, -0.417f, 1.425f)
                curveToRelative(-1.009f, 3.036f, -2.654f, 6.307f, -4.15f, 6.307f)
                curveToRelative(-1.327f, 0.0f, -1.491f, -1.055f, -1.5f, -1.5f)
                verticalLineToRelative(-2.493f)
                curveToRelative(0.008f, -0.471f, 0.174f, -2.007f, 2.0f, -2.007f)
                verticalLineToRelative(-2.0f)
                lineTo(-0.031f, 8.999f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.826f, 0.0f, 1.992f, 1.537f, 2.0f, 2.009f)
                lineToRelative(0.031f, 3.331f)
                curveToRelative(0.0f, 3.708f, 1.971f, 7.669f, 7.5f, 7.669f)
                curveToRelative(2.854f, 0.0f, 5.771f, -2.247f, 6.785f, -5.227f)
                curveToRelative(0.422f, -1.24f, 1.291f, -4.144f, 2.202f, -7.247f)
                curveToRelative(0.32f, -0.961f, 2.558f, -8.815f, 2.558f, -8.815f)
                curveToRelative(0.122f, -0.424f, 0.518f, -0.721f, 0.96f, -0.721f)
                horizontalLineToRelative(1.995f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-1.995f)
                close()
                moveTo(9.5f, 22.009f)
                curveToRelative(-4.785f, 0.0f, -5.5f, -3.552f, -5.5f, -5.678f)
                lineToRelative(-0.031f, -3.331f)
                curveToRelative(0.0f, -0.612f, -0.154f, -1.336f, -0.507f, -2.0f)
                horizontalLineToRelative(6.045f)
                curveToRelative(-0.352f, 0.664f, -0.507f, 1.388f, -0.507f, 2.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.407f, 0.932f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.637f, 0.0f, 1.228f, -0.201f, 1.773f, -0.546f)
                curveToRelative(-0.831f, 2.017f, -2.867f, 3.555f, -4.773f, 3.555f)
                close()
            }
        }
        .build()
        return _saxophone!!
    }

private var _saxophone: ImageVector? = null
