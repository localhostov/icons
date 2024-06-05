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

public val Icons.Filled.BookFont: ImageVector
    get() {
        if (_bookFont != null) {
            return _bookFont!!
        }
        _bookFont = Builder(name = "BookFont", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.97f)
                lineToRelative(1.08f, 3.03f)
                horizontalLineToRelative(-2.16f)
                lineToRelative(1.08f, -3.03f)
                close()
                moveTo(5.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                lineTo(6.0f, 0.1f)
                curveTo(3.67f, 0.58f, 2.0f, 2.62f, 2.0f, 5.0f)
                verticalLineToRelative(12.02f)
                curveToRelative(0.7f, -0.53f, 1.53f, -0.86f, 2.4f, -0.96f)
                curveToRelative(0.2f, -0.04f, 0.4f, -0.06f, 0.6f, -0.06f)
                close()
                moveTo(2.0f, 21.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 18.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                close()
                moveTo(22.0f, 5.0f)
                verticalLineToRelative(11.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                close()
                moveTo(19.16f, 11.66f)
                lineToRelative(-2.74f, -7.69f)
                curveToRelative(-0.22f, -0.6f, -0.77f, -0.99f, -1.41f, -0.99f)
                reflectiveCurveToRelative(-1.19f, 0.39f, -1.41f, 1.0f)
                lineToRelative(-2.74f, 7.69f)
                curveToRelative(-0.23f, 0.65f, 0.25f, 1.34f, 0.94f, 1.34f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.42f, 0.0f, 0.8f, -0.27f, 0.94f, -0.66f)
                lineToRelative(0.48f, -1.34f)
                horizontalLineToRelative(3.59f)
                lineToRelative(0.48f, 1.34f)
                curveToRelative(0.14f, 0.4f, 0.52f, 0.66f, 0.94f, 0.66f)
                curveToRelative(0.69f, 0.0f, 1.17f, -0.68f, 0.94f, -1.34f)
                close()
            }
        }
        .build()
        return _bookFont!!
    }

private var _bookFont: ImageVector? = null
