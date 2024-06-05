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

public val Icons.Bold.BookFont: ImageVector
    get() {
        if (_bookFont != null) {
            return _bookFont!!
        }
        _bookFont = Builder(name = "BookFont", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 0.0f)
                lineTo(6.5f, 0.0f)
                curveTo(3.47f, 0.0f, 1.0f, 2.47f, 1.0f, 5.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(23.0f, 5.5f)
                curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(20.0f, 5.5f)
                lineTo(20.0f, 15.0f)
                lineTo(10.0f, 15.0f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(6.5f, 3.0f)
                horizontalLineToRelative(0.5f)
                lineTo(7.0f, 15.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.53f, 0.0f, -1.03f, 0.09f, -1.5f, 0.26f)
                lineTo(4.0f, 5.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(17.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(12.15f, 13.5f)
                curveToRelative(0.42f, 0.0f, 0.8f, -0.27f, 0.95f, -0.67f)
                lineToRelative(0.3f, -0.83f)
                horizontalLineToRelative(3.22f)
                lineToRelative(0.3f, 0.83f)
                curveToRelative(0.14f, 0.4f, 0.52f, 0.67f, 0.95f, 0.67f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.7f, 0.0f, 1.18f, -0.69f, 0.95f, -1.34f)
                lineToRelative(-2.39f, -6.66f)
                curveToRelative(-0.22f, -0.6f, -0.77f, -0.99f, -1.41f, -0.99f)
                reflectiveCurveToRelative(-1.19f, 0.39f, -1.41f, 1.0f)
                lineToRelative(-2.39f, 6.66f)
                curveToRelative(-0.23f, 0.65f, 0.25f, 1.34f, 0.95f, 1.34f)
                close()
                moveTo(15.9f, 10.0f)
                horizontalLineToRelative(-1.79f)
                lineToRelative(0.9f, -2.51f)
                lineToRelative(0.9f, 2.51f)
                close()
            }
        }
        .build()
        return _bookFont!!
    }

private var _bookFont: ImageVector? = null
