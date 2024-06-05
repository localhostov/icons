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

public val Icons.Bold.OilCan: ImageVector
    get() {
        if (_oilCan != null) {
            return _oilCan!!
        }
        _oilCan = Builder(name = "OilCan", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.414f, 17.681f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.828f, 0.0f)
                lineToRelative(0.8f, -0.905f)
                arcToRelative(0.819f, 0.819f, 0.0f, false, true, 1.226f, 0.0f)
                close()
                moveTo(24.0f, 9.5f)
                verticalLineTo(10.0f)
                arcToRelative(1.507f, 1.507f, 0.0f, false, true, -0.281f, 0.874f)
                reflectiveCurveToRelative(-5.851f, 8.154f, -5.877f, 8.186f)
                arcTo(5.488f, 5.488f, 0.0f, false, true, 13.649f, 21.0f)
                horizontalLineTo(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineToRelative(-0.015f)
                lineTo(2.336f, 16.4f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.0f, 13.1f)
                verticalLineToRelative(-2.93f)
                arcTo(3.114f, 3.114f, 0.0f, false, true, 1.291f, 7.552f)
                arcToRelative(3.473f, 3.473f, 0.0f, false, true, 3.232f, -0.29f)
                lineTo(6.2f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(1.191f)
                arcToRelative(4.394f, 4.394f, 0.0f, false, true, 3.623f, 1.922f)
                arcToRelative(0.487f, 0.487f, 0.0f, false, false, 0.358f, 0.069f)
                lineTo(21.949f, 8.1f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 24.0f, 9.5f)
                close()
                moveTo(4.0f, 13.8f)
                verticalLineToRelative(-3.5f)
                lineToRelative(-0.6f, -0.266f)
                arcTo(0.633f, 0.633f, 0.0f, false, false, 3.0f, 10.016f)
                reflectiveCurveTo(3.0f, 13.1f, 3.0f, 13.1f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.334f, 0.471f)
                close()
                moveTo(18.811f, 12.57f)
                reflectiveCurveToRelative(-0.72f, 0.282f, -0.768f, 0.295f)
                arcToRelative(3.407f, 3.407f, 0.0f, false, true, -3.666f, -1.188f)
                arcTo(1.385f, 1.385f, 0.0f, false, false, 13.191f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.649f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.871f, -0.841f)
                close()
            }
        }
        .build()
        return _oilCan!!
    }

private var _oilCan: ImageVector? = null
