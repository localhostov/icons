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

public val Icons.Filled.CvvCard: ImageVector
    get() {
        if (_cvvCard != null) {
            return _cvvCard!!
        }
        _cvvCard = Builder(name = "CvvCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                curveTo(0.0f, 5.243f, 2.243f, 3.0f, 5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(24.0f, 10.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 21.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                lineTo(24.0f, 10.0f)
                close()
                moveTo(9.751f, 16.999f)
                verticalLineToRelative(-1.998f)
                curveToRelative(0.0f, -0.449f, 0.358f, -0.751f, 0.749f, -0.751f)
                curveToRelative(0.288f, 0.005f, 0.544f, 0.173f, 0.669f, 0.411f)
                curveToRelative(0.106f, 0.202f, 0.32f, 0.324f, 0.548f, 0.324f)
                curveToRelative(0.472f, 0.0f, 0.776f, -0.504f, 0.553f, -0.92f)
                curveToRelative(-0.335f, -0.629f, -1.003f, -1.059f, -1.77f, -1.064f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.109f, -0.001f, -2.0f, 0.889f, -2.0f, 1.984f)
                verticalLineToRelative(2.03f)
                curveToRelative(0.0f, 1.094f, 0.891f, 1.985f, 2.0f, 1.985f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.768f, -0.006f, 1.435f, -0.436f, 1.77f, -1.065f)
                curveToRelative(0.222f, -0.417f, -0.081f, -0.92f, -0.553f, -0.92f)
                curveToRelative(-0.228f, 0.0f, -0.442f, 0.122f, -0.548f, 0.324f)
                curveToRelative(-0.125f, 0.238f, -0.381f, 0.406f, -0.669f, 0.411f)
                curveToRelative(-0.391f, 0.0f, -0.749f, -0.302f, -0.749f, -0.751f)
                close()
                moveTo(16.86f, 13.731f)
                curveToRelative(0.079f, -0.377f, -0.209f, -0.731f, -0.594f, -0.731f)
                horizontalLineToRelative(-0.012f)
                curveToRelative(-0.287f, 0.0f, -0.535f, 0.202f, -0.594f, 0.483f)
                lineToRelative(-0.583f, 2.799f)
                lineToRelative(-0.71f, -2.823f)
                curveToRelative(-0.068f, -0.27f, -0.31f, -0.459f, -0.588f, -0.459f)
                curveToRelative(-0.395f, 0.0f, -0.685f, 0.372f, -0.588f, 0.755f)
                lineToRelative(1.171f, 4.652f)
                curveToRelative(0.088f, 0.349f, 0.402f, 0.593f, 0.761f, 0.593f)
                curveToRelative(0.372f, 0.0f, 0.693f, -0.261f, 0.768f, -0.625f)
                lineToRelative(0.969f, -4.645f)
                close()
                moveTo(21.36f, 13.731f)
                curveToRelative(0.079f, -0.377f, -0.209f, -0.731f, -0.594f, -0.731f)
                horizontalLineToRelative(-0.012f)
                curveToRelative(-0.287f, 0.0f, -0.535f, 0.202f, -0.594f, 0.483f)
                lineToRelative(-0.583f, 2.799f)
                lineToRelative(-0.71f, -2.823f)
                curveToRelative(-0.068f, -0.27f, -0.31f, -0.459f, -0.588f, -0.459f)
                curveToRelative(-0.395f, 0.0f, -0.685f, 0.372f, -0.588f, 0.755f)
                lineToRelative(1.171f, 4.652f)
                curveToRelative(0.088f, 0.349f, 0.402f, 0.593f, 0.761f, 0.593f)
                curveToRelative(0.372f, 0.0f, 0.693f, -0.261f, 0.768f, -0.625f)
                lineToRelative(0.969f, -4.645f)
                close()
            }
        }
        .build()
        return _cvvCard!!
    }

private var _cvvCard: ImageVector? = null
