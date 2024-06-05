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

public val Icons.Filled.Saxophone: ImageVector
    get() {
        if (_saxophone != null) {
            return _saxophone!!
        }
        _saxophone = Builder(name = "Saxophone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 0.0f)
                curveToRelative(-1.323f, 0.0f, -2.476f, 0.849f, -2.865f, 2.113f)
                curveToRelative(-0.072f, 0.232f, -0.153f, 0.5f, -0.239f, 0.784f)
                lineToRelative(-0.071f, -0.022f)
                curveToRelative(-0.774f, -0.24f, -1.345f, -0.416f, -1.745f, -0.552f)
                lineToRelative(-0.646f, 1.893f)
                curveToRelative(0.413f, 0.141f, 1.002f, 0.323f, 1.801f, 0.57f)
                lineToRelative(0.091f, 0.028f)
                curveToRelative(-0.228f, 0.775f, -0.476f, 1.62f, -0.734f, 2.508f)
                lineToRelative(-0.225f, -0.07f)
                curveToRelative(-0.783f, -0.242f, -1.358f, -0.42f, -1.762f, -0.558f)
                lineToRelative(-0.645f, 1.894f)
                curveToRelative(0.416f, 0.142f, 1.009f, 0.325f, 1.815f, 0.575f)
                lineToRelative(0.256f, 0.079f)
                curveToRelative(-0.258f, 0.888f, -0.518f, 1.781f, -0.772f, 2.649f)
                curveToRelative(-0.834f, 2.366f, -2.23f, 5.109f, -3.759f, 5.109f)
                curveToRelative(-1.327f, 0.0f, -1.491f, -1.056f, -1.5f, -1.5f)
                verticalLineToRelative(-2.493f)
                curveToRelative(0.008f, -0.471f, 0.174f, -2.007f, 2.0f, -2.007f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.826f, 0.0f, 1.992f, 1.537f, 2.0f, 2.009f)
                lineToRelative(0.031f, 3.322f)
                curveToRelative(0.0f, 2.979f, 1.221f, 5.409f, 3.348f, 6.665f)
                curveToRelative(1.077f, 0.636f, 2.323f, 0.983f, 3.605f, 1.003f)
                curveToRelative(0.041f, 0.0f, 0.082f, 0.0f, 0.123f, 0.0f)
                curveToRelative(3.188f, 0.0f, 6.062f, -1.938f, 7.019f, -4.746f)
                curveToRelative(0.384f, -1.127f, 1.162f, -3.753f, 2.018f, -6.682f)
                curveToRelative(0.402f, -1.15f, 2.437f, -8.367f, 2.901f, -9.869f)
                curveToRelative(0.13f, -0.42f, 0.514f, -0.703f, 0.955f, -0.703f)
                horizontalLineToRelative(2.024f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.024f)
                close()
            }
        }
        .build()
        return _saxophone!!
    }

private var _saxophone: ImageVector? = null
