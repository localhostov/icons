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

public val Icons.Filled.CopyImage: ImageVector
    get() {
        if (_copyImage != null) {
            return _copyImage!!
        }
        _copyImage = Builder(name = "CopyImage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                lineTo(10.0f, 2.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.07f, 0.34f, 2.06f, 0.91f, 2.87f)
                lineToRelative(6.1f, -6.1f)
                curveToRelative(1.01f, -1.01f, 2.66f, -1.02f, 3.68f, 0.0f)
                lineToRelative(1.04f, 1.04f)
                curveToRelative(0.23f, 0.23f, 0.62f, 0.23f, 0.85f, 0.0f)
                lineToRelative(5.95f, -5.95f)
                curveToRelative(-0.8f, -1.69f, -2.53f, -2.86f, -4.52f, -2.86f)
                close()
                moveTo(9.5f, 8.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(24.0f, 7.21f)
                verticalLineToRelative(5.79f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                lineTo(10.0f, 18.0f)
                curveToRelative(-0.97f, 0.0f, -1.87f, -0.28f, -2.64f, -0.75f)
                lineToRelative(6.06f, -6.06f)
                curveToRelative(0.23f, -0.23f, 0.62f, -0.23f, 0.85f, 0.0f)
                lineToRelative(1.04f, 1.04f)
                curveToRelative(0.98f, 0.98f, 2.69f, 0.98f, 3.67f, 0.0f)
                lineToRelative(5.02f, -5.02f)
                close()
                moveTo(18.0f, 20.0f)
                curveToRelative(-0.91f, 1.21f, -2.37f, 2.0f, -4.0f, 2.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.06f, 1.25f, -3.83f, 3.03f, -4.59f)
                curveToRelative(-0.02f, 0.2f, -0.03f, 0.39f, -0.03f, 0.59f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _copyImage!!
    }

private var _copyImage: ImageVector? = null
