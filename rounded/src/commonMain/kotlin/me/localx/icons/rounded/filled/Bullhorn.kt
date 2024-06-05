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

public val Icons.Filled.Bullhorn: ImageVector
    get() {
        if (_bullhorn != null) {
            return _bullhorn!!
        }
        _bullhorn = Builder(name = "Bullhorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 11.95f)
                verticalLineToRelative(6.05f)
                curveToRelative(0.0f, 0.521f, -0.399f, 0.954f, -0.917f, 0.997f)
                curveToRelative(-0.028f, 0.002f, -0.056f, 0.003f, -0.083f, 0.003f)
                curveToRelative(-0.484f, 0.0f, -0.904f, -0.35f, -0.985f, -0.835f)
                curveToRelative(-0.389f, -2.333f, -3.62f, -3.165f, -6.514f, -3.165f)
                horizontalLineToRelative(-4.5f)
                lineTo(9.001f, 4.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.894f, 0.0f, 6.125f, -0.831f, 6.514f, -3.165f)
                curveToRelative(0.086f, -0.513f, 0.555f, -0.88f, 1.069f, -0.832f)
                curveToRelative(0.519f, 0.043f, 0.917f, 0.476f, 0.917f, 0.997f)
                verticalLineToRelative(6.05f)
                curveToRelative(1.141f, 0.232f, 2.0f, 1.24f, 2.0f, 2.45f)
                reflectiveCurveToRelative(-0.859f, 2.218f, -2.0f, 2.45f)
                close()
                moveTo(7.0f, 15.0f)
                lineTo(7.0f, 4.0f)
                horizontalLineToRelative(-1.5f)
                curveTo(2.467f, 4.0f, 0.0f, 6.467f, 0.0f, 9.5f)
                reflectiveCurveToRelative(2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(8.523f, 17.0f)
                horizontalLineToRelative(-3.023f)
                curveToRelative(-0.878f, 0.0f, -1.721f, -0.152f, -2.505f, -0.431f)
                lineToRelative(2.171f, 5.792f)
                curveToRelative(0.228f, 0.625f, 0.686f, 1.124f, 1.289f, 1.405f)
                curveToRelative(0.335f, 0.156f, 0.692f, 0.234f, 1.05f, 0.234f)
                curveToRelative(0.288f, 0.0f, 0.577f, -0.051f, 0.855f, -0.152f)
                curveToRelative(0.625f, -0.228f, 1.124f, -0.686f, 1.405f, -1.289f)
                curveToRelative(0.281f, -0.604f, 0.31f, -1.28f, 0.082f, -1.904f)
                lineToRelative(-1.325f, -3.656f)
                close()
            }
        }
        .build()
        return _bullhorn!!
    }

private var _bullhorn: ImageVector? = null
