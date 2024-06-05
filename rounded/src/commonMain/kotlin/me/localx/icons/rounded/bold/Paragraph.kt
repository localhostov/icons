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

public val Icons.Bold.Paragraph: ImageVector
    get() {
        if (_paragraph != null) {
            return _paragraph!!
        }
        _paragraph = Builder(name = "Paragraph", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 0.0f)
                horizontalLineToRelative(-14.0f)
                curveTo(3.813f, 0.0f, 0.0f, 3.813f, 0.0f, 8.5f)
                reflectiveCurveToRelative(3.813f, 8.5f, 8.5f, 8.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(19.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(21.0f, 3.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.467f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(11.0f)
                close()
            }
        }
        .build()
        return _paragraph!!
    }

private var _paragraph: ImageVector? = null
