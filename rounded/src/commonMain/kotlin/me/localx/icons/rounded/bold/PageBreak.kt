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

public val Icons.Bold.PageBreak: ImageVector
    get() {
        if (_pageBreak != null) {
            return _pageBreak!!
        }
        _pageBreak = Builder(name = "PageBreak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 16.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                lineTo(2.5f, 16.0f)
                close()
                moveTo(10.5f, 13.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(21.5f, 13.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(3.5f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(5.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.5f)
                lineTo(13.0f, 7.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-1.343f)
                curveToRelative(0.0f, -1.47f, -0.572f, -2.851f, -1.611f, -3.89f)
                lineToRelative(-2.656f, -2.656f)
                curveToRelative(-1.039f, -1.039f, -2.42f, -1.611f, -3.89f, -1.611f)
                lineTo(7.5f, -0.0f)
                curveTo(4.468f, 0.0f, 2.0f, 2.468f, 2.0f, 5.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(20.874f, 18.048f)
                curveToRelative(-0.8f, -0.213f, -1.62f, 0.275f, -1.826f, 1.078f)
                curveToRelative(-0.284f, 1.104f, -1.28f, 1.874f, -2.422f, 1.874f)
                lineTo(7.374f, 21.0f)
                curveToRelative(-1.142f, 0.0f, -2.138f, -0.771f, -2.422f, -1.874f)
                curveToRelative(-0.206f, -0.803f, -1.03f, -1.292f, -1.826f, -1.078f)
                curveToRelative(-0.803f, 0.206f, -1.285f, 1.024f, -1.078f, 1.826f)
                curveToRelative(0.625f, 2.43f, 2.815f, 4.126f, 5.326f, 4.126f)
                horizontalLineToRelative(9.252f)
                curveToRelative(2.511f, 0.0f, 4.701f, -1.696f, 5.326f, -4.126f)
                curveToRelative(0.207f, -0.802f, -0.275f, -1.62f, -1.078f, -1.826f)
                close()
            }
        }
        .build()
        return _pageBreak!!
    }

private var _pageBreak: ImageVector? = null
