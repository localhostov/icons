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

public val Icons.Bold.Background: ImageVector
    get() {
        if (_background != null) {
            return _background!!
        }
        _background = Builder(name = "Background", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.47f, 0.0f, 0.0f, 2.47f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(18.85f, 3.03f)
                lineTo(3.03f, 18.85f)
                curveToRelative(-0.02f, -0.12f, -0.03f, -0.23f, -0.03f, -0.35f)
                verticalLineToRelative(-4.88f)
                reflectiveCurveToRelative(0.04f, -0.04f, 0.06f, -0.06f)
                curveToRelative(0.0f, 0.0f, 10.54f, -10.54f, 10.56f, -10.56f)
                horizontalLineToRelative(4.88f)
                curveToRelative(0.12f, 0.0f, 0.24f, 0.0f, 0.35f, 0.03f)
                close()
                moveTo(5.5f, 3.0f)
                horizontalLineToRelative(3.88f)
                lineTo(3.0f, 9.38f)
                verticalLineToRelative(-3.88f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(5.15f, 20.97f)
                lineTo(20.97f, 5.15f)
                curveToRelative(0.02f, 0.12f, 0.03f, 0.23f, 0.03f, 0.35f)
                verticalLineToRelative(4.88f)
                reflectiveCurveToRelative(-0.04f, 0.04f, -0.06f, 0.06f)
                curveToRelative(0.0f, 0.0f, -10.54f, 10.54f, -10.56f, 10.56f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-0.12f, 0.0f, -0.24f, 0.0f, -0.35f, -0.03f)
                close()
                moveTo(18.5f, 21.0f)
                horizontalLineToRelative(-3.88f)
                lineToRelative(6.38f, -6.38f)
                verticalLineToRelative(3.88f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _background!!
    }

private var _background: ImageVector? = null
