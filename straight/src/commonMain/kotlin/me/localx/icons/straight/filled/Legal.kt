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

public val Icons.Filled.Legal: ImageVector
    get() {
        if (_legal != null) {
            return _legal!!
        }
        _legal = Builder(name = "Legal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 22.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.873f)
                curveToRelative(0.663f, -1.253f, 1.373f, -3.764f, 1.373f, -4.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.45f, -2.5f, -2.45f)
                reflectiveCurveToRelative(-2.5f, 1.069f, -2.5f, 2.45f)
                curveToRelative(0.0f, 0.736f, 0.71f, 3.247f, 1.373f, 4.5f)
                horizontalLineToRelative(-0.873f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(19.0f, 17.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineToRelative(-12.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.05f)
                lineToRelative(0.005f, 0.051f)
                curveToRelative(2.241f, 0.252f, 3.995f, 2.117f, 3.995f, 4.399f)
                curveToRelative(0.0f, 0.63f, -0.254f, 1.773f, -0.61f, 2.916f)
                curveToRelative(1.092f, 0.508f, 1.948f, 1.44f, 2.354f, 2.584f)
                horizontalLineToRelative(1.257f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(11.0f)
                lineTo(24.001f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(10.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(17.5f, 21.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _legal!!
    }

private var _legal: ImageVector? = null
