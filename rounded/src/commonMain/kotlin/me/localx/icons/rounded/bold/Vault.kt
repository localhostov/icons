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

public val Icons.Bold.Vault: ImageVector
    get() {
        if (_vault != null) {
            return _vault!!
        }
        _vault = Builder(name = "Vault", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.0f)
                lineTo(5.5f, 2.0f)
                curveTo(2.47f, 2.0f, 0.0f, 4.47f, 0.0f, 7.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.13f, 1.22f, 3.99f, 3.0f, 4.9f)
                verticalLineToRelative(1.1f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.1f)
                curveToRelative(1.78f, -0.91f, 3.0f, -2.77f, 3.0f, -4.9f)
                lineTo(24.0f, 7.5f)
                curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 16.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 19.0f)
                curveToRelative(-1.21f, 0.0f, -2.22f, -0.86f, -2.45f, -2.0f)
                horizontalLineToRelative(0.45f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.45f)
                curveToRelative(0.23f, -1.14f, 1.24f, -2.0f, 2.45f, -2.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(13.0f, 12.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.25f)
                curveToRelative(-0.64f, 2.02f, -2.51f, 3.5f, -4.75f, 3.5f)
                curveToRelative(-3.12f, 0.0f, -5.57f, -2.85f, -4.88f, -6.09f)
                curveToRelative(0.41f, -1.92f, 1.98f, -3.45f, 3.91f, -3.82f)
                curveToRelative(2.65f, -0.5f, 4.99f, 1.1f, 5.72f, 3.41f)
                horizontalLineToRelative(-3.25f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _vault!!
    }

private var _vault: ImageVector? = null
