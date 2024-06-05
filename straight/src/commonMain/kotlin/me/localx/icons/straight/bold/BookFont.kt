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
                moveTo(20.5f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.79f, 0.0f, 1.0f, 1.79f, 1.0f, 4.0f)
                lineTo(1.0f, 20.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                lineTo(23.0f, 24.0f)
                lineTo(23.0f, 2.5f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(20.0f, 16.0f)
                lineTo(10.0f, 16.0f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.35f, 0.0f, -0.68f, 0.04f, -1.0f, 0.13f)
                lineTo(4.0f, 4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(5.0f, 21.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 21.0f)
                close()
                moveTo(13.12f, 14.0f)
                lineToRelative(0.31f, -0.98f)
                horizontalLineToRelative(3.14f)
                lineToRelative(0.31f, 0.98f)
                horizontalLineToRelative(2.12f)
                lineToRelative(-2.59f, -8.01f)
                curveToRelative(-0.22f, -0.6f, -0.77f, -0.99f, -1.41f, -0.99f)
                reflectiveCurveToRelative(-1.19f, 0.39f, -1.41f, 1.0f)
                lineToRelative(-2.59f, 8.0f)
                horizontalLineToRelative(2.12f)
                close()
                moveTo(15.94f, 11.02f)
                horizontalLineToRelative(-1.89f)
                lineToRelative(0.95f, -3.03f)
                lineToRelative(0.95f, 3.03f)
                close()
            }
        }
        .build()
        return _bookFont!!
    }

private var _bookFont: ImageVector? = null
