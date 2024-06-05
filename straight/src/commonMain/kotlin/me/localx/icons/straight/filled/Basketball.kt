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

public val Icons.Filled.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.252f, 6.334f)
                arcTo(9.223f, 9.223f, 0.0f, false, true, 14.0f, 0.181f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, true, 5.741f, 2.664f)
                close()
                moveTo(7.752f, 14.834f)
                lineTo(10.586f, 12.0f)
                lineTo(2.845f, 4.259f)
                arcTo(11.944f, 11.944f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(0.323f, 12.0f)
                arcTo(11.582f, 11.582f, 0.0f, false, true, 7.749f, 14.837f)
                close()
                moveTo(21.155f, 4.259f)
                lineTo(17.666f, 7.748f)
                arcTo(9.531f, 9.531f, 0.0f, false, false, 23.819f, 10.0f)
                arcTo(11.95f, 11.95f, 0.0f, false, false, 21.155f, 4.259f)
                close()
                moveTo(14.837f, 7.749f)
                arcTo(11.585f, 11.585f, 0.0f, false, true, 12.0f, 0.323f)
                lineTo(12.0f, 0.0f)
                arcTo(11.944f, 11.944f, 0.0f, false, false, 4.259f, 2.845f)
                lineTo(12.0f, 10.586f)
                close()
                moveTo(23.677f, 12.0f)
                arcToRelative(11.584f, 11.584f, 0.0f, false, true, -7.426f, -2.837f)
                lineTo(13.414f, 12.0f)
                lineToRelative(7.741f, 7.741f)
                arcTo(11.944f, 11.944f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(9.163f, 16.251f)
                arcTo(11.937f, 11.937f, 0.0f, false, true, 12.0f, 23.648f)
                lineTo(12.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(11.944f, 11.944f, 0.0f, false, false, 7.741f, -2.845f)
                lineTo(12.0f, 13.414f)
                close()
                moveTo(7.746f, 17.668f)
                lineTo(4.259f, 21.155f)
                arcTo(11.95f, 11.95f, 0.0f, false, false, 10.0f, 23.819f)
                arcTo(9.495f, 9.495f, 0.0f, false, false, 7.746f, 17.668f)
                close()
                moveTo(0.181f, 14.0f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, 2.664f, 5.741f)
                lineToRelative(3.489f, -3.489f)
                arcTo(9.452f, 9.452f, 0.0f, false, false, 0.181f, 14.0f)
                close()
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
