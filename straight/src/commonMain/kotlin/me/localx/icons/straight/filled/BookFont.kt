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
                moveTo(15.0f, 6.99f)
                lineToRelative(1.08f, 3.03f)
                horizontalLineToRelative(-2.16f)
                lineToRelative(1.08f, -3.03f)
                close()
                moveTo(6.0f, 18.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                verticalLineToRelative(15.77f)
                curveToRelative(0.55f, -0.49f, 1.26f, -0.77f, 2.0f, -0.77f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(2.0f, 22.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                lineTo(22.0f, 24.0f)
                verticalLineToRelative(-4.0f)
                lineTo(4.0f, 20.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                close()
                moveTo(22.0f, 2.0f)
                lineTo(22.0f, 18.0f)
                lineTo(8.0f, 18.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                close()
                moveTo(19.63f, 14.02f)
                lineToRelative(-3.22f, -9.02f)
                curveToRelative(-0.22f, -0.6f, -0.77f, -0.99f, -1.41f, -0.99f)
                reflectiveCurveToRelative(-1.19f, 0.39f, -1.41f, 1.0f)
                lineToRelative(-3.22f, 9.02f)
                horizontalLineToRelative(2.12f)
                lineToRelative(0.71f, -2.0f)
                horizontalLineToRelative(3.59f)
                lineToRelative(0.71f, 2.0f)
                horizontalLineToRelative(2.12f)
                close()
            }
        }
        .build()
        return _bookFont!!
    }

private var _bookFont: ImageVector? = null
