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

public val Icons.Filled.Banner3: ImageVector
    get() {
        if (_banner3 != null) {
            return _banner3!!
        }
        _banner3 = Builder(name = "Banner3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 2.619f)
                verticalLineToRelative(4.212f)
                curveToRelative(0.0f, 1.807f, -1.507f, 3.249f, -3.312f, 3.169f)
                lineTo(0.42f, 9.41f)
                curveTo(0.105f, 8.873f, -0.049f, 8.246f, 0.014f, 7.602f)
                lineToRelative(0.365f, -3.705f)
                curveToRelative(0.176f, -1.542f, 1.443f, -2.731f, 2.993f, -2.808f)
                lineTo(21.25f, 0.003f)
                curveToRelative(1.496f, -0.075f, 2.75f, 1.118f, 2.75f, 2.616f)
                close()
                moveTo(9.573f, 18.877f)
                lineToRelative(-5.938f, -3.464f)
                lineToRelative(-0.733f, 1.181f)
                curveToRelative(-0.538f, 0.867f, -0.896f, 1.692f, -0.901f, 2.885f)
                horizontalLineToRelative(-0.002f)
                verticalLineToRelative(0.295f)
                curveToRelative(0.0f, 1.322f, 0.826f, 2.488f, 2.091f, 2.871f)
                lineToRelative(4.386f, 1.329f)
                curveToRelative(0.793f, 0.198f, 1.285f, -0.836f, 0.631f, -1.326f)
                lineToRelative(-3.339f, -2.172f)
                lineToRelative(-0.025f, -0.018f)
                lineToRelative(3.769f, -1.54f)
                curveToRelative(0.023f, -0.01f, 0.038f, -0.031f, 0.06f, -0.042f)
                close()
                moveTo(1.458f, 11.488f)
                curveToRelative(0.147f, 0.122f, 0.289f, 0.252f, 0.45f, 0.35f)
                lineToRelative(8.369f, 5.259f)
                curveToRelative(0.162f, 0.102f, 0.346f, 0.153f, 0.532f, 0.153f)
                curveToRelative(0.108f, 0.0f, 0.218f, -0.018f, 0.323f, -0.054f)
                curveToRelative(0.286f, -0.097f, 0.512f, -0.318f, 0.616f, -0.601f)
                curveToRelative(0.168f, -0.457f, 0.253f, -0.922f, 0.253f, -1.38f)
                verticalLineToRelative(-3.447f)
                lineToRelative(-10.542f, -0.281f)
                close()
            }
        }
        .build()
        return _banner3!!
    }

private var _banner3: ImageVector? = null
