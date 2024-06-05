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

public val Icons.Filled.CassetteVhs: ImageVector
    get() {
        if (_cassetteVhs != null) {
            return _cassetteVhs!!
        }
        _cassetteVhs = Builder(name = "CassetteVhs", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.42f, 6.0f)
                curveToRelative(0.77f, -1.76f, 2.53f, -3.0f, 4.58f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.05f, 0.0f, 3.81f, 1.24f, 4.58f, 3.0f)
                lineTo(0.42f, 6.0f)
                close()
                moveTo(16.0f, 11.99f)
                verticalLineToRelative(4.01f)
                horizontalLineToRelative(1.48f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.23f, -0.4f, 0.52f, -1.09f, 0.52f, -2.0f)
                reflectiveCurveToRelative(-0.29f, -1.6f, -0.53f, -2.01f)
                horizontalLineToRelative(-1.47f)
                close()
                moveTo(8.0f, 12.0f)
                horizontalLineToRelative(-1.48f)
                curveToRelative(-0.24f, 0.41f, -0.52f, 1.09f, -0.52f, 2.0f)
                reflectiveCurveToRelative(0.29f, 1.6f, 0.53f, 2.01f)
                horizontalLineToRelative(1.47f)
                verticalLineToRelative(-4.01f)
                close()
                moveTo(10.0f, 16.01f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.02f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.02f)
                close()
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 21.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 8.0f)
                lineTo(24.0f, 8.0f)
                close()
                moveTo(20.0f, 14.0f)
                curveToRelative(0.0f, -1.35f, -0.44f, -2.39f, -0.8f, -3.02f)
                curveToRelative(-0.35f, -0.61f, -1.01f, -0.98f, -1.72f, -0.98f)
                lineTo(6.52f, 10.0f)
                curveToRelative(-0.71f, 0.0f, -1.37f, 0.38f, -1.72f, 0.98f)
                curveToRelative(-0.37f, 0.63f, -0.8f, 1.66f, -0.8f, 3.02f)
                reflectiveCurveToRelative(0.44f, 2.39f, 0.8f, 3.02f)
                curveToRelative(0.35f, 0.61f, 1.01f, 0.98f, 1.72f, 0.98f)
                horizontalLineToRelative(10.95f)
                curveToRelative(0.71f, 0.0f, 1.37f, -0.38f, 1.72f, -0.98f)
                curveToRelative(0.37f, -0.63f, 0.8f, -1.66f, 0.8f, -3.02f)
                close()
            }
        }
        .build()
        return _cassetteVhs!!
    }

private var _cassetteVhs: ImageVector? = null
