package me.localx.icons.rounded.outline

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

public val Icons.Outline.Tram: ImageVector
    get() {
        if (_tram != null) {
            return _tram!!
        }
        _tram = Builder(name = "Tram", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                lineTo(12.0f, 9.0f)
                lineTo(12.0f, 3.0f)
                curveToRelative(0.0f, -0.017f, 0.0f, -0.035f, 0.0f, -0.052f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 10.0f, 5.0f)
                lineTo(10.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(19.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 14.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 9.0f)
                close()
                moveTo(22.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineTo(17.0f, 16.0f)
                lineTo(17.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 14.0f)
                close()
                moveTo(9.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                lineTo(9.0f, 16.0f)
                close()
                moveTo(5.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 16.0f)
                lineTo(2.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 11.0f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(2.0f, 18.0f)
                lineTo(22.0f, 18.0f)
                verticalLineToRelative(1.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 22.0f)
                close()
                moveTo(13.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 2.0f)
                close()
                moveTo(19.016f, 1.724f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.821f, 0.562f)
                lineToRelative(3.0f, -0.546f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.358f, 1.968f)
                lineToRelative(-3.0f, 0.545f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.016f, 1.724f)
                close()
                moveTo(0.016f, 5.179f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.821f, 4.016f)
                lineToRelative(4.0f, -0.727f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.358f, 1.968f)
                lineToRelative(-4.0f, 0.727f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.016f, 5.179f)
                close()
            }
        }
        .build()
        return _tram!!
    }

private var _tram: ImageVector? = null
