package me.localx.icons.straight.outline

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

public val Icons.Outline.BookFont: ImageVector
    get() {
        if (_bookFont != null) {
            return _bookFont!!
        }
        _bookFont = Builder(name = "BookFont", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(3.35f, 0.0f, 2.0f, 1.35f, 2.0f, 3.0f)
                lineTo(2.0f, 21.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 2.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 18.0f)
                lineTo(8.0f, 18.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                lineTo(20.0f, 18.0f)
                close()
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(6.0f, 18.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.35f, 0.0f, -0.69f, 0.06f, -1.0f, 0.17f)
                lineTo(4.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(5.0f, 22.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 22.0f)
                close()
                moveTo(11.49f, 15.02f)
                lineToRelative(0.71f, -2.0f)
                horizontalLineToRelative(3.59f)
                lineToRelative(0.71f, 2.0f)
                horizontalLineToRelative(2.12f)
                lineToRelative(-3.22f, -9.02f)
                curveToRelative(-0.22f, -0.6f, -0.77f, -0.99f, -1.41f, -0.99f)
                reflectiveCurveToRelative(-1.19f, 0.39f, -1.41f, 1.0f)
                lineToRelative(-3.22f, 9.02f)
                horizontalLineToRelative(2.12f)
                close()
                moveTo(14.0f, 7.99f)
                lineToRelative(1.08f, 3.03f)
                horizontalLineToRelative(-2.16f)
                lineToRelative(1.08f, -3.03f)
                close()
            }
        }
        .build()
        return _bookFont!!
    }

private var _bookFont: ImageVector? = null
