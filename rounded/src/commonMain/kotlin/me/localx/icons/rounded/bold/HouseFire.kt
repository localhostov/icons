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

public val Icons.Bold.HouseFire: ImageVector
    get() {
        if (_houseFire != null) {
            return _houseFire!!
        }
        _houseFire = Builder(name = "HouseFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 22.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-8.614f)
                curveToRelative(0.0f, -1.831f, 0.906f, -3.536f, 2.424f, -4.56f)
                lineTo(8.924f, 0.941f)
                curveToRelative(1.869f, -1.262f, 4.283f, -1.262f, 6.152f, 0.0f)
                lineToRelative(6.924f, 4.708f)
                curveToRelative(1.12f, 0.923f, 1.834f, 2.246f, 1.975f, 3.707f)
                curveToRelative(0.08f, 0.825f, -0.524f, 1.558f, -1.349f, 1.638f)
                curveToRelative(-0.816f, 0.075f, -1.558f, -0.524f, -1.638f, -1.349f)
                curveToRelative(-0.072f, -0.745f, -0.469f, -1.412f, -1.09f, -1.831f)
                lineToRelative(-6.5f, -4.387f)
                curveToRelative(-0.85f, -0.573f, -1.947f, -0.573f, -2.797f, 0.0f)
                lineToRelative(-6.5f, 4.386f)
                curveToRelative(-0.689f, 0.466f, -1.102f, 1.24f, -1.102f, 2.073f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 17.974f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 3.208f, -2.507f, 5.831f, -5.669f, 6.016f)
                curveToRelative(-2.642f, 0.155f, -4.939f, -1.57f, -5.956f, -4.014f)
                curveToRelative(-0.95f, -2.283f, 0.052f, -4.33f, 1.125f, -5.656f)
                curveToRelative(0.28f, -0.346f, 0.827f, -0.283f, 1.007f, 0.123f)
                curveToRelative(0.254f, 0.575f, -0.045f, 1.721f, 0.777f, 1.721f)
                curveToRelative(1.137f, 0.0f, 0.808f, -3.581f, 2.077f, -5.728f)
                curveToRelative(0.225f, -0.381f, 0.748f, -0.455f, 1.078f, -0.161f)
                curveToRelative(2.05f, 1.829f, 5.562f, 4.532f, 5.562f, 7.699f)
                close()
                moveTo(19.319f, 18.453f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.894f, -0.894f)
                curveToRelative(-0.249f, -0.249f, -0.652f, -0.249f, -0.901f, 0.0f)
                lineToRelative(-0.894f, 0.894f)
                curveToRelative(-0.763f, 0.763f, -0.899f, 2.015f, -0.197f, 2.835f)
                curveToRelative(0.813f, 0.948f, 2.271f, 0.948f, 3.083f, 0.0f)
                curveToRelative(0.703f, -0.819f, 0.566f, -2.072f, -0.197f, -2.835f)
                close()
            }
        }
        .build()
        return _houseFire!!
    }

private var _houseFire: ImageVector? = null
