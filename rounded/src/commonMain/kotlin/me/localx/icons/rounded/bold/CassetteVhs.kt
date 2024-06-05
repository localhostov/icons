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

public val Icons.Bold.CassetteVhs: ImageVector
    get() {
        if (_cassetteVhs != null) {
            return _cassetteVhs!!
        }
        _cassetteVhs = Builder(name = "CassetteVhs", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.33f, 10.49f)
                curveToRelative(0.29f, 0.5f, 0.67f, 1.37f, 0.67f, 2.51f)
                reflectiveCurveToRelative(-0.37f, 2.01f, -0.67f, 2.51f)
                curveToRelative(-0.18f, 0.31f, -0.51f, 0.49f, -0.86f, 0.49f)
                horizontalLineToRelative(-1.48f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.48f)
                curveToRelative(0.35f, 0.0f, 0.68f, 0.18f, 0.86f, 0.49f)
                close()
                moveTo(5.66f, 10.49f)
                curveToRelative(-0.29f, 0.5f, -0.67f, 1.37f, -0.67f, 2.51f)
                reflectiveCurveToRelative(0.37f, 2.01f, 0.67f, 2.51f)
                curveToRelative(0.18f, 0.31f, 0.51f, 0.49f, 0.86f, 0.49f)
                horizontalLineToRelative(1.48f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.48f)
                curveToRelative(-0.35f, 0.0f, -0.68f, 0.18f, -0.86f, 0.49f)
                close()
                moveTo(9.99f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(23.99f, 8.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                verticalLineToRelative(-7.0f)
                curveTo(0.0f, 5.47f, 2.47f, 3.0f, 5.5f, 3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
                moveTo(20.99f, 8.5f)
                curveToRelative(0.0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.5f)
                lineTo(3.05f, 8.0f)
                curveToRelative(-0.03f, 0.16f, -0.05f, 0.33f, -0.05f, 0.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _cassetteVhs!!
    }

private var _cassetteVhs: ImageVector? = null
