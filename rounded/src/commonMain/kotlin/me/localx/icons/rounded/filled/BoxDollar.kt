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

public val Icons.Filled.BoxDollar: ImageVector
    get() {
        if (_boxDollar != null) {
            return _boxDollar!!
        }
        _boxDollar = Builder(name = "BoxDollar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                lineTo(2.0f, 10.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(13.38f, 21.0f)
                horizontalLineToRelative(-0.38f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.27f)
                curveToRelative(-1.07f, 0.0f, -2.06f, -0.57f, -2.6f, -1.5f)
                curveToRelative(-0.28f, -0.48f, -0.11f, -1.09f, 0.37f, -1.37f)
                curveToRelative(0.48f, -0.28f, 1.09f, -0.11f, 1.37f, 0.36f)
                curveToRelative(0.18f, 0.31f, 0.51f, 0.5f, 0.87f, 0.5f)
                horizontalLineToRelative(2.64f)
                curveToRelative(0.34f, 0.0f, 0.62f, -0.28f, 0.62f, -0.62f)
                curveToRelative(0.0f, -0.31f, -0.22f, -0.57f, -0.52f, -0.62f)
                lineToRelative(-3.29f, -0.55f)
                curveToRelative(-1.27f, -0.21f, -2.19f, -1.3f, -2.19f, -2.59f)
                curveToRelative(0.0f, -1.45f, 1.18f, -2.62f, 2.62f, -2.62f)
                horizontalLineToRelative(0.38f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                horizontalLineToRelative(0.27f)
                curveToRelative(1.07f, 0.0f, 2.06f, 0.57f, 2.6f, 1.5f)
                curveToRelative(0.28f, 0.48f, 0.11f, 1.09f, -0.37f, 1.37f)
                curveToRelative(-0.48f, 0.28f, -1.09f, 0.11f, -1.37f, -0.36f)
                curveToRelative(-0.18f, -0.31f, -0.51f, -0.5f, -0.87f, -0.5f)
                horizontalLineToRelative(-2.64f)
                curveToRelative(-0.34f, 0.0f, -0.62f, 0.28f, -0.62f, 0.62f)
                curveToRelative(0.0f, 0.31f, 0.22f, 0.57f, 0.52f, 0.62f)
                lineToRelative(3.29f, 0.55f)
                curveToRelative(1.27f, 0.21f, 2.19f, 1.3f, 2.19f, 2.59f)
                curveToRelative(0.0f, 1.45f, -1.18f, 2.62f, -2.62f, 2.62f)
                close()
                moveTo(24.0f, 5.23f)
                curveToRelative(-0.1f, 1.58f, -1.42f, 2.8f, -3.0f, 2.78f)
                lineTo(3.0f, 8.01f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                curveTo(0.0f, 2.24f, 2.24f, 0.0f, 5.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, 14.14f, 0.0f, 14.21f, 0.0f)
                curveToRelative(2.76f, 0.12f, 4.9f, 2.46f, 4.78f, 5.22f)
                close()
            }
        }
        .build()
        return _boxDollar!!
    }

private var _boxDollar: ImageVector? = null
