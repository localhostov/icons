package me.localx.icons.straight.bold

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

public val Icons.Bold.Features: ImageVector
    get() {
        if (_features != null) {
            return _features!!
        }
        _features = Builder(name = "Features", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.917f)
                lineToRelative(-3.3f, 1.909f)
                lineToRelative(1.326f, 4.029f)
                lineToRelative(-0.75f, 0.523f)
                lineToRelative(-3.261f, -2.521f)
                lineToRelative(-3.275f, 2.532f)
                lineToRelative(-0.721f, -0.543f)
                lineToRelative(1.304f, -4.076f)
                lineToRelative(-3.323f, -1.848f)
                verticalLineToRelative(-0.922f)
                horizontalLineToRelative(4.35f)
                lineToRelative(1.178f, -4.5f)
                horizontalLineToRelative(0.97f)
                lineToRelative(1.176f, 4.5f)
                horizontalLineToRelative(4.326f)
                verticalLineToRelative(0.917f)
                close()
                moveTo(5.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 14.931f)
                curveToRelative(-0.328f, 0.041f, -0.661f, 0.069f, -1.0f, 0.069f)
                curveToRelative(-0.692f, 0.0f, -1.36f, -0.097f, -2.0f, -0.262f)
                verticalLineToRelative(3.262f)
                lineTo(5.0f, 18.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7.579f)
                curveToRelative(0.727f, -1.255f, 1.781f, -2.296f, 3.051f, -3.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(16.5f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(14.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.069f)
                close()
            }
        }
        .build()
        return _features!!
    }

private var _features: ImageVector? = null
