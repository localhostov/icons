package me.localx.icons.straight.outline

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

public val Icons.Outline.BowArrow: ImageVector
    get() {
        if (_bowArrow != null) {
            return _bowArrow!!
        }
        _bowArrow = Builder(name = "BowArrow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.7f, 1.715f)
                lineToRelative(0.008f, -0.008f)
                lineToRelative(-0.026f, -0.026f)
                arcTo(2.994f, 2.994f, 0.0f, false, false, 22.319f, 0.319f)
                lineTo(22.293f, 0.293f)
                lineTo(22.285f, 0.3f)
                arcTo(2.951f, 2.951f, 0.0f, false, false, 21.0f, 0.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.586f)
                lineTo(17.6f, 4.989f)
                arcTo(12.507f, 12.507f, 0.0f, false, false, 0.667f, 5.66f)
                lineToRelative(-0.708f, 0.707f)
                lineToRelative(8.13f, 8.13f)
                lineTo(4.586f, 18.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.586f)
                lineTo(0.293f, 22.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(4.0f, 21.414f)
                verticalLineTo(24.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.414f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(8.13f, 8.13f)
                lineToRelative(0.707f, -0.708f)
                arcTo(12.505f, 12.505f, 0.0f, false, false, 19.011f, 6.4f)
                lineTo(22.0f, 3.414f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.0f)
                arcTo(2.951f, 2.951f, 0.0f, false, false, 23.7f, 1.715f)
                close()
                moveTo(2.821f, 6.4f)
                arcToRelative(10.518f, 10.518f, 0.0f, false, true, 13.364f, 0.0f)
                lineTo(9.5f, 13.083f)
                close()
                moveTo(17.6f, 21.179f)
                lineTo(10.917f, 14.5f)
                lineTo(17.6f, 7.815f)
                arcTo(10.518f, 10.518f, 0.0f, false, true, 17.6f, 21.179f)
                close()
            }
        }
        .build()
        return _bowArrow!!
    }

private var _bowArrow: ImageVector? = null
