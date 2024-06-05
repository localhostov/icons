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
                moveTo(17.172f, 9.991f)
                arcToRelative(0.492f, 0.492f, 0.0f, false, true, -0.377f, -0.082f)
                lineToRelative(-0.482f, -0.685f)
                lineToRelative(-0.167f, -0.2f)
                arcTo(3.477f, 3.477f, 0.0f, false, false, 13.672f, 8.0f)
                lineTo(12.0f, 8.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                lineTo(15.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                lineTo(6.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 8.0f)
                lineTo(5.755f, 8.0f)
                lineTo(3.513f, 7.215f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 0.0f, 9.5f)
                verticalLineToRelative(3.146f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, 1.935f, 3.131f)
                lineTo(4.0f, 16.544f)
                lineTo(4.0f, 21.0f)
                lineTo(15.194f, 21.0f)
                lineTo(24.0f, 10.629f)
                lineTo(24.0f, 7.3f)
                close()
                moveTo(3.229f, 13.067f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 12.647f)
                lineTo(3.0f, 10.214f)
                lineToRelative(1.0f, 0.35f)
                verticalLineToRelative(2.787f)
                close()
                moveTo(13.806f, 18.0f)
                lineTo(7.0f, 18.0f)
                lineTo(7.0f, 11.0f)
                horizontalLineToRelative(6.672f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.287f, 0.091f)
                lineToRelative(0.481f, 0.685f)
                lineToRelative(0.167f, 0.2f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.436f, 0.89f)
                lineToRelative(0.175f, -0.06f)
                close()
                moveTo(23.414f, 17.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.828f, 0.0f)
                lineTo(22.0f, 16.0f)
                close()
            }
        }
        .build()
        return _oilCan!!
    }

private var _oilCan: ImageVector? = null
