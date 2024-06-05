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

public val Icons.Bold.SearchDollar: ImageVector
    get() {
        if (_searchDollar != null) {
            return _searchDollar!!
        }
        _searchDollar = Builder(name = "SearchDollar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.983f, 21.862f)
                lineToRelative(-5.935f, -5.935f)
                curveToRelative(1.226f, -1.66f, 1.951f, -3.71f, 1.951f, -5.927f)
                curveTo(20.0f, 4.486f, 15.514f, 0.0f, 10.0f, 0.0f)
                reflectiveCurveTo(0.0f, 4.486f, 0.0f, 10.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.217f, 0.0f, 4.268f, -0.726f, 5.927f, -1.951f)
                lineToRelative(5.935f, 5.935f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(14.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                curveToRelative(0.0f, 0.294f, 0.176f, 0.555f, 0.449f, 0.664f)
                lineToRelative(2.216f, 0.887f)
                curveToRelative(1.418f, 0.566f, 2.335f, 1.921f, 2.335f, 3.449f)
                curveToRelative(0.0f, 1.58f, -1.059f, 2.903f, -2.5f, 3.337f)
                verticalLineToRelative(1.163f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.163f)
                curveToRelative(-1.441f, -0.434f, -2.5f, -1.757f, -2.5f, -3.337f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                curveToRelative(0.0f, -0.294f, -0.176f, -0.555f, -0.449f, -0.664f)
                lineToRelative(-2.216f, -0.887f)
                curveToRelative(-1.418f, -0.566f, -2.335f, -1.921f, -2.335f, -3.449f)
                curveToRelative(0.0f, -1.58f, 1.059f, -2.903f, 2.5f, -3.337f)
                verticalLineToRelative(-1.163f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.163f)
                curveToRelative(1.441f, 0.434f, 2.5f, 1.757f, 2.5f, 3.337f)
                verticalLineToRelative(0.5f)
                close()
            }
        }
        .build()
        return _searchDollar!!
    }

private var _searchDollar: ImageVector? = null
