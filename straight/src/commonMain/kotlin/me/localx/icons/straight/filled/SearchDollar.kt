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

public val Icons.Filled.SearchDollar: ImageVector
    get() {
        if (_searchDollar != null) {
            return _searchDollar!!
        }
        _searchDollar = Builder(name = "SearchDollar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.957f, 22.543f)
                lineToRelative(-6.219f, -6.219f)
                curveToRelative(1.412f, -1.725f, 2.262f, -3.927f, 2.262f, -6.324f)
                curveTo(20.0f, 4.486f, 15.514f, 0.0f, 10.0f, 0.0f)
                reflectiveCurveTo(0.0f, 4.486f, 0.0f, 10.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.397f, 0.0f, 4.599f, -0.85f, 6.324f, -2.262f)
                lineToRelative(6.219f, 6.219f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(8.623f, 8.739f)
                lineToRelative(3.041f, 0.507f)
                curveToRelative(1.341f, 0.223f, 2.315f, 1.372f, 2.315f, 2.732f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.378f, -0.271f, -0.697f, -0.643f, -0.76f)
                lineToRelative(-3.042f, -0.507f)
                curveToRelative(-1.341f, -0.224f, -2.315f, -1.374f, -2.315f, -2.733f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.379f, 0.271f, 0.698f, 0.644f, 0.761f)
                close()
            }
        }
        .build()
        return _searchDollar!!
    }

private var _searchDollar: ImageVector? = null
