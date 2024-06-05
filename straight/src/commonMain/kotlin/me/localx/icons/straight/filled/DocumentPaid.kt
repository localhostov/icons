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

public val Icons.Filled.DocumentPaid: ImageVector
    get() {
        if (_documentPaid != null) {
            return _documentPaid!!
        }
        _documentPaid = Builder(name = "DocumentPaid", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.1f, 13.6f)
                curveToRelative(0.496f, 0.0f, 0.9f, 0.404f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.404f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.5f)
                moveToRelative(5.136f, 0.106f)
                lineToRelative(0.638f, 3.295f)
                horizontalLineToRelative(-1.262f)
                lineToRelative(0.624f, -3.295f)
                moveTo(17.0f, 0.586f)
                verticalLineToRelative(4.414f)
                horizontalLineToRelative(4.414f)
                lineTo(17.0f, 0.586f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(15.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 7.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(16.4f, 12.0f)
                horizontalLineToRelative(2.3f)
                curveToRelative(1.269f, 0.0f, 2.3f, 1.031f, 2.3f, 2.3f)
                verticalLineToRelative(3.4f)
                curveToRelative(0.0f, 1.269f, -1.031f, 2.3f, -2.3f, 2.3f)
                horizontalLineToRelative(-2.3f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(13.8f, 12.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(10.256f, 12.0f)
                curveToRelative(0.757f, 0.0f, 1.226f, 0.524f, 1.346f, 1.192f)
                lineToRelative(1.397f, 6.807f)
                horizontalLineToRelative(-1.488f)
                lineToRelative(-0.262f, -1.474f)
                horizontalLineToRelative(-2.006f)
                lineToRelative(-0.275f, 1.474f)
                horizontalLineToRelative(-1.469f)
                lineToRelative(1.372f, -6.833f)
                curveToRelative(0.103f, -0.58f, 0.628f, -1.167f, 1.385f, -1.167f)
                close()
                moveTo(4.599f, 16.999f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.1f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(19.4f, 17.699f)
                curveToRelative(0.0f, 0.386f, -0.314f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, 0.0f, -0.7f, 0.0f)
                verticalLineToRelative(-4.802f)
                reflectiveCurveToRelative(0.314f, 0.0f, 0.7f, 0.0f)
                reflectiveCurveToRelative(0.7f, 0.314f, 0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                close()
            }
        }
        .build()
        return _documentPaid!!
    }

private var _documentPaid: ImageVector? = null
