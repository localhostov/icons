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

public val Icons.Outline.BusAlt: ImageVector
    get() {
        if (_busAlt != null) {
            return _busAlt!!
        }
        _busAlt = Builder(name = "BusAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                lineTo(22.0f, 4.229f)
                arcToRelative(2.987f, 2.987f, 0.0f, false, false, -1.821f, -2.76f)
                curveToRelative(-3.673f, -1.9f, -12.695f, -1.893f, -16.358f, 0.0f)
                arcTo(2.986f, 2.986f, 0.0f, false, false, 2.0f, 4.229f)
                lineTo(2.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 22.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(20.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineTo(22.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(24.0f, 10.0f)
                close()
                moveTo(4.0f, 13.0f)
                lineTo(4.0f, 7.0f)
                lineTo(20.0f, 7.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(4.6f, 3.312f)
                arcTo(19.013f, 19.013f, 0.0f, false, true, 12.0f, 2.0f)
                arcToRelative(19.018f, 19.018f, 0.0f, false, true, 7.4f, 1.311f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, 0.6f, 0.918f)
                lineTo(20.0f, 5.0f)
                lineTo(15.0f, 5.0f)
                lineTo(15.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                lineTo(9.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                lineTo(4.0f, 4.229f)
                arcTo(0.989f, 0.989f, 0.0f, false, true, 4.6f, 3.312f)
                close()
                moveTo(4.0f, 20.0f)
                lineTo(4.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(8.0f, 15.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(18.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _busAlt!!
    }

private var _busAlt: ImageVector? = null
