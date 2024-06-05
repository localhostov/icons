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

public val Icons.Filled.Alicorn: ImageVector
    get() {
        if (_alicorn != null) {
            return _alicorn!!
        }
        _alicorn = Builder(name = "Alicorn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.92f)
                verticalLineToRelative(0.58f)
                lineToRelative(-5.0f, 0.5f)
                verticalLineToRelative(2.9f)
                curveToRelative(0.0f, 1.48f, -0.2f, 2.44f, -0.62f, 3.9f)
                lineToRelative(-0.38f, 1.81f)
                verticalLineToRelative(5.4f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-4.38f)
                lineToRelative(-0.62f, 5.0f)
                horizontalLineToRelative(-4.15f)
                lineToRelative(0.68f, -4.92f)
                curveToRelative(-0.11f, -0.36f, -0.25f, -0.76f, -0.4f, -1.17f)
                curveToRelative(-0.49f, -1.4f, -1.09f, -3.13f, -1.13f, -4.72f)
                curveToRelative(-1.32f, 1.08f, -2.0f, 3.02f, -2.0f, 5.81f)
                horizontalLineTo(0.0f)
                curveToRelative(0.0f, -5.16f, 2.1f, -7.32f, 4.08f, -8.21f)
                curveToRelative(1.06f, 1.76f, 2.89f, 3.48f, 5.98f, 4.71f)
                lineToRelative(0.74f, -1.86f)
                curveToRelative(-6.11f, -2.44f, -6.3f, -6.9f, -6.03f, -9.0f)
                curveToRelative(0.31f, -1.73f, 0.79f, -3.05f, 0.79f, -3.05f)
                curveToRelative(0.0f, 0.0f, 3.31f, 5.6f, 6.46f, 6.3f)
                curveToRelative(0.18f, -1.9f, 1.21f, -4.62f, 4.05f, -5.55f)
                curveToRelative(0.3f, -1.34f, 1.49f, -2.34f, 2.92f, -2.34f)
                verticalLineToRelative(1.6f)
                lineToRelative(4.63f, -1.6f)
                curveToRelative(0.2f, 0.34f, 0.17f, 0.28f, 0.37f, 0.61f)
                lineToRelative(-4.27f, 3.52f)
                curveToRelative(0.6f, 1.07f, 1.57f, 1.92f, 2.85f, 2.53f)
                curveToRelative(0.86f, 0.41f, 1.41f, 1.3f, 1.41f, 2.25f)
                close()
            }
        }
        .build()
        return _alicorn!!
    }

private var _alicorn: ImageVector? = null
