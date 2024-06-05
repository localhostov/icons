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

public val Icons.Bold.Review: ImageVector
    get() {
        if (_review != null) {
            return _review!!
        }
        _review = Builder(name = "Review", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.026f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(11.334f, 0.0f, 8.026f, 0.0f)
                reflectiveCurveTo(2.026f, 2.691f, 2.026f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(8.026f, 3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(10.0f, 15.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-3.033f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                curveToRelative(0.0f, -4.687f, 3.813f, -8.5f, 8.5f, -8.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(23.643f, 17.765f)
                lineToRelative(-2.366f, 1.927f)
                lineToRelative(0.979f, 2.98f)
                curveToRelative(0.134f, 0.403f, -0.002f, 0.847f, -0.339f, 1.106f)
                curveToRelative(-0.337f, 0.259f, -0.801f, 0.277f, -1.156f, 0.046f)
                lineToRelative(-2.754f, -1.793f)
                lineToRelative(-2.708f, 1.812f)
                curveToRelative(-0.168f, 0.113f, -0.362f, 0.169f, -0.556f, 0.169f)
                curveToRelative(-0.211f, 0.0f, -0.422f, -0.067f, -0.6f, -0.2f)
                curveToRelative(-0.34f, -0.254f, -0.481f, -0.696f, -0.354f, -1.101f)
                lineToRelative(0.941f, -3.016f)
                lineToRelative(-2.377f, -1.934f)
                curveToRelative(-0.32f, -0.271f, -0.437f, -0.713f, -0.292f, -1.107f)
                curveToRelative(0.145f, -0.394f, 0.519f, -0.655f, 0.938f, -0.655f)
                horizontalLineToRelative(3.001f)
                lineToRelative(1.062f, -2.98f)
                curveToRelative(0.146f, -0.391f, 0.52f, -0.651f, 0.937f, -0.651f)
                reflectiveCurveToRelative(0.791f, 0.26f, 0.937f, 0.651f)
                lineToRelative(1.062f, 2.98f)
                horizontalLineToRelative(3.001f)
                curveToRelative(0.42f, 0.0f, 0.795f, 0.263f, 0.939f, 0.657f)
                curveToRelative(0.144f, 0.395f, 0.026f, 0.837f, -0.295f, 1.108f)
                close()
            }
        }
        .build()
        return _review!!
    }

private var _review: ImageVector? = null
