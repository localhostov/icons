package me.localx.icons.rounded.outline

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

public val Icons.Outline.CopyImage: ImageVector
    get() {
        if (_copyImage != null) {
            return _copyImage!!
        }
        _copyImage = Builder(name = "CopyImage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                lineTo(10.0f, 18.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(5.0f, 7.0f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                close()
                moveTo(7.0f, 13.0f)
                curveToRelative(0.0f, 0.77f, 0.29f, 1.47f, 0.77f, 2.01f)
                lineToRelative(5.24f, -5.24f)
                curveToRelative(0.98f, -0.98f, 2.69f, -0.98f, 3.67f, 0.0f)
                lineToRelative(1.04f, 1.04f)
                curveToRelative(0.23f, 0.23f, 0.62f, 0.23f, 0.85f, 0.0f)
                lineToRelative(3.43f, -3.43f)
                verticalLineToRelative(-0.38f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                lineTo(10.0f, 4.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(22.0f, 13.0f)
                verticalLineToRelative(-2.79f)
                lineToRelative(-2.02f, 2.02f)
                curveToRelative(-0.98f, 0.98f, -2.69f, 0.98f, -3.67f, 0.0f)
                lineToRelative(-1.04f, -1.04f)
                curveToRelative(-0.23f, -0.23f, -0.61f, -0.23f, -0.85f, 0.0f)
                lineToRelative(-4.79f, 4.79f)
                curveToRelative(0.12f, 0.02f, 0.24f, 0.02f, 0.37f, 0.02f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                close()
                moveTo(17.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.74f, 0.27f, -1.45f, 0.77f, -2.0f)
                curveToRelative(0.37f, -0.41f, 0.33f, -1.04f, -0.08f, -1.41f)
                curveToRelative(-0.41f, -0.37f, -1.04f, -0.33f, -1.41f, 0.08f)
                curveToRelative(-0.82f, 0.92f, -1.28f, 2.1f, -1.28f, 3.34f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _copyImage!!
    }

private var _copyImage: ImageVector? = null
